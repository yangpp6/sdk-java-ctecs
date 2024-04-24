package cn.ctyun.ctapi.ctecs.reneworderprice;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-续订询价(根据resourceId查询)>
 * Example: RenewOrderPriceExample
 */
public class RenewOrderPriceExample {
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
            RenewOrderPriceRequestBody body = new RenewOrderPriceRequestBody().withRegionID("41f64827f25f468595ffa3a5deb5d15d").withResourceType("VM")
                    .withResourceID("6ff3103f8daf41839d13dafa55e981c1").withCycleType("MONTH").withCycleCount(1);
            RenewOrderPriceRequest request = new RenewOrderPriceRequest().withBody(body);
            CTResponse<RenewOrderPriceResponseData> response = client.renewOrderPrice(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
