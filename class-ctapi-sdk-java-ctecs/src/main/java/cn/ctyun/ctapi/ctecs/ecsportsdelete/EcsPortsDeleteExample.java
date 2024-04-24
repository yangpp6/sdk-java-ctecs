package cn.ctyun.ctapi.ctecs.ecsportsdelete;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-删除弹性网卡>
 * Example: EcsPortsDeleteExample
 */
public class EcsPortsDeleteExample {
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
            EcsPortsDeleteRequestBody body = new EcsPortsDeleteRequestBody().withClientToken("delete-ports-test")
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withNetworkInterfaceID("port-vibsmse8pl");
            EcsPortsDeleteRequest request = new EcsPortsDeleteRequest().withBody(body);
            CTResponse<EcsPortsDeleteResponseData> response = client.ecsPortsDelete(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}