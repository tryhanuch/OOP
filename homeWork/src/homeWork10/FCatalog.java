package homeWork10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tish on 21.03.14.
 */
public class FCatalog {

    public static void catalog(){

        final JFrame frame = new JFrame("Catalog");
        JPanel panelTable = new JPanel();
        JPanel panelField = new JPanel();
        JPanel panelButton = new JPanel();


        Object [][] data = {                //TableModel
                {"11", "12", "13", "14"},
                {"21", "22", "23", "24"},
                {"11", "12", "13", "14"},
                {"11", "12", "13", "14"},
                {"11", "12", "13", "14"},
                {"11", "12", "13", "14"},
                {"11", "12", "13", "14"},
                {"11", "12", "13", "14"},
                {"11", "12", "13", "14"},
                {"31", "32", "33", "34"}
        };
        Object [] clNames = {"First name", "Second name", "Salary", "Age"};
        //  Метод заполнения таблицы!

        JTable table = new JTable(data, clNames);
        JScrollPane areaScrollPane = new JScrollPane(table);
        areaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        areaScrollPane.setPreferredSize(new Dimension(285, 100));

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(50, 27));
        textField.setToolTipText("Enter the goods id to add to cart");
        String id = textField.getText();

        JButton butAdd = new JButton("Add");
        butAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Метод добавления в корзину by id!
            }
        });

        JButton butCart = new JButton("Cart");
        butCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                FCart.cart();
            }
        });

        panelTable.add(areaScrollPane);
        panelField.add(textField, BorderLayout.WEST);
        panelField.add(butAdd, BorderLayout.EAST);
        panelButton.add(butCart);
//        frame.setLayout(new BorderLayout());
        frame.add(panelTable, BorderLayout.PAGE_START);
        frame.add(panelField, BorderLayout.CENTER);
        frame.add(panelButton, BorderLayout.PAGE_END);
        frame.setSize(300, 220);
        frame.setLocation(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}
