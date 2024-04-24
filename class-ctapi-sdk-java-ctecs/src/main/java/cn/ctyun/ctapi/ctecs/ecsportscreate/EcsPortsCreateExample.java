package cn.ctyun.ctapi.ctecs.ecsportscreate;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-创建弹性网卡>
 * Example: EcsPortsCreateExample
 */
public class EcsPortsCreateExample {
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
            EcsPortsCreateRequestBody body = new EcsPortsCreateRequestBody().withClientToken("ports_create07231529")
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withSubnetID("subnet-y8cofge5uj").withPrimaryPrivateIp("172.16.0.141")
                    .withIpv6Addresses(new String[] { "240e:978:497c:ec00:cd74:fd9d:c45d:4131" }).withSecurityGroupIds(new String[] { "sg-n7nu88xfbq" })
                    .withSecondaryPrivateIpCount(1).withSecondaryPrivateIps(new String[] { "172.16.0.210" }).withName("nic-test01");
            EcsPortsCreateRequest request = new EcsPortsCreateRequest().withBody(body);
            CTResponse<EcsPortsCreateResponseData> response = client.ecsPortsCreate(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
