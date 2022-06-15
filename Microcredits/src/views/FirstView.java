package views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstView extends JFrame{
    private JPanel panel1;
    private JLabel txtTitle;
    private JButton btnClients;


    public FirstView(){
        super("Microcredits!");
        setContentPane(panel1);

        btnClients.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame frame = new ClientView();
                        frame.setSize(300,300);
                        frame.setVisible(true);
                    }
                });
            }
        });
    }





}
