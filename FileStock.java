import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.Iterator;

public class FileStock {


    /*
    Function write stock to file json
     */
    public static void initFileStock(Stock s) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(s);
        try {
            FileWriter writer = new FileWriter("Stock.json");
            writer.write(json);
            writer.close();


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /*
    Function read file Stock and return object Stock
     */
    public static Stock ReadStockFile() throws FileNotFoundException {

        File file = new File("Stock.json");
        //  System.out.println(file.exists());
        if (!file.exists()) {
            System.out.println("File not exists");
            return null;
        }


        FileReader reader = new FileReader("Stock.json");

        Gson gson = new Gson();
        Stock stock = gson.fromJson(reader, Stock.class);
        return stock;
    }

    /*
    Function add company to Stock file
     */
    public static void AddIporterFromFile(String company) throws FileNotFoundException {
        Stock s = ReadStockFile();//save old data
        // System.out.println(s);
        Iporter d = GetIporterFile(company);//read company and save in object Iporter
        // System.out.println(d);
        Iterator<Iporter> it = s.GetIporter().iterator();
        if (s.GetIporter().isEmpty()) {
            s.AddIporter(d);
        } else {
            while (it.hasNext()) {
                if (it.next().GetKey() == (d.GetKey())) {
                    s.RemoveIporter(d.GetKey());
                    break;
                }
            }
        }
        s.AddIporter(d);
        initFileStock(s);
    }


    /*
    Function remove Iporter from stock
     */
    public static void RemoveIporterFromFile(int key) throws FileNotFoundException {
        Stock s = ReadStockFile();//save old data
        Iterator<Iporter> it = s.GetIporter().iterator();
        if (s.GetIporter().isEmpty()) {
            System.out.println("The stock is empty");
        } else {
            while (it.hasNext()) {

                if (it.next().GetKey() == key) {
                    s.RemoveIporter(key);
                    break;
                }
            }
        }
        initFileStock(s);
    }


    /*
    Function return Iporter from file company
     */
    public static Iporter GetIporterFile(String NameCompany) throws FileNotFoundException {
        FileReader reader = new FileReader(NameCompany + ".json");
        Gson gson = new Gson();
        Iporter n = gson.fromJson(reader, Iporter.class);
        return n;
    }


}
