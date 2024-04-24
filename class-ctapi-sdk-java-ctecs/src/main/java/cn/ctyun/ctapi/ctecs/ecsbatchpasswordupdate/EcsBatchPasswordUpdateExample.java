package cn.ctyun.ctapi.ctecs.ecsbatchpasswordupdate;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-更新多台云主机的密码>
 * Example: EcsBatchPasswordUpdateExample
 */
public class EcsBatchPasswordUpdateExample {
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
            EcsBatchPasswordUpdateUpdatePwdInfo updatePwdInfo1 = new EcsBatchPasswordUpdateUpdatePwdInfo().withID("8d8e8888-8ed8-88b8-88cb-888f8b8cf8fa")
                    .withPassword("1qaz@WSX");
            EcsBatchPasswordUpdateRequestBody body = new EcsBatchPasswordUpdateRequestBody().withRegionID("88f8888888dd88ec888888888d888d8b").withAzName("az1")
                    .withUpdatePwdInfo(new EcsBatchPasswordUpdateUpdatePwdInfo[] { updatePwdInfo1 });
            EcsBatchPasswordUpdateRequest request = new EcsBatchPasswordUpdateRequest().withBody(body);
            CTResponse<EcsBatchPasswordUpdateResponseData> response = client.ecsBatchPasswordUpdate(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
