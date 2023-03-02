import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class j27menu implements ActionListener
{
    JFrame frame;
    JComboBox<String> c1,c2,c3,c4;
    JLabel lblitm, lblqty, lblsum,lblfinaltotal;
    JTextField qty1, qty2, qty3,qty4,sum1,sum2,sum3,sum4,txtfinaltotal;
    JButton btnans;


    public j27menu() {
        frame = new JFrame();

        lblqty = new JLabel("Enter Qty");
        lblqty.setBounds(50,40,80,30);

        lblitm = new JLabel("Select Items");
        lblitm.setBounds(170,40,80,30);

        lblsum = new JLabel("Sum Amount");
        lblsum.setBounds(280, 40,80,30);

        c1 = new JComboBox<String>(new String[] {"VEG PIZZA", "NON VEG PIZZA", "PIZZA MANIA"}); 
        c1.setBounds(160,100,100,30);
        
        c2 = new JComboBox<String>(new String[] {"NUTELLA SANDWICH", "GRILLED SANDWICH", "VEG SANDWICH" }); 
        c2.setBounds(160,150,100,30);

        c3 = new JComboBox<String>(new String[] {"LATTE", "HOT CHOCOLATE", "CAPPUCCINO"}); 
        c3.setBounds(160,200,100,30);

        c4 = new JComboBox<String>(new String[] { "CHEESECAKE", "CHOCOLATE CAKE", "CHERRY CAKE"}); 
        c4.setBounds(160,250,100,30);

        qty1 = new JTextField(7);
        qty1.setBounds(40,100,100,30);

        qty2 = new JTextField(7);
        qty2.setBounds(40,150,100,30);

        qty3 = new JTextField(7);
        qty3.setBounds(40,200,100,30);

        qty4 = new JTextField(7);
        qty4.setBounds(40,250,100,30);

        sum1 = new JTextField(7);
        sum1.setBounds(280,100,100,30);

        sum2 = new JTextField(7);
        sum2.setBounds(280,150,100,30);

        sum3 = new JTextField(7);
        sum3.setBounds(280,200,100,30);

        sum4 = new JTextField(7);
        sum4.setBounds(280,250,100,30);

        btnans = new JButton("Place Order");
        btnans.setBounds(120,320,140,30);

        lblfinaltotal = new JLabel("Payable Amount:");
        lblfinaltotal.setBounds(60,380,100,30);

        txtfinaltotal = new JTextField(7);
        txtfinaltotal.setBounds(200,380,100,30);

        frame.add(c1);
        frame.add(c2);
        frame.add(c3);
        frame.add(c4);
        frame.add(lblitm);
        frame.add(lblqty);
        frame.add(lblsum);
        frame.add(qty1);
        frame.add(qty2);
        frame.add(qty3);
        frame.add(qty4);
        frame.add(sum1);
        frame.add(sum2);
        frame.add(sum3);
        frame.add(sum4);
        frame.add(btnans);
        frame.add(lblfinaltotal);
        frame.add(txtfinaltotal);

        btnans.addActionListener(this);    
        c1.addActionListener(this);  
        c2.addActionListener(this);
        c3.addActionListener(this);
        c4.addActionListener(this);


        frame.setSize(470, 520); // increased frame size
        frame.setLayout(null);
        frame.setVisible(true);
       

    }
    public  static void main(String[]args)
    {
        new j27menu();
}
    @Override
    public void actionPerformed(ActionEvent e) {
            }

}
