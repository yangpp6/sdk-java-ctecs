package cn.ctyun.ctapi.ctecs.snapshotcreateinstance;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-快照创建一台云主机>
 * Example: SnapshotCreateInstanceExample
 */
public class SnapshotCreateInstanceExample {
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
            SnapshotCreateInstanceLabelList labelList1 = new SnapshotCreateInstanceLabelList().withLabelKey("test-key").withLabelValue("test-value");
            SnapshotCreateInstanceRequestBody body = new SnapshotCreateInstanceRequestBody().withClientToken("4cf2962d-e92c-4c00-9181-cfbb2218636c")
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withProjectID("aaaaaaaa-bda4-4102-b68f-98c9d7190d69").withInstanceName("ecm-3300")
                    .withDisplayName("ecm-3300").withSnapshotID("f02bef68-7aba-f51d-6ead-7d47dde57b45").withVpcID("4797e8a1-722d-4996-9362-458001813e41")
                    .withOnDemand(false).withSecGroupList(new String[] { "202ca2d2-273a-5995-873b-03731212c8e4" }).withExtIP("2").withIpVersion("ipv4")
                    .withBandwidth(100).withIpv6AddressID("").withEipID("eip-9jpeyl0frh").withAffinityGroupID("259b0c37-1044-41d8-989e")
                    .withKeyPairID("c57d0626-8a82-407b-a910-b454907778c3").withUserPassword("").withCycleCount(6).withCycleType("MONTH").withAutoRenewStatus(1)
                    .withUserData("ZWNobyBoZWxsbyBnb3N0YWNrIQ==").withLabelList(new SnapshotCreateInstanceLabelList[] { labelList1 }).withMonitorService(true);
            SnapshotCreateInstanceRequest request = new SnapshotCreateInstanceRequest().withBody(body);
            CTResponse<SnapshotCreateInstanceResponseData> response = client.snapshotCreateInstance(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
