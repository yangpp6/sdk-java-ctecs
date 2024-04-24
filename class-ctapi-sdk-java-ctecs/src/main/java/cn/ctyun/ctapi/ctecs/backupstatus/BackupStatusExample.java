package cn.ctyun.ctapi.ctecs.backupstatus;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询云主机备份状态>
 * Example: BackupStatusExample
 */
public class BackupStatusExample {
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
            BackupStatusRequest request = new BackupStatusRequest().withRegionID("bb9fdb42056f11eda1610242ac110002").withInstanceBackupID(
                    "82ef7698-76a3-ede8-0c6d-c94a4acd73b0");
            CTResponse<BackupStatusResponseData> response = client.backupStatus(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
