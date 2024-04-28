package cn.ctyun.ctapi.ctecs.ecslitecreate;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <创建轻量型云主机>
 * Example: EcsLiteCreateExample
 */
public class EcsLiteCreateExample {
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
            EcsLiteCreateDisks dataDiskList1 = new EcsLiteCreateDisks().withDiskName("lite-disk").withDiskSize(50);
            EcsLiteCreateRequestBody body = new EcsLiteCreateRequestBody().withClientToken("4cf2962d-e92c-4c00-9181-cfbb2218636c")
                    .withRegionID("aaf589124d5d11eaa04d0242ac110002").withDisplayName("ecm-3300").withFlavorSetType("fix").withFlavorName("lite1.fix.small.1")
                    .withImageID("9d9e8998-8ed5-43b2-99cb-322f2b8cf6fa").withCycleCount(6).withCycleType("MONTH").withBootDiskSize(40).withBandwidth(5)
                    .withDataDiskList(new EcsLiteCreateDisks[] { dataDiskList1 }).withUserPassword("1qaz@WSX").withAutoRenewStatus(1);
            EcsLiteCreateRequest request = new EcsLiteCreateRequest().withBody(body);
            CTResponse<EcsLiteCreateResponseData> response = client.ecsLiteCreate(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
