package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class FilterComboBoxExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Filter JComboBox Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            FilterComboBox<String> filterComboBox = new FilterComboBox<>(getComboBoxItems());
            JTextField filterTextField = new JTextField(15);

            filterTextField.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    filterComboBox.filterItems(filterTextField.getText());
                }
            });

            panel.add(new JLabel("Filter: "));
            panel.add(filterTextField);

            frame.add(panel, BorderLayout.NORTH);
            frame.add(filterComboBox, BorderLayout.CENTER);

            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private static List<String> getComboBoxItems() {
        List<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");
        items.add("Grape");
        items.add("Lemon");
        items.add("Orange");
        items.add("Peach");
        items.add("Strawberry");
        items.add("Watermelon");
        return items;
    }
}

class FilterComboBox<T> extends JComboBox<T> {
    private List<T> originalItems;

    public FilterComboBox(List<T> items) {
        super((T[]) items.toArray());
        this.originalItems = new ArrayList<>(items);
        setEditable(true);

        JTextField textField = (JTextField) getEditor().getEditorComponent();
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filterItems(textField.getText());
            }
        });
    }

    public void filterItems(String filterText) {
        removeAllItems();
        originalItems.stream()
                .filter(item -> item.toString().toLowerCase().contains(filterText.toLowerCase()))
                .forEach(this::addItem);
        setPopupVisible(true);
    }
}
