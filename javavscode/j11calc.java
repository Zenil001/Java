import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class j11calc implements ActionListener
{
    
    JFrame jf;
    JLabel lblno1, lblno2, lblfre, lblans;
    JButton btnsub, btnmulti, btndiv, btnadd;
    JTextField txtno1, txtno2, txtans;

    public j11calc() {
        jf = new JFrame();

        lblno1 = new JLabel("EnterNO1=>");
        lblno1.setBounds(100, 100, 100, 30);

        lblno2 = new JLabel("EnterNo2=>");
        lblno2.setBounds(100, 150, 100, 30);

        lblans = new JLabel("Ans=");
        lblans.setBounds(100, 200, 100, 30);

        btnadd = new JButton("+");
        btnadd.setBounds(100, 300, 100, 40);

        btnmulti = new JButton("*");
        btnmulti.setBounds(250, 300, 100, 40);

        btndiv = new JButton("/");
        btndiv.setBounds(400, 300, 100, 40);

        btnsub = new JButton("-");
        btnsub.setBounds(550, 300, 100, 40);

        txtno1 = new JTextField(5);
        txtno1.setBounds(200, 100, 100, 30);

        txtno2 = new JTextField(5);
        txtno2.setBounds(200, 150, 100, 30);

        txtans = new JTextField(5);
        txtans.setBounds(200, 200, 100, 30);
        
        jf.add(lblno1);
        jf.add(lblno2);
        jf.add(lblans);
        jf.add(btnadd);
        jf.add(btnsub);
        jf.add(btnmulti);
        jf.add(btndiv);
        jf.add(txtno1);
        jf.add(txtno2);
        jf.add(txtans);

        btnadd.addActionListener(this);
        btnsub.addActionListener(this);
        btnmulti.addActionListener(this);
        btndiv.addActionListener(this);

        jf.setSize(700, 500);
        jf.setLayout(null);
        jf.setVisible(true);  
    }

    public static void main(String[] args)
    {
        new j11calc();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        int no1 = Integer.parseInt(txtno1.getText());
        int no2 = Integer.parseInt(txtno2.getText());
        int ans = 0;
        
        if (e.getSource()==btnadd) 
        {
            ans=no1+no2;
        } 
        else if(e.getSource()==btnsub)
        {
            ans=no1-no2;
        } 
        else if(e.getSource()==btnmulti)
        {
            ans=no1*no2;
        } 
        else if(e.getSource()==btndiv)
        {
            ans=no1/no2;
        }
        
        txtans.setText(ans+"");
    }
}
