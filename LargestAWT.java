import java.awt.*;
import java.awt.event.*;

public class LargestAWT extends Frame implements ActionListener {

    Label l1, l2, l3, result;
    TextField t1, t2, t3;
    Button b;

    LargestAWT() {

        l1 = new Label("Enter First Number");
        l2 = new Label("Enter Second Number");
        l3 = new Label("Enter Third Number");
        result = new Label("");

        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        b = new Button("Find Largest");

        setLayout(new GridLayout(5,2));

        add(l1); add(t1);
        add(l2); add(t2);
        add(l3); add(t3);
        add(b); 
        add(result);

        b.addActionListener(this);

        // Window close properly karega
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setSize(350, 250);
        setTitle("Largest of Three Numbers");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int c = Integer.parseInt(t3.getText());

            int largest;

            if (a >= b && a >= c)
                largest = a;
            else if (b >= a && b >= c)
                largest = b;
            else
                largest = c;

            result.setText("Largest Number is: " + largest);

        } catch (Exception ex) {
            result.setText("Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new LargestAWT();
    }
}
