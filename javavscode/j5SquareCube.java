
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class j5SquareCube implements ActionListener  {

    JFrame jf1;
    JLabel lblno,lblans;
    JButton btnans;
    JTextField txtno,txtans;

    public j5SquareCube() {
    jf1=new JFrame();//creating instance of JFrame  

    lblno=new JLabel("No");
    lblno.setBounds(100,100 , 100, 30);

    lblans=new JLabel("Square");
    lblans.setBounds(100, 200, 100, 30);


    btnans=new JButton("Click me");
    btnans.setBounds(100, 150, 100, 40);

    txtno=new JTextField(5);
    txtno.setBounds(200,100 , 100, 30);
    
    txtans=new JTextField(5);
    txtans.setBounds(200, 200, 100, 30);


    
        jf1.add(lblno);
        jf1.add(txtno);
        jf1.add(btnans);
        jf1.add(lblans);
        jf1.add(txtans);

        btnans.addActionListener(this);

        jf1.setSize(700, 500); // 400 width and 500 height
        jf1.setLayout(null); // using no layout managers
        jf1.setVisible(true); // making the frame visible
    }
public static void main(String[] args) {
    new j5SquareCube();

    
    
}
   @Override
    public void actionPerformed(ActionEvent e) {

        int no = Integer.parseInt(txtno.getText() +"");

        txtans.setText((no*no) + "");

    }
    
}
