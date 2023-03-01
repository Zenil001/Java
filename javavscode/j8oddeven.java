import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class j8oddeven implements ActionListener {

    JFrame jf1;
    JLabel lblno, lblans;
    JButton btnans;
    JTextField txtno, txtans;
    private static j8oddeven j8oddeven;

    public j8oddeven(){

        jf1 = new JFrame();

        lblno = new JLabel("No");
        lblno.setBounds(100, 100, 100, 30);

        lblans = new JLabel("Odd/Even");
        lblans.setBounds(100,200 ,100 ,30);

        btnans = new JButton("Click me");
        btnans.setBounds(100, 150, 100, 40);

        txtno = new JTextField(5);
        txtno.setBounds(200, 100, 100, 30);

        txtans = new JTextField(5);
        txtans.setBounds(200, 200, 100, 30);

        jf1.add(lblno);
        jf1.add(txtno);
        jf1.add(btnans);
        jf1.add(lblans);
        jf1.add(txtans);

        btnans.addActionListener(this);

        jf1.setSize(700,500);
        jf1.setLayout(null);
        jf1.setVisible(true);

    }

    
    public static void main(String[] args){
    
        j8oddeven = new j8oddeven();

    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
    
        int no = Integer.parseInt(txtno.getText());
            if (no%2==0) 
            {
                txtans.setText("Even");
            } else {
                txtans.setText("Odd");
            }
        
     
    }


    
}
