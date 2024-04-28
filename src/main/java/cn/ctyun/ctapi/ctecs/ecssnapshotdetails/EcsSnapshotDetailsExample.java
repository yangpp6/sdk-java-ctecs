package cn.ctyun.ctapi.ctecs.ecssnapshotdetails;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照详情>
 * Example: EcsSnapshotDetailsExample
 */
public class EcsSnapshotDetailsExample {
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
            EcsSnapshotDetailsRequestBody body = new EcsSnapshotDetailsRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b").withSnapshotID(
                    "b6e2966d-7b1c-385e-abe4-d940caa273b7");
            EcsSnapshotDetailsRequest request = new EcsSnapshotDetailsRequest().withBody(body);
            CTResponse<EcsSnapshotDetailsResponseData> response = client.ecsSnapshotDetails(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
