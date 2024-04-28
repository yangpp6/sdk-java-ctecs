package cn.ctyun.ctapi.ctecs.backuplist;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份列表>
 * Example: BackupListExample
 */
public class BackupListExample {
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
            BackupListRequestBody body = new BackupListRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withPageNo(1).withPageSize(10)
                    .withInstanceID("de70ef00-1ea0-459a-b74d-b06272561a32").withRepositoryID("de70ef00-1ea0-459a-b74d-b06272561a32")
                    .withInstanceBackupID("ed48dc25-d6bb-48e6-b202-3e36ee6321a3").withQueryContent("backup-test01").withInstanceBackupStatus("ACTIVE")
                    .withProjectID("0");
            BackupListRequest request = new BackupListRequest().withBody(body);
            CTResponse<BackupListResponseData> response = client.backupList(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
