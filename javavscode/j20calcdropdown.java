import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class j20calcdropdown implements ActionListener {

    JFrame jf;
    JLabel lblno1, lblno2, lblans;
    JTextField txtno1, txtno2, txtans;
    JComboBox<String> c1;

    public j20calcdropdown() {
        jf= new JFrame();

        lblno1 = new JLabel("No1");
        lblno1.setBounds(100, 100, 100, 30);

        lblno2 = new JLabel("No2");
        lblno2.setBounds(100, 150, 100, 30);

        lblans = new JLabel("Answer");
        lblans.setBounds(100, 200, 100, 40);

        txtno1 = new JTextField(5);
        txtno1.setBounds(200, 100, 100, 30);

        txtno2 = new JTextField(5);
        txtno2.setBounds(200, 150, 100, 30);

        txtans = new JTextField(5);
        txtans.setBounds(200, 200, 100, 30);

        c1 = new JComboBox<>(new String[] { "+", "-", "*", "/" });
        c1.setBounds(100, 250, 150, 40);


        jf.add(lblno1);
        jf.add(lblno2);
        jf.add(lblans);        
        jf.add(txtno1);
        jf.add(txtno2);
        jf.add(txtans);
        jf.add(c1);

        c1.addActionListener(this);

        jf.setSize(600, 600); // increased frame size
        jf.setLayout(null);
        jf.setVisible(true);

    }

    public static void main(String[] args) {
        new j20calcdropdown();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(txtno1.getText());
        double num2 = Double.parseDouble(txtno2.getText());
        double result = 0.0;
        String selectedCalc = c1.getSelectedItem().toString();
        switch (selectedCalc) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        txtans.setText(Double.toString(result));

    }
}
