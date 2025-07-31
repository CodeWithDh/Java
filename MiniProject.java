import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class miniProject extends JFrame implements ActionListener {
        static double a, b, result;
        static int operator;
        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bpro, bdiv, beq, bdec, bc;
        JTextField tf;

        Calculator() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("CALCULATOR");
            setSize(400, 500);
            setLayout(null);
            setVisible(true);

            b1 = new JButton("1");
            b2 = new JButton("2");
            b3 = new JButton("3");
            b4 = new JButton("4");
            b5 = new JButton("5");
            b6 = new JButton("6");
            b7 = new JButton("7");
            b8 = new JButton("8");
            b9 = new JButton("9");
            b0 = new JButton("0");
            badd = new JButton("+");
            bsub = new JButton("-");
            bpro = new JButton("x");
            bdiv = new JButton("/");
            bdec = new JButton(".");
            beq = new JButton("=");
            bc = new JButton("CLEAR");
            tf = new JTextField();

            tf.setFont(new Font("Arial", Font.BOLD, 50));
            b1.setFont(new Font("Arial", Font.BOLD, 20));
            b2.setFont(new Font("Arial", Font.BOLD, 20));
            b3.setFont(new Font("Arial", Font.BOLD, 20));
            b4.setFont(new Font("Arial", Font.BOLD, 20));
            b5.setFont(new Font("Arial", Font.BOLD, 20));
            b6.setFont(new Font("Arial", Font.BOLD, 20));
            b7.setFont(new Font("Arial", Font.BOLD, 20));
            b8.setFont(new Font("Arial", Font.BOLD, 20));
            b9.setFont(new Font("Arial", Font.BOLD, 20));
            b0.setFont(new Font("Arial", Font.BOLD, 20));
            badd.setFont(new Font("Arial", Font.BOLD, 20));
            bsub.setFont(new Font("Arial", Font.BOLD, 20));
            bdiv.setFont(new Font("Arial", Font.BOLD, 20));
            bpro.setFont(new Font("Arial", Font.BOLD, 20));
            bdec.setFont(new Font("Arial", Font.BOLD, 20));
            beq.setFont(new Font("Arial", Font.BOLD, 50));
            bc.setFont(new Font("Arial", Font.BOLD, 30));

            b1.setBounds(0, 200, 260, 125);
            b2.setBounds(260, 200, 260, 125);
            b3.setBounds(520, 200, 260, 125);
            b4.setBounds(0, 325, 260, 125);
            b5.setBounds(260, 325, 260, 125);
            b6.setBounds(520, 325, 260, 125);
            b7.setBounds(0, 450, 260, 125);
            b8.setBounds(260, 450, 260, 125);
            b9.setBounds(520, 450, 260, 125);
            b0.setBounds(0, 575, 260, 125);
            badd.setBounds(260, 575, 260, 125);
            bsub.setBounds(520, 575, 260, 125);
            bdiv.setBounds(780, 200, 260, 125);
            bpro.setBounds(780, 325, 260, 125);
            bdec.setBounds(780, 450, 260, 125);
            beq.setBounds(1040, 200, 350, 500);
            bc.setBounds(780, 575, 260, 125);
            tf.setBounds(0, 0, 1500, 200);

            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(b0);
            add(badd);
            add(bsub);
            add(bpro);
            add(bdiv);
            add(beq);
            add(bdec);
            add(tf);
            add(bc);

            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
            b8.addActionListener(this);
            b9.addActionListener(this);
            b0.addActionListener(this);
            badd.addActionListener(this);
            bsub.addActionListener(this);
            bpro.addActionListener(this);
            bdiv.addActionListener(this);
            bdec.addActionListener(this);
            beq.addActionListener(this);
            bc.addActionListener(this);
            tf.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == b1) {
                tf.setText(tf.getText().concat("1"));
            }

            else if (e.getSource() == b2) {
                tf.setText(tf.getText().concat("2"));
            }

            else if (e.getSource() == b3) {
                tf.setText(tf.getText().concat("3"));
            }

            else if (e.getSource() == b4) {
                tf.setText(tf.getText().concat("4"));
            }

            else if (e.getSource() == b5) {
                tf.setText(tf.getText().concat("5"));
            }

            else if (e.getSource() == b6) {
                tf.setText(tf.getText().concat("6"));
            }

            else if (e.getSource() == b7) {
                tf.setText(tf.getText().concat("7"));
            }

            else if (e.getSource() == b8) {
                tf.setText(tf.getText().concat("8"));
            }

            else if (e.getSource() == b9) {
                tf.setText(tf.getText().concat("9"));
            }

            else if (e.getSource() == b0) {
                tf.setText(tf.getText().concat("0"));
            }

            else if (e.getSource() == bdec) {
                tf.setText(tf.getText().concat("."));
            }

            if (e.getSource() == badd) {
                a = Double.parseDouble(tf.getText());
                operator = 1;
                tf.setText("");
            }

            if (e.getSource() == bsub) {
                a = Double.parseDouble(tf.getText());
                operator = 2;
                tf.setText("");
            }

            if (e.getSource() == bpro) {
                a = Double.parseDouble(tf.getText());
                operator = 3;
                tf.setText("");
            }

            if (e.getSource() == bdiv) {
                a = Double.parseDouble(tf.getText());
                operator = 4;
                tf.setText("");
            }

            if (e.getSource() == beq) {
                b = Double.parseDouble(tf.getText());
                switch (operator) {
                    case 1:
                        result = a + b;
                        break;

                    case 2:
                        result = a - b;
                        break;

                    case 3:
                        result = a * b;
                        break;

                    case 4:
                        result = a / b;
                        break;

                    default:
                        result = 0;
                }

                tf.setText("" + result);
            }

            if (e.getSource() == bc)
                tf.setText("");
        }

        public static void main(String[] args) {
            new Calculator();
        }
}
