package cn.ctyun.ctapi.ctecs.ecsunsubscribe;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-释放云主机>
 * Example: EcsUnsubscribeExample
 */
public class EcsUnsubscribeExample {
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
            EcsUnsubscribeRequestBody body = new EcsUnsubscribeRequestBody().withClientToken("4cf2962d-e92c-4c00-9181-cfbb2218636c")
                    .withRegionID("81f7728662dd11ec810800155d307d5b").withAzName("az1").withID("755a72c6-ea40-ce04-7ad8-c9f54d38ccfd");
            EcsUnsubscribeRequest request = new EcsUnsubscribeRequest().withBody(body);
            CTResponse<EcsUnsubscribeResponseData> response = client.ecsUnsubscribe(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
