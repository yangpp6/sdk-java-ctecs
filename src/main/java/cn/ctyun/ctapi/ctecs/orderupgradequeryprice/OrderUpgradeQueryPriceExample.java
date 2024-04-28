package cn.ctyun.ctapi.ctecs.orderupgradequeryprice;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-升级订单询价(根据资源uuid查询)>
 * Example: OrderUpgradeQueryPriceExample
 */
public class OrderUpgradeQueryPriceExample {
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
            OrderUpgradeQueryPriceRequestBody body = new OrderUpgradeQueryPriceRequestBody().withRegionID("41f64827f25f468595ffa3a5deb5d15d")
                    .withResourceUUID("bandwidth-czpnl3k1mg").withResourceType("VM").withFlavorName("s2.medium.2").withBandwidth(101).withDiskSize(40)
                    .withNatType("large").withIpPoolBandwidth(9).withElbType("standardI").withCbrValue(100);
            OrderUpgradeQueryPriceRequest request = new OrderUpgradeQueryPriceRequest().withBody(body);
            CTResponse<OrderUpgradeQueryPriceResponseData> response = client.orderUpgradeQueryPrice(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
