package cn.ctyun.ctapi.ctecs.ecsvpccreatesecuritygroup;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-创建安全组>
 * Example: EcsVpcCreateSecurityGroupExample
 */
public class EcsVpcCreateSecurityGroupExample {
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
            EcsVpcCreateSecurityGroupRequestBody body = new EcsVpcCreateSecurityGroupRequestBody().withClientToken("create-sg-test-01")
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withProjectID("6732237e53bc4591b0e67d750030ebe3")
                    .withVpcID("4797e8a1-722d-4996-9362-458001813e41").withName("sg-bp67axxxxzb4p");
            EcsVpcCreateSecurityGroupRequest request = new EcsVpcCreateSecurityGroupRequest().withBody(body);
            CTResponse<EcsVpcCreateSecurityGroupResponseData> response = client.ecsVpcCreateSecurityGroup(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
