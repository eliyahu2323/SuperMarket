public class Product {

    private String name;
    private int barcode;
    private double cost;
    private int Amount;

    public Product(String n, int b, double p) {
        this.name = n;
        this.barcode = b;
        this.cost = p;
        this.Amount = 0;
    }
    /*
    Getters and Setters
     */
    public double GetCost() {
        return cost;
    }

    public void SetCost(double cost) {
        this.cost = cost;
    }

    public String GetName() {
        return this.name;
    }

    public int GetBarcode() {
        return this.barcode;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public void SetAmount(int num) {
        this.Amount += num;
    }

    public int GetAmount() {
        return this.Amount ;
    }

    public String toString() {
        return "\n" + "{" + "\n" + "name:  " + this.name + " \n, " + "barcode: " + this.barcode + "\n" + "}";

    }




}
