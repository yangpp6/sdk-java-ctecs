package cn.ctyun.ctapi.ctecs.ecsresize;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-云主机修改规格>
 * Example: EcsResizeExample
 */
public class EcsResizeExample {
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
            EcsResizeRequestBody body = new EcsResizeRequestBody().withRegionID("41f64827f25f468595ffa3a5deb5d15d").withAzName("az1").withID("")
                    .withFlavorID("s2.small.1或00ebe3aa-aac0-1d99-0b9e-4d391c5e06d5").withClientToken("");
            EcsResizeRequest request = new EcsResizeRequest().withBody(body);
            CTResponse<EcsResizeResponseData> response = client.ecsResize(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
