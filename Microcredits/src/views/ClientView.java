package views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientView extends JFrame{
    private JButton btnNewClient;
    private JPanel panel1;
    private JButton BtnSeeClients;

    public ClientView() {
        super("Clients");
        setContentPane(panel1);
        BtnSeeClients.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame frame = new ClientDataView();
                        frame.setSize(300,300);
                        frame.setVisible(true);
                    }
                });
            }
        });
        btnNewClient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        JFrame frame = new NewClient();
                        frame.setSize(300,300);
                        frame.setVisible(true);
                    }
                });
            }
        });
    }
}
