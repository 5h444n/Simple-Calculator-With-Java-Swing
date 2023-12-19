import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    JFrame frame;
    JPanel panel;
    JTextField textField;
    JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonClear, buttonDot, buttonBack;
    String string1, string2, string3;
    double firstNumber, secondNumber, result;

    Calculator()
    {
        frame = new JFrame("Calculator");

        panel = new JPanel(new GridLayout());

        textField = new JTextField(20);
        textField.setSize(500,80);
        textField.setBackground(new Color(255, 255, 255));
        textField.setEditable(false);


        buttonClear = new JButton("C");
        buttonClear.setBounds(260,100,100,50);
        buttonClear.setBackground(new Color(255, 255, 255, 73));
        buttonClear.addActionListener(this);

        buttonBack = new JButton("D");
        buttonBack.setBounds(380,100,100,50);
        buttonBack.setBackground(new Color(255, 255, 255, 73));
        buttonBack.addActionListener(this);

        button7 = new JButton("7");
        button7.setBounds(20,170,100,50);
        button7.setBackground(new Color(255, 255, 255, 73));
        button7.addActionListener(this);

        button8 = new JButton("8");
        button8.setBounds(140,170,100,50);
        button8.setBackground(new Color(255, 255, 255, 73));
        button8.addActionListener(this);

        button9 = new JButton("9");
        button9.setBounds(260,170,100,50);
        button9.setBackground(new Color(255, 255, 255, 73));
        button9.addActionListener(this);

        buttonAdd = new JButton("+");
        buttonAdd.setBounds(380,170,100,50);
        buttonAdd.setBackground(new Color(255, 255, 255, 73));
        buttonAdd.addActionListener(this);

        button4 = new JButton("4");
        button4.setBounds(20,240,100,50);
        button4.setBackground(new Color(255, 255, 255, 73));
        button4.addActionListener(this);

        button5 = new JButton("5");
        button5.setBounds(140,240,100,50);
        button5.setBackground(new Color(255, 255, 255, 73));
        button5.addActionListener(this);

        button6 = new JButton("6");
        button6.setBounds(260,240,100,50);
        button6.setBackground(new Color(255, 255, 255, 73));
        button6.addActionListener(this);

        buttonSub = new JButton("-");
        buttonSub.setBounds(380,240,100,50);
        buttonSub.setBackground(new Color(255, 255, 255, 73));
        buttonSub.addActionListener(this);

        button1 = new JButton("1");
        button1.setBounds(20,310,100,50);
        button1.setBackground(new Color(255, 255, 255, 73));
        button1.addActionListener(this);

        button2 = new JButton("2");
        button2.setBounds(140,310,100,50);
        button2.setBackground(new Color(255, 255, 255, 73));
        button2.addActionListener(this);

        button3 = new JButton("3");
        button3.setBounds(260,310,100,50);
        button3.setBackground(new Color(255, 255, 255, 73));
        button3.addActionListener(this);

        buttonMul = new JButton("*");
        buttonMul.setBounds(380,310,100,50);
        buttonMul.setBackground(new Color(255, 255, 255, 73));
        buttonMul.addActionListener(this);


        button0 = new JButton("0");
        button0.setBounds(20,380,100,50);
        button0.setBackground(new Color(255, 255, 255, 73));
        button0.addActionListener(this);

        buttonDot = new JButton(".");
        buttonDot.setBounds(140,380,100,50);
        buttonDot.setBackground(new Color(255, 255, 255, 73));
        buttonDot.addActionListener(this);

        buttonEqual = new JButton("=");
        buttonEqual.setBounds(260,380,100,50);
        buttonEqual.setBackground(new Color(255, 255, 255, 73));
        buttonEqual.addActionListener(this);

        buttonDiv = new JButton("/");
        buttonDiv.setBounds(380,380,100,50);
        buttonDiv.setBackground(new Color(255, 255, 255, 73));
        buttonDiv.addActionListener(this);


        panel.setBounds(0,0,500,650);
        panel.setBackground(new Color(255, 255, 255, 73));



        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.add(textField);
        frame.add(buttonClear);
        frame.add(buttonBack);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(buttonAdd);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(buttonSub);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(buttonMul);
        frame.add(button0);
        frame.add(buttonDot);
        frame.add(buttonEqual);
        frame.add(buttonDiv);
        frame.add(panel);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(255, 255, 255, 73));

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== buttonClear)
        {
            textField.setText("");
        }
        if (e.getSource()== buttonBack)
        {
            string1 = textField.getText();
            int length = string1.length();
            string1 = string1.substring(0,length-1);
            textField.setText(string1);
        }
        if (e.getSource()== button7)
        {
            string1 = textField.getText();
            string2 = "7";
            string3 = string1+string2;
            textField.setText(string3);
        }
        if (e.getSource()== button8)
        {
            string1 = textField.getText();
            string2 = "8";
            string3 = string1+string2;
            textField.setText(string3);
        }
        if (e.getSource()== button9)
        {
            string1 = textField.getText();
            string2 = "9";
            string3 = string1+string2;
            textField.setText(string3);
        }
        if(e.getSource() == buttonAdd)
        {
            string1 = textField.getText();
            string2 = "+";
            string3 = string1+string2;
            textField.setText(string3);
        }
        if (e.getSource()== button4)
        {
            string1 = textField.getText();
            string2 = "4";
            string3 = string1+string2;
            textField.setText(string3);
        }
        if (e.getSource()== button5)
        {
            string1 = textField.getText();
            string2 = "5";
            string3 = string1+string2;
            textField.setText(string3);
        }
        if (e.getSource()== button6)
        {
            string1 = textField.getText();
            string2 = "6";
            string3 = string1+string2;
            textField.setText(string3);
        }
        if(e.getSource() == buttonSub)
        {
            string1 = textField.getText();
            string2 = "-";
            string3 = string1+string2;
            textField.setText(string3);
        }
        if (e.getSource()== button1)
        {
            string1 = textField.getText();
            string2 = "1";
            string3 = string1+string2;
            textField.setText(string3);
        }
        if (e.getSource()== button2)
        {
            string1 = textField.getText();
            string2 = "2";
            string3 = string1+string2;
            textField.setText(string3);
        }
        if (e.getSource()== button3)
        {
            string1 = textField.getText();
            string2 = "3";
            string3 = string1+string2;
            textField.setText(string3);
        }
        if(e.getSource() == buttonMul)
        {
            string1 = textField.getText();
            string2 = "*";
            string3 = string1+string2;
            textField.setText(string3);
        }
        if (e.getSource()== button0)
        {
            string1 = textField.getText();
            string2 = "0";
            string3 = string1+string2;
            textField.setText(string3);
        }
        if (e.getSource()== buttonDot)
        {
            string1 = textField.getText();
            string2 = ".";
            string3 = string1+string2;
            textField.setText(string3);
        }
        if(e.getSource()==buttonEqual)
        {
            equalMethod();
        }
        if(e.getSource()==buttonDiv)
        {
            string1 = textField.getText();
            string2 = "/";
            string3 = string1+string2;
            textField.setText(string3);
        }


    }

    void equalMethod()
    {
        string1 = textField.getText();
        int length = string1.length();
        char[] ch = new char[length];
        for (int i = 0; i < length; i++) {
            ch[i] = string1.charAt(i);
        }
        for (int i = 0; i < length; i++) {
            if (ch[i] == '+') {
                String string4 = string1.substring(0, i);
                String string5 = string1.substring(i + 1, length);

                firstNumber = Double.parseDouble(string4);
                secondNumber = Double.parseDouble(string5);

                result = firstNumber + secondNumber;
                textField.setText(String.valueOf(result));
                System.out.println(result);
            }
            if (ch[i] == '-') {
                String string4 = string1.substring(0, i);
                String string5 = string1.substring(i + 1, length);
                firstNumber = Double.parseDouble(string4);
                secondNumber = Double.parseDouble(string5);
                result = firstNumber - secondNumber;
                textField.setText(String.valueOf(result));
                System.out.println(result);
            }
            if (ch[i] == '*') {
                String string4 = string1.substring(0, i);
                String string5 = string1.substring(i + 1, length);
                firstNumber = Double.parseDouble(string4);
                secondNumber = Double.parseDouble(string5);
                result = firstNumber * secondNumber;
                textField.setText(String.valueOf(result));
                System.out.println(result);
            }
            if (ch[i] == '/') {
                String string4 = string1.substring(0, i);
                String string5 = string1.substring(i + 1, length);
                firstNumber = Double.parseDouble(string4);
                secondNumber = Double.parseDouble(string5);
                result = firstNumber / secondNumber;
                textField.setText(String.valueOf(result));
                System.out.println(result);
            }
        }

    }
}

class Main
{
    public static void main(String[] args) {
        new Calculator();
    }
}