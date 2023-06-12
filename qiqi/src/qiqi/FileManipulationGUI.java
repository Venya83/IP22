package qiqi;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class FileManipulationGUI extends JFrame implements ActionListener {

    private JTextField filePath;
    private JButton browseButton, insertButton;

    public FileManipulationGUI() {
        super("Программа, которая вставляет");

        // Set up the file path text field
        filePath = new JTextField(30);

        // Set up the browse button
        browseButton = new JButton("Обзор");
        browseButton.addActionListener(this);

        // Set up the insert button
        insertButton = new JButton("Вставить");
        insertButton.addActionListener(this);

        // Add the components to the content pane
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(filePath);
        c.add(browseButton);
        c.add(insertButton);

        // Set up the frame
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == browseButton) {
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                filePath.setText(file.getPath());
            }
        } else if (e.getSource() == insertButton) {
            try {
                FileWriter fw = new FileWriter(filePath.getText());
                fw.write("В меня вставили.");
                fw.close();
                JOptionPane.showMessageDialog(null, "Вставлено успешно!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Не удалось вставить: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new FileManipulationGUI();
    }
}
