import javax.swing.JOptionPane;

public class LoginCheck {

    public static void main(String[] args) {

        // Prompt for username
        String username = JOptionPane.showInputDialog("Enter username:");

        // Prompt for password
        String password = JOptionPane.showInputDialog("Enter password:");

        // Compare credentials
        if (username != null && password != null &&
            username.equals("Hero") && password.equals("Zero")) {

            JOptionPane.showMessageDialog(null, "Access Granted");

        } else {
            JOptionPane.showMessageDialog(null, "Incorrect Credentials");
        }
    }
}
