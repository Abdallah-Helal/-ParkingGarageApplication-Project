import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter num for your system ");
        System.out.println("1-first come first served slots");
        System.out.println("2-best-fit");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        int  systemconfig = myObj.nextInt();  // Read user input
        //if systemconfig==1 it means garage system will be first come first served slots
        //else it will be best-fit

        System.out.println("Enter num for your system Slots");
        Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
        int  slotsnum  = myObj1.nextInt();  // Read user input
        //use singelton methode 
        Garage g1 = Garage.setGarage(systemconfig);
        g1.setSlotsNum(slotsnum);

        for (int i = 0; i < slotsnum; i++) {
            System.out.print("Enter the dimensions of slot's ");
            System.out.print(i+1);
            System.out.print(" width & lenght ");

            Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
            double  wid  = myObj2.nextDouble();  // Read user input for width

            Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
            double  len  = myObj3.nextDouble();  // Read user input for length

            g1.setSlotLenWid(len,wid, i);
        }

        g1.displaySlots();
        ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
        
        boolean x=true;
        while(x)
        {

            System.out.println(" 1- park In ");
            System.out.println("2- park out ");
            System.out.println("3- Display Available SLots ");
            System.out.println("4- exit ");
             
            Scanner sc = new Scanner(System.in);  // Create a Scanner object
            int  ch  = sc.nextInt();  // Read user input 

            switch(ch)
            {
                case 1:
                {
                    System.out.println(" Add vehicle ");
                    System.out.print("Enter the car information model, model year , width, lenght and ID: ");
                    Scanner myObj0= new Scanner(System.in);  // Create a Scanner object
                    String  model  = myObj0.nextLine();  // Read user input for width
            
                    Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
                    String  year  = myObj2.nextLine();  // Read user input for width
            
                    Scanner myObj3 = new Scanner(System.in);  // Create a Scanner object
                    double  wid  = myObj3.nextDouble();  // Read user input for length
            
                    Scanner myObj4 = new Scanner(System.in);  // Create a Scanner object
                    double  len  = myObj4.nextDouble();  // Read user input for length
                    
                    Scanner sc1 = new Scanner(System.in);  // Create a Scanner object
                    int  id  = sc1.nextInt();  // Read user input 

                    Vehicle car = new Vehicle(model,year,id,len,wid);
                    vehicle.add(car);
                    g1.parkin(car);
                    break;
                    
                }
                case 2:
                {
                    System.out.println(" Add vehicle ID ");
                    Scanner sc1 = new Scanner(System.in);  // Create a Scanner object
                    int  id  = sc1.nextInt();  // Read user input 

                    for(int i=0;i<vehicle.size();i++)
                    {
                        if(vehicle.get(i).getId()==id)
                        {
                            g1.parkout(vehicle.get(i).getId());
                            vehicle.remove(i);
                            break;
                        }
                    }
                    break;
                }
                case 3:
                {
                    g1.displayAvailableSLots();
                    break;
                }
                default:
                {
                    x=false;
                }

            }




        }
        System.out.print("Total Income: ");
        System.out.println(g1.getTotalIncome());
        System.out.println();
      
    }

}
