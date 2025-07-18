import javax.swing.*;
import java.awt.*;

public class UIComponents {
    public JPanel mainPanel;
    public JButton themeToggleButton, generateButton, copyButton, historyButton;
    public JTextField passwordField, baseWordField;
    public JCheckBox upperCaseCheck, lowerCaseCheck, numberCheck, symbolCheck, customWordCheck;
    public JSpinner lengthSpinner;
    public JLabel strengthLabel;

    public JPanel setupUI(ActionListener listener) {
        mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        themeToggleButton = new JButton("🌙 Switch to Light Theme");
        themeToggleButton.addActionListener(listener);
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        mainPanel.add(themeToggleButton, gbc);

        JLabel title = new JLabel("Stylish Password Generator");
        title.setFont(new Font("Segoe UI", Font.BOLD, 26));
        gbc.gridy = 1;
        mainPanel.add(title, gbc);

        gbc.gridwidth = 1; gbc.gridy = 2; gbc.gridx = 0;
        JLabel lengthLabel = new JLabel("Password Length:");
        mainPanel.add(lengthLabel, gbc);

        lengthSpinner = new JSpinner(new SpinnerNumberModel(12, 4, 32, 1));
        gbc.gridx = 1;
        mainPanel.add(lengthSpinner, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        JLabel baseLabel = new JLabel("Enter Base Word:");
        mainPanel.add(baseLabel, gbc);

        baseWordField = new JTextField(15);
        gbc.gridx = 1;
        mainPanel.add(baseWordField, gbc);

        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        customWordCheck = new JCheckBox("Use custom word in password");
        upperCaseCheck = new JCheckBox("Include Uppercase (A-Z)");
        lowerCaseCheck = new JCheckBox("Include Lowercase (a-z)");
        numberCheck = new JCheckBox("Include Numbers (0-9)");
        symbolCheck = new JCheckBox("Include Symbols (!@#$)");
        
        mainPanel.add(customWordCheck, gbc);
        gbc.gridy = 5; mainPanel.add(upperCaseCheck, gbc);
        gbc.gridy = 6; mainPanel.add(lowerCaseCheck, gbc);
        gbc.gridy = 7; mainPanel.add(numberCheck, gbc);
        gbc.gridy = 8; mainPanel.add(symbolCheck, gbc);

        generateButton = new JButton("Generate Password");
        generateButton.addActionListener(listener);
        gbc.gridy = 9;
        mainPanel.add(generateButton, gbc);

        passwordField = new JTextField(25);
        passwordField.setEditable(false);
        gbc.gridy = 10;
        mainPanel.add(passwordField, gbc);

        copyButton = new JButton("Copy to Clipboard");
        copyButton.addActionListener(listener);
        gbc.gridy = 11;
        mainPanel.add(copyButton, gbc);

        strengthLabel = new JLabel(" ");
        gbc.gridy = 12;
        mainPanel.add(strengthLabel, gbc);

        historyButton = new JButton("Show History");
        historyButton.addActionListener(listener);
        gbc.gridy = 13;
        mainPanel.add(historyButton, gbc);

        return mainPanel;
    }
}
