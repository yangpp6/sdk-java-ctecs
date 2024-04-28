package cn.ctyun.ctapi.ctecs.ecsvolumeupdate;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-修改云硬盘属性>
 * Example: EcsVolumeUpdateExample
 */
public class EcsVolumeUpdateExample {
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
            EcsVolumeUpdateRequestBody body = new EcsVolumeUpdateRequestBody().withRegionID("888888c8888888e8a8888888ac888888").withName("test-volume")
                    .withResourceID("eff436e3d44040f1b306ab3a14530f02");
            EcsVolumeUpdateRequest request = new EcsVolumeUpdateRequest().withBody(body);
            CTResponse<EcsVolumeUpdateResponseData> response = client.ecsVolumeUpdate(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
