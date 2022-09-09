import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Wat wil je maken?");
        System.out.println("Typ 1 voor een heerlijke appeltaart");
        System.out.println("Typ 2 voor een amazing shakshuka");
        Scanner userInput = new Scanner(System.in);
        int choice = userInput.nextInt();

        if (choice == 1) {
            ApplePieRecipe applepierecipe = new ApplePieRecipe();
            //print ingredienten
            applepierecipe.printIngredients();
            //print recipe
            applepierecipe.printAllSteps();
        } else if (choice == 2) {
            Shakshuka shakshuka = new Shakshuka();
            shakshuka.printIngredients();
            shakshuka.printAllSteps();
        } else {
            System.out.println("Wrong input. Start over again.");
        }

        System.out.println("\nEet smakelijk!\n");
    } // closing method main
} // closing class main