import javax.swing.*;
import java.awt.event.*;
//Update by Ash

import static java.lang.Double.parseDouble;

public class MyCalculator {
    private JPanel Calculator;
    private JTextField txtDisplay;
    private JButton ACButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button11;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton button16;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button20;

    double a, b, result;
    String op;

    public MyCalculator() {
        ACButton.addActionListener(e -> txtDisplay.setText(""));
        a7Button.addActionListener(e -> txtDisplay.setText(txtDisplay.getText() + a7Button.getText()));
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a0Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = parseDouble(txtDisplay.getText());
                double c = (a*a);
                txtDisplay.setText(String.valueOf(c));
            }
        });
//        button16.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if(txtDisplay.getText().contains(".")) {
//                    double pm = Double.parseDouble(txtDisplay.getText());
//                    pm = pm*-1;
//                    txtDisplay.setText(String.valueOf(pm));
//                } else {
//                    long PM = Long.parseLong(txtDisplay.getText());
//                    PM = PM*-1;
//                    txtDisplay.setText(String.valueOf(PM));
//                }
//            }
//        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = parseDouble(txtDisplay.getText());
                String binary = Integer.toBinaryString((int) a);
                txtDisplay.setText(binary);
            }
        });

        button20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtDisplay.getText().contains(".")){
                    txtDisplay.setText(txtDisplay.getText() + button20.getText());
                }
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = parseDouble(txtDisplay.getText());
                op = "+";
                txtDisplay.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = parseDouble(txtDisplay.getText());
                op = "-";
                txtDisplay.setText("");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = parseDouble(txtDisplay.getText());
                op = "*";
                txtDisplay.setText("");
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = parseDouble(txtDisplay.getText());
                op = "/";
                txtDisplay.setText("");
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace;

                if(txtDisplay.getText().length() > 0){
                    StringBuilder strB = new StringBuilder(txtDisplay.getText());
                    strB.deleteCharAt(txtDisplay.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    txtDisplay.setText(backspace);
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = parseDouble(txtDisplay.getText());

                switch (op) {
                    case "+" -> {
                        result = a + b;
                        txtDisplay.setText(String.valueOf(result));
                    }
                    case "-" -> {
                        result = a - b;
                        txtDisplay.setText(String.valueOf(result));
                    }
                    case "*" -> {
                        result = a * b;
                        txtDisplay.setText(String.valueOf(result));
                    }
                    case "/" -> {
                        result = a / b;
                        txtDisplay.setText(String.valueOf(result));
                    }
                    default -> result = 0;
                }
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("MyCalculator");
        frame.setContentPane(new MyCalculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
