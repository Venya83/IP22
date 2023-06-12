import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Game extends JFrame {
    private Player player;

    public Game() {
        super("Getting Over It with Cirno");

        // Окно
        setSize(900, 900);
        setLocationRelativeTo(null); // Центрирование
        setResizable(false);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Фон
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon image = new ImageIcon("materials\\bg.png");
                g.drawImage(image.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(new BorderLayout());

        // Создание игрока
        ImageIcon playerImage = new ImageIcon("materials\\cirno.png");
        player = new Player(panel.getWidth() / 2 - playerImage.getIconWidth() / 2, panel.getHeight() / 2 - playerImage.getIconHeight() / 2, playerImage);
        panel.add(player.getImageLabel(), BorderLayout.CENTER);

        add(panel);

        // Подслушивание клавиш
        panel.setFocusable(true);
        panel.requestFocusInWindow();
        panel.addKeyListener(new ArrowKeyListener());

        setVisible(true);
    }

    private class ArrowKeyListener implements java.awt.event.KeyListener {
        private Timer moveTimer;

        public ArrowKeyListener() {
            moveTimer = new Timer(10, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    player.move(player.getDx(), player.getDy());
                }
            });
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();

            if (keyCode == KeyEvent.VK_LEFT) {
                player.setDx(-1);
            } else if (keyCode == KeyEvent.VK_RIGHT) {
                player.setDx(1);
            } else if (keyCode == KeyEvent.VK_UP) {
                player.setDy(-1);
            } else if (keyCode == KeyEvent.VK_DOWN) {
                player.setDy(1);
            } else if (keyCode == KeyEvent.VK_C) {

            }

            moveTimer.start();
        }

        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();

            if (keyCode == KeyEvent.VK_LEFT || keyCode == KeyEvent.VK_RIGHT) {
                player.setDx(0);
            } else if (keyCode == KeyEvent.VK_UP || keyCode == KeyEvent.VK_DOWN) {
                player.setDy(0);
            }

            if (player.getDx() == 0 && player.getDy() == 0) {
                moveTimer.stop();
            }
        }

        @Override
        public void keyTyped(KeyEvent e) {
            // do nothing
        }
    }
}
