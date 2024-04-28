package cn.ctyun.ctapi.ctecs.orderrenewqueryprice;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-续订单询价(根据资源uuid查询)>
 * Example: OrderRenewQueryPriceExample
 */
public class OrderRenewQueryPriceExample {
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
            OrderRenewQueryPriceRequestBody body = new OrderRenewQueryPriceRequestBody().withRegionID("41f64827f25f468595ffa3a5deb5d15d")
                    .withResourceType("VM").withResourceUUID("eip-anjj0eaiz8").withCycleType("MONTH").withCycleCount(1);
            OrderRenewQueryPriceRequest request = new OrderRenewQueryPriceRequest().withBody(body);
            CTResponse<OrderRenewQueryPriceResponseData> response = client.orderRenewQueryPrice(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
