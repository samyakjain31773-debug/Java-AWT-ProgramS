import java.awt.*;
import java.awt.event.*;
 
public class printnameonlabel extends Frame {

    Label lbl;
    printnameonlabel(){
        // create Label 
        lbl = new Label("Samyak Lundia");

        // Set Position of Label
        lbl.setBounds(100,100,200,30);

        // Add Label to frame 
        add (lbl);
    
        // Frame Setting 
        setSize(400,300);
        setLayout(null);
        setVisible(true);
        
        // Close button functionality 

        addWindowListener(new WindowAdapter() {
            public void Windowclosing(WindowEvent e){
                dispose();
            }
        });
    }
    public static void main (String[]args){
        new printnameonlabel();
    }
}
