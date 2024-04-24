package cn.ctyun.ctapi.ctecs.ecslitelist;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <查询轻量型云主机列表>
 * Example: EcsLiteListExample
 */
public class EcsLiteListExample {
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
            EcsLiteListRequestBody body = new EcsLiteListRequestBody().withRegionID("aaf589124d5d11eaa04d0242ac110002").withPageNo(1).withPageSize(10);
            EcsLiteListRequest request = new EcsLiteListRequest().withBody(body);
            CTResponse<EcsLiteListResponseData> response = client.ecsLiteList(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
