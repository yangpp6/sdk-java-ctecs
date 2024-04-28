package cn.ctyun.ctapi.ctecs.unsubscribeinstance;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-释放云主机>
 * Example: UnsubscribeInstanceExample
 */
public class UnsubscribeInstanceExample {
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
            UnsubscribeInstanceRequestBody body = new UnsubscribeInstanceRequestBody().withClientToken("4cf2962d-e92c-4c00-9181-cfbb2218636c")
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withInstanceID("755a72c6-ea40-ce04-7ad8-c9f54d38ccfd");
            UnsubscribeInstanceRequest request = new UnsubscribeInstanceRequest().withBody(body);
            CTResponse<UnsubscribeInstanceResponseData> response = client.unsubscribeInstance(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
