package cn.ctyun.ctapi.ctecs.ecsupdate;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-更新云主机的部分信息>
 * Example: EcsUpdateExample
 */
public class EcsUpdateExample {
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
            EcsUpdateRequestBody body = new EcsUpdateRequestBody().withRegionID("88f8888888dd88ec888888888d888d8b").withAzName("az1")
                    .withID("8d8e8888-8ed8-88b8-88cb-888f8b8cf8fa").withDisplayName("ecs-0003");
            EcsUpdateRequest request = new EcsUpdateRequest().withBody(body);
            CTResponse<EcsUpdateResponseData> response = client.ecsUpdate(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
