import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER,
                GlobalConstants.PRIMARY_MAX_BARRIER);

        model.generateSecretNumber();

        view.printMessage(View.GREETING_MESSAGE);

        while (model.checkEnteredNumber(inputIntValueInDiapason(sc))){
            view.printMessage(model.messageToPrint);
        }

        view.printMessage(View.CONGRATULATION_MESSAGE + model.getAttempts());
    }

    public int inputIntValueInDiapason(Scanner sc){
        int res = 0;

        while (true) {
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT + "\n");
                sc.next();
            }
            if ((res = sc.nextInt()) < model.getMinBarrier() ||
                    res > model.getMaxBarrier()) {
                view.printMessage(View.WRONG_RANGE
                        + model.getMinBarrier() + "; "
                        + model.getMaxBarrier() + "]\n");
                continue;
            }
            break;
        }
        return res;
    }
}


