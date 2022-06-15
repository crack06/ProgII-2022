package views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientDataView extends JFrame{
    private JPanel panel1;
    private JTextField txtUserId;
    private JLabel lbUserId;
    private JButton btnSearch;
    private JTextArea tAreaAnswer;

    public ClientDataView() {
        super("Informacion del Cliente");
        setContentPane(panel1);
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
