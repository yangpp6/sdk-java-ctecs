package cn.ctyun.ctapi.ctecs.ecsstatuslist;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-获取多台云主机的状态信息>
 * Example: EcsStatusListExample
 */
public class EcsStatusListExample {
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
            EcsStatusListRequest request = new EcsStatusListRequest().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withAzName("cn-huadong1-jsnj1A-public-ctcloud")
                    .withInstanceIDList("5ae83d07-0389-22fd-def8-995090ee3d5a,1d371359-7378-7d51-69bd-fd5c1c40cddd").withProjectID("0").withPageNo("1")
                    .withPageSize("10");
            CTResponse<EcsStatusListResponseData> response = client.ecsStatusList(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
