package cn.ctyun.ctapi.ctecs.ecsgpudriverlist;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <查询GPU云主机驱动版本>
 * Example: EcsGpuDriverListExample
 */
public class EcsGpuDriverListExample {
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
            EcsGpuDriverListRequestBody body = new EcsGpuDriverListRequestBody().withRegionID("7f8653e8657d11edbb550242ac110006").withAzName("default")
                    .withFlavorID("5cf44a7e-e23c-4199-9ebf-226650646e5a");
            EcsGpuDriverListRequest request = new EcsGpuDriverListRequest().withBody(body);
            CTResponse<EcsGpuDriverListResponseData> response = client.ecsGpuDriverList(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
