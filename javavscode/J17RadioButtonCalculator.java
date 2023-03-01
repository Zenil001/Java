import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class J17RadioButtonCalculator implements ActionListener {

    JFrame frame;
    JLabel label1, label2, labelResult;
    JTextField field1, field2, fieldResult;
    
    JRadioButton rbtnAdd, rbtnSub, rbtnMul, rbtnDiv;
    ButtonGroup bg;

    public J17RadioButtonCalculator() {
        frame = new JFrame();
        label1 = new JLabel("Enter No. 1:");
        label1.setBounds(50, 50, 100, 30);

        label2 = new JLabel("Enter No. 2:");
        label2.setBounds(50, 100, 100, 30);

        labelResult = new JLabel("Result:");
        labelResult.setBounds(50, 150, 100, 30);

        rbtnAdd = new JRadioButton("+");
        rbtnAdd.setBounds(50, 200, 50, 30);

        rbtnSub = new JRadioButton("-");
        rbtnSub.setBounds(120, 200, 50, 30);

        rbtnMul = new JRadioButton("*");
        rbtnMul.setBounds(190, 200, 50, 30);

        rbtnDiv = new JRadioButton("/");
        rbtnDiv.setBounds(260, 200, 50, 30);
        
        // create a button group
        bg = new ButtonGroup();
        // add all the radio buttons to the button group
        bg.add(rbtnAdd);
        bg.add(rbtnSub);
        bg.add(rbtnMul);
        bg.add(rbtnDiv);
        // set the initial selection of the radio button
        
        field1 = new JTextField();
        field1.setBounds(150, 50, 150, 30);

        field2 = new JTextField();
        field2.setBounds(150, 100, 150, 30);

        fieldResult = new JTextField();
        fieldResult.setBounds(150, 150, 150, 30);

        frame.add(label1);
        frame.add(label2);
        frame.add(labelResult);
        frame.add(rbtnAdd);
        frame.add(rbtnSub);
        frame.add(rbtnMul);
        frame.add(rbtnDiv);
        frame.add(field1);
        frame.add(field2);
        frame.add(fieldResult);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        rbtnAdd.addActionListener(this);
        rbtnSub.addActionListener(this);
        rbtnMul.addActionListener(this);
        rbtnDiv.addActionListener(this);
    }

    public static void main(String[] args) {
        new J17RadioButtonCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(field1.getText());
        double num2 = Double.parseDouble(field2.getText());
        double result = 0.0;
        if (rbtnAdd.isSelected()) {
            result = num1 + num2;
        } else if (rbtnSub.isSelected()) {
            result = num1 - num2;
        } else if (rbtnMul.isSelected()) {
            result = num1 * num2;
        } else if (rbtnDiv.isSelected()) {
            result = num1 / num2;
        }
        fieldResult.setText(Double.toString(result));
    }
}
