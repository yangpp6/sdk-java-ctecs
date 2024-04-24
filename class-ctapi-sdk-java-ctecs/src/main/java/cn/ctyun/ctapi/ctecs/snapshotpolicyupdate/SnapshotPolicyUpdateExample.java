package cn.ctyun.ctapi.ctecs.snapshotpolicyupdate;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-修改云主机快照策略>
 * Example: SnapshotPolicyUpdateExample
 */
public class SnapshotPolicyUpdateExample {
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
            SnapshotPolicyUpdateRequestBody body = new SnapshotPolicyUpdateRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b")
                    .withSnapshotPolicyID("4f69f096066011ee9caf0242ac110002").withSnapshotPolicyName("update-test01").withSnapshotTime("12,13")
                    .withCycleType("week").withCycleDay(1).withCycleWeek("0,2,6").withRetentionType("date").withRetentionDay(2).withRetentionNum(3);
            SnapshotPolicyUpdateRequest request = new SnapshotPolicyUpdateRequest().withBody(body);
            CTResponse<SnapshotPolicyUpdateResponseData> response = client.snapshotPolicyUpdate(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
