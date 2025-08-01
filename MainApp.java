import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UIComponents ui = new UIComponents();
            ThemeManager theme = new ThemeManager();
            PasswordGenerator generator = new PasswordGenerator();
            PasswordUtils utils = new PasswordUtils();
            EventHandler handler = new EventHandler(ui, generator, utils, theme);

            JFrame frame = new JFrame("Password Generator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(700, 700);
            frame.setLocationRelativeTo(null);

            JPanel panel = ui.setupUI(handler);
            theme.applyTheme(panel, true);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}
