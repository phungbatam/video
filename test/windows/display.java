package windows;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class display {
    
    private JFrame window;
    private String winName;
    public int width, height;

    // contructor open window
    public display(int width, int height, JFrame window, String winName) {

        this.window = window;
        this.width = width;
        this.height = height;
        this.winName = winName;

        window.setSize(width, height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle(winName);
        window.setResizable(false);
        centerWindow();
    }

    private void centerWindow() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        int winWidth = getWidth();
        int winHeight = getHeight();

        int x = (screenWidth - winWidth) / 2;
        int y = (screenHeight - winHeight) / 2;
        window.setLocation(x, y);

    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
