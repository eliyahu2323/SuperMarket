import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Iporter implements Iporter_Inte {

    private ArrayList<Product> ListProduct;
    private String NameCompany;
    private String NameIporter;
    private String NumberSearch;
    private int key;

    public Iporter(String company, String Iporter, String numberS,int keys) {
        this.ListProduct = new ArrayList<Product>();
        this.NameCompany = company;
        this.NameIporter = Iporter;
        this.NumberSearch = numberS;
        this.key=keys;
    }

    @Override
    public void AddProduct(Product p) {
        if (!this.ListProduct.contains(p)) {
            this.ListProduct.add(p);
        } else {
            System.out.println("This pruduct exists");
        }
    }

    @Override
    public void RemoveProduct(Product p) {
        if (ListProduct.contains(p)) {
            this.ListProduct.remove(p);
        } else {
            System.out.println("This pruduct not exists");
        }
    }

    public List<Product> GetProduct() {
        return ListProduct;
    }

    public int SizeProduct() {
        return ListProduct.size();
    }

    public String GetNameComp() {

        return this.NameCompany;
    }
    public int GetKey() {

        return this.key;
    }

    public String GetNameIporter() {

        return this.NameIporter;
    }

    public void SetNameIporter(String name) {
        this.NameIporter = name;
    }

    public String toString() {
        return this.GetProduct() + "\n";

    }


}
