package cn.ctyun.ctapi.ctecs.ecssnapshotdelete;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-删除云主机快照>
 * Example: EcsSnapshotDeleteExample
 */
public class EcsSnapshotDeleteExample {
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
            EcsSnapshotDeleteRequestBody body = new EcsSnapshotDeleteRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withSnapshotID(
                    "b6e2966d-7b1c-385e-abe4-d940caa273b7");
            EcsSnapshotDeleteRequest request = new EcsSnapshotDeleteRequest().withBody(body);
            CTResponse<EcsSnapshotDeleteResponseData> response = client.ecsSnapshotDelete(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
