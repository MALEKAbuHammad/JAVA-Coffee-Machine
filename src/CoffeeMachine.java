import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Coffee Machine!");
            System.out.println("Select an option to continue:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1, 2, or 3): ");

            int choice = keyboard.nextInt();

            switch (choice) {
                case 1:
                    String espressoName = "Espresso";
                    double espressoPrice = 2.50;
                    boolean boolEspressoRoast=true;
                    String espressoRoast="";
                    while(boolEspressoRoast){
                        System.out.print("What Roast would you like? (light, medium, dark): ");
                        espressoRoast = keyboard.next();
                        if( espressoRoast.equalsIgnoreCase("light") ||  espressoRoast.equalsIgnoreCase("medium") ||  espressoRoast.equalsIgnoreCase("dark")){
                            boolEspressoRoast=false;
                        }
                    }

                    System.out.print("How many servings would you like? (a number please): ");
                    int numberOfShots = keyboard.nextInt();

                    Espresso myEspresso = new Espresso(espressoName,espressoRoast,espressoPrice,numberOfShots);
                    myEspresso.grindBeans();
                    myEspresso.brewCoffee();
                    myEspresso.printInfo();
                    myEspresso.printEspressoDetails();
                    break;
                case 2:

                    String latteName = "Latte";
                    double lattePrice = 3.50;
                    String latteRoast = "";
                    boolean boolLatteRoast=true;
                    while(boolLatteRoast){
                        System.out.print("What Roast would you like? (light, medium, dark): ");
                        latteRoast = keyboard.next();
                        if( latteRoast.equalsIgnoreCase("light") ||  latteRoast.equalsIgnoreCase("medium") ||  latteRoast.equalsIgnoreCase("dark")){
                            boolLatteRoast=false;
                        }
                    }

                    boolean boolMilkType=true;
                    String milkType="";
                    while(boolMilkType){
                        System.out.print("What milk type would you like? (whole, skim, almond, oat): ");
                         milkType = keyboard.next();
                        if( milkType.equalsIgnoreCase("whole") ||  milkType.equalsIgnoreCase("skim") ||  milkType.equalsIgnoreCase("almond")||  milkType.equalsIgnoreCase("oat")){
                            boolMilkType=false;
                        }
                    }

                    System.out.print("Would you like syrup? (yes/ no): ");
                    String syrupWanted = keyboard.next();

                    String syrupFlavor = "no";
                    if(syrupWanted.equals("yes")){
                        boolean booleSyrupFlavor=true;
                        while(booleSyrupFlavor){
                            System.out.print("Which flavor would you like? (vanilla, caramel, hazelnut): ");
                            syrupFlavor=keyboard.next();
                            if( syrupFlavor.equalsIgnoreCase("vanilla") ||  syrupFlavor.equalsIgnoreCase("caramel") ||  syrupFlavor.equalsIgnoreCase("almond")){
                                booleSyrupFlavor=false;
                            }
                        }
                    }

                    Latte myLatte  =new Latte(latteName,latteRoast,lattePrice,milkType,syrupFlavor);
                    myLatte.grindBeans();
                    myLatte.brewCoffee();
                    myLatte.printInfo();
                    myLatte.printLatteDetails();
                    break;
                case 3:
                    System.out.println("Thank you for using the Coffee Machine!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }
}
