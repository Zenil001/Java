import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;


public class j19dropdownlist implements ActionListener 
{

    JComboBox<String> c1 ; 
    JFrame frame;
    

    public j19dropdownlist() 
    {
        frame = new JFrame();
        

        c1 = new JComboBox<String>(new String[] {"Red", "Green", "Yellow"}); 
        c1.setBounds(200, 100, 150, 80);

        c1.addActionListener(this); // register for events    

        frame.add(c1);

        frame.setSize(500, 400); // increased frame size
        frame.setLayout(null);
        frame.setVisible(true);
    }

    
    public static void main(String[] args) 
    {
        new j19dropdownlist();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    { 
        String str = c1.getSelectedItem().toString();
        switch (str) 
            {
            case "Red":
                frame.getContentPane().setBackground(Color.RED);
                break;
            case "Green":
                frame.getContentPane().setBackground(Color.GREEN);
                break;
            case "Yellow":
                frame.getContentPane().setBackground(Color.YELLOW);
               break;
            }
        

    }
}


