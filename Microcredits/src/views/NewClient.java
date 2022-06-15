package views;

import Model.Client;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NewClient extends JFrame{
    private JPanel panel1;
    private JLabel lbClientName;
    private JTextField txtClientName;
    private JLabel lbClientId;
    private JTextField txtClientId;
    private JLabel lbClientAddress;
    private JTextField txtClientAddress;
    private JLabel lbClientPhone;
    private JTextField txtClientPhone;
    private JButton btnSave;

    private ArrayList<Client> clients = new ArrayList<>();


    public NewClient() {
        super("Informacion del cliente");
        setContentPane(panel1);
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Client client = new Client();
                client.setClientName(txtClientName.getText());
                client.setClienteId(txtClientId.getText());
                client.setClientResidenceAddress(txtClientAddress.getText());
                client.setClientNumberPhone(txtClientPhone.getText());
                clients.add(client);


                var converted = convertToJSon(clients);
                saveData("JsonConverted", converted);

            }
        });
    }

    public String convertToJSon(ArrayList<Client> clients){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(clients);

    }

    public void saveData(String fullFileName, String data){
            try {
                FileWriter myWriter = new FileWriter(fullFileName);
                myWriter.write(data);
                myWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

}
