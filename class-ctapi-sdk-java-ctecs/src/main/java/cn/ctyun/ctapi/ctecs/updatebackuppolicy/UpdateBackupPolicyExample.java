package cn.ctyun.ctapi.ctecs.updatebackuppolicy;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-修改启用停用云主机备份策略>
 * Example: UpdateBackupPolicyExample
 */
public class UpdateBackupPolicyExample {
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
            UpdateBackupPolicyRequestBody body = new UpdateBackupPolicyRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b")
                    .withPolicyID("d58bc64aa3b411edaf600242ac110009").withPolicyName("test-bak").withCycleType("day").withCycleDay(1).withCycleWeek("0,2,6")
                    .withTime("1,20").withStatus(1).withRetentionType("date").withRetentionDay(30).withRetentionNum(20);
            UpdateBackupPolicyRequest request = new UpdateBackupPolicyRequest().withBody(body);
            CTResponse<UpdateBackupPolicyResponseData> response = client.updateBackupPolicy(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
