import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pr_20 extends JFrame implements ActionListener {
    private JLabel messageLabel;
    private JButton leftButton;
    private JButton rightButton;
    private JRadioButton redRadioButton;
    private JRadioButton greenRadioButton;
    private JRadioButton blueRadioButton;

    public pr_20() {
        setTitle("Message App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        messageLabel = new JLabel("Hello, World!");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(messageLabel);

        leftButton = new JButton("Left");
        rightButton = new JButton("Right");
        add(leftButton);
        add(rightButton);

        redRadioButton = new JRadioButton("Red");
        greenRadioButton = new JRadioButton("Green");
        blueRadioButton = new JRadioButton("Blue");

        ButtonGroup colorButtonGroup = new ButtonGroup();
        colorButtonGroup.add(redRadioButton);
        colorButtonGroup.add(greenRadioButton);
        colorButtonGroup.add(blueRadioButton);

        add(redRadioButton);
        add(greenRadioButton);
        add(blueRadioButton);

        leftButton.addActionListener(this);
        rightButton.addActionListener(this);
        redRadioButton.addActionListener(this);
        greenRadioButton.addActionListener(this);
        blueRadioButton.addActionListener(this);

        pack();
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == leftButton) {
            moveMessage(-10);
        } else if (e.getSource() == rightButton) {
            moveMessage(10);
        } else if (e.getSource() == redRadioButton) {
            changeColor(Color.RED);
        } else if (e.getSource() == greenRadioButton) {
            changeColor(Color.GREEN);
        } else if (e.getSource() == blueRadioButton) {
            changeColor(Color.BLUE);
        }
    }

    private void moveMessage(int xOffset) {
        Point location = messageLabel.getLocation();
        messageLabel.setLocation(location.x + xOffset, location.y);
    }

    private void changeColor(Color color) {
        messageLabel.setForeground(color);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                pr_20 messageApp = new pr_20();
                messageApp.setVisible(true);
            }
        });
    }
}
