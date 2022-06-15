import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class WindowsCompany extends JFrame {
    private Stock s;



    public static void main(String s[]) {
        JFrame frame = new JFrame("JFrame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        // JPanel panel = new JPanel();
        //JLabel label = new JLabel("JFrame By Example");
        JButton button1 = new JButton("Osem");
        Icon icon = new ImageIcon("osem.jpg");
        button1.setIcon(icon);
        JButton button2 = new JButton();
        icon = new ImageIcon("elit.jpg");
        button2.setIcon(icon);

        JButton button3 = new JButton("Liman");
        JButton button4 = new JButton("Coca Cola");
        JButton button5 = new JButton("Tempo");
        JButton button6 = new JButton("Einat");
        JButton button7 = new JButton("Globrans Sigaret");
        JButton button8 = new JButton("Filip Moris");
        JButton button9 = new JButton("Schweppes");

        // frame.add(panel);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);

        //Click on the botton
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WindowsProducts win = new WindowsProducts("Osem");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WindowsProducts win = new WindowsProducts("Elit");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WindowsProducts win = new WindowsProducts("Liman");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WindowsProducts win = new WindowsProducts("Coca Cola");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WindowsProducts win = new WindowsProducts("Tempo");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WindowsProducts win = new WindowsProducts("");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WindowsProducts win = new WindowsProducts("");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WindowsProducts win = new WindowsProducts("");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WindowsProducts win = new WindowsProducts("");
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        });

        frame.setLayout(new GridLayout(3, 4));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }


}
