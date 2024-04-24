package cn.ctyun.ctapi.ctecs.regioncustomerresources;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-根据regionID查询用户资源>
 * Example: RegionCustomerResourcesExample
 */
public class RegionCustomerResourcesExample {
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
            RegionCustomerResourcesRequest request = new RegionCustomerResourcesRequest().withRegionID("81f7728662dd11ec810800155d307d5b");
            CTResponse<RegionCustomerResourcesResponseData> response = client.regionCustomerResources(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}