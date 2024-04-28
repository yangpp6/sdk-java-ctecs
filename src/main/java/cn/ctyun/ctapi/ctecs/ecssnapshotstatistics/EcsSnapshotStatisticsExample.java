package cn.ctyun.ctapi.ctecs.ecssnapshotstatistics;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <云主机快照个数统计>
 * Example: EcsSnapshotStatisticsExample
 */
public class EcsSnapshotStatisticsExample {
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
            EcsSnapshotStatisticsRequestBody body = new EcsSnapshotStatisticsRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withInstanceIDList(
                    "8986fc25-4f0a-4fc6-03ef-71c386b49905, 88a6a862-9030-e91b-3843-0144cd5e5dff");
            EcsSnapshotStatisticsRequest request = new EcsSnapshotStatisticsRequest().withBody(body);
            CTResponse<EcsSnapshotStatisticsResponseData> response = client.ecsSnapshotStatistics(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
