import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class GameTest {
    private static Model model;

    @BeforeClass
    public static void initialize() {
        model = new Model();
        model.setPrimaryBarrier(GlobalConstants.PRIMARY_MIN_BARRIER, GlobalConstants.PRIMARY_MAX_BARRIER);
    }

    @Test
    public void secretNumbersIsInDiapason() {
        for (int i = 0; i < 10000; i++) {
            model.generateSecretNumber();
            int secretNumber = model.getSecretNumber();
            boolean isInDiapason = (secretNumber > model.getMinBarrier()) & (secretNumber < model.getMaxBarrier());
            Assert.assertTrue(isInDiapason);
        }
    }

    @Test
    public void equalledSecretNumberReturnFalse() {
        for (int i = 0; i < 10000; i++) {
            model.getAttempts().clear();
            model.generateSecretNumber();
            int secretNumber = model.getSecretNumber();
            Assert.assertFalse(model.checkEnteredNumber(secretNumber));
        }
    }
}
