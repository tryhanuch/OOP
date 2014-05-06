package homeWork10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tish on 20.03.14.
 */
public class FCart {

    public static void cart(){
        final JFrame frame = new JFrame("Cart");
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
        textField.setToolTipText("Enter the goods id to remove from cart");
        String id = textField.getText();

        JButton butRemove = new JButton("Remove");
        butRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Метод удаления из корзины by id!
            }
        });

        JButton butClean = new JButton("Clean");
        butClean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Метод очистки корзины!
            }
        });

        JButton butBuy = new JButton("Buy");
        butBuy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int value = 0;
                //Метод общей сумы покупки!
                FOrder.order(value);
                frame.dispose();
            }
        });

        JButton butCatalog = new JButton("Catalog");
        butCatalog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                FCatalog.catalog();
            }
        });

        panelTable.add(areaScrollPane);
        panelField.add(textField, BorderLayout.WEST);
        panelField.add(butRemove, BorderLayout.EAST);
        panelButton.add(butClean);
        panelButton.add(butBuy);
        panelButton.add(butCatalog);
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
