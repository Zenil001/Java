import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
public class j13ticktockto implements ActionListener{
    JFrame jf;
    JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
   
    JTextField txtans;
    int a=1;

    
    public j13ticktockto()
    {
        jf = new JFrame();


        btn1 = new JButton(" ");
        btn1.setBounds(90, 150, 50, 40);

        btn2 = new JButton(" ");
        btn2.setBounds(150, 150, 50, 40);

        btn3 = new JButton(" ");
        btn3.setBounds(210, 150, 50, 40);

        btn4 = new JButton(" ");
        btn4.setBounds(90, 200, 50, 40);

        btn5 = new JButton(" ");
        btn5.setBounds(150, 200, 50, 40);

        btn6 = new JButton(" ");
        btn6.setBounds(210, 200, 50, 40);

        btn7 = new JButton(" ");
        btn7.setBounds(90, 250, 50, 40);

        btn8 = new JButton(" ");
        btn8.setBounds(150, 250, 50, 40);

        btn9 = new JButton(" ");
        btn9.setBounds(210, 250, 50, 40);

        txtans = new JTextField("");
        txtans.setBounds(90, 300, 200, 40);


        jf.add(btn1);
        jf.add(btn2);
        jf.add(btn3);
        jf.add(btn4);
        jf.add(btn5);
        jf.add(btn6);
        jf.add(btn7);
        jf.add(btn8);
        jf.add(btn9);        
        jf.add(txtans);        

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);

        jf.setSize(450, 500);
        jf.setLayout(null);
        jf.setVisible(true);

    }
    public static void main(String[]args)
    {
        new j13ticktockto();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()==btn1)
        {
            if(a%2==0)
            {
                btn1.setText("0");
            }
            else
            {
                btn1.setText("x");
            }
            a++;

        }

        if (e.getSource()==btn2)
        {
            if(a%2==0)
            {
                btn2.setText("0");
            }
            else
            {
                btn2.setText("x");
            }
            a++;
        }
        if (e.getSource()==btn3)
        {
            if(a%2==0)
            {
                btn3.setText("0");
            }
            else
            {
                btn3.setText("x");
            }
            a++;
        }
        if (e.getSource()==btn4)
        {
            if(a%2==0)
            {
                btn4.setText("0");
            }
            else
            {
                btn4.setText("x");
            }
            a++;
        }
        if (e.getSource()==btn5)
        {
            if(a%2==0)
            {
                btn5.setText("0");
            }
            else
            {
                btn5.setText("x");
            }
            a++;
        }
        if (e.getSource()==btn6)
        {
            if(a%2==0)
            {
                btn6.setText("0");
            }
            else
            {
                btn6.setText("x");
            }
            a++;
        }
        if (e.getSource()==btn7)
        {
            if(a%2==0)
            {
                btn7.setText("0");
            }
            else
            {
                btn7.setText("x");
            }
            a++;
        }
        if (e.getSource()==btn8)
        {
            if(a%2==0)
            {
                btn8.setText("0");
            }
            else
            {
                btn8.setText("x");
            }
            a++;
        }
        if (e.getSource()==btn9)
        {
            if(a%2==0)
            {
                btn9.setText("0");
            }
            else
            {
                btn9.setText("x");
            }
            a++;
        }
        
        if ( btn1.getText()=="x" && btn2.getText()=="x" && btn3.getText()=="x")
        {
            txtans.setText("Player 1 is Win");
            a=15;
        }
        else if(btn4.getText()=="x" && btn5.getText()=="x" && btn6.getText()=="x")
        {
            txtans.setText("Player 1 is Win");
            a=15;
        }
        else if (btn7.getText()=="x" && btn8.getText()=="x" && btn9.getText()=="x")
        {
            txtans.setText("Player 1 is Win");
            a=15;
        }
        else if (btn1.getText()=="x" && btn4.getText()=="x" && btn7.getText()=="x")
        {
            txtans.setText("Player 1 is Win");
            a=15;
        }
        else if(btn2.getText()=="x" && btn5.getText()=="x" && btn8.getText()=="x")
        {
            txtans.setText("Player 1 is Win");
            a=15;
        }
        else if(btn3.getText()=="x" && btn6.getText()=="x" && btn9.getText()=="x")
        {
            txtans.setText("Player 1 is Win");
            a=15;
            
        }
        else if(btn1.getText()=="x" && btn5.getText()=="x" && btn9.getText()=="x")
        {
            txtans.setText("Player 1 is Win");
            a=15;
        }
        else if(btn7.getText()=="x" && btn5.getText()=="x" && btn3.getText()=="x" )
        {
            txtans.setText("Player 1 is Win");
            a=15;
        }
        else if(btn1.getText()=="0" && btn2.getText()=="0" && btn3.getText()=="0")
        {
            txtans.setText("Player 2 is Win");
            a=15;
        }
        else if(btn4.getText()=="0" && btn5.getText()=="0" && btn6.getText()=="0")
        {
            txtans.setText("Player 2 is Win");
            a=15;
        }
        else if (btn7.getText()=="0" && btn8.getText()=="0" && btn9.getText()=="0")
        {
            txtans.setText("Player 2 is Win");
            a=15;
        }
        else if (btn1.getText()=="0" && btn4.getText()=="0" && btn7.getText()=="0")
        {
            txtans.setText("Player 2 is Win");
            a=15;
        }
        else if(btn2.getText()=="0" && btn5.getText()=="0" && btn8.getText()=="0")
        {
            txtans.setText("Player 2 is Win");
            a=15;
        }
        else if(btn3.getText()=="0" && btn6.getText()=="0" && btn9.getText()=="0")
        {
            txtans.setText("Player 2 is Win");
            a=15;
        }
        else if(btn1.getText()=="0" && btn5.getText()=="0" && btn9.getText()=="0")
        {
            txtans.setText("Player 2 is Win");
            a=15;
        }
        else if(btn7.getText()=="0" && btn5.getText()=="0" && btn3.getText()=="0" )
        {
            txtans.setText("Player 2 is Win");
            a=15;
        }
        else if(a==10)
        {
            txtans.setText("Tie!!!!!");
        }       
       

    }

    
}
