import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class  j25errordropdown implements ActionListener {

    JFrame frame;
    JComboBox<String> c1 ;
    JLabel label1, label2, labelResult;
    JTextField field1, field2, fieldResult;


    public  j25errordropdown() {
        frame = new JFrame();
        label1 = new JLabel("Enter No. 1:");
        label1.setBounds(50, 50, 100, 30);

        label2 = new JLabel("Enter No. 2:");
        label2.setBounds(50, 100, 100, 30);

        labelResult = new JLabel("Result:");
        labelResult.setBounds(50, 200, 100, 30);

        field1 = new JTextField();
        field1.setBounds(150, 50, 150, 30);

        field2 = new JTextField();
        field2.setBounds(150, 100, 150, 30);

        fieldResult = new JTextField();
        fieldResult.setBounds(150, 200, 150, 30);
        
        c1 = new JComboBox<String>(new String[] {"Select","Add" , "Sub" , "Mul" , "Div"}); 
        c1.setBounds(180, 150, 100, 30);  

        frame.add(c1);
        frame.add(label1);
        frame.add(label2);
        frame.add(labelResult);
        frame.add(field1);
        frame.add(field2);
        frame.add(fieldResult);


        c1.addActionListener(this); // register for events  

        frame.setSize(500, 400); // increased frame size
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new j25errordropdown();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        double num1 = Double.parseDouble(field1.getText());
        double num2 = Double.parseDouble(field2.getText());
        String result = "";

        String selectedCalc = c1.getSelectedItem().toString();
        switch (selectedCalc) 
        {
            case "Select":
                result = "ERROR";
                break;
            case "Add":
                result = num1 + num2+"";
                break;
            case "Sub":
                result = num1 - num2+"";
                break;
            case "Mul":
                result = num1 * num2+"";
                break;
            case "Div":
                result = num1 / num2+"";
                break;
        }
        fieldResult.setText(result);
 
    }
}
