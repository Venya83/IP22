import javax.swing.*;
import java.awt.*;

public class Player {
    private JLabel imageLabel;
    private int x;
    private int y;
    private int dx;
    private int dy;

    public Player(int x, int y, ImageIcon image) {
        this.x = x;
        this.y = y;

        Image scaledImage = image.getImage().getScaledInstance(76, 100, Image.SCALE_SMOOTH);
        imageLabel = new JLabel(new ImageIcon(scaledImage));
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        imageLabel.setVerticalAlignment(SwingConstants.CENTER);
    }

    public JLabel getImageLabel() {
        return imageLabel;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move(int dx, int dy) {
        x += 3 * dx;
        y += 3 * dy;
        imageLabel.setBounds(x, y, imageLabel.getWidth(), imageLabel.getHeight());
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }
}
