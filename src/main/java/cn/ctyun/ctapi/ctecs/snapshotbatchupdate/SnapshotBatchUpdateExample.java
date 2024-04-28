package cn.ctyun.ctapi.ctecs.snapshotbatchupdate;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机快照>
 * Example: SnapshotBatchUpdateExample
 */
public class SnapshotBatchUpdateExample {
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
            SnapshotBatchUpdateUpdateInfo updateInfo1 = new SnapshotBatchUpdateUpdateInfo().withSnapshotID("d4d4ee2b-1478-0e0b-53e6-10e738cfc58c")
                    .withSnapshotName("snapshot_update_batch01").withSnapshotDescription("snapshot_update_des");
            SnapshotBatchUpdateRequestBody body = new SnapshotBatchUpdateRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withUpdateInfo(
                    new SnapshotBatchUpdateUpdateInfo[] { updateInfo1 });
            SnapshotBatchUpdateRequest request = new SnapshotBatchUpdateRequest().withBody(body);
            CTResponse<SnapshotBatchUpdateResponseData> response = client.snapshotBatchUpdate(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
