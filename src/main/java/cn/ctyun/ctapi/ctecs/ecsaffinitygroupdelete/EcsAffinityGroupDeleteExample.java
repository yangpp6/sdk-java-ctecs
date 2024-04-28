package cn.ctyun.ctapi.ctecs.ecsaffinitygroupdelete;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-删除云主机组>
 * Example: EcsAffinityGroupDeleteExample
 */
public class EcsAffinityGroupDeleteExample {
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
            EcsAffinityGroupDeleteRequestBody body = new EcsAffinityGroupDeleteRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b")
                    .withAffinityGroupID("ce804a6b-5be0-aa29-cc32-d0471321e99d");
            EcsAffinityGroupDeleteRequest request = new EcsAffinityGroupDeleteRequest().withBody(body);
            CTResponse<EcsAffinityGroupDeleteResponseData> response = client.ecsAffinityGroupDelete(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}