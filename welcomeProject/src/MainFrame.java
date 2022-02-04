import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JButton okButton;
    private JButton clearButton;
    private JPanel MainPanel;
    private JLabel jlWelcome;

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();

    }

    public MainFrame() {
        setContentPane(MainPanel);
        setTitle("Welcome");
        setSize(450, 600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                jlWelcome.setText("Welcome " + firstName + " " + lastName  );

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                jlWelcome.setText("");
            }
        });
    }
};





