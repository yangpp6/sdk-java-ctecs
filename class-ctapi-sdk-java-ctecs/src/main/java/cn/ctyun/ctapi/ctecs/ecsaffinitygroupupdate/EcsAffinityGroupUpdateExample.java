package cn.ctyun.ctapi.ctecs.ecsaffinitygroupupdate;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-更新云主机组信息>
 * Example: EcsAffinityGroupUpdateExample
 */
public class EcsAffinityGroupUpdateExample {
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
            EcsAffinityGroupUpdateRequestBody body = new EcsAffinityGroupUpdateRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b")
                    .withAffinityGroupID("8d8e8888-8ed8-88b8-88cb-888f8b8cf8fa").withAffinityGroupName("update-02");
            EcsAffinityGroupUpdateRequest request = new EcsAffinityGroupUpdateRequest().withBody(body);
            CTResponse<EcsAffinityGroupUpdateResponseData> response = client.ecsAffinityGroupUpdate(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
