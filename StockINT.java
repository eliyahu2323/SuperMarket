import java.io.FileNotFoundException;

public interface StockINT {

    public void AddIporter(Iporter d);
    public void AddIporterFromFile(String company) throws FileNotFoundException;
    public void initFileStock() ;


    }
