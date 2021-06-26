import java.util.ArrayList;

public class Model {

    private int number;
    private int enteredNumber;
    private int minBarrier = 0;
    private int maxBarrier = 100;
    private boolean repeatedAttempt = false;
    private ArrayList<Integer> attempts = new ArrayList<>();
    public String messageToPrint = "";


    public int getNumber() {
        return number;
    }

    public int getEnteredNumber() {
        return enteredNumber;
    }

    public void setEnteredNumber(int enteredNum) {
        this.enteredNumber = enteredNum;

        if (isBiggerThan(this.number)) {
            this.maxBarrier = enteredNum;
        } else {
            this.minBarrier = enteredNum;
        }

        if (this.attempts.contains(this.enteredNumber)) {
            repeatedAttempt = true;
        } else {
            this.attempts.add(enteredNum);
        }
    }

    public ArrayList<Integer> getAttempts() {
        return this.attempts;
    }

    public int getMinBarrier() {
        return this.minBarrier;
    }

    public int getMaxBarrier() {
        return this.maxBarrier;
    }

    public void generateNumber() {
        this.number = 1 + (int) (Math.random() * 100);
    }

    private boolean isBiggerThan(int num) {
        return (this.enteredNumber > num);
    }

    public void playGame() {
        if (repeatedAttempt) {
            this.messageToPrint = "You have already entered this one! Try harder!!!\n" +
                    "Your attempts: " + this.attempts + "\n";

            repeatedAttempt = false;
        } else {
            if (isBiggerThan(this.number)) {
                this.messageToPrint = "Your attempts: " + this.attempts + "\nEnter smaller number in [" +
                        this.minBarrier + "; " + this.maxBarrier + "]\n";
            } else {
                this.messageToPrint = "Your attempts: " + this.attempts + "\nEnter bigger number in [" +
                        this.minBarrier + "; " + this.maxBarrier + "]\n";
            }
        }
    }
}
