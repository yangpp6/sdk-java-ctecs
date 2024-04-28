package cn.ctyun.ctapi.ctecs.updateinstancespec;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-更新云主机网络或者配置>
 * Example: UpdateInstanceSpecExample
 */
public class UpdateInstanceSpecExample {
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
            UpdateInstanceSpecRequestBody body = new UpdateInstanceSpecRequestBody().withRegionID("88f8888888dd88ec888888888d888d8b")
                    .withInstanceID("8d8e8888-8ed8-88b8-88cb-888f8b8cf8fa").withBandwidth(100).withFlavorID("00ebe3aa-aac0-1d99-0b9e-4d391c5e06d5")
                    .withClientToken("bdfse888-8ed8-88b8-88cb-888f8b8cf8fa");
            UpdateInstanceSpecRequest request = new UpdateInstanceSpecRequest().withBody(body);
            CTResponse<UpdateInstanceSpecResponseData> response = client.updateInstanceSpec(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
