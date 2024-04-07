package engine;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

class Menu {
	
    protected String name;
    protected int price;
    protected String category;
    protected String Quantity;

    public Menu(String name, int price, String category,String Quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.Quantity=Quantity;
    }

    
    public void display() {
        System.out.println(name + " - Rs" + price+ Quantity);
    }

}



class BBQ extends Menu {
    public BBQ(String name, int price, String Quantity) {
        super(name, price, "BBQ", Quantity);
    }

    @Override
    public void display() {
        System.out.println(name + " - Rs" + price + " for " + Quantity);
    }

    
    public void display(int quantity) {
        int totalPrice = price * quantity;
        System.out.println(name + " - Rs" + totalPrice);
    }
}



class Desi extends Menu {
    public Desi(String name, int price,String Quantity) {
        super(name, price, "Desi", Quantity);
    }
    @Override
    public void display() {
        System.out.println(name + " - Rs" + price + " for " + Quantity);
    }

    
    public void display(int quantity) {
        int totalPrice = price * quantity;
        System.out.println(name + " - Rs" + totalPrice);
    }
}


class Desert extends Menu {
    public Desert(String name, int price,String Quantity) {
        super(name, price, "Desert", Quantity);
    }
    @Override
    public void display() {
        System.out.println(name + " - Rs" + price + " for " + Quantity);
    }

    
    public void display(int quantity) {
        int totalPrice = price * quantity;
        System.out.println(name + " - Rs" + totalPrice);
    }
}

class Homescreen {
    public void display() {
        System.out.println("==============================");
        System.out.println("|| Welcome to Khan's Dinner ||");
        System.out.println("==============================");
        System.out.println("");
        System.out.println("Press 'Y' to continue or 'N' to exit");
    }
}

public class Main {
    public static void main(String[] args) {
        
    	
    	Scanner scanner = new Scanner(System.in);
        Homescreen homescreen = new Homescreen();
        while (true){
        homescreen.display();
        String input1 = scanner.nextLine();

        
        if (input1.equalsIgnoreCase("Y")) {
            
            BBQ bbq1 = new BBQ("1.Chicken Thikka", 799, " 6 pcs");
            BBQ bbq2 = new BBQ("2.Chicken Broast", 999, " 6 pcs");
            Desi desi1 = new Desi("1.Chicken Biryani", 119, " 1 Plate");
            Desi desi2 = new Desi("2.Chicken Karahi", 749," full for rs 1499");
            Desert desert1 = new Desert("1.Falooda", 528,"");
            Desert desert2 = new Desert("2.Custard", 99,"");

            
            System.out.println("BBQ Menu:");
            bbq1.display();
            bbq2.display();

            System.out.println("\nDesi Menu:");
            desi1.display();
            desi2.display();

            System.out.println("\nDesert Menu:");
            desert1.display();
            desert2.display();
            
            
            System.out.println("\n\n============================================================");
            System.out.println("||Enter Catagory to take Order (1=BBQ),(2=Desi),(3=Desert)||");
            System.out.println("============================================================");
        
            String input2 = scanner.nextLine();
            
            if(input2.equalsIgnoreCase("1")) {
            	System.out.println("________________________");
            	System.out.println("|Enter Your Dish Number|");
            	System.out.println("========================");
            	String input3 = scanner.nextLine();
            	if(input3.equalsIgnoreCase("1")) {
            		
            		bbq1.display();
            		System.out.println("__________________________");
                	System.out.println("|Enter Your Dish Quantity|");
                	System.out.println("==========================");
                	int input4 = scanner.nextInt();
                	
                	System.out.println("===========================================");
                	System.out.println("|| Your Order was placed Sucsessfully :D ||");
                	System.out.println("===========================================");
                	bbq1.display(input4);
                	
                	
                	
            	}if(input3.equalsIgnoreCase("2")) {
            		
            		bbq2.display();
            		System.out.println("__________________________");
                	System.out.println("|Enter Your Dish Quantity|");
                	System.out.println("==========================");
                	int input4 = scanner.nextInt();
                	
                	System.out.println("===========================================");
                	System.out.println("|| Your Order was placed Sucsessfully :D ||");
                	System.out.println("===========================================");
                	bbq2.display(input4);
                	
            	}
            	
            }
            if(input2.equalsIgnoreCase("2")) {
            	System.out.println("________________________");
            	System.out.println("|Enter Your Dish Number|");
            	System.out.println("========================");
            	String input3 = scanner.nextLine();
            	if(input3.equalsIgnoreCase("1")) {
            		
            		desi1.display();
            		System.out.println("__________________________");
                	System.out.println("|Enter Your Dish Quantity|");
                	System.out.println("==========================");
                	int input4 = scanner.nextInt();
                	
                	System.out.println("===========================================");
                	System.out.println("|| Your Order was placed Sucsessfully :D ||");
                	System.out.println("===========================================");
                	desi1.display(input4);
                	
            	}if(input3.equalsIgnoreCase("2")) {
            		
            		desi2.display();
            		System.out.println("__________________________");
                	System.out.println("|Enter Your Dish Quantity|");
                	System.out.println("==========================");
                	int input4 = scanner.nextInt();
                	System.out.println("===========================================");
                	System.out.println("|| Your Order was placed Sucsessfully :D ||");
                	System.out.println("===========================================");
                	desi2.display(input4);
                	
            	}
            	
            	
            }
            if(input2.equalsIgnoreCase("3")) {
            	
            	System.out.println("________________________");
            	System.out.println("|Enter Your Dish Number|");
            	System.out.println("========================");
            	String input3 = scanner.nextLine();
            	if(input3.equalsIgnoreCase("1")) {
            		
            		desert1.display();
            		System.out.println("__________________________");
                	System.out.println("|Enter Your Dish Quantity|");
                	System.out.println("==========================");
                	int input4 = scanner.nextInt();
                	
                	System.out.println("===========================================");
                	System.out.println("|| Your Order was placed Sucsessfully :D ||");
                	System.out.println("===========================================");
                	desert1.display(input4);
                	
            	}if(input3.equalsIgnoreCase("2")) {
            		
            		desert2.display();
            		System.out.println("__________________________");
                	System.out.println("|Enter Your Dish Quantity|");
                	System.out.println("==========================");
                	int input4 = scanner.nextInt();
                	System.out.println("===========================================");
                	System.out.println("|| Your Order was placed Sucsessfully :D ||");
                	System.out.println("===========================================");
                	desert2.display(input4);
                	
            	}
            	
            }
        
        } else if (input1.equalsIgnoreCase("N")) {
            System.out.println("Goodbye!");
            break;
        } else {
            System.out.println("Invalid input. Please try again.");
        }
        }
        
    }
}

