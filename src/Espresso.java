public class Espresso extends  Coffee{
    int numberOfShots;

    public Espresso(String name,String roast,double price,int numberOfShots){
        super(name,roast,price);
        this.numberOfShots=numberOfShots;
    }

    public void grindBeans() {
        System.out.println("\nGrinding the espresso beans finely...");
    }

    public void brewCoffee() {
        System.out.println("Brewing the espresso under high pressure...");
    }

    // Method to print the information about the coffee
    public void printInfo() {
        super.printInfo();
        System.out.println("You asked for " + numberOfShots + " servings!");
        System.out.println("Every serving of Espresso costs " + price + "$. Your total bill is " + (price * numberOfShots) + "$.");    }

}
