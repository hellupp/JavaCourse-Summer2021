import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Controller class provides inputting value, checking it and writing down in Notebook class
 */
public class Controller {

    private final Notebook notebook;
    private final View view;

    public Controller(Notebook notebook, View view) {
        this.notebook = notebook;
        this.view = view;
    }


    /**
     * Work method
     */
    public void processUser() {
        int numOfQuestion = 1;
        Scanner sc = new Scanner(System.in);

        view.printMessage(View.GREETING_MESSAGE);

        while (numOfQuestion <= Notebook.NUMBER_OF_GAPS) {
            switch (numOfQuestion) {

                case 1:
                    view.printMessage(View.MESSAGE_FOR_INPUT + "surname");
                    notebook.setUserSurname(inputAndCheckValue(sc, RegexConstants.REGEX_SURNAME));
                    numOfQuestion++;
                    break;
                case 2:
                    view.printMessage(View.MESSAGE_FOR_INPUT + "name");
                    notebook.setUserName(inputAndCheckValue(sc, RegexConstants.REGEX_NAME));
                    numOfQuestion++;
                    break;
                case 3:
                    view.printMessage(View.MESSAGE_FOR_INPUT + "second name");
                    notebook.setUserSecondName(inputAndCheckValue(sc, RegexConstants.REGEX_SECOND_NAME));
                    numOfQuestion++;
                    break;
                case 4:
                    view.printMessage(View.MESSAGE_FOR_INPUT + "login");
                    notebook.setUserLogin(inputAndCheckValue(sc, RegexConstants.REGEX_LOGIN));
                    numOfQuestion++;
                    break;
                case 5:
                    view.printMessage(View.MESSAGE_FOR_INPUT + "num");
                    notebook.setUserMobilePhoneNumber1(inputAndCheckValue(sc, RegexConstants.REGEX_MOBILE_PHONE_NUMBER_1));
                    numOfQuestion++;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " +
                            numOfQuestion + ">" + Notebook.NUMBER_OF_GAPS);
            }
        }
        view.printMessage(View.FINAL_MESSAGE + notebook.getNotes());
    }


    /**
     * @param sc    Scanner
     * @param regex Regular expression from RegexConstants.java interface
     * @return Inputted String after checking if it's valid
     */
    public String inputAndCheckValue(Scanner sc, String regex) {
        String res = sc.next();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(res);

        while (true) {
            if (matcher.find()) {
                return res;
            } else {
                view.printMessage(View.WRONG_INPUT);
                res = sc.next();
                matcher = pattern.matcher(res);
            }
        }
    }

}