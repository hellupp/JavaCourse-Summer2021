import java.util.Scanner;

public class Controller {

    // The Constants
    public static final String WORD_1 = "Hello";
    public static final String WORD_2 = "world!";


    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setValue(inputStringValueWithScanner(sc));
        view.printMessageAndString(View.OUR_STRING, model.getValue());
    }

    // Utility method
    public String inputStringValueWithScanner(Scanner sc) {
        String input = "";

        view.printMessage(View.INPUT_DATA);
        input += inputValidation(WORD_1, sc);

        view.printMessage("\n" + View.INPUT_DATA);
        input += " " + inputValidation(WORD_2, sc);

        return input;
    }

    // Validation method
    private String inputValidation(String input, Scanner sc) {
        while (!sc.hasNext(input)) {
            view.printMessage(View.WRONG_INPUT_DATA + "\"" + input + "\")");
            sc.next();
        }
        return sc.next();
    }
}
