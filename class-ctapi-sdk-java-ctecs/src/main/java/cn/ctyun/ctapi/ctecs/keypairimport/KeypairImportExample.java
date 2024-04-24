package cn.ctyun.ctapi.ctecs.keypairimport;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-导入密钥对>
 * Example: KeypairImportExample
 */
public class KeypairImportExample {
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
            KeypairImportRequestBody body = new KeypairImportRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withKeyPairName("KeyPair-a589")
                    .withPublicKey("").withProjectID("0");
            KeypairImportRequest request = new KeypairImportRequest().withBody(body);
            CTResponse<KeypairImportResponseData> response = client.keypairImport(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
