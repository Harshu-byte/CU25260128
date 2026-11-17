import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class SimpleNotepadMain extends JFrame implements ActionListener {

    JTextArea textArea;
    JMenuItem newFile, openFile, saveFile, exit;

    SimpleNotepadMain() {
        setTitle("Simple Notepad");
        setSize(600, 500);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        newFile = new JMenuItem("New");
        openFile = new JMenuItem("Open");
        saveFile = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        fileMenu.add(newFile);
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        fileMenu.addSeparator();
        fileMenu.add(exit);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        newFile.addActionListener(this);
        openFile.addActionListener(this);
        saveFile.addActionListener(this);
        exit.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newFile) {
            textArea.setText("");
        }

        else if (e.getSource() == openFile) {
            JFileChooser chooser = new JFileChooser();

            int choice = chooser.showOpenDialog(this);

            if (choice == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();

                try (BufferedReader reader =
                             new BufferedReader(new FileReader(file))) {

                    textArea.setText("");
                    String line;

                    while ((line = reader.readLine()) != null) {
                        textArea.append(line + "\n");
                    }

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Error opening file.");
                }
            }
        }

        else if (e.getSource() == saveFile) {
            JFileChooser chooser = new JFileChooser();

            int choice = chooser.showSaveDialog(this);

            if (choice == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();

                try (FileWriter writer = new FileWriter(file)) {
                    writer.write(textArea.getText());

                    JOptionPane.showMessageDialog(this,
                            "File saved successfully.");

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                            "Error saving file.");
                }
            }
        }

        else if (e.getSource() == exit) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new SimpleNotepadMain();
    }
}