import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A panel maintaining a picture of a Do Not Enter sign.
 */
public class Masterpiece extends JPanel {
    //private static final long serialVersionUID = 7148504528835036003L;

    /**
     * Called by the runtime system whenever the panel needs painting.
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(new Color(255, 204, 204));
        g.fillOval(75, 133, 333, 333);
        g.setColor(Color.RED);
        g.fillRect(150, 350, 200, 40);
        g.setColor(Color.WHITE);
        g.fillRect(250, 350, 20, 20);
        g.setColor(Color.GREEN);
        g.fillOval(150, 200, 60, 60);
        g.fillOval(250, 225, 50, 50);
        g.setColor(Color.BLACK);
        g.fillOval(170, 220, 10, 10);
        g.fillOval(270, 245, 10, 10);
        int[] xcoords = {125, 400, 400, 275, 250, 200, 125};
        int[] ycoords = {200, 200, 50, 125, 50, 125, 50};
        g.setColor(new Color(204, 102, 0));
        g.fillPolygon(xcoords, ycoords, 7);
    }

    /**
     * A little driver in case you want a stand-alone application.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var panel = new Masterpiece();
            panel.setBackground(new Color(51, 153, 255));
            var frame = new JFrame("So Beautiful");
            frame.setSize(500, 500);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}