package cn.ctyun.ctapi.ctecs.ecsportsunassignipv6;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-网卡解绑多个IPv6地址>
 * Example: EcsPortsUnassignIpv6Example
 */
public class EcsPortsUnassignIpv6Example {
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
            EcsPortsUnassignIpv6RequestBody body = new EcsPortsUnassignIpv6RequestBody().withClientToken("unassign-ipv6-01")
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withNetworkInterfaceID("port-vibsmse8pl")
                    .withIpv6Addresses(new String[] { "240e:978:497c:ec00:cd74:fd9d:c45d:4131" });
            EcsPortsUnassignIpv6Request request = new EcsPortsUnassignIpv6Request().withBody(body);
            CTResponse<EcsPortsUnassignIpv6ResponseData> response = client.ecsPortsUnassignIpv6(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
