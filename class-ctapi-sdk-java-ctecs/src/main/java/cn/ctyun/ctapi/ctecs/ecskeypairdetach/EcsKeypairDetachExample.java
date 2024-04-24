package cn.ctyun.ctapi.ctecs.ecskeypairdetach;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-为Linux云主机解绑SSH密钥对>
 * Example: EcsKeypairDetachExample
 */
public class EcsKeypairDetachExample {
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
            EcsKeypairDetachRequestBody body = new EcsKeypairDetachRequestBody().withRegionID("4cf2962d-e92c-4c00-9181-cfbb2218636c")
                    .withID("39341024-9c57-4be4-a580-ae809d44bafd").withKeyPairName("KeyPair-886");
            EcsKeypairDetachRequest request = new EcsKeypairDetachRequest().withBody(body);
            CTResponse<EcsKeypairDetachResponseData> response = client.ecsKeypairDetach(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}