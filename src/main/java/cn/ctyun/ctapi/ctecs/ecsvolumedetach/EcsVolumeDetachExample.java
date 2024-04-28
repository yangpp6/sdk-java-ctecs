package cn.ctyun.ctapi.ctecs.ecsvolumedetach;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-卸载按量付费云硬盘>
 * Example: EcsVolumeDetachExample
 */
public class EcsVolumeDetachExample {
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
            EcsVolumeDetachRequestBody body = new EcsVolumeDetachRequestBody().withResourceID("eff436e3d44040f1b306ab3a14530f02")
                    .withRegionID("41f64827f25f468595ffa3a5deb5d15d").withInstanceUUID("8869f238-631e-4026-91b5-169df4dbd1c0");
            EcsVolumeDetachRequest request = new EcsVolumeDetachRequest().withBody(body);
            CTResponse<EcsVolumeDetachResponseData> response = client.ecsVolumeDetach(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
