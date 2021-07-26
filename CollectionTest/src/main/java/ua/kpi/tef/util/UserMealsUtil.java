package ua.kpi.tef.util;

import ua.kpi.tef.model.UserMeal;
import ua.kpi.tef.model.UserMealWithExceed;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

/**
 * GKislin
 * 31.05.2015.
 */
public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин", 510)
        );
        getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
//        .toLocalDate();
//        .toLocalTime();
    }

    // Using loops
    public static List<UserMealWithExceed>  getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        //return filtered list with correctly exceeded field

        Map<LocalDate, Integer> caloriesForDate = new HashMap<>();
        for(UserMeal userMeal : mealList){
            caloriesForDate.putIfAbsent(userMeal.getDateTime().toLocalDate(),
                    userMeal.getCalories() + caloriesForDate.getOrDefault(userMeal.getDateTime().toLocalDate(), 0));
        }

        List<UserMealWithExceed> userMealWithExceeds = new ArrayList<>();

        for(UserMeal userMeal : mealList){
            boolean exceeded = caloriesForDate.get(userMeal.getDateTime().toLocalDate()) > caloriesPerDay;

            if(TimeUtil.isBetween(userMeal.getDateTime().toLocalTime(), startTime, endTime)){
                userMealWithExceeds.add(new UserMealWithExceed(userMeal.getDateTime(), userMeal.getDescription(),
                        userMeal.getCalories(), exceeded));
            }
        }

        return userMealWithExceeds;
    }

    // Using streams
//    public static List<UserMealWithExceed>  getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
//        //return filtered list with correctly exceeded field
//
//        Map<LocalDate, Integer> caloriesForDate = mealList.stream().
//                collect(Collectors.groupingBy(userMeal -> userMeal.getDateTime().toLocalDate(),
//                        Collectors.summingInt(UserMeal::getCalories)));
//
//
//        return mealList.stream().
//                filter(userMeal -> TimeUtil.isBetween(userMeal.getDateTime().toLocalTime(), startTime, endTime)).
//                map(userMeal -> new UserMealWithExceed(userMeal.getDateTime(), userMeal.getDescription(),
//                        userMeal.getCalories(), caloriesForDate.get(userMeal.getDateTime().toLocalDate()) > caloriesPerDay)).
//                collect(Collectors.toList());
//    }
}
