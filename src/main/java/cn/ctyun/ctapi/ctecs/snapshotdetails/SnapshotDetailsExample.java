package cn.ctyun.ctapi.ctecs.snapshotdetails;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-获取云主机快照详情>
 * Example: SnapshotDetailsExample
 */
public class SnapshotDetailsExample {
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
            SnapshotDetailsRequest request = new SnapshotDetailsRequest().withRegionID("bb9fdb42056f11eda1610242ac110002").withSnapshotID(
                    "c7a7f06d-fb0f-8d5a-e710-9262995b6b6d");
            CTResponse<SnapshotDetailsResponseData> response = client.snapshotDetails(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
