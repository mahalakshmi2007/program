class Battery {
    private int capacity;
    public Battery(int capacity) {
        this.capacity = capacity;
    }
public int getCapacity(){
  return capacity;
}
}
class Mobile{
  private Battery battery;
  public Mobile(int batteryCapacity){
    this.battery=new Battery(batteryCapacity);
  }
  public void showBatteryCapacity(){
    System.out.println("Battery capacity:"+battery.getCapacity());
  }
  }
  public class Composition{
    public static void main(String[]args){
      Mobile m=new Mobile(5000);
      m.showBatteryCapacity();
    }
  }
