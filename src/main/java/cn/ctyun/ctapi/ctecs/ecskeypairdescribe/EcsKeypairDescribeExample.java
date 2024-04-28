package cn.ctyun.ctapi.ctecs.ecskeypairdescribe;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个密钥对>
 * Example: EcsKeypairDescribeExample
 */
public class EcsKeypairDescribeExample {
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
            EcsKeypairDescribeRequestBody body = new EcsKeypairDescribeRequestBody().withRegionID("4cf2962d-e92c-4c00-9181-cfbb2218636c").withProjectID("0")
                    .withName("KeyPair-a589").withPageNo(1).withPageSize(10);
            EcsKeypairDescribeRequest request = new EcsKeypairDescribeRequest().withBody(body);
            CTResponse<EcsKeypairDescribeResponseData> response = client.ecsKeypairDescribe(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}