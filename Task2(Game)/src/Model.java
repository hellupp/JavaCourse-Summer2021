import java.util.ArrayList;

public class Model {

    private int secretNumber;
    public String messageToPrint = "";
    private boolean repeatedAttempt = false;

    private int minBarrier;
    private int maxBarrier;

    private ArrayList<Integer> attempts = new ArrayList<>();


    public void setPrimaryBarrier(int minBarrier, int maxBarrier){
        this.minBarrier = minBarrier;
        this.maxBarrier = maxBarrier;
    }

    public void generateSecretNumber() {
        this.secretNumber = (int) (Math.random() * 99);
    }


    public boolean checkEnteredNumber (int num){
        if (this.attempts.contains(num)) {
            this.messageToPrint = "Your attempts: " + this.attempts +
                    "\nYou have already entered this one! Try harder!!!" +
                    "\nEnter number in [" + this.minBarrier + "; " + this.maxBarrier + "]\n";

            repeatedAttempt = false;
            return true;
        } else {
            attempts.add(num);
            if (num == secretNumber){
                return false;
            } else if (num > secretNumber){
                maxBarrier = num;
                this.messageToPrint = "Your attempts: " + this.attempts + "\nEnter smaller number in [" +
                        this.minBarrier + "; " + this.maxBarrier + "]\n";
            } else {
                minBarrier = num;
                this.messageToPrint = "Your attempts: " + this.attempts + "\nEnter bigger number in [" +
                        this.minBarrier + "; " + this.maxBarrier + "]\n";
            }
            return true;
        }
    }


    public ArrayList<Integer> getAttempts() {
        return this.attempts;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public int getMinBarrier() {
        return this.minBarrier;
    }

    public int getMaxBarrier() {
        return this.maxBarrier;
    }
}
