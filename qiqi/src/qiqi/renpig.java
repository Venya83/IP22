package qiqi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class renpig extends JFrame {

    private JPanel canvas;

    public renpig() {
        super("Drawing Program");
        canvas = new CanvasPanel();
        getContentPane().add(canvas);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }

    private class CanvasPanel extends JPanel {

        private Point lastPoint;

        public CanvasPanel() {
            setBackground(Color.WHITE);
            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    lastPoint = e.getPoint();
                }
            });
            addMouseMotionListener(new MouseAdapter() {
                public void mouseDragged(MouseEvent e) {
                    Graphics g = getGraphics();
                    g.setColor(Color.BLACK);
                    g.drawLine(lastPoint.x, lastPoint.y, e.getX(), e.getY());
                    lastPoint = e.getPoint();
                }
            });
        }

        public void clearCanvas() {
            Graphics g = getGraphics();
            g.setColor(getBackground());
            g.fillRect(0, 0, getWidth(), getHeight());
        }

    }

    public static void main(String[] args) {
        new renpig();
    }

}