package swingsample;

import javax.swing.*;
import javax.swing.DefaultListModel;

public class MyJListExample {
    MyJListExample() {
        JFrame frame = new JFrame("Example");
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("First item");
        listModel.addElement("Second item");
        JList<String> myList = new JList<>(listModel);
        myList.setBounds(100, 100, 75, 75);
        frame.add(myList);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> {
            new MyJListExample();
        });
    }
}
