public class CatalogItem {
    private int id;
    private String name;
    private String desc;

    public CatalogItem(int id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public int getID() { return id;}
    public String getName() { return name;}
    public String getDesc() { return desc;}

    public void setName() { this.name = name;}
    public void setDesc() { this.desc = desc;}
}
