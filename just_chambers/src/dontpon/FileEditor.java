package dontpon;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class FileEditor extends JFrame implements ActionListener {

    private JTextField filePathField;
    private JTextArea fileTextArea;

    public FileEditor() {
        super("Текстовый редактор");
        setSize(750, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel(new BorderLayout());
        JPanel filePanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(new GridLayout(1, 5));
        setLocationRelativeTo(null);

        filePathField = new JTextField();
        JButton browseButton = new JButton("Обзор");
        browseButton.addActionListener(this);

        filePanel.add(new JScrollPane(fileTextArea = new JTextArea()), BorderLayout.CENTER);

        JButton newFileButton = new JButton("Создать новый");
        newFileButton.addActionListener(this);
        JButton deleteButton = new JButton("Удалить");
        deleteButton.addActionListener(this);
        JButton renameButton = new JButton("Переименовать");
        renameButton.addActionListener(this);
        JButton readButton = new JButton("Прочитать");
        readButton.addActionListener(this);
        JButton saveButton = new JButton("Записать");
        saveButton.addActionListener(this);

        buttonPanel.add(newFileButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(renameButton);
        buttonPanel.add(readButton);
        buttonPanel.add(saveButton);

        topPanel.add(filePathField, BorderLayout.CENTER);
        topPanel.add(browseButton, BorderLayout.EAST);

        add(topPanel, BorderLayout.NORTH);
        add(filePanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Обзор")) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                filePathField.setText(file.getAbsolutePath());
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    fileTextArea.read(reader, null);
                    reader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getActionCommand().equals("Создать новый")) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                filePathField.setText(file.getAbsolutePath());
                try {
                    FileWriter writer = new FileWriter(file);
                    writer.write("");
                    writer.close();
                    fileTextArea.setText("");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getActionCommand().equals("Удалить")) {
            String filePath = filePathField.getText();
            if (!filePath.isEmpty()) {
                File file = new File(filePath);
                if (file.delete()) {
                    JOptionPane.showMessageDialog(this, "Файл успешно удалён");
                    filePathField.setText("");
                    fileTextArea.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Ошибка при удалении файла");
                }
            }
        } else if (e.getActionCommand().equals("Переименовать")) {
            String filePath = filePathField.getText();
            if (!filePath.isEmpty()) {
                File file = new File(filePath);
                String newFilePath = JOptionPane.showInputDialog(this, "Введите новое имя файла", file.getName());
                if (newFilePath != null && !newFilePath.isEmpty())
                {
                    File newFile = new File(file.getParent(), newFilePath);
                    if (file.renameTo(newFile)) {
                        filePathField.setText(newFile.getAbsolutePath());
                    } else {
                        JOptionPane.showMessageDialog(this, "Ошибка при переименовании файла");
                    }
                }
            }
        } else if (e.getActionCommand().equals("Прочитать")) {
            String filePath = filePathField.getText();
            if (!filePath.isEmpty()) {
                File file = new File(filePath);
                try {
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    fileTextArea.read(reader, null);
                    reader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getActionCommand().equals("Записать")) {
            String filePath = filePathField.getText();
            if (!filePath.isEmpty()) {
                File file = new File(filePath);
                try {
                    FileWriter writer = new FileWriter(file);
                    fileTextArea.write(writer);
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        FileEditor fileEditor = new FileEditor();
        fileEditor.setVisible(true);
    }
}
