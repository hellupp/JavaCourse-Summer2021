import java.util.ArrayList;

public class Model {

    private int secretNumber;

    private int minBarrier = 0;
    private int maxBarrier = 100;

    private ArrayList<Integer> attempts = new ArrayList<>();


    public void setPrimaryBarrier(int minBarrier, int maxBarrier){
        this.minBarrier = minBarrier;
        this.maxBarrier = maxBarrier;
    }

    public void generateSecretNumber() {
        this.secretNumber = 1 + (int) (Math.random() * 100);
    }


    public boolean checkEnteredNumber (int num){
        attempts.add(num);
        if (num == secretNumber){
            return false;
        } else if (num > secretNumber){
            maxBarrier = num;
        } else {
            minBarrier = num;
        }
        return true;
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
