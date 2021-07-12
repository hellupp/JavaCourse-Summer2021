package controller;

import model.Notebook;
import view.View;

import java.util.Scanner;

import static controller.RegexConstants.*;
import static view.TextConstants.*;

public class InputNotes {
    private View view;
    private Scanner scanner;
    private Notebook notebook;


    public InputNotes(View view, Scanner sc, Notebook notebook) {
        this.view = view;
        this.scanner = sc;
        this.notebook = notebook;
    }

    public void inputNotes() {
        UtilityController utilityController =
                new UtilityController(scanner, view);

        view.printGreetings();

        boolean isUkrainianLocale = String.valueOf(View.bundle.getLocale()).equals("ua");

        String str = isUkrainianLocale ? REGEX_SURNAME_UKR : REGEX_SURNAME_LAT;
        notebook.setUserSurname(utilityController.inputAndCheckValue(SURNAME, str));

        str = isUkrainianLocale ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        notebook.setUserName(utilityController.inputAndCheckValue(NAME, str));

        str = isUkrainianLocale ? REGEX_SECOND_NAME_UKR : REGEX_SECOND_NAME_LAT;
        notebook.setUserSecondName(utilityController.inputAndCheckValue(SECOND_NAME, str));

        notebook.setUserLogin(utilityController.inputAndCheckValue(LOGIN, REGEX_LOGIN), this);

        notebook.setUserMobilePhoneNumber1(utilityController.inputAndCheckValue
                (MOBILE_PHONE_NUMBER, REGEX_MOBILE_PHONE_NUMBER_1));

        view.printFinalMessage();
        view.printMessage(isUkrainianLocale ? notebook.getNotesUkr() : notebook.getNotesLat());
    }

    public void inputLogin(){
        UtilityController utilityController =
                new UtilityController(scanner, view);
        this.notebook.setUserLogin(utilityController.inputAndCheckValue
                (LOGIN, REGEX_LOGIN), this);
    }
}
