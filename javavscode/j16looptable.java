import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class j16looptable  implements ActionListener
{
    JFrame jf;
    JLabel lblno, lblarea;
    JButton btnans;
    JTextField txtno;
    JTextArea area;

    public j16looptable()
    {
        jf = new JFrame();

        lblno = new JLabel(" Enter Number: ");
        lblno.setBounds(70, 70, 100, 30);

        lblarea = new JLabel("Table of Number: ");
        lblarea.setBounds(70, 150, 100, 30);
        
        btnans=new JButton("Submit");
        btnans.setBounds(100, 110, 100, 30);

        txtno = new JTextField(5);
        txtno.setBounds(180, 70, 100, 30);

        area = new JTextArea(10, 10);
        area.setBounds(180, 150, 250, 200);

        jf.add(lblno);
        jf.add(lblarea);
        jf.add(btnans);
        jf.add(txtno);
        jf.add(area);

        btnans.addActionListener(this);

        jf.setSize(500, 480);
        jf.setLayout(null);
        jf.setVisible(true);  
    }
     public static void main(String[] args) {
        new j16looptable();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int i=Integer.parseInt(txtno.getText());
        String s="";
        int no=Integer.parseInt(txtno.getText());

        for(i=1;i<=10;i++){
            s+=no+" * "+i+" = "+(no*i+"\n"); 
        }  area.setText(s+" ");  

    }
    
    
}
