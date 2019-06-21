import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class circleGUI extends JFrame {
    private static final int WIDTH = 480;
    private static final int HEIGHT = 200;
    private JLabel label;
    private JTextField rField;
    private JTextField cField;

    private int r;
    private String c;
    private double area;
    private Circle  circle;


    public circleGUI()
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
        JLabel label1 = new JLabel("Enter color of Circle");
        add(label1);
        cField = new JTextField("",27);
        add(cField);
        JLabel label = new JLabel("Enter radius of Circle");
        add(label);
        rField = new JTextField("",26);
        add(rField);
        JButton btn = new JButton("Enter    ");
        add(btn);


        cField.addActionListener(listener);
        rField.addActionListener(listener);
        btn.addActionListener(listener);

    }
    private class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int rad;
            double are;
            circleGUI Circle = new circleGUI();
            c = cField.getText();
            try {
                r = Integer.parseInt(rField.getText());
            } catch (NumberFormatException nfe) {
                r = -1;
            }
            if (r < 0) {
                JOptionPane.showMessageDialog(Circle, "Area is undefined" );
            } else {
                circle = new Circle(r,c);
                circle.setRadius(r);
                circle.setColor(c);
                String cl = circle.getColor();
                are=circle.Area();

                JOptionPane.showMessageDialog(Circle, "Area is "+ are+" Color is "+cl);


            }
        }
    }


 public static void main(String args[]){
     new circleGUI();


        }


}
