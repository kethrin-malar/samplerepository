package swingsample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JWindowExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        // Create the main JFrame
        JFrame frame = new JFrame("JWindow Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a button
        JButton button = new JButton("Show JWindow");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create a JWindow
                JWindow jWindow = new JWindow();
                jWindow.setSize(200, 100);

                // Create a label and add it to the JWindow
                JLabel label = new JLabel("Hello, JWindow!");
                label.setHorizontalAlignment(JLabel.CENTER);
                jWindow.getContentPane().add(label, BorderLayout.CENTER);

                // Set the location of the JWindow relative to the button
                Point buttonLocation = button.getLocationOnScreen();
                jWindow.setLocation(buttonLocation.x, buttonLocation.y + button.getHeight());

                // Make the JWindow visible
                jWindow.setVisible(true);
            }
        });

        // Add the button to the main JFrame
        frame.add(button, BorderLayout.CENTER);

        // Center the main JFrame on the screen
        frame.setLocationRelativeTo(null);

        // Make the main JFrame visible
        frame.setVisible(true);
    }
}
