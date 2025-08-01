import java.util.*;

public class PasswordUtils {
    private final ArrayList<String> passwordHistory = new ArrayList<>();
    private final HashMap<String, String> passwordStrengthMap = new HashMap<>();

    public String checkStrength(String password) {
        int score = 0;
        if (password.length() >= 8) score++;
        if (password.matches(".[A-Z].")) score++;
        if (password.matches(".[a-z].")) score++;
        if (password.matches(".\\d.")) score++;
        if (password.matches(".[!@#$%^&()].*")) score++;

        String strength = switch (score) {
            case 5 -> "Strong";
            case 4 -> "Good";
            case 3 -> "Weak";
            default -> "Very Weak";
        };
        passwordStrengthMap.put(password, strength);
        passwordHistory.add(password);
        return strength;
    }

    public ArrayList<String> getHistory() {
        return passwordHistory;
    }

    public HashMap<String, String> getStrengthMap() {
        return passwordStrengthMap;
    }
}
