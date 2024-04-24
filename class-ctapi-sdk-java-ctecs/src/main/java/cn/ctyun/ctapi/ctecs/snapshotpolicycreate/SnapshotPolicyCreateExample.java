package cn.ctyun.ctapi.ctecs.snapshotpolicycreate;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-创建云主机快照策略>
 * Example: SnapshotPolicyCreateExample
 */
public class SnapshotPolicyCreateExample {
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
            SnapshotPolicyCreateRequestBody body = new SnapshotPolicyCreateRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b")
                    .withSnapshotPolicyName("api-create01").withSnapshotTime("12,13").withCycleType("day").withCycleDay(1).withCycleWeek("0,2,6")
                    .withRetentionType("num").withRetentionDay(2).withRetentionNum(3).withSnapshotPolicyStatus(1);
            SnapshotPolicyCreateRequest request = new SnapshotPolicyCreateRequest().withBody(body);
            CTResponse<SnapshotPolicyCreateResponseData> response = client.snapshotPolicyCreate(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
