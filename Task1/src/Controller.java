import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setValue(inputStringValueWithScanner(sc));
        view.printMessageAndString(View.OUR_STRING, model.getValue());
    }

    public String inputStringValueWithScanner(Scanner sc) {
        String input = "";
        view.printMessage(View.INPUT_DATA);
        while (!sc.hasNext("Hello")) {
            view.printMessage(View.WRONG_INPUT_DATA + "\"Hello\")");
            sc.next();
        }
        input += sc.next();

        view.printMessage(View.INPUT_DATA);
        while(!sc.hasNext("world!")){
            view.printMessage(View.WRONG_INPUT_DATA + "\"world!\")");
            sc.next();
        }
        input += " " + sc.next();
        return input;
    }
}
