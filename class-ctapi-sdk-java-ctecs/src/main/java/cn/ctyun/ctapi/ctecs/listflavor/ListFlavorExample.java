package cn.ctyun.ctapi.ctecs.listflavor;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个云主机规格资源>
 * Example: ListFlavorExample
 */
public class ListFlavorExample {
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
            ListFlavorRequestBody body = new ListFlavorRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002").withAzName("default")
                    .withFlavorType("GPU_N_PI7").withFlavorName("pi7.4xlarge.4").withFlavorCPU(16).withFlavorRAM(32).withFlavorArch("x86")
                    .withFlavorSeries("g").withFlavorID("f02916cc-0445-be64-5e41-64019e95dc07");
            ListFlavorRequest request = new ListFlavorRequest().withBody(body);
            CTResponse<ListFlavorResponseData> response = client.listFlavor(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
