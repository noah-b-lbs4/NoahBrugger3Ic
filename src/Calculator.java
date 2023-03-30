import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    // Deklariere Komponenten
    private JTextField num1Field, num2Field, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton, clearButton;

    // Konstruktor
    public Calculator() {

        // Setze Titel und Größe des Fensters
        setTitle("Taschenrechner");
        setSize(300, 200);

        // Setze Farbschema
        Color backgroundColor = new Color(28, 28, 28);
        Color foregroundColor = new Color(220, 220, 220);
        Color buttonColor = new Color(55, 55, 55);
        Color buttonTextColor = new Color(255, 255, 255);

        // Erstelle Komponenten mit Retro-Stil
        num1Field = new JTextField(10);
        num1Field.setBackground(backgroundColor);
        num1Field.setForeground(Color.WHITE);
        num1Field.setBorder(BorderFactory.createLineBorder(foregroundColor));

        num2Field = new JTextField(10);
        num2Field.setBackground(backgroundColor);
        num2Field.setForeground(Color.WHITE);
        num2Field.setBorder(BorderFactory.createLineBorder(foregroundColor));

        resultField = new JTextField(10);
        resultField.setBackground(backgroundColor);
        resultField.setForeground(foregroundColor);
        resultField.setBorder(BorderFactory.createLineBorder(foregroundColor));
        resultField.setEditable(false); // Ergebnisfeld kann nicht vom Benutzer bearbeitet werden

        addButton = new JButton("+");
        addButton.setBackground(buttonColor);
        addButton.setForeground(buttonTextColor);
        addButton.setBorder(BorderFactory.createLineBorder(buttonTextColor));

        subtractButton = new JButton("-");
        subtractButton.setBackground(buttonColor);
        subtractButton.setForeground(buttonTextColor);
        subtractButton.setBorder(BorderFactory.createLineBorder(buttonTextColor));

        multiplyButton = new JButton("*");
        multiplyButton.setBackground(buttonColor);
        multiplyButton.setForeground(buttonTextColor);
        multiplyButton.setBorder(BorderFactory.createLineBorder(buttonTextColor));

        divideButton = new JButton("/");
        divideButton.setBackground(buttonColor);
        divideButton.setForeground(buttonTextColor);
        divideButton.setBorder(BorderFactory.createLineBorder(buttonTextColor));

        clearButton = new JButton("Löschen");
        clearButton.setBackground(buttonColor);
        clearButton.setForeground(buttonTextColor);
        clearButton.setBorder(BorderFactory.createLineBorder(buttonTextColor));

        // Füge Action Listener zu Buttons hinzu
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Erstelle Panel für Eingabefelder
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));
        inputPanel.setBackground(backgroundColor);

        JLabel num1Label = new JLabel("Erste Zahl eingeben: ");
        num1Label.setForeground(Color.WHITE);
        inputPanel.add(num1Label);
        inputPanel.add(num1Field);

        JLabel num2Label = new JLabel("Zweite Zahl eingeben: ");
        num2Label.setForeground(Color.WHITE);
        inputPanel.add(num2Label);
        inputPanel.add(num2Field);

        JLabel resultLabel = new JLabel("Ergebnis: ");
        resultLabel.setForeground(Color.WHITE);
        inputPanel.add(resultLabel);
        inputPanel.add(resultField);

        // Erstelle Panel für Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2));
        buttonPanel.setBackground(backgroundColor);
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);
        buttonPanel.add(clearButton);

        // Füge Panels zum Frame hinzu
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Setze Frame-Eigenschaften
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // ActionListener-Methode zum Behandeln von Button-Klicks
    public void actionPerformed(ActionEvent e) {

        // Behandle Klick auf Löschen-Button
        if (e.getSource() == clearButton) {
            num1Field.setText("");
            num2Field.setText("");
            resultField.setText("");
            return;
        }

        // Hole Eingabewerte aus Textfeldern
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());

        // Führe entsprechende Operation basierend auf Button-Klick aus
        if (e.getSource() == addButton) {
            resultField.setText(String.valueOf(num1 + num2));
        } else if (e.getSource() == subtractButton) {
            resultField.setText(String.valueOf(num1 - num2));
        } else if (e.getSource() == multiplyButton) {
            resultField.setText(String.valueOf(num1 * num2));
        } else if (e.getSource() == divideButton) {
            if (num2 == 0) {
                resultField.setText("Undefiniert");
            } else {
                resultField.setText(String.valueOf(num1 / num2));
            }
        }
    }

    // Main-Methode zum Ausführen des Programms
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
