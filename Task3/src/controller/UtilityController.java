package controller;

import view.View;

import java.util.Scanner;

public class UtilityController {
    private Scanner scanner;
    private View view;

    public UtilityController(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    /**
     * @param msg   Message to output
     * @param regex Regular expression from Controllers.RegexConstants.java interface
     * @return Inputted String after checking if it's valid
     */
    public String inputAndCheckValue(String msg, String regex) {
        String res;
        view.printStringInput(msg);

        while (!(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongStringInput(msg);
        }
        return res;
    }
}
