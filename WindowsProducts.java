import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.util.Iterator;

public class WindowsProducts {

    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    WindowsProducts(String company) throws FileNotFoundException {
        frame.setLayout(new GridLayout(5, 4));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        Iporter d = FileImporter.GetIporter(company);
        Iterator<Product> it = d.GetProduct().iterator();
        while (it.hasNext()) {
            frame.add(new JButton(it.next().GetName()));
        }
    }

}
