import java.io.IOException;
import java.util.List;

public interface Iporter_Inte {

	public void AddProduct(Product p);
	public void RemoveProduct(Product p);
	public List<Product> GetProduct();
	public int SizeProduct();

	
}
