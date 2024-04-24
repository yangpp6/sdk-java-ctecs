package cn.ctyun.ctapi.ctecs.ecsliteupdatespec;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <变配轻量型云主机>
 * Example: EcsLiteUpdateSpecExample
 */
public class EcsLiteUpdateSpecExample {
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
            EcsLiteUpdateSpecRequestBody body = new EcsLiteUpdateSpecRequestBody().withClientToken("bdfse888-8ed8-88b8-88cb-888f8b8cf8fa")
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withInstanceID("adc614e0-e838-d73f-0618-a6d51d09070a").withFlavorSetType("fix")
                    .withFlavorName("lite1.fix.small.1").withBootDiskSize(40).withBandwidth(5);
            EcsLiteUpdateSpecRequest request = new EcsLiteUpdateSpecRequest().withBody(body);
            CTResponse<EcsLiteUpdateSpecResponseData> response = client.ecsLiteUpdateSpec(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
