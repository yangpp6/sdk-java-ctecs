package cn.ctyun.ctapi.ctecs.ecsportsattach;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-网卡绑定云主机>
 * Example: EcsPortsAttachExample
 */
public class EcsPortsAttachExample {
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
            EcsPortsAttachRequestBody body = new EcsPortsAttachRequestBody().withClientToken("attach_test01").withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withAzName("cn-huadong1-jsnj1A-public-ctcloud").withProjectID("0").withNetworkInterfaceID("subnet-y8cofge5uj")
                    .withInstanceID("a628a7d9-ef97-3b16-8a0a-4a794fcdbc39").withInstanceType(3);
            EcsPortsAttachRequest request = new EcsPortsAttachRequest().withBody(body);
            CTResponse<EcsPortsAttachResponseData> response = client.ecsPortsAttach(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
