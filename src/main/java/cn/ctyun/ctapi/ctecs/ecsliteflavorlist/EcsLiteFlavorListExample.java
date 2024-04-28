package cn.ctyun.ctapi.ctecs.ecsliteflavorlist;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <查询轻量型云主机的规格套餐资源>
 * Example: EcsLiteFlavorListExample
 */
public class EcsLiteFlavorListExample {
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
            EcsLiteFlavorListRequest request = new EcsLiteFlavorListRequest().withRegionID("bb9fdb42056f11eda1610242ac110002").withFlavorSetType("fix");
            CTResponse<EcsLiteFlavorListResponseData> response = client.ecsLiteFlavorList(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
