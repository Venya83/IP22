package tasks;

import javax.swing.*;

public class chamber6 extends JFrame {
    private JTextArea textArea;

    public chamber6() {
        super("Чёйта?");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int[] evenNumbers = new int[10];
        for (int i = 2, j = 0; i <= 20; i += 2, j++) {
            evenNumbers[j] = i;
        }

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < evenNumbers.length; i++) {
            strBuilder.append(evenNumbers[i]).append(" ");
        }
        String strLine = strBuilder.toString().trim();

        StringBuilder strBuilder2 = new StringBuilder();
        for (int i = 0; i < evenNumbers.length; i++) {
            strBuilder2.append(evenNumbers[i]).append("\n");
        }
        String strColumn = strBuilder2.toString().trim();
        
        JLabel lineLabel = new JLabel(strLine);
        JLabel columnLabel = new JLabel(strColumn);

        textArea = new JTextArea(strColumn, 10, 10);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JPanel panel = new JPanel();
        panel.add(lineLabel);
        panel.add(columnLabel);
        panel.add(scrollPane);

        setContentPane(panel);

        setSize(400, 300);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new chamber6();
    }
}
