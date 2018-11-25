package reagodjj.example.com.imtao.entity;

public class MainFragmentMainMenu {
    private String itemName;
    private int icon;

    public MainFragmentMainMenu(String itemName, int icon) {
        this.itemName = itemName;
        this.icon = icon;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
