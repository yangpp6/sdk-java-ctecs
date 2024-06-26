package cn.ctyun.ctapi.ctecs.ecsagentbatchaction;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <操作云主机监控插件>
 * Example: EcsAgentBatchActionExample
 */
public class EcsAgentBatchActionExample {
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
            EcsAgentBatchActionActionInfo actionInfo1 = new EcsAgentBatchActionActionInfo().withInstanceID("88f888ea-88ff-88ec-a8bc-888888888fe8")
                    .withSystemType("").withSystemArch("").withSystemVersion("");
            EcsAgentBatchActionRequestBody body = new EcsAgentBatchActionRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withAction("")
                    .withActionInfo(new EcsAgentBatchActionActionInfo[] { actionInfo1 });
            EcsAgentBatchActionRequest request = new EcsAgentBatchActionRequest().withBody(body);
            CTResponse<EcsAgentBatchActionResponseData> response = client.ecsAgentBatchAction(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
