import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class j14factorial  implements ActionListener 
{
    JFrame jf;
    JLabel lblno1, lblfact, lblans;
    JTextField txtno1, txtfact, txtans;
    JButton btnans;



    public j14factorial()
    {
        jf =new JFrame();

        lblno1 = new JLabel("Enter Number: ");
        lblno1.setBounds(100, 100, 100, 30);

        lblfact = new JLabel("Factoial Series");
        lblfact.setBounds(100, 150, 100, 30);

        lblans = new JLabel("Factorial Ans: ");
        lblans.setBounds(100, 200, 100, 30);

        txtno1 = new JTextField(5);
        txtno1.setBounds(200, 100, 100, 30);

        txtfact = new JTextField(6);
        txtfact.setBounds(200, 150, 150, 40);

        txtans = new JTextField(5);
        txtans.setBounds(200, 200, 150, 30);

        btnans = new JButton("Submit");
        btnans.setBounds(200, 250, 100, 40);

        jf.add(lblno1);
        jf.add(lblfact);
        jf.add(lblans);
        jf.add(txtno1);
        jf.add(txtfact);
        jf.add(txtans);
        jf.add(btnans);

        btnans.addActionListener(this);

        jf.setSize(400, 380);
        jf.setLayout(null);
        jf.setVisible(true);


    }
    public static void main(String[]args)
    {
        new j14factorial();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        int i,fact=1;
        String s="";  
        int number=Integer.parseInt(txtno1.getText());
        
        for(i=1;i<=number;i++){
            s+=" * " + i;
            fact=fact*i;    
        }    
        txtfact.setText(s+" ");
        txtans.setText(number+" Factorial: "+fact);
    
    
    
    
    
    
    
    }

}

