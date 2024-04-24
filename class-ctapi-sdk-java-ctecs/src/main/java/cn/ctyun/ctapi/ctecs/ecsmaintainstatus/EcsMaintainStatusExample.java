package cn.ctyun.ctapi.ctecs.ecsmaintainstatus;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-获取云主机维护属性>
 * Example: EcsMaintainStatusExample
 */
public class EcsMaintainStatusExample {
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
            EcsMaintainStatusIdentity identity = new EcsMaintainStatusIdentity().withAccountId("8c6a2a5d71044e239c47bf8c17c00686");
            EcsMaintainStatusCustomInfo customInfo = new EcsMaintainStatusCustomInfo().withIdentity(identity);
            EcsMaintainStatusRequestBody body = new EcsMaintainStatusRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b").withAzName("az1")
                    .withID("2c92dba1-1f69-16fc-6567-a4886bfa0a74").withCustomInfo(customInfo);
            EcsMaintainStatusRequest request = new EcsMaintainStatusRequest().withBody(body);
            CTResponse<EcsMaintainStatusResponseData> response = client.ecsMaintainStatus(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
