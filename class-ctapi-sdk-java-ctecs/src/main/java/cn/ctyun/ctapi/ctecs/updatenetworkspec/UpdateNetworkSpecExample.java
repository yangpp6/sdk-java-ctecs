package cn.ctyun.ctapi.ctecs.updatenetworkspec;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-更新云主机网络>
 * Example: UpdateNetworkSpecExample
 */
public class UpdateNetworkSpecExample {
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
            UpdateNetworkSpecRequestBody body = new UpdateNetworkSpecRequestBody().withRegionID("a6449feab4db11e9a6b40242ac110007")
                    .withInstanceID("93366056-b08f-4b9b-8e47-c50d92f2d4fd").withBandwidth(100).withClientToken("ea1b9004-f450-11ec-8d4f-00155de3fd73");
            UpdateNetworkSpecRequest request = new UpdateNetworkSpecRequest().withBody(body);
            CTResponse<UpdateNetworkSpecResponseData> response = client.updateNetworkSpec(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
