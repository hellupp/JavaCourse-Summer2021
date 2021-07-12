package view;

import java.util.Locale;
import java.util.ResourceBundle;

import static view.TextConstants.*;

public class View {

    // Resource Bundle Installation's
    static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(
                    MESSAGES_BUNDLE_NAME,
                    //new Locale("ua", "UA"));  // Ukrainian
                    new Locale("en"));                    // English


    public void printMessage(String msg) {
        System.out.println(msg);
    }

    public void printGreetings() {
        printMessage(bundle.getString(GREETING_MESSAGE) + "\n");
    }

    public void printFinalMessage() {
        printMessage(concatenationString( "\n",
                bundle.getString(FINAL_DATA_MESSAGE),
                "\n", bundle.getString(NOTEBOOK_DATA_MESSAGE),
                "\n"));
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(MESSAGE_FOR_INPUT),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT), "\n",
                bundle.getString(MESSAGE_FOR_INPUT),
                bundle.getString(message)));
    }

    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString.append(v);
        }
        return new String(concatString);
    }
}
