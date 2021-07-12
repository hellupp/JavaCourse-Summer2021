package controller;

import model.Notebook;
import view.View;

import java.util.Scanner;

/**
 * The Controllers.Controller class provides inputting value, checking it and writing down in Notes.Notebook class
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
        Scanner sc = new Scanner(System.in);
        InputNotes inputNotes = new InputNotes(view, sc, notebook);
        inputNotes.inputNotes();
    }
}
