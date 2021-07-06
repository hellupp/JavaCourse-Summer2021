import Controllers.Controller;
import Notes.Notebook;
import View.View;

public class Main {

    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        View view = new View();
        Controller controller = new Controller(notebook, view);

        controller.processUser();
    }
}
