package cn.ctyun.ctapi.ctecs.upgradeorderprice;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-升级订单询价(根据resourceId查询)>
 * Example: UpgradeOrderPriceExample
 */
public class UpgradeOrderPriceExample {
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
            UpgradeOrderPriceRequestBody body = new UpgradeOrderPriceRequestBody().withRegionID("41f64827f25f468595ffa3a5deb5d15d")
                    .withResourceID("6ff3103f8daf41839d13dafa55e981c1").withResourceType("VM").withFlavorName("s2.medium.2").withBandwidth(101)
                    .withDiskSize(40).withNatType("large").withIpPoolBandwidth(9).withElbType("standardI").withCbrValue(100);
            UpgradeOrderPriceRequest request = new UpgradeOrderPriceRequest().withBody(body);
            CTResponse<UpgradeOrderPriceResponseData> response = client.upgradeOrderPrice(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
