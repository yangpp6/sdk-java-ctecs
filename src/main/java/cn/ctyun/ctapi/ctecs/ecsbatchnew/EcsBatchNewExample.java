package cn.ctyun.ctapi.ctecs.ecsbatchnew;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-批量创建按量付费或者包年包月云主机>
 * Example: EcsBatchNewExample
 */
public class EcsBatchNewExample {
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
            EcsBatchNewDisks diskList1 = new EcsBatchNewDisks().withDiskMode("VBD").withTitle("ebs.name").withType("SATA").withSize(20);
            EcsBatchNewNetworkCardList networkCardList1 = new EcsBatchNewNetworkCardList().withTitle("net.name").withFixedIP("192.168.3.2").withMaster(true)
                    .withSubnetID("a90eebf0-d798-5017-b9f0-9468bb2301c2");
            EcsBatchNewRequestBody body = new EcsBatchNewRequestBody().withClientToken("4cf2962d-e92c-4c00-9181-cfbb2218636c")
                    .withRegionID("100054c0416811e9a6690242ac110002").withAzName("az2").withProjectID("0").withVmName("ecm-3300").withDisplayName("ecm-3300")
                    .withFlavorID("0824679a-dc86-47dc-a0d3-9c330928f4f6").withImagePublic(1).withImageID("9d9e8998-8ed5-43b2-99cb-322f2b8cf6fa")
                    .withSyshdType("SATA").withSyshd(40).withDiskList(new EcsBatchNewDisks[] { diskList1 }).withVpc("4797e8a1-722d-4996-9362-458001813e41")
                    .withOnDemand(false).withSecGroupList(new String[] { "202ca2d2-273a-5995-873b-03731212c8e4" })
                    .withNetworkCardList(new EcsBatchNewNetworkCardList[] { networkCardList1 }).withExtIP("2").withIpType("ipv4").withBandWidth(100)
                    .withIpv6Address("eip-5sdasd2gfh").withPublicIP("eip-9jpeyl0frh").withAffinityGroup("259b0c37-1044-41d8-989e")
                    .withKeyPairID("c57d0626-8a82-407b-a910-b454907778c3").withRootPassword("1qaz@WSX").withCycleCount(6).withCycleType("MONTH")
                    .withOrderCount(1).withAutoRenewStatus(1).withUserData("ZWNobyBoZWxsbyBnb3N0YWNrIQ==");
            EcsBatchNewRequest request = new EcsBatchNewRequest().withBody(body);
            CTResponse<EcsBatchNewResponseData> response = client.ecsBatchNew(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}