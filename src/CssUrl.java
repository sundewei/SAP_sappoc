/**
 * Created by IntelliJ IDEA.
 * User: I827779
 * Date: 11/18/11
 * Time: 2:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class CssUrl {
    private int id;
    private String url;

    public CssUrl(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "\"" + id + "\",\"" + url + "\"";
    }
}
