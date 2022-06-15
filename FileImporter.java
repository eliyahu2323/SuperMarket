import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileImporter {

    /*
    function create new file of company
     */
    public static void initFilemIporter(String Namecompany, Iporter d) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(d);
        //System.out.println(json);

        try {
            FileWriter writer = new FileWriter(Namecompany + ".json");
            writer.write(json);
            writer.close();


        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /*
     function add product for company and save file.
     */
    public static void addProductToFile(String NameCompany, Product p) throws FileNotFoundException {
        FileReader reader = new FileReader(NameCompany + ".json");
        Gson gson = new Gson();
        Iporter n = gson.fromJson(reader, Iporter.class);
        n.AddProduct(p);
        initFileIporter(NameCompany, n);
    }

    static void initFileIporter(String nameCompany, Iporter n) {
    }

    /*
     function return object Iporter from file company
     */
    public static Iporter GetIporter(String NameCompany) throws FileNotFoundException {
        FileReader reader = new FileReader(NameCompany + ".json");
        Gson gson = new Gson();
        Iporter n = gson.fromJson(reader, Iporter.class);
        return n;
    }




    }