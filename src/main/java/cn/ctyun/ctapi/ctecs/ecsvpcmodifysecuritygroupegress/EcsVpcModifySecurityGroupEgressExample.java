package cn.ctyun.ctapi.ctecs.ecsvpcmodifysecuritygroupegress;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-修改安全组出方向规则描述>
 * Example: EcsVpcModifySecurityGroupEgressExample
 */
public class EcsVpcModifySecurityGroupEgressExample {
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
            EcsVpcModifySecurityGroupEgressRequestBody body = new EcsVpcModifySecurityGroupEgressRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withSecurityGroupID("sg-bp67axxxxzb4p").withSecurityGroupRuleID("79fa97e3-c48b-xxxxx-9f46-6a13d8163678").withDescription("modify_test")
                    .withClientToken("123e4567-e89b-12d3-a456-426655440000");
            EcsVpcModifySecurityGroupEgressRequest request = new EcsVpcModifySecurityGroupEgressRequest().withBody(body);
            CTResponse<EcsVpcModifySecurityGroupEgressResponseData> response = client.ecsVpcModifySecurityGroupEgress(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
