package cn.ctyun.ctapi.ctecs.ecsdisklist;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询云主机的云硬盘列表>
 * Example: EcsDiskListExample
 */
public class EcsDiskListExample {
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
            EcsDiskListRequestBody body = new EcsDiskListRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withAzName("cn-huadong1-jsnj1A-public-ctcloud").withID("d82f0125-55ed-07d7-52a8-acaedbd201af").withPageNo(1).withPageSize(10);
            EcsDiskListRequest request = new EcsDiskListRequest().withBody(body);
            CTResponse<EcsDiskListResponseData> response = client.ecsDiskList(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
