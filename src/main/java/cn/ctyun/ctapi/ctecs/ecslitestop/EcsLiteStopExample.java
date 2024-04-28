package cn.ctyun.ctapi.ctecs.ecslitestop;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <轻量型云主机关机>
 * Example: EcsLiteStopExample
 */
public class EcsLiteStopExample {
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
            EcsLiteStopRequestBody body = new EcsLiteStopRequestBody().withRegionID("aaf589124d5d11eaa04d0242ac110002").withInstanceID(
                    "adc614e0-e838-d73f-0618-a6d51d09070a");
            EcsLiteStopRequest request = new EcsLiteStopRequest().withBody(body);
            CTResponse<EcsLiteStopResponseData> response = client.ecsLiteStop(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
