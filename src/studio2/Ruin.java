import java.util.Scanner;
public class Ruin {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    
    // defining variables
    double startAmount;
    double winChance;
    double winLimit;
    // int totalSimulations;

    System.out.println("How much money do you have?");
    startAmount = in.nextDouble();
    System.out.println("What is your win chance?");
    winChance = in.nextDouble();
    System.out.println("What is your win limit?");
    winLimit = in.nextDouble();

     // defining variables
    double currentMoney = startAmount;

    while ((currentMoney < winLimit) && (currentMoney > 0)) {
        if (winChance > Math.random()) {
            currentMoney ++;
            System.out.println("You win!");

        }
        else {
            currentMoney --;
            System.out.println("You lose!");
        }    
    }
    if (currentMoney >= winLimit) {
        System.out.println("Success!!!");

    }
    else if(currentMoney == 0) {
        System.out.println("Ruin!!!");

    }
    }

}
