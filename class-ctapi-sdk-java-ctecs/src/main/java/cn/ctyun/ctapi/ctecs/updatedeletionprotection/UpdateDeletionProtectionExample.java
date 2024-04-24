package cn.ctyun.ctapi.ctecs.updatedeletionprotection;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <更新云主机实例删除保护信息>
 * Example: UpdateDeletionProtectionExample
 */
public class UpdateDeletionProtectionExample {
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
            UpdateDeletionProtectionRequestBody body = new UpdateDeletionProtectionRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b")
                    .withInstanceID("70d8eff4-630f-3358-1ff3-46deb3c52e5f").withDeletionProtection(true).withAzName("cn-huadong1-jsnj1A-public-ctcloud");
            UpdateDeletionProtectionRequest request = new UpdateDeletionProtectionRequest().withBody(body);
            CTResponse<UpdateDeletionProtectionResponseData> response = client.updateDeletionProtection(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
