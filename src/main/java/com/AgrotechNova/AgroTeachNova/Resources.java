public class Resources {
    private int idresources;
    private String name;
    private String description;
    private float cost;
    private resourceType idresourceType;

    public resources() {
    }

    public resources(int idresources, String name, String description, float cost, int resourceType_idresourceType) {
        this.idresources = idresources;
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.idresourceType = idresourceType;
    }

    public int getIdresources() {
        return idresources;
    }

    public void setIdresources(int idresources) {
        this.idresources = idresources;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public ResourceType getIdResourceType() {
        return idresourceType;
    }

    public void ResourceType setIdResourceType() {
      this.idresourceType = idresourceType;
}
