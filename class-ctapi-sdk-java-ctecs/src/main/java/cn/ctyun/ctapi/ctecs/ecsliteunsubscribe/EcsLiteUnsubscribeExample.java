package cn.ctyun.ctapi.ctecs.ecsliteunsubscribe;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <退订轻量型云主机>
 * Example: EcsLiteUnsubscribeExample
 */
public class EcsLiteUnsubscribeExample {
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
            EcsLiteUnsubscribeRequestBody body = new EcsLiteUnsubscribeRequestBody().withClientToken("4cf2962d-e92c-4c00-9181-cfbb2218636c")
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withInstanceID("adc614e0-e838-d73f-0618-a6d51d09070a");
            EcsLiteUnsubscribeRequest request = new EcsLiteUnsubscribeRequest().withBody(body);
            CTResponse<EcsLiteUnsubscribeResponseData> response = client.ecsLiteUnsubscribe(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
