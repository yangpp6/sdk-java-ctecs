package cn.ctyun.ctapi.ctecs.ecssnapshotstatus;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照状态>
 * Example: EcsSnapshotStatusExample
 */
public class EcsSnapshotStatusExample {
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
            EcsSnapshotStatusRequestBody body = new EcsSnapshotStatusRequestBody().withRegionID("").withSnapshotID("");
            EcsSnapshotStatusRequest request = new EcsSnapshotStatusRequest().withBody(body);
            CTResponse<EcsSnapshotStatusResponseData> response = client.ecsSnapshotStatus(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
