package cn.ctyun.ctapi.ctecs.ecskeypairimport;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-导入RSA密钥对公钥>
 * Example: EcsKeypairImportExample
 */
public class EcsKeypairImportExample {
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
            EcsKeypairImportRequestBody body = new EcsKeypairImportRequestBody().withRegionID("4cf2962d-e92c-4c00-9181-cfbb2218636c")
                    .withKeyPairName("KeyPair-a589").withPublicKey("").withProjectID("0");
            EcsKeypairImportRequest request = new EcsKeypairImportRequest().withBody(body);
            CTResponse<EcsKeypairImportResponseData> response = client.ecsKeypairImport(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
