package cn.ctyun.ctapi.ctecs.ecsbackupdelete;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-删除云主机备份>
 * Example: EcsBackupDeleteExample
 */
public class EcsBackupDeleteExample {
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
            EcsBackupDeleteRequestBody body = new EcsBackupDeleteRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withInstanceBackupID(
                    "b6e2966d-7b1c-385e-abe4-d940caa273b7");
            EcsBackupDeleteRequest request = new EcsBackupDeleteRequest().withBody(body);
            CTResponse<EcsBackupDeleteResponseData> response = client.ecsBackupDelete(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}