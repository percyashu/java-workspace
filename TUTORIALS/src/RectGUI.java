import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RectGUI extends JFrame {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 200;
    private JLabel label;
    private JTextField rField;
    private JTextField dField;
    private JTextField cField;
    private Graphics g;
    private int r;
    private int d;
    private String c;
    private double area;
    private Rectangle rectangle;


    public RectGUI()
    {
        setTitle("Circle Area GUI");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createContents();
        setVisible(true);
    }
    private void createContents()
    {
        Listener listener = new Listener();
        JLabel label1 = new JLabel("Enter color of Rectangle");
        add(label1);
        cField = new JTextField("",24);
        add(cField);
        JLabel label = new JLabel("Enter radius of Rectangle");
        add(label);
        rField = new JTextField("",23);
        add(rField);
        JLabel label2 = new JLabel("Enter Diameter of Rectangle");
        add(label2);
        dField = new JTextField("",21);
        add(dField);
        JButton btn = new JButton("Enter    ");
        add(btn);


        cField.addActionListener(listener);
        rField.addActionListener(listener);
        dField.addActionListener(listener);
        btn.addActionListener(listener);

    }
    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int rad;
            int dia;
            double are;
            RectGUI rect = new RectGUI();
            c = cField.getText();
            try {
                r = Integer.parseInt(rField.getText());
                d = Integer.parseInt(dField.getText());
            } catch (NumberFormatException nfe) {
                r = -1;
                d = -1;
            }
            if (r < 0||d<0) {
                JOptionPane.showMessageDialog(rect, "Area is undefined" );
            } else {
                rectangle = new Rectangle(r,d,c);
                rectangle.setR(r);
                rectangle.setD(d);
                rectangle.setColor(c);
                String cl = rectangle.getColor();
                are=rectangle.Area();


                JOptionPane.showMessageDialog(rect, "Area is "+ are+ " and color is "+cl);


            }
        }
    }


    public static void main(String args[]){
        new RectGUI();


    }


}
