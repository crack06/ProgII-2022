package Model;

public class Client {

    private String clientName = "";
    private String clienteId = "";
    private String clientResidenceAddress = ""; // direccion de residencia
    private String clientNumberPhone = ""; // numero telefono

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getClientResidenceAddress() {
        return clientResidenceAddress;
    }

    public void setClientResidenceAddress(String clientResidenceAddress) {
        this.clientResidenceAddress = clientResidenceAddress;
    }

    public String getClientNumberPhone() {
        return clientNumberPhone;
    }

    public void setClientNumberPhone(String clientNumberPhone) {
        this.clientNumberPhone = clientNumberPhone;
    }
}
