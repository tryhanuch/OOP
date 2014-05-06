package sWing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

/**
 * Created by tish on 16.03.14.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        JFrame frame = new JFrame("aaa");
        JPanel panel = new JPanel();
        JTextField tfFirstName = new JTextField();
        tfFirstName.setPreferredSize(new Dimension(375, 20));
        JTextField tfSecondName = new JTextField();
        tfSecondName.setPreferredSize(new Dimension(375, 20));
        JTextField tfSalary = new JTextField();
        tfSalary.setPreferredSize(new Dimension(375, 20));
        JTextField tfAge = new JTextField();
        tfAge.setPreferredSize(new Dimension(375, 20));

        panel.add(tfFirstName);
        panel.add(tfSecondName);
        panel.add(tfSalary);
        panel.add(tfAge);



//        JFrame frame = new JFrame("File");
//        JPanel panel = new JPanel();
//        final JTextArea textArea0 = new JTextArea();
//        final JTextArea textArea1 = new JTextArea();
//
//        JButton button0 = new JButton("Read text");
//        button0.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//               textArea0.setText(" ");
//                for (int i = 0; i < ReadWrite.read().size(); i++) {
//                    textArea0.append("\n"+ReadWrite.read().get(i));    //??????????????????
//                }
//            }
//        });
//        panel.add(button0);
//
//        JButton button1 = new JButton("Write text");
//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String str = textArea1.getText();
//                ReadWrite.write(str, true);
//            }
//        });
//        panel.add(button1);
//
//        JButton button2 = new JButton("Clear file");
//        button2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                ReadWrite.write("", false);
//            }
//        });
//        panel.add(button2);
//
//        JScrollPane areaScrollPane0 = new JScrollPane(textArea0);
//        areaScrollPane0.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        areaScrollPane0.setPreferredSize(new Dimension(375, 100));
//
//        panel.add(areaScrollPane0);
//
//        JScrollPane areaScrollPane1 = new JScrollPane(textArea1);
//        areaScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        areaScrollPane1.setPreferredSize(new Dimension(375, 100));
//
//        panel.add(areaScrollPane1);

        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(400, 300);
//        frame.setLocation(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
