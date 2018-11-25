package reagodjj.example.com.imtao.entity;

public class FindFragmentPopularHeadline {
    private int icon, lookNum, praiseNum;
    private String content, comeFrom;

    public FindFragmentPopularHeadline(int icon, int lookNum, int praiseNum, String content, String comeFrom) {
        this.icon = icon;
        this.lookNum = lookNum;
        this.praiseNum = praiseNum;
        this.content = content;
        this.comeFrom = comeFrom;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public int getLookNum() {
        return lookNum;
    }

    public void setLookNum(int lookNum) {
        this.lookNum = lookNum;
    }

    public int getPraiseNum() {
        return praiseNum;
    }

    public void setPraiseNum(int praiseNum) {
        this.praiseNum = praiseNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(String comeFrom) {
        this.comeFrom = comeFrom;
    }
}
