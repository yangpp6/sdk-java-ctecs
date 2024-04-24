package cn.ctyun.ctapi.ctecs.batchcreateinstances;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-批量创建云主机>
 * Example: BatchCreateInstancesExample
 */
public class BatchCreateInstancesExample {
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
            BatchCreateInstancesNetworkCardList networkCardList1 = new BatchCreateInstancesNetworkCardList().withNicName("net.name")
                    .withFixedIP("192.168.3.20").withIsMaster(true).withSubnetID("a90eebf0-d798-5017-b9f0-9468bb2301c2");
            BatchCreateInstancesDataDiskList dataDiskList1 = new BatchCreateInstancesDataDiskList().withDiskMode("VBD").withDiskName("ebs.name")
                    .withDiskType("SATA").withDiskSize(20);
            BatchCreateInstancesLabelList labelList1 = new BatchCreateInstancesLabelList().withLabelKey("test-key").withLabelValue("test-value");
            BatchCreateInstancesRequestBody body = new BatchCreateInstancesRequestBody().withClientToken("4cf2962d-e92c-4c00-9181-cfbb2218636c")
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withAzName("cn-huadong1-jsnj1A-public-ctcloud").withInstanceName("ecm-3300")
                    .withDisplayName("ecm-3300").withFlavorID("0824679a-dc86-47dc-a0d3-9c330928f4f6").withImageType(1)
                    .withImageID("9d9e8998-8ed5-43b2-99cb-322f2b8cf6fa").withBootDiskType("SATA").withBootDiskSize(40)
                    .withVpcID("4797e8a1-722d-4996-9362-458001813e41").withOnDemand(false)
                    .withNetworkCardList(new BatchCreateInstancesNetworkCardList[] { networkCardList1 }).withExtIP("2")
                    .withProjectID("6732237e53bc4591b0e67d750030ebe3").withSecGroupList(new String[] { "202ca2d2-273a-5995-873b-03731212c8e4" })
                    .withDataDiskList(new BatchCreateInstancesDataDiskList[] { dataDiskList1 }).withIpVersion("ipv4").withBandwidth(100)
                    .withIpv6AddressID("eip-5sdasd2gfh").withEipID("eip-9jpeyl0frh").withAffinityGroupID("259b0c37-1044-41d8-989e")
                    .withKeyPairID("c57d0626-8a82-407b-a910-b454907778c3").withUserPassword("1qaz@WSX").withCycleCount(6).withCycleType("MONTH")
                    .withAutoRenewStatus(1).withUserData("ZWNobyBoZWxsbyBnb3N0YWNrIQ==").withOrderCount(1).withPayVoucherPrice(20.55f)
                    .withLabelList(new BatchCreateInstancesLabelList[] { labelList1 }).withGpuDriverKits("CUDA 11.4.3 Driver 470.82.01 CUDNN 8.8.1.3")
                    .withMonitorService(true);
            BatchCreateInstancesRequest request = new BatchCreateInstancesRequest().withBody(body);
            CTResponse<BatchCreateInstancesResponseData> response = client.batchCreateInstances(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
