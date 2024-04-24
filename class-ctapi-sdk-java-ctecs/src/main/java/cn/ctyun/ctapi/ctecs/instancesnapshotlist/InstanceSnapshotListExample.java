package cn.ctyun.ctapi.ctecs.instancesnapshotlist;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-获取云主机快照列表>
 * Example: InstanceSnapshotListExample
 */
public class InstanceSnapshotListExample {
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
            InstanceSnapshotListRequestBody body = new InstanceSnapshotListRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withProjectID("0")
                    .withPageNo(1).withPageSize(10).withInstanceID("b6e2966d-7b1c-385e-abe4-d940caa273b7").withSnapshotStatus("restoring")
                    .withSnapshotID("73e30bcd-119b-9653-f864-a50150434a90").withQueryContent("").withSnapshotName("snapshot_for_restore");
            InstanceSnapshotListRequest request = new InstanceSnapshotListRequest().withBody(body);
            CTResponse<InstanceSnapshotListResponseData> response = client.instanceSnapshotList(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
