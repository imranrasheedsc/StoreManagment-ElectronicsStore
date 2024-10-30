public class Electronics {
  // Instance variables
  private double price;
  private double screenSize;
  private String brand;
  private int device;

  // Default constructor values
  public Electronics() {
    this(20.00, 16.5, "Windows", 0);
  }

  // Parameterized constructor
  public Electronics(double price, double screenSize, String brand, int device) {
    this.price = price;
    this.screenSize = screenSize;
    this.brand = brand;
    this.device = device;
  }

  // Getter Methods
  public double getPrice() {
    return price;
  }

  public double getScreenSize() {
    return screenSize;
  }

  public String getBrand() {
    return brand;
  }
  
  public int getDevice() {
    return device;
  }

  // Accessor methods
  public void setScreenSize(double screenSize) {
    this.screenSize = screenSize;
  }

  public void setDevice(int device) {
    this.device = device;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }
  
  // Adds a specified value to the price variable.
  public void addToPrice(double price) {
    this.price += price;
  }
  
  /* Tostring method, combines information together 
   * such as the brand and deviceName and then returns it.
   */

  public String toString() {
    String deviceName = "Computer";
    if (device == 2) {
      deviceName = "Tablet";
    }
    return "\n" + brand + " " + deviceName;
  }
  
}