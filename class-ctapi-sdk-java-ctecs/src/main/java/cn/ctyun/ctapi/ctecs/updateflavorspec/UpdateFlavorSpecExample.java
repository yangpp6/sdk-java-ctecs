package cn.ctyun.ctapi.ctecs.updateflavorspec;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-更新云主机配置>
 * Example: UpdateFlavorSpecExample
 */
public class UpdateFlavorSpecExample {
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
            UpdateFlavorSpecRequestBody body = new UpdateFlavorSpecRequestBody().withRegionID("41f64827f25f468595ffa3a5deb5d15d")
                    .withInstanceID("285010af-16f1-137e-06c0-920d4bdd0026").withFlavorID("s2.small.1或00ebe3aa-aac0-1d99-0b9e-4d391c5e06d5")
                    .withClientToken("resize3003").withPayVoucherPrice(20.55f);
            UpdateFlavorSpecRequest request = new UpdateFlavorSpecRequest().withBody(body);
            CTResponse<UpdateFlavorSpecResponseData> response = client.updateFlavorSpec(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
