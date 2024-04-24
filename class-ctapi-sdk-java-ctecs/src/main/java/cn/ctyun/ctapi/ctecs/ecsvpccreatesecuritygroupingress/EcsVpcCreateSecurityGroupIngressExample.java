package cn.ctyun.ctapi.ctecs.ecsvpccreatesecuritygroupingress;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-创建安全组入向规则>
 * Example: EcsVpcCreateSecurityGroupIngressExample
 */
public class EcsVpcCreateSecurityGroupIngressExample {
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
            EcsVpcCreateSecurityGroupIngressSecurityGroupRules securityGroupRules1 = new EcsVpcCreateSecurityGroupIngressSecurityGroupRules()
                    .withDirection("ingress").withAction("accept").withPriority(100).withProtocol("ANY").withEthertype("IPv4").withDestCidrIp("0.0.0.0/0")
                    .withDescription("出方向").withRange("8000-9000");
            EcsVpcCreateSecurityGroupIngressRequestBody body = new EcsVpcCreateSecurityGroupIngressRequestBody()
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withSecurityGroupID("sg-bp67axxxxzb4p")
                    .withSecurityGroupRules(new EcsVpcCreateSecurityGroupIngressSecurityGroupRules[] { securityGroupRules1 })
                    .withClientToken("123e4567-e89b-12d3-a456-426655440000");
            EcsVpcCreateSecurityGroupIngressRequest request = new EcsVpcCreateSecurityGroupIngressRequest().withBody(body);
            CTResponse<EcsVpcCreateSecurityGroupIngressResponseData> response = client.ecsVpcCreateSecurityGroupIngress(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
