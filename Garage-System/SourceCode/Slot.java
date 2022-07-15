import java.time.LocalTime;

public class Slot {
    private Vehicle vehicle;
    private int vehicleID;
    private Time time;
    private boolean empty;
    private double slotLength;
    private double slotWidth;
    private  static double pricePerHour=5;
    private double fees;

    //default constructor
    public Slot() {
        empty = true;
        time = new Time();
        fees = 0;
    }
    public Slot( Vehicle vehicle,Time time,boolean empty,double slotLength, double slotWidth, double fees)
    {
        this.vehicle=vehicle;
        this.time=time;
        this.empty=empty;
        this.slotLength=slotLength;
        this.slotWidth=slotWidth;
        this.fees=fees;
    }
    //setter
    public void setEmpty() {
        empty = true;
    }

    public void setNotEmpty() {
        empty = false;
    }

    public void setSlotLength(double Len) {
        slotLength = Len;
    }

    public void setSlotWidth(double wid) {
        slotWidth = wid;
    }
    

    //getter
    public boolean isEmpty() {
        return empty;
    }

    public double getSlotLength() {
        return slotLength;
    }

    public double getSlotWidth() {
        return slotWidth;
    }

    public int getSId() {
        return vehicleID;
    }

    public double getFees() {
        return fees;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }

    //setter the time
    public LocalTime aTime() {
        return time.getArrivalTime();
    }

    public LocalTime dTime() {
        return time.getDepartureTime();
    }

    //put the vehicle at the slot  
    public void parkIn(Vehicle v) {
        vehicle = v;
        fees = 0;
        time.setArrivalTime();
        setNotEmpty();
        vehicleID = vehicle.getId();
    }

    //calc the fees for long the time he used
    public double calculateFees() {
        fees = pricePerHour * (time.calculateTime());
        return fees;
    }

    //print and calc the fees for a vehicle and set the slot to be empty
    public void parkOut() {
        time.setDepartueTime();
        displayFees();
        setEmpty();
        vehicleID = 0;
    }
    
    public void  displayFees( )
    {
        System.out.print("Fees For Car");
        System.out.print(vehicleID);
        System.out.print(" : ");
        System.out.println(calculateFees());
    }

    //display Slot Data
    public void displaySlotsData() {
        System.out.print("SLot Length: ");
        System.out.println(slotLength);
        System.out.print("SLot Width: ");
        System.out.println(slotWidth);
        if (isEmpty())
            System.out.println("Empty");
        else {
            System.out.println("Not Empty");
        }
        System.out.println();
    }
}
