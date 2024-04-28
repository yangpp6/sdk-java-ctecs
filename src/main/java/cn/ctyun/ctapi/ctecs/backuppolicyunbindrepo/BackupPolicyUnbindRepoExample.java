package cn.ctyun.ctapi.ctecs.backuppolicyunbindrepo;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-云主机备份策略解绑存储库>
 * Example: BackupPolicyUnbindRepoExample
 */
public class BackupPolicyUnbindRepoExample {
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
            BackupPolicyUnbindRepoRequestBody body = new BackupPolicyUnbindRepoRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withPolicyID(
                    "c0f853a4a5c311edb27d0242ac110007");
            BackupPolicyUnbindRepoRequest request = new BackupPolicyUnbindRepoRequest().withBody(body);
            CTResponse<BackupPolicyUnbindRepoResponseData> response = client.backupPolicyUnbindRepo(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
