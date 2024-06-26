package cn.ctyun.ctapi.ctecs.snapshotpolicyinstancelist;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询快照策略绑定云主机列表>
 * Example: SnapshotPolicyInstanceListExample
 */
public class SnapshotPolicyInstanceListExample {
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
            SnapshotPolicyInstanceListRequestBody body = new SnapshotPolicyInstanceListRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b")
                    .withSnapshotPolicyID("4f69f096066011ee9caf0242ac110002").withPageNo(1).withPageSize(10);
            SnapshotPolicyInstanceListRequest request = new SnapshotPolicyInstanceListRequest().withBody(body);
            CTResponse<SnapshotPolicyInstanceListResponseData> response = client.snapshotPolicyInstanceList(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
