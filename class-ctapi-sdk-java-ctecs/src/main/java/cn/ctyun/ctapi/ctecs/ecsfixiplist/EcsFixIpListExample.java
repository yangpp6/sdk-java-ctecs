package cn.ctyun.ctapi.ctecs.ecsfixiplist;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询云主机的固定IP列表>
 * Example: EcsFixIpListExample
 */
public class EcsFixIpListExample {
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
            EcsFixIpListRequest request = new EcsFixIpListRequest().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withAzName("cn-huadong1-jsnj1A-public-ctcloud").withID("8d8e8888-8ed8-88b8-88cb-888f8b8cf8fa");
            CTResponse<EcsFixIpListResponseData> response = client.ecsFixIpList(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
