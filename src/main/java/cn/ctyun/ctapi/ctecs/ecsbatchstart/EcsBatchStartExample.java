package cn.ctyun.ctapi.ctecs.ecsbatchstart;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-开启多台云主机>
 * Example: EcsBatchStartExample
 */
public class EcsBatchStartExample {
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
            EcsBatchStartRequestBody body = new EcsBatchStartRequestBody().withRegionID("").withID("").withInstanceIDList("");
            EcsBatchStartRequest request = new EcsBatchStartRequest().withBody(body);
            CTResponse<EcsBatchStartResponseData> response = client.ecsBatchStart(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
