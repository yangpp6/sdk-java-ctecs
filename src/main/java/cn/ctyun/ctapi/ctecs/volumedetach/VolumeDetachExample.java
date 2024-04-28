package cn.ctyun.ctapi.ctecs.volumedetach;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <卸载云硬盘>
 * Example: VolumeDetachExample
 */
public class VolumeDetachExample {
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
            VolumeDetachRequestBody body = new VolumeDetachRequestBody().withDiskID("6f8928c7-f961-4ece-b0ee-9f8d6b4663b5")
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withInstanceID("c54322f1-735d-409d-2a7c-76d611492469");
            VolumeDetachRequest request = new VolumeDetachRequest().withBody(body);
            CTResponse<VolumeDetachResponseData> response = client.volumeDetach(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
