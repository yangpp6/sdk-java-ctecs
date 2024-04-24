package cn.ctyun.ctapi.ctecs.ecslitereboot;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <轻量型云主机重启>
 * Example: EcsLiteRebootExample
 */
public class EcsLiteRebootExample {
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
            EcsLiteRebootRequestBody body = new EcsLiteRebootRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withInstanceID(
                    "adc614e0-e838-d73f-0618-a6d51d09070a");
            EcsLiteRebootRequest request = new EcsLiteRebootRequest().withBody(body);
            CTResponse<EcsLiteRebootResponseData> response = client.ecsLiteReboot(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
