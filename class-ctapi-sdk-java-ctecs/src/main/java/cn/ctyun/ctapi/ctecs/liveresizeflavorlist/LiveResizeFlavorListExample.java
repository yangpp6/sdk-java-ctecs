package cn.ctyun.ctapi.ctecs.liveresizeflavorlist;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <查询云主机支持的热变配规格信息>
 * Example: LiveResizeFlavorListExample
 */
public class LiveResizeFlavorListExample {
    public static void main(String[] args) {
        String ak = "<YOUR AK>";
        String sk = "<YOUR SK>";
        String endingPoint = "<YOUR ENDINGPOINT>";
        System.out.println(run(ak, sk, endingPoint));
    }

    public static String run(String ak, String sk, String endingPoint) {
        Credential credential = new Credential().withAk(ak).withSk(sk);
        CtecsClient client = new CtecsClient();
        client.init(credential, endingPoint);
        try {
            LiveResizeFlavorListRequestBody body = new LiveResizeFlavorListRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withInstanceID(
                    "adc614e0-e838-d73f-0618-a6d51d09070a");
            LiveResizeFlavorListRequest request = new LiveResizeFlavorListRequest().withBody(body);
            CTResponse<LiveResizeFlavorListResponseData> response = client.liveResizeFlavorList(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
