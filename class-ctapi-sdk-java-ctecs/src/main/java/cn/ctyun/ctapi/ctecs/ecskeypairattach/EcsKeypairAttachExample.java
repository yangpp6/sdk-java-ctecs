package cn.ctyun.ctapi.ctecs.ecskeypairattach;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-绑定SSH密钥对到云主机>
 * Example: EcsKeypairAttachExample
 */
public class EcsKeypairAttachExample {
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
            EcsKeypairAttachRequestBody body = new EcsKeypairAttachRequestBody().withRegionID("4cf2962d-e92c-4c00-9181-cfbb2218636c")
                    .withKeyPairName("KeyPair-886").withID("b6e2966d-7b1c-385e-abe4-d940caa273b7");
            EcsKeypairAttachRequest request = new EcsKeypairAttachRequest().withBody(body);
            CTResponse<EcsKeypairAttachResponseData> response = client.ecsKeypairAttach(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
