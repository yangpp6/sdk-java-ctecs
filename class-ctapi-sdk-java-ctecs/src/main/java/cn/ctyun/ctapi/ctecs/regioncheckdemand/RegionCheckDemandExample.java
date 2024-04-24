package cn.ctyun.ctapi.ctecs.regioncheckdemand;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询资源池产品可售信息>
 * Example: RegionCheckDemandExample
 */
public class RegionCheckDemandExample {
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
            RegionCheckDemandRequest request = new RegionCheckDemandRequest().withRegionID("").withAzName("").withProductType("").withFlavorID("")
                    .withSpecName("").withEcsAmount(1).withEbsType("").withEbsSize(1).withEipAmount(1);
            CTResponse<RegionCheckDemandResponseData> response = client.regionCheckDemand(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
