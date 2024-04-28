package cn.ctyun.ctapi.ctecs.ecsvpcquerysecuritygroups;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询用户安全组列表>
 * Example: EcsVpcQuerySecurityGroupsExample
 */
public class EcsVpcQuerySecurityGroupsExample {
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
            EcsVpcQuerySecurityGroupsRequest request = new EcsVpcQuerySecurityGroupsRequest().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withVpcID("vpc-qfnsjbkrls").withQueryContent("Default-Security-Group").withProjectID("0")
                    .withInstanceID("adc614e0-e838-d73f-0618-a6d51d09070a").withPageNumber(1).withPageNo(1).withPageSize(10);
            CTResponse<EcsVpcQuerySecurityGroupsResponseData> response = client.ecsVpcQuerySecurityGroups(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
