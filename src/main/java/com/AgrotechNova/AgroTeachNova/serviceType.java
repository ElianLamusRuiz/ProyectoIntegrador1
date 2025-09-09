public class ServiceType {
    private int idserviceType;
    private String description;

    public ServiceType() {
    }

    public ServiceType(int idserviceType, String description) {
        this.idserviceType = idserviceType;
        this.description = description;
    }

    public int getIdserviceType() {
        return idserviceType;
    }

    public void setIdserviceType(int idserviceType) {
        this.idserviceType = idserviceType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
