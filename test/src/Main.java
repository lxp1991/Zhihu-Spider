

/**
 * Created by lxp19_000 on 2015-04-11.
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // 定义即将访问的链接
        String url = "http://www.zhihu.com/explore/recommendations";
        // 访问链接并获取页面内容
        String content = Spider.SendGet(url);
        // 获取编辑推荐
        ArrayList<Zhihu> myZhihu = Spider.GetRecommendations(content);
        // 打印结果
        System.out.println(myZhihu);
    }
}