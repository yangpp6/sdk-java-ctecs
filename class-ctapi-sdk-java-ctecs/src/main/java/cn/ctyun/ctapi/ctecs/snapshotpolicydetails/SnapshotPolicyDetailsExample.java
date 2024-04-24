package cn.ctyun.ctapi.ctecs.snapshotpolicydetails;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照策略详情>
 * Example: SnapshotPolicyDetailsExample
 */
public class SnapshotPolicyDetailsExample {
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
            SnapshotPolicyDetailsRequestBody body = new SnapshotPolicyDetailsRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b")
                    .withSnapshotPolicyID("4f69f096066011ee9caf0242ac110002");
            SnapshotPolicyDetailsRequest request = new SnapshotPolicyDetailsRequest().withBody(body);
            CTResponse<SnapshotPolicyDetailsResponseData> response = client.snapshotPolicyDetails(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
