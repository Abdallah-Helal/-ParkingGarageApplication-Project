
//singelton class
public abstract class Garage {
    protected static Garage obj;
    protected int slotsNum;
    protected Slot[] slots;
    protected long totalIncome;

    // privte constructor to prevent for making more than one object
    protected Garage() {
        totalIncome = 0;
    }

    public static Garage setGarage(int x) {
        if (obj == null && x == 1)
            obj = new FCFSGarage();
        else if (obj == null && x == 2)
            obj = new BestFitGarage();
        return obj;
    }

    public void setSlotsNum(int s) {
        slotsNum = s;
        slots = new Slot[slotsNum];
        for (int i = 0; i < slotsNum; i++) {
            slots[i] = new Slot();
        }
    }

    public void setSlotLenWid(double l, double w, int i) {
        slots[i].setSlotLength(l);
        slots[i].setSlotWidth(w);
    }

    public void displaySlots() {
        for (int i = 0; i < slotsNum; i++) {
            System.out.print("Slot id: ");
            System.out.println(i + 1);
            slots[i].displaySlotsData();
        }
    }

    public void updateTotalIncome(int i) {
        totalIncome += slots[i].getFees();
    }

    public long getTotalIncome() {
        return totalIncome;
    }

    public void displayAvailableSLots() {
        System.out.print("Available Slots:");
        for (int i = 0; i < slotsNum; i++) {
            if (slots[i].isEmpty() == true) {
                System.out.print(i + 1);
                System.out.print(' ');
            }
        }
        System.out.println();
        System.out.println();
    }

    public boolean garageIsFull() {
        for (int i = 0; i < slotsNum; i++) {
            if (slots[i].isEmpty())
                return false;
        }
        return true;
    }

    public abstract void parkin(Vehicle v);

    public void parkout(int carID) {
        for (int j = 0; j < slotsNum; j++) {
            if (slots[j].getSId() == carID) {
                slots[j].parkOut();
                updateTotalIncome(j);
                break;
            }
        }
    }

}