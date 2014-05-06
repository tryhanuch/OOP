package homeWork10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by tish on 21.03.14.
 */
public class FStore {
    
    public static void store(){

        final JFrame frame = new JFrame("Store");
        JPanel panelImage = new JPanel();
        JPanel panelButtonUp = new JPanel();
        JPanel panelButtonDown = new JPanel();

        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(285, 100));
        textField.setText("There will be logo of the store");

        JButton butCatalog = new JButton("Catalog");
        butCatalog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                frame.dispose();
                FCatalog.catalog();
            }
        });

        JButton butCart = new JButton("Cart");
        butCart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                frame.dispose();
                FCart.cart();
            }
        });

        JButton butHelp = new JButton("Help");
        butHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Метод Help!
            }
        });
        
        JButton butExit = new JButton("Exit");
        butExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panelImage.add(textField);                // Добавить изображение в шапку!
        panelButtonUp.add(butCatalog, BorderLayout.WEST);
        panelButtonUp.add(butCart, BorderLayout.EAST);
        panelButtonDown.add(butHelp, BorderLayout.WEST);
        panelButtonDown.add(butExit, BorderLayout.EAST);
//        frame.setLayout(new BorderLayout());
        frame.add(panelImage, BorderLayout.PAGE_START);
        frame.add(panelButtonUp, BorderLayout.CENTER);
        frame.add(panelButtonDown, BorderLayout.PAGE_END);
        frame.setSize(300, 220);
        frame.setLocation(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
