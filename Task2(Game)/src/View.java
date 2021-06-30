public class View {

    public static final String GREETING_MESSAGE = "Hello!\nNumber is taken\nTry to guess it";
    public static final String CONGRATULATION_MESSAGE = "Congratulations, you guessed!!!\nHere are your attempts: ";
    public static final String WRONG_INPUT = "Wrong input! You need to enter integer";
    public static final String WRONG_RANGE = "Wrong range! You need to enter integer in [";

    public void printMessage(String msg) {
        System.out.println(msg);
    }

}
