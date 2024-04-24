package cn.ctyun.ctapi.ctecs.batchresetpassword;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-批量重置云主机密码>
 * Example: BatchResetPasswordExample
 */
public class BatchResetPasswordExample {
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
            BatchResetPasswordUpdatePwdInfo updatePwdInfo1 = new BatchResetPasswordUpdatePwdInfo().withInstanceID("8d8e8888-8ed8-88b8-88cb-888f8b8cf8fa")
                    .withNewPassword("1qaz@WSX");
            BatchResetPasswordRequestBody body = new BatchResetPasswordRequestBody().withRegionID("88f8888888dd88ec888888888d888d8b").withUpdatePwdInfo(
                    new BatchResetPasswordUpdatePwdInfo[] { updatePwdInfo1 });
            BatchResetPasswordRequest request = new BatchResetPasswordRequest().withBody(body);
            CTResponse<BatchResetPasswordResponseData> response = client.batchResetPassword(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
