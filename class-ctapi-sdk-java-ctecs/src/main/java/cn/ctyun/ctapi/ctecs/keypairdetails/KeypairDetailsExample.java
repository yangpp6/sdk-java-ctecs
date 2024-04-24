package cn.ctyun.ctapi.ctecs.keypairdetails;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-获取密钥对详情>
 * Example: KeypairDetailsExample
 */
public class KeypairDetailsExample {
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
            KeypairDetailsRequestBody body = new KeypairDetailsRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withProjectID("0")
                    .withKeyPairName("KeyPair-a589").withQueryContent("KeyPair-a589").withPageNo(1).withPageSize(10);
            KeypairDetailsRequest request = new KeypairDetailsRequest().withBody(body);
            CTResponse<KeypairDetailsResponseData> response = client.keypairDetails(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
