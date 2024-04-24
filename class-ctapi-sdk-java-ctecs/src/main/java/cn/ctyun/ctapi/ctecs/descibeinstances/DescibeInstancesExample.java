package cn.ctyun.ctapi.ctecs.descibeinstances;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询一台或多台云主机详细信息>
 * Example: DescibeInstancesExample
 */
public class DescibeInstancesExample {
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
            DescibeInstancesLabelList labelList1 = new DescibeInstancesLabelList().withLabelKey("test-key").withLabelValue("test-value");
            DescibeInstancesRequestBody body = new DescibeInstancesRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withAzName("cn-huadong1-jsnj1A-public-ctcloud").withProjectID("0").withPageNo(1).withPageSize(10).withState("active")
                    .withKeyword("ecs-888").withInstanceName("ecs-1")
                    .withInstanceIDList("73f321ea-62ff-11ec-a8bc-005056898fe0,88f888ea-88ff-88ec-a8bc-888888888fe8").withSecurityGroupID("sg-tolywxbe1f")
                    .withLabelList(new DescibeInstancesLabelList[] { labelList1 });
            DescibeInstancesRequest request = new DescibeInstancesRequest().withBody(body);
            CTResponse<DescibeInstancesResponseData> response = client.descibeInstances(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
