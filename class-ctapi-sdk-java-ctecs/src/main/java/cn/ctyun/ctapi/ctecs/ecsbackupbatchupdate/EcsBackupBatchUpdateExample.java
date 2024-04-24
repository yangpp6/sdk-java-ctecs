package cn.ctyun.ctapi.ctecs.ecsbackupbatchupdate;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-批量更新云主机备份信息>
 * Example: EcsBackupBatchUpdateExample
 */
public class EcsBackupBatchUpdateExample {
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
            EcsBackupBatchUpdateUpdateInfo updateInfo1 = new EcsBackupBatchUpdateUpdateInfo().withInstanceBackupID("b6e2966d-7b1c-385e-abe4-d940caa273b7")
                    .withName("update-test01").withDescription("api_update_test01");
            EcsBackupBatchUpdateRequestBody body = new EcsBackupBatchUpdateRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b").withUpdateInfo(
                    new EcsBackupBatchUpdateUpdateInfo[] { updateInfo1 });
            EcsBackupBatchUpdateRequest request = new EcsBackupBatchUpdateRequest().withBody(body);
            CTResponse<EcsBackupBatchUpdateResponseData> response = client.ecsBackupBatchUpdate(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
