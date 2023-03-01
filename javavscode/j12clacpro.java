import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.lang.model.util.ElementScanner14;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class  j12clacpro implements ActionListener 
{

    JFrame jf;
    JLabel lblans;
    JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnsub, btnmul, btnadd, btndiv, btnans;
    JTextField txtans;
    int no101=0;
    int no102=0;
    String op="";

    public  j12clacpro() 
    {
        jf = new JFrame();

        lblans = new JLabel("Ans=");
        lblans.setBounds(100, 100, 40, 30);

        btn0 = new JButton("0");
        btn0.setBounds(150, 300, 50, 30);

        btn1 = new JButton("1");
        btn1.setBounds(100, 150, 50, 30);

        btn2 = new JButton("2");
        btn2.setBounds(150, 150, 50, 30);

        btn3 = new JButton("3");
        btn3.setBounds(200, 150, 50, 30);

        btn4 = new JButton("4");
        btn4.setBounds(100, 200, 50, 30);

        btn5 = new JButton("5");
        btn5.setBounds(150, 200, 50, 30);

        btn6 = new JButton("6");
        btn6.setBounds(200, 200, 50, 30);

        btn7 = new JButton("7");
        btn7.setBounds(100, 250, 50, 30);

        btn8 = new JButton("8");
        btn8.setBounds(150, 250, 50, 30);

        btn9 = new JButton("9");
        btn9.setBounds(200, 250, 50, 30);

        btnsub = new JButton("-");
        btnsub.setBounds(250, 150, 50, 30);

        btnmul = new JButton("*");
        btnmul.setBounds(250, 200, 50, 30);

        btndiv = new JButton("/");
        btndiv.setBounds(250, 250, 50, 30);

        btnadd = new JButton("+");
        btnadd.setBounds(250, 100, 50, 30);

        btnans = new JButton("=");
        btnans.setBounds(250, 300, 50, 30);

        txtans = new JTextField(10);
        txtans.setBounds(150, 100, 100, 30);

        jf.add(lblans);
        jf.add(btn0);
        jf.add(btn1);
        jf.add(btn2);
        jf.add(btn3);
        jf.add(btn4);
        jf.add(btn5);
        jf.add(btn6);
        jf.add(btn7);
        jf.add(btn8);
        jf.add(btn9);
        jf.add(btnsub);
        jf.add(btnadd);
        jf.add(btndiv);
        jf.add(btnmul);
        jf.add(btnans);
        jf.add(txtans);

        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnadd.addActionListener(this);
        btndiv.addActionListener(this);
        btnmul.addActionListener(this);
        btnsub.addActionListener(this);
        btnans.addActionListener(this);
        
        jf.setSize(700, 500);
        jf.setLayout(null);
        jf.setVisible(true);  
    }
    public static void main(String[]args)
    {
        new j12clacpro();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {      
        if (e.getSource() == btn0) {
            String no0 = txtans.getText();
            txtans.setText(no0 + "0");
        }
        else if (e.getSource()==btn1)
        {
            String no1 =txtans.getText();
            txtans.setText(no1 + "1");
        }
        else if (e.getSource()==btn2)
        {
            String no2 =txtans.getText();
            txtans.setText(no2 + "2");
        }
        else if (e.getSource()==btn3)
        {
            String no3 =txtans.getText();
            txtans.setText(no3 + "3");
        }
        else if (e.getSource()==btn4)
        {
            String no4 =txtans.getText();
            txtans.setText(no4 + "4");
        }
        else if (e.getSource()==btn5)
        {
            String no5 =txtans.getText();
            txtans.setText(no5 + "5");
        }
        else if (e.getSource()==btn6)
        {
            String no6 =txtans.getText();
            txtans.setText(no6 + "6");
        }
        else if (e.getSource()==btn7)
        {
            String no7=txtans.getText();
            txtans.setText(no7+"7");
        } 
        else if (e.getSource()==btn8) 
        {
            String no8=txtans.getText();
            txtans.setText(no8+"8");
        } 
        else if (e.getSource()==btn9) 
        {
            String no9=txtans.getText();
            txtans.setText(no9+"9");
        }
        if (e.getSource()==btnadd) 
        {
            no101=Integer.parseInt( txtans.getText()+"");
            op ="+";
            txtans.setText("");
        }
        else if (e.getSource()==btnsub) 
        {
            no101=Integer.parseInt( txtans.getText()+"");
            op ="-";
            txtans.setText("");
        }
        else if (e.getSource()==btnmul) 
        {
            no101=Integer.parseInt( txtans.getText()+"");
            op ="*";
            txtans.setText("");
        }
        else if (e.getSource()==btndiv) 
        {
            no101=Integer.parseInt( txtans.getText()+"");
            op ="/";
            txtans.setText("");
        }
        else if (e.getSource()==btnans)
        {
            no102=Integer.parseInt(txtans.getText()+"");
            if(op=="+")
            {
            txtans.setText((no101 + no102 ) + ""); 
            }
            else if(op=="-")
            {
                txtans.setText((no101-no102)+"");
            }
            else if(op=="*")
            {
                txtans.setText((no101*no102)+"");
            }
            else if(op=="/")
            {
                txtans.setText((no101/no102)+"");
            }

        }
    }
}