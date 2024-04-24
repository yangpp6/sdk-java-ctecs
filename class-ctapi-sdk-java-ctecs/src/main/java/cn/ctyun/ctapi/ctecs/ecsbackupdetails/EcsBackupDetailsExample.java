package cn.ctyun.ctapi.ctecs.ecsbackupdetails;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份详情>
 * Example: EcsBackupDetailsExample
 */
public class EcsBackupDetailsExample {
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
            EcsBackupDetailsRequestBody body = new EcsBackupDetailsRequestBody().withRegionID("b6bb383e876c11ea8a5e0242ac110002").withInstanceBackupID(
                    "ed48dc25-d6bb-48e6-b202-3e36ee6321a3");
            EcsBackupDetailsRequest request = new EcsBackupDetailsRequest().withBody(body);
            CTResponse<EcsBackupDetailsResponseData> response = client.ecsBackupDetails(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
