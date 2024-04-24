package cn.ctyun.ctapi.ctecs.neworderprice;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-下单询价>
 * Example: NewOrderPriceExample
 */
public class NewOrderPriceExample {
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
            NewOrderPriceDisks disks1 = new NewOrderPriceDisks().withDiskType("SATA").withDiskSize(10);
            NewOrderPriceOrderDisks orderDisks1 = new NewOrderPriceOrderDisks().withDiskType("SATA").withDiskSize(10);
            NewOrderPriceRequestBody body = new NewOrderPriceRequestBody().withRegionID("41f64827f25f468595ffa3a5deb5d15d").withResourceType("VM").withCount(1)
                    .withOnDemand(false).withCycleType("MONTH").withCycleCount(6).withFlavorName("s2.small.1")
                    .withImageUUID("7d2922f3-019e-4dbb-ad84-cc8c3497546c").withSysDiskType("SATA").withSysDiskSize(50)
                    .withDisks(new NewOrderPriceDisks[] { disks1 }).withBandwidth(1).withDiskType("SATA").withDiskSize(30).withDiskMode("VBD")
                    .withNatType("small").withIpPoolBandwidth(6).withDeviceType("physical.t4.large").withAzName("az1")
                    .withOrderDisks(new NewOrderPriceOrderDisks[] { orderDisks1 }).withElbType("standardI").withCbrValue(100);
            NewOrderPriceRequest request = new NewOrderPriceRequest().withBody(body);
            CTResponse<NewOrderPriceResponseData> response = client.newOrderPrice(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
