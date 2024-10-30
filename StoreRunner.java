import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates an input Scanner object
    Scanner input = new Scanner(System.in);
    
    Electronics store = new Electronics();
    Computer newComp = new Computer();
    Tablet newTablet = new Tablet();
    int choice = 0; 

    // Prompts the store selection menu untill the user picks choice 3 which quits the program. 
    while (choice <= 2) {
      System.out.println("What would you like to buy? \n 1. Computer \n 2. Tablet \n 3. I'd like to quit (1/2/3)"); 
      // Sets the choice to the integer typed in the console. 
      choice = input.nextInt();
      store.setDevice(choice);
      /* If the choice is 1, it chooses the computer,
       * If the choice is 2, it chooses the laptop
       */
      if (choice == 1) {
        System.out.println("What brand of computers would you like to purchase? Apple or Windows");
        store.setBrand(input.next());
        /* gets the brand
         * adds an amount to the price based on the brand
         */
        if (store.getBrand().equalsIgnoreCase("Apple")) {
          store.addToPrice(226.17);
        } else {
          store.addToPrice(125.0);
        }
        System.out.println("Is it a laptop? (y/n)");
        newComp.setIsLaptop(input.next());
        if(newComp.getIsLaptop() == true) {
          store.addToPrice(100.0);
          System.out.println("Is the Laptop Touch Screen? (y/n)");
          newComp.setIsTouchscreen(input.next());
          if (newComp.getIsTouchscreen()  == true) {
            store.addToPrice(100.0);
          } else {
            store.addToPrice(50.0);
          }
          System.out.println("What screen size should the laptop be?");
          store.setScreenSize(input.nextDouble());
        } else {
           store.addToPrice(50.0);
          System.out.println("What size monitor would you like with the desktop?");
          store.setScreenSize(input.nextDouble());
        }
        store.addToPrice(store.getScreenSize() * 6.6);
        System.out.println("Reciept: $" + store.getPrice() + newComp.toString());
      } 
      else if (choice == 2) {
        System.out.println("What tablet brand would you like to purchase? Apple or Android");
        store.setBrand(input.next());
        /* gets the brand
         * adds an amount to the price based on the brand
         */
        if (store.getBrand().equalsIgnoreCase("Apple")) {
          store.addToPrice(150.99);
        } else {
          store.addToPrice(75.99);
        }
        System.out.println("What should the camera resolution be? (in megapixels)");
        newTablet.setCameraMP(input.nextDouble());
        // Adds to the price based on the cameraMP multiplied by 1.25
        store.addToPrice(newTablet.getCameraMP() * 1.25);
        System.out.println("What screen size should the tablet be?");
        store.setScreenSize(input.nextDouble());
        // Adds to the price based on the screenSize multiplied by 6.6
        store.addToPrice(store.getScreenSize() * 6.6);
        System.out.println("Reciept: $" + store.getPrice() + newTablet.toString());
      }
    }


    // Closes the Scanner object
    input.close();
    
  }
}