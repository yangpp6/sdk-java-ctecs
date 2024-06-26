package cn.ctyun.ctapi.ctecs.ecssfslist;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <查询虚机绑定文件系统列表>
 * Example: EcsSfsListExample
 */
public class EcsSfsListExample {
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
            EcsSfsListRequest request = new EcsSfsListRequest().withRegionID("81f7728662dd11ec810800155d307d5b").withInstanceID(
                    "5a6e9ec1-9742-2dea-7750-52dc05ed794d");
            CTResponse<EcsSfsListResponseData> response = client.ecsSfsList(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
