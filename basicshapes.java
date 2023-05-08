import java.awt.*;
import java.applet.*;
public class basicshapes extends Applet implements Runnable {
    private Thread animationThread;
    private int x = 0; 
    private int y = 150; 
    private int shapeWidth = 50; 
    private int shapeHeight = 50; 
    private int moveStep = 5; 
    public void init() {
       
        setBackground(Color.white);
    }
    public void start() {
       
        if (animationThread == null) {
            animationThread = new Thread(this);
            animationThread.start();
        }
    }
    public void stop() {
       
        if (animationThread != null) {
            animationThread = null;
        }
    }
    public void run() {
        while (true) {
       
            x += moveStep;
           
            if (x > getWidth()) {
                x = -shapeWidth; 
            }
            
            repaint();
            
            try {
                Thread.sleep(50); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(x, y, shapeWidth, shapeHeight);
    }
}
