
public class Coffee {
    String name;
    String roast;
    int caffeineLevelInMg;
    double price;

    public Coffee(){

    }

    public Coffee(String name,String roast,double price){
        this.name=name;
        this.roast=roast;
        this.price=price;
        setCaffeineLevel();
    }

    public void setCaffeineLevel(){
        if(roast.toLowerCase().equals("light")){
            caffeineLevelInMg=50;
        }
        else if(roast.toLowerCase().equals("medium")){
            caffeineLevelInMg=100;
        }
        else if(roast.toLowerCase().equals("dark")){
            caffeineLevelInMg=150;
        }
        else {
            caffeineLevelInMg=0;
        }
    }

    public void grindBeans() {
        System.out.println("\nGrinding beans for " + name + "...");
    }

    public void brewCoffee() {
        System.out.println("\nBrewing your favorite " + name + "...");
    }

    // Method to print the information about the coffee
    public void printInfo() {
        System.out.println("\nYou ordered a " + name + " with a " + roast + " roast.");
        System.out.println("The caffeine level in your coffee is " + caffeineLevelInMg + " mg.");
    }
}



