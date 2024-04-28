package cn.ctyun.ctapi.ctecs.ecsagentbatchdetails;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <查询云主机监控插件信息>
 * Example: EcsAgentBatchDetailsExample
 */
public class EcsAgentBatchDetailsExample {
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
            EcsAgentBatchDetailsRequestBody body = new EcsAgentBatchDetailsRequestBody().withRegionID("100054c0416811e9a6690242ac110002").withInstanceIDList(
                    "73f321ea-62ff-11ec-a8bc-005056898fe0,88f888ea-88ff-88ec-a8bc-888888888fe8");
            EcsAgentBatchDetailsRequest request = new EcsAgentBatchDetailsRequest().withBody(body);
            CTResponse<EcsAgentBatchDetailsResponseData> response = client.ecsAgentBatchDetails(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
