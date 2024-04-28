package cn.ctyun.ctapi.ctecs.batchrebuildinstance;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-重装多台云主机>
 * Example: BatchRebuildInstanceExample
 */
public class BatchRebuildInstanceExample {
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
            BatchRebuildInstanceRebuildInfo rebuildInfo1 = new BatchRebuildInstanceRebuildInfo().withInstanceID("adc614e0-e838-d73f-0618-a6d51d09070a")
                    .withPassword("rebuildTest123").withImageID("b1d896e1-c977-4fd4-b6c2-5432549977be").withUserData("UmVidWlsZFRlc3QyMDIyMTEyNDEzMTE=")
                    .withInstanceName("ecm-3300").withMonitorService(true);
            BatchRebuildInstanceRequestBody body = new BatchRebuildInstanceRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withRebuildInfo(
                    new BatchRebuildInstanceRebuildInfo[] { rebuildInfo1 });
            BatchRebuildInstanceRequest request = new BatchRebuildInstanceRequest().withBody(body);
            CTResponse<BatchRebuildInstanceResponseData> response = client.batchRebuildInstance(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
