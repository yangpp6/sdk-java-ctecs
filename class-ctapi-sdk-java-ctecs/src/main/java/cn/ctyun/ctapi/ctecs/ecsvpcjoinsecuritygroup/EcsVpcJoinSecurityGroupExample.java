package cn.ctyun.ctapi.ctecs.ecsvpcjoinsecuritygroup;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-绑定安全组>
 * Example: EcsVpcJoinSecurityGroupExample
 */
public class EcsVpcJoinSecurityGroupExample {
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
            EcsVpcJoinSecurityGroupRequestBody body = new EcsVpcJoinSecurityGroupRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withSecurityGroupID("sg-bp67axxxxzb4p").withInstanceID("89a2d977-c078-5779-f391-f0ab8c9773b6").withNetworkInterfaceID("port-l0shxxxrfyg9")
                    .withAction("joinSecurityGroup");
            EcsVpcJoinSecurityGroupRequest request = new EcsVpcJoinSecurityGroupRequest().withBody(body);
            CTResponse<EcsVpcJoinSecurityGroupResponseData> response = client.ecsVpcJoinSecurityGroup(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
