package cn.ctyun.ctapi.ctecs.ecsmigratetime;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-获取云主机迁移时间预估>
 * Example: EcsMigrateTimeExample
 */
public class EcsMigrateTimeExample {
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
            EcsMigrateTimeIdentity identity = new EcsMigrateTimeIdentity().withAccountId("8c6a2a5d71044e239c47bf8c17c00686");
            EcsMigrateTimeCustomInfo customInfo = new EcsMigrateTimeCustomInfo().withIdentity(identity);
            EcsMigrateTimeRequestBody body = new EcsMigrateTimeRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b").withAzName("az1")
                    .withID("2c92dba1-1f69-16fc-6567-a4886bfa0a74").withCustomInfo(customInfo);
            EcsMigrateTimeRequest request = new EcsMigrateTimeRequest().withBody(body);
            CTResponse<EcsMigrateTimeResponseData> response = client.ecsMigrateTime(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
