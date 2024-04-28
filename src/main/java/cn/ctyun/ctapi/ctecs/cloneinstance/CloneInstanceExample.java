package cn.ctyun.ctapi.ctecs.cloneinstance;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-克隆云主机>
 * Example: CloneInstanceExample
 */
public class CloneInstanceExample {
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
            CloneInstanceNetworkCardList networkCardList1 = new CloneInstanceNetworkCardList().withNicName("net.name").withFixedIP("192.168.3.20")
                    .withIsMaster(true).withSubnetID("a90eebf0-d798-5017-b9f0-9468bb2301c2");
            CloneInstanceLabelList labelList1 = new CloneInstanceLabelList().withLabelKey("test-key").withLabelValue("test-value");
            CloneInstanceRequestBody body = new CloneInstanceRequestBody().withClientToken("4cf2962d-e92c-4c00-9181-cfbb2218636c")
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withInstanceID("").withInstanceName("ecm-3300").withDisplayName("ecm-3300")
                    .withVpcID("4797e8a1-722d-4996-9362-458001813e41").withOnDemand(false)
                    .withSecGroupList(new String[] { "202ca2d2-273a-5995-873b-03731212c8e4" })
                    .withNetworkCardList(new CloneInstanceNetworkCardList[] { networkCardList1 }).withExtIP("2").withIpVersion("ipv4").withBandwidth(100)
                    .withIpv6AddressID("eip-5sdasd2gfh").withEipID("eip-9jpeyl0frh").withAffinityGroupID("259b0c37-1044-41d8-989e")
                    .withKeyPairID("c57d0626-8a82-407b-a910-b454907778c3").withUserPassword("1qaz@WSX").withCycleCount(6).withCycleType("MONTH")
                    .withAutoRenewStatus(1).withUserData("ZWNobyBoZWxsbyBnb3N0YWNrIQ==").withProjectID("6732237e53bc4591b0e67d750030ebe3")
                    .withLabelList(new CloneInstanceLabelList[] { labelList1 }).withMonitorService(true);
            CloneInstanceRequest request = new CloneInstanceRequest().withBody(body);
            CTResponse<CloneInstanceResponseData> response = client.cloneInstance(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
