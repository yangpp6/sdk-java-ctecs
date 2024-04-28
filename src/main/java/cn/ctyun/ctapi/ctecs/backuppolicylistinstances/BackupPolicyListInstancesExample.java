package cn.ctyun.ctapi.ctecs.backuppolicylistinstances;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份策略绑定云主机信息>
 * Example: BackupPolicyListInstancesExample
 */
public class BackupPolicyListInstancesExample {
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
            BackupPolicyListInstancesRequest request = new BackupPolicyListInstancesRequest().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withPolicyID("26da64d4a77f11ed923d0242ac110007").withInstanceName("ecm-888").withPageNo(1).withPageSize(10);
            CTResponse<BackupPolicyListInstancesResponseData> response = client.backupPolicyListInstances(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
