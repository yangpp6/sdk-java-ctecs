package cn.ctyun.ctapi.ctecs.ecsaffinitygrouplist;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询云主机组列表或者详情>
 * Example: EcsAffinityGroupListExample
 */
public class EcsAffinityGroupListExample {
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
            EcsAffinityGroupListRequestBody body = new EcsAffinityGroupListRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b").withAzName("az1")
                    .withAffinityGroupID("ce804a6b-5be0-aa29-cc32-d0471321e99d").withQueryContent("aa29").withPageNo(1).withPageSize(10);
            EcsAffinityGroupListRequest request = new EcsAffinityGroupListRequest().withBody(body);
            CTResponse<EcsAffinityGroupListResponseData> response = client.ecsAffinityGroupList(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
