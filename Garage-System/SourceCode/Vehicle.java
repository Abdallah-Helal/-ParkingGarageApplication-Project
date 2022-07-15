//class Vehicle with its attributes and methods
public class Vehicle {
    private String modelName;
    private int id;
    private String modelYear;
    private double vehicleLength;
    private double vehicleLwidth;
    //default constructor
    public Vehicle(){}

    //parametrize constructor
    public Vehicle(String mN,String mY,int i,double l,double w){
        modelName = mN;
        modelYear = mY;
        id = i;
        vehicleLength = l;
        vehicleLwidth = w;
    }
    //setter
    public void setModName(String modname){
        modelName = modname ;
    }
    public void setId(int i){
        id = i;
    }
    public void setModYear(String modyear){
        modelYear = modyear ;
    }
    public void setVLength(double vlen){
        vehicleLength = vlen ;
    }
    public void setVWidth(double vwid){
        vehicleLwidth = vwid ;
    }
    //getter
    public String getModelName(){
        return modelName;
    }
    public int getId(){
        return id ;
    }
    public String getModelYear(){
        return modelYear ;
    }
    public double getVehicleLength(){
        return vehicleLength ;
    }
    public double getVehicleWidth(){
        return vehicleLwidth ;
    }
    //display  Vehicle  Data
    void displyVehicleData(){
        System.out.print("Model Name: ");
        System.out.println(modelName);
        System.out.print("ID: ");
        System.out.println(id);
        System.out.print("Model Year: ");
        System.out.println(modelYear);
        System.out.print("Car Length: ");
        System.out.println(vehicleLength);
        System.out.print("Car width: ");
        System.out.println(vehicleLwidth);
        System.out.println();


    }
}