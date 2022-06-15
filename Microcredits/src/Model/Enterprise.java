package Model;

import java.util.ArrayList;

public class Enterprise {
    private String name = "";
    private int nit = 0;

    public Enterprise(String name, int nit, ArrayList<Client> clients) {
        this.name = name;
        this.nit = nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

}
