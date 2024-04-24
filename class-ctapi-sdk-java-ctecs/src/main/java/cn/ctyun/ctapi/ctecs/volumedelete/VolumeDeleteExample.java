package cn.ctyun.ctapi.ctecs.volumedelete;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <释放云硬盘>
 * Example: VolumeDeleteExample
 */
public class VolumeDeleteExample {
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
            VolumeDeleteRequestBody body = new VolumeDeleteRequestBody().withClientToken("refund0211v1").withDiskID("0ae97ef5-6ee2-44af-9d05-1a509b0a1be6")
                    .withRegionID("81f7728662dd11ec810800155d307d5b");
            VolumeDeleteRequest request = new VolumeDeleteRequest().withBody(body);
            CTResponse<VolumeDeleteResponseData> response = client.volumeDelete(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
