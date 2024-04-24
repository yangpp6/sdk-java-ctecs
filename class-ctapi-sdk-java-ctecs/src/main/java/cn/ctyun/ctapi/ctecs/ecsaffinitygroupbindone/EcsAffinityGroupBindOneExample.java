package cn.ctyun.ctapi.ctecs.ecsaffinitygroupbindone;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-云主机组中添加单台云主机>
 * Example: EcsAffinityGroupBindOneExample
 */
public class EcsAffinityGroupBindOneExample {
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
            EcsAffinityGroupBindOneRequestBody body = new EcsAffinityGroupBindOneRequestBody().withRegionID("81f7728662dd11ec810800155d307d5b")
                    .withAzName("cn-huadong1-jsnj1A-public-ctcloud").withID("9a1fdc59-b6a2-32bb-780f-3b00653c56f7")
                    .withAffinityGroupID("1d9de965-3d77-25f1-f521-8d6703280406");
            EcsAffinityGroupBindOneRequest request = new EcsAffinityGroupBindOneRequest().withBody(body);
            CTResponse<EcsAffinityGroupBindOneResponseData> response = client.ecsAffinityGroupBindOne(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
