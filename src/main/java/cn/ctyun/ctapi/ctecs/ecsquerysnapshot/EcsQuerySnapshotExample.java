package cn.ctyun.ctapi.ctecs.ecsquerysnapshot;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-云主机快照个数统计>
 * Example: EcsQuerySnapshotExample
 */
public class EcsQuerySnapshotExample {
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
            EcsQuerySnapshotRequestBody body = new EcsQuerySnapshotRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withInstanceIDList(
                    "88f888ea-88ff-88ec-a8bc-888888888fe8,a8f8d8c8-88fd-f88a-888b-c8888adf8da8");
            EcsQuerySnapshotRequest request = new EcsQuerySnapshotRequest().withBody(body);
            CTResponse<EcsQuerySnapshotResponseData> response = client.ecsQuerySnapshot(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}