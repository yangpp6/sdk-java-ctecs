package cn.ctyun.ctapi.ctecs.ecsaffinitygroupunbindinstances;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <云主机组批量移除云主机>
 * Example: EcsAffinityGroupUnbindInstancesExample
 */
public class EcsAffinityGroupUnbindInstancesExample {
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
            EcsAffinityGroupUnbindInstancesRequestBody body = new EcsAffinityGroupUnbindInstancesRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b")
                    .withInstanceIDs("'d5673536-6c77-8ac8-5b73-19a96fd41dca,191881cf-e766-6909-31a9-c4086b17c1dd'")
                    .withAffinityGroupID("1d9de965-3d77-25f1-f521-8d6703280406");
            EcsAffinityGroupUnbindInstancesRequest request = new EcsAffinityGroupUnbindInstancesRequest().withBody(body);
            CTResponse<EcsAffinityGroupUnbindInstancesResponseData> response = client.ecsAffinityGroupUnbindInstances(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
