import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class j6areaoftringle implements ActionListener {

    JFrame jf1;
    JLabel lblhight, lblbase, lblans;
    JButton btnans;
    JTextField txthight, txtbase, txtans;

    public j6areaoftringle() {
        jf1 = new JFrame();

        lblhight = new JLabel("Height");
        lblhight.setBounds(100, 100, 100, 30);

        lblbase = new JLabel("Base");
        lblbase.setBounds(100, 150, 100, 30);

        lblans = new JLabel("Area of triangle");
        lblans.setBounds(100, 250, 100, 30);

        btnans = new JButton("Click me");
        btnans.setBounds(100, 200, 100, 40);

        txthight = new JTextField(5);
        txthight.setBounds(200, 100, 100, 30);

        txtbase = new JTextField(5);
        txtbase.setBounds(200, 150, 100, 30);

        txtans = new JTextField(5);
        txtans.setBounds(200, 250, 100, 30);

        jf1.add(lblhight);
        jf1.add(lblbase);
        jf1.add(txthight);
        jf1.add(txtbase);
        jf1.add(btnans);
        jf1.add(lblans);
        jf1.add(txtans);

        btnans.addActionListener(this);

        jf1.setSize(700, 500);
        jf1.setLayout(null);
        jf1.setVisible(true);
    }

    public static void main(String[] args) {
        new j6areaoftringle();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double base = Double.parseDouble(txtbase.getText());
        double height = Double.parseDouble(txthight.getText());
        txtans.setText(Double.toString(0.5 * base * height));
    }
}
