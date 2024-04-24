package cn.ctyun.ctapi.ctecs.ecsportsassignipv6;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-网卡关联多个IPv6地址>
 * Example: EcsPortsAssignIpv6Example
 */
public class EcsPortsAssignIpv6Example {
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
            EcsPortsAssignIpv6RequestBody body = new EcsPortsAssignIpv6RequestBody().withClientToken("assign-ipv6-01")
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withNetworkInterfaceID("port-vibsmse8pl").withIpv6AddressesCount(1)
                    .withIpv6Addresses(new String[] { "240e:978:497c:ec00:cd74:fd9d:c45d:4131" });
            EcsPortsAssignIpv6Request request = new EcsPortsAssignIpv6Request().withBody(body);
            CTResponse<EcsPortsAssignIpv6ResponseData> response = client.ecsPortsAssignIpv6(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
