package cn.ctyun.ctapi.ctecs.ecsstart;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-开启一台云主机>
 * Example: EcsStartExample
 */
public class EcsStartExample {
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
            EcsStartRequestBody body = new EcsStartRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b").withAzName("az1")
                    .withID("adc614e0-e838-d73f-0618-a6d51d09070a");
            EcsStartRequest request = new EcsStartRequest().withBody(body);
            CTResponse<EcsStartResponseData> response = client.ecsStart(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
