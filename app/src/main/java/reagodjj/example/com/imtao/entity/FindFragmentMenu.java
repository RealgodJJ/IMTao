package reagodjj.example.com.imtao.entity;

public class FindFragmentMenu {
    private int icon;
    private String itemName;

    public FindFragmentMenu(int icon, String itemName) {
        this.icon = icon;
        this.itemName = itemName;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
