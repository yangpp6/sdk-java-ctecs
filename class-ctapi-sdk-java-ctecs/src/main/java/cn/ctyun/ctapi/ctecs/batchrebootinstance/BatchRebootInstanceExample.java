package cn.ctyun.ctapi.ctecs.batchrebootinstance;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-重启多台云主机>
 * Example: BatchRebootInstanceExample
 */
public class BatchRebootInstanceExample {
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
            BatchRebootInstanceRequestBody body = new BatchRebootInstanceRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withInstanceIDList(
                    "adc614e0-e838-d73f-0618-a6d51d09070a,5ae83d07-0389-22fd-def8-995090ee3d5a");
            BatchRebootInstanceRequest request = new BatchRebootInstanceRequest().withBody(body);
            CTResponse<BatchRebootInstanceResponseData> response = client.batchRebootInstance(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
