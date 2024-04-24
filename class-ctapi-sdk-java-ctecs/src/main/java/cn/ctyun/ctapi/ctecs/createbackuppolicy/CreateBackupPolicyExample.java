package cn.ctyun.ctapi.ctecs.createbackuppolicy;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份策略>
 * Example: CreateBackupPolicyExample
 */
public class CreateBackupPolicyExample {
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
            CreateBackupPolicyRequestBody body = new CreateBackupPolicyRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withPolicyName("test-bak").withCycleType("day").withCycleDay(1).withCycleWeek("0,2,6").withTime("1,20").withStatus(1)
                    .withRetentionType("date").withRetentionDay(30).withRetentionNum(20).withProjectID("0");
            CreateBackupPolicyRequest request = new CreateBackupPolicyRequest().withBody(body);
            CTResponse<CreateBackupPolicyResponseData> response = client.createBackupPolicy(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
