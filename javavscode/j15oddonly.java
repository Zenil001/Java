import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class j15oddonly implements ActionListener{
    JFrame jf;
    JLabel lbllimit, lbleven, lblodd;
    JButton btnans;
    JTextField txtlimit, txteven, txtodd;




    public j15oddonly(){
        jf = new JFrame();
        lbllimit = new JLabel("Enter Limit: ");
        lbllimit.setBounds(100, 70, 100, 30);

        lbleven = new JLabel("Even Values");
        lbleven.setBounds(100, 150, 100, 30);

        lblodd = new JLabel("Odd Values: ");
        lblodd.setBounds(100, 200, 100, 30);
        
        btnans=new JButton("Submit");
        btnans.setBounds(150, 110, 100, 30);

        txtlimit = new JTextField(5);
        txtlimit.setBounds(200, 70, 100, 30);

        txteven = new JTextField(7);
        txteven.setBounds(200, 150, 130, 30);

        txtodd = new JTextField(7);
        txtodd.setBounds(200, 200, 130, 30);


        jf.add(lbllimit);
        jf.add(lbleven);
        jf.add(lblodd);
        jf.add(btnans);
        jf.add(txtlimit);
        jf.add(txteven);
        jf.add(txtodd);

        btnans.addActionListener(this);

        jf.setSize(400, 380);
        jf.setLayout(null);
        jf.setVisible(true);  


    }
    public static void main(String[]args)
    {
        new j15oddonly();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int i,no=Integer.parseInt(txtlimit.getText());
        String s1="",s2="";

        for(i=1;i<=no;i++)
        {
            if (i%2==0) 
            {   
                s1+=" , " + i;
                txteven.setText(no+" ");
                txteven.setText(s1+" ");
            } 
            else 
            {
                s2+=" , " + i;
                txtodd.setText(no+" ");
                txtodd.setText(s2+" ");
            } 
        }
    }     


}
