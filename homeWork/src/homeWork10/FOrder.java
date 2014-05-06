package homeWork10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tish on 20.03.14.
 */
public class FOrder {

    public static void order(int value) {
        final JFrame frame = new JFrame("Order");
        JPanel panelValue = new JPanel();
        JPanel panelButton = new JPanel();

        JLabel labelValue = new JLabel("The total value of goods - " + value, JLabel.TRAILING);

        JButton butOk = new JButton("Ok");
        butOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Your order is processed!");
                frame.dispose();

                final JFrame frameOk = new JFrame("Success");
                JPanel panelLabel = new JPanel();
                JPanel panelOk = new JPanel();

                JLabel labelOk = new JLabel("Your order is processed!");

                final JButton button = new JButton("OK");
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });

                panelLabel.add(labelOk);
                panelOk.add(button);
                frameOk.setLayout(new BorderLayout());
                frameOk.add(panelLabel, BorderLayout.CENTER);
                frameOk.add(panelOk, BorderLayout.PAGE_END);
                frameOk.setSize(240, 100);
                frameOk.setLocation(330, 355);
                frameOk.setVisible(true);
                frameOk.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

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

        panelValue.add(labelValue);
        panelButton.add(butOk);
        panelButton.add(butCart);
//        frame.setLayout(new BorderLayout());
        frame.add(panelValue, BorderLayout.CENTER);
        frame.add(panelButton, BorderLayout.PAGE_END);
        frame.setSize(240, 100);
        frame.setLocation(330, 355);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}
