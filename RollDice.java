import java.util.Random;

public class RollDice{

    public static int rollDice(int maxNumber){
        Random randNum = new Random();
        int x = randNum.nextInt(maxNumber) +1;
        return x;
    }

}