package cn.ctyun.ctapi.ctecs.listbackuppolicy;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份策略列表>
 * Example: ListBackupPolicyExample
 */
public class ListBackupPolicyExample {
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
            ListBackupPolicyRequest request = new ListBackupPolicyRequest().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withPolicyID("26da64d4a77f11ed923d0242ac110007").withPolicyName("test-bak").withProjectID("0").withPageNo(1).withPageSize(10);
            CTResponse<ListBackupPolicyResponseData> response = client.listBackupPolicy(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
