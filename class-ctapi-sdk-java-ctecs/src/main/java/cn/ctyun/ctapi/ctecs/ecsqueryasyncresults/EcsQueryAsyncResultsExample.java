package cn.ctyun.ctapi.ctecs.ecsqueryasyncresults;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-批量查询异步任务的结果>
 * Example: EcsQueryAsyncResultsExample
 */
public class EcsQueryAsyncResultsExample {
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
            EcsQueryAsyncResultsRequestBody body = new EcsQueryAsyncResultsRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withJobIDList(
                    "a8e88ab8-888e-8888-8b88-c8f88a88e8bf,a8e88ab8-888e-8888-8b88-c8f88a88e8bk");
            EcsQueryAsyncResultsRequest request = new EcsQueryAsyncResultsRequest().withBody(body);
            CTResponse<EcsQueryAsyncResultsResponseData> response = client.ecsQueryAsyncResults(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
