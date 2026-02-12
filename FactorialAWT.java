  // Write a program to calculate the factorial of a number using recursion
import java.awt.*; 
import java.awt.event.*;

public class FactorialAWT extends Frame implements ActionListener {

    Label l1, result;
    TextField t1;
    Button b;

    // Constructor
    FactorialAWT() {

        l1 = new Label("Enter a Number:");
        result = new Label("");

        t1 = new TextField();
        b = new Button("Calculate Factorial");

        setLayout(new GridLayout(3,2));

        add(l1); 
        add(t1);
        add(b); 
        add(result);

        b.addActionListener(this);

        // Window close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setSize(350, 200);
        setTitle("Factorial Using Recursion");
        setVisible(true);
    }

    // Recursive Method
    int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public void actionPerformed(ActionEvent e) {

        try {
            int num = Integer.parseInt(t1.getText());

            if (num < 0) {
                result.setText("Enter positive number only!");
                return;
            }

            int fact = factorial(num);

            result.setText("Factorial is: " + fact);

        } catch (Exception ex) {
            result.setText("Invalid Input!");
        }
    }

    public static void main(String[] args) {
        new FactorialAWT();
    }
}
