import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
public class j18bgcolorchangerbt implements ActionListener{
    
    
    JFrame frame;
    JRadioButton rbtn1, rbtn2, rbtn3;
    ButtonGroup bg;
    
    public j18bgcolorchangerbt()
    {
        frame = new JFrame();

        rbtn1 = new JRadioButton("Red"); // creating instance of JButton
        rbtn1.setBounds(100, 100, 100, 30);

        rbtn2 = new JRadioButton("Yellow"); // creating instance of JButton
        rbtn2.setBounds(300, 100, 100, 30);

        rbtn3 = new JRadioButton("Green"); // creating instance of JButton
        rbtn3.setBounds(500, 100, 100, 30);

        bg = new ButtonGroup();
        bg.add(rbtn1);
        bg.add(rbtn2);
        bg.add(rbtn3);

        
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        
        frame.add(rbtn1);
        frame.add(rbtn2);
        frame.add(rbtn3);


        rbtn1.addActionListener(this);
        rbtn2.addActionListener(this);
        rbtn3.addActionListener(this);
       
    }
    public static void main(String[] args){
        new j18bgcolorchangerbt();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rbtn1)
        {
            frame.getContentPane().setBackground(Color.RED);
        } else if (e.getSource() == rbtn2)
        {
            frame.getContentPane().setBackground(Color.YELLOW);
        } else if (e.getSource() == rbtn3) {
            frame.getContentPane().setBackground(Color.GREEN);}

    } 
}
