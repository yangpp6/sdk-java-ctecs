package cn.ctyun.ctapi.ctecs.ecsbackupcreate;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份>
 * Example: EcsBackupCreateExample
 */
public class EcsBackupCreateExample {
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
            EcsBackupCreateRequestBody body = new EcsBackupCreateRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b")
                    .withID("b6e2966d-7b1c-385e-abe4-d940caa273b7").withName("backup-01").withDescription("backup_test_01").withForceConsistencyBackup("true")
                    .withRepositoryID("62a7cd2f-55a4-4a65-bb64-6f8352b4f55f");
            EcsBackupCreateRequest request = new EcsBackupCreateRequest().withBody(body);
            CTResponse<EcsBackupCreateResponseData> response = client.ecsBackupCreate(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
