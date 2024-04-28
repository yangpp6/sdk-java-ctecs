package cn.ctyun.ctapi.ctecs.ecsinstancelist;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询云主机列表>
 * Example: EcsInstanceListExample
 */
public class EcsInstanceListExample {
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
            EcsInstanceListRequestBody body = new EcsInstanceListRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withAzName("cn-huadong1-jsnj1A-public-ctcloud").withProjectID("0").withPageNo(1).withPageSize(10)
                    .withStatus("虚机状态，大小写不敏感，参数可选 'active' 'shutoff' 'expired'").withKeyword("name、displayName、ID、privateIP对这些字段模糊查询")
                    .withInstanceIDList("88fsssea-xxxx-88ec-a8bc-88xxxx888fe8,88f888ea-88ff-88ec-a8bc-888888888fe8");
            EcsInstanceListRequest request = new EcsInstanceListRequest().withBody(body);
            CTResponse<EcsInstanceListResponseData> response = client.ecsInstanceList(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
