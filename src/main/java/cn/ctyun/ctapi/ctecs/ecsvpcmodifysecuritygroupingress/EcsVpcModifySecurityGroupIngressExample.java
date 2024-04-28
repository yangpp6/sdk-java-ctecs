package cn.ctyun.ctapi.ctecs.ecsvpcmodifysecuritygroupingress;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-修改安全组入方向规则描述>
 * Example: EcsVpcModifySecurityGroupIngressExample
 */
public class EcsVpcModifySecurityGroupIngressExample {
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
            EcsVpcModifySecurityGroupIngressRequestBody body = new EcsVpcModifySecurityGroupIngressRequestBody()
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withSecurityGroupID("sg-bp67axxxxzb4p")
                    .withSecurityGroupRuleID("79fa97e3-c48b-xxxxx-9f46-6a13d8163678").withDescription("modify_test")
                    .withClientToken("123e4567-e89b-12d3-a456-426655440000");
            EcsVpcModifySecurityGroupIngressRequest request = new EcsVpcModifySecurityGroupIngressRequest().withBody(body);
            CTResponse<EcsVpcModifySecurityGroupIngressResponseData> response = client.ecsVpcModifySecurityGroupIngress(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
