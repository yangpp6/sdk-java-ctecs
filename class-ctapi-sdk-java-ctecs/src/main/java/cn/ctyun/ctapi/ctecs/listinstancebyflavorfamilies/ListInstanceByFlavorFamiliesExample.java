package cn.ctyun.ctapi.ctecs.listinstancebyflavorfamilies;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询指定规格族下的云主机信息>
 * Example: ListInstanceByFlavorFamiliesExample
 */
public class ListInstanceByFlavorFamiliesExample {
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
            ListInstanceByFlavorFamiliesRequestBody body = new ListInstanceByFlavorFamiliesRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withAzName("cn-huadong1-jsnj1A-public-ctcloud").withFlavorFamily("s7").withPageSize(10);
            ListInstanceByFlavorFamiliesRequest request = new ListInstanceByFlavorFamiliesRequest().withBody(body);
            CTResponse<ListInstanceByFlavorFamiliesResponseData> response = client.listInstanceByFlavorFamilies(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
