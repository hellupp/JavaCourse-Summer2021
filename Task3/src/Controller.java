import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    private Notebook notebook;
    private View view;

    private Pattern pattern;
    private Matcher matcher;


    public Controller(Notebook notebook, View view){
        this.notebook = notebook;
        this.view = view;
    }

    public void processUser(){
        boolean needToInput = true;
        Scanner sc = new Scanner(System.in);

        view.printMessage(View.GREETING_MESSAGE);

        for (int i = 0; i < 1; i++){
            view.printMessage(View.MESSAGE_FOR_INPUT);
            inputAndCheckValue(sc, RegexConstants.REGEX_NAME);
        }

        view.printMessage(View.FINAL_MESSAGE + notebook.getNotes());
    }



    public boolean inputAndCheckValue(Scanner sc, String regex){
        String res = sc.nextLine();

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(res);

        while(true){
            if (matcher.find()) {
                notebook.setUserName(res);
                break;
            } else {
                view.printMessage(View.WRONG_INPUT);
                res = sc.next();
                matcher = pattern.matcher(res);
            }
        }
        return true;
    }

}
