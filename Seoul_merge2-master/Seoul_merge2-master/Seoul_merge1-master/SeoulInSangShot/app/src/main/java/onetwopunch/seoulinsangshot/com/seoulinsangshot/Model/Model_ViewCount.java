package onetwopunch.seoulinsangshot.com.seoulinsangshot.Model;

/**
 * Created by Beom2 on 2017-10-07.
 */

public class Model_ViewCount {

    //조회수 모델
    String url;
    String hit;

    public Model_ViewCount(String url, String hit) {
        this.url = url;
        this.hit = hit;
    }

    public String getUrl() {
        return url;
    }

    public String getHit() {
        return hit;
    }
}
