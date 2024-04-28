package cn.ctyun.ctapi.ctecs.ecsbatchdelete;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-批量释放云主机>
 * Example: EcsBatchDeleteExample
 */
public class EcsBatchDeleteExample {
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
            EcsBatchDeleteRequestBody body = new EcsBatchDeleteRequestBody().withClientToken("4cf2962d-e92c-4c00-9181-cfbb2218636c")
                    .withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withInstanceIDList("c7dba5ca-ca72-3823-9429-57a4165600a1,755a72c6-ea40-ce04-7ad8-c9f54d38ccfd");
            EcsBatchDeleteRequest request = new EcsBatchDeleteRequest().withBody(body);
            CTResponse<EcsBatchDeleteResponseData> response = client.ecsBatchDelete(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
