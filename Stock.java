import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

public class Stock extends FileStock {

    private ArrayList<Iporter> stock;
    private int AmountProduct;
    private double ValueOfProduct;


    public Stock() {
        this.stock = new ArrayList<Iporter>();
        this.AmountProduct = 0;
        this.ValueOfProduct = 0;

    }

    public void RemoveIporter(int key) {
        Iterator<Iporter> it = stock.iterator();
        while (it.hasNext()) {
            if (it.next().GetKey() == key) {
                it.remove();
            }
        }
    }

    public void UpdateProductToFileStock(int key, int barcode, int count) throws FileNotFoundException {
        Stock s = ReadStockFile();//save old data
        Iterator<Iporter> it = s.GetIporter().iterator();
        while (it.hasNext()) {
            Iporter d = it.next();
            if (d.GetKey() == key) {

                Iterator<Product> p = d.GetProduct().iterator();
                while (p.hasNext()) {
                    Product pr = p.next();
                    if (pr.GetBarcode() == barcode) {
                        pr.SetAmount(count);
                        s.SetAmountProduct(count);
                        break;
                    }
                }
            }

        }
        initFileStock(s);
    }

    public ArrayList<Iporter> GetIporter() {
        return stock;
    }

    public void AddIporter(Iporter d) {
        this.stock.add(d);
    }

    public int GetAmountProduct() {
        return this.AmountProduct;
    }

    public double GetValueOfProduct() {
        return this.ValueOfProduct;
    }

    public void SetAmountProduct(int p) {
        this.AmountProduct += p;
    }

    public void SetValueOfProduct(double p) {
        this.ValueOfProduct += p;
    }

    public String toString() {
        return stock.toString();

    }


}
