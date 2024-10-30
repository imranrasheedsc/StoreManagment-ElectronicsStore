public class Computer extends Electronics {
  // Instance variables
  private boolean isLaptop;
  private boolean isTouchscreen;

  // Default constructor values
  public Computer() {
    isLaptop = false;
    isTouchscreen = false;
  }

  // Parameterized constructor
  public Computer(double price, double screenSize, String brand, int device, boolean isLaptop, boolean isTouchscreen) {
    super(price, screenSize, brand, device);
    this.isLaptop = isLaptop;
    this.isTouchscreen = isTouchscreen;
  }

  // Getter methods
  public boolean getIsTouchscreen() {
    return isTouchscreen;
  }

  public boolean getIsLaptop() {
    return isLaptop;
  }

  /* Accessor methods
   * Sets the value based on the option inputted
   * if the option inputted is "y" then it sets the value of the variable to true
   * if the option inputted is "n" then it sets the value of the variable to false
   */
  public void setIsLaptop(String option) {
    if (option.equalsIgnoreCase("Y")) {
       this.isLaptop = true;
    } else {
       this.isLaptop = false;
    }
  }
  
  public void setIsTouchscreen(String option) {
     if (option.equalsIgnoreCase("Y")) {
       this.isTouchscreen = true;
     } else {
       this.isTouchscreen = false;
     }
   }

   /* toString method
    * Gets the information about the computer, like its deviceType (Laptop or Deskop)
    * If the device is touchscreen aswell as the size of the screen
    * and returns that information plus the information from the superclass toString method to be printed.
    */
   public String toString() {
      String TouchStatus = " Touchscreen ";
      String deviceType = "Laptop";
      String screenType = "screen";
      if (this.isTouchscreen == false) {
         TouchStatus = "";
      }
      if (this.isLaptop == false) {
        deviceType = " Desktop";
        screenType = "Monitor";
      }
      return super.toString() + TouchStatus + deviceType + " with a " + getScreenSize() + " inch " + screenType;
   }
}