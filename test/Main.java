import java.awt.Color;

import javax.swing.JFrame;

import windows.Title;
import windows.display;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
               
                JFrame winForm = new JFrame();
                new display(1050, 620, winForm, Title.TITLE);
                winForm.getContentPane().setBackground(Color.WHITE);
                winForm.setVisible(true);

            }

        });
    }
}  
