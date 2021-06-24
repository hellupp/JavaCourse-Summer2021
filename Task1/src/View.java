public class View {

    public static final String INPUT_DATA = "Enter a word: ";
    public static final String WRONG_INPUT_DATA = "Wrong input, try again, please! (Must be a ";
    public static final String OUR_STRING = "Entered string = ";

    public void printMessage(String msg) {
        System.out.println(msg);
    }

    public void printMessageAndString(String msg, String str) {
        System.out.println(msg + str);
    }
}
