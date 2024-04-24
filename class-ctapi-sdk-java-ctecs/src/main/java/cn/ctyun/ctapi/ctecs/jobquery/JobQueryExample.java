package cn.ctyun.ctapi.ctecs.jobquery;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个异步任务的结果>
 * Example: JobQueryExample
 */
public class JobQueryExample {
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
            JobQueryRequestBody body = new JobQueryRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withJobIDs(
                    "a8e88ab8-888e-8888-8b88-c8f88a88e8bf,a8e88ab8-888e-8888-8b88-c8f88a88e8bk");
            JobQueryRequest request = new JobQueryRequest().withBody(body);
            CTResponse<JobQueryResponseData> response = client.jobQuery(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
