public class Tablet extends Electronics {
  // Instance variables
  private double cameraMP;

  // No argument constructor
  public Tablet() {
    cameraMP = 10.0;
  }

  // Parameterized constructor
  public Tablet(double price, double screenSize, String brand, int device, double cameraMP) {
    super(price, screenSize, brand, device);
    this.cameraMP = cameraMP;
  }

  // Getter method
  public double getCameraMP() {
    return cameraMP;
  }

  // Accessor (Setter) method
  public void setCameraMP(double cameraMP) {
    this.cameraMP = cameraMP;
  }

 /* toString method
  * Gets the information about the tablet, like the screen size
  * As well as the cameraMP 
  * Returns that information plus the information from the superclass toString method to be printed.
  */
  public String toString() {
    return super.toString() + " " + getScreenSize() + " inch screen " + "with a " + cameraMP + "MP camera";
  }
}