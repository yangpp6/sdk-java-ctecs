package cn.ctyun.ctapi.ctecs.shareinterfaceattach;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-挂载共享网卡>
 * Example: ShareInterfaceAttachExample
 */
public class ShareInterfaceAttachExample {
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
            ShareInterfaceAttachRequestBody body = new ShareInterfaceAttachRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withInstanceID("adc614e0-e838-d73f-0618-a6d51d09070a").withSubnetID("a90eebf0-d798-5017-b9f0-9468bb2301c2");
            ShareInterfaceAttachRequest request = new ShareInterfaceAttachRequest().withBody(body);
            CTResponse<ShareInterfaceAttachResponseData> response = client.shareInterfaceAttach(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
