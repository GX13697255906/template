package helper;

public class UrlAndName {

    private String url;

    private String syncName;

    public UrlAndName(String url, String syncName) {
        this.url = url;
        this.syncName = syncName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSyncName() {
        return syncName;
    }

    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }
}
