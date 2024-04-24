package cn.ctyun.ctapi.ctecs.volumeupdate;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <修改云硬盘属性>
 * Example: VolumeUpdateExample
 */
public class VolumeUpdateExample {
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
            VolumeUpdateRequestBody body = new VolumeUpdateRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withDiskName("test-volume")
                    .withDiskID("eff436e3d44040f1b306ab3a14530f02");
            VolumeUpdateRequest request = new VolumeUpdateRequest().withBody(body);
            CTResponse<VolumeUpdateResponseData> response = client.volumeUpdate(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
