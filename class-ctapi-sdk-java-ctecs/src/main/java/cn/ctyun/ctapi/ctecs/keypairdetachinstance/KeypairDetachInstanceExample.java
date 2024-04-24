package cn.ctyun.ctapi.ctecs.keypairdetachinstance;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-密钥对解绑云主机>
 * Example: KeypairDetachInstanceExample
 */
public class KeypairDetachInstanceExample {
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
            KeypairDetachInstanceRequestBody body = new KeypairDetachInstanceRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withInstanceID("39341024-9c57-4be4-a580-ae809d44bafd").withKeyPairName("KeyPair-886");
            KeypairDetachInstanceRequest request = new KeypairDetachInstanceRequest().withBody(body);
            CTResponse<KeypairDetachInstanceResponseData> response = client.keypairDetachInstance(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
