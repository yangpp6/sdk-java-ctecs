package cn.ctyun.ctapi.ctecs.ecsmemhistorymetricdata;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询指定时间段内的内存监控数据>
 * Example: EcsMemHistoryMetricDataExample
 */
public class EcsMemHistoryMetricDataExample {
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
            EcsMemHistoryMetricDataRequestBody body = new EcsMemHistoryMetricDataRequestBody().withRegionID("100054c0416811e9a6690242ac110002")
                    .withDeviceIDList(new String[] { "9d8a3ea2-add5-c0b6-204a-9e1d0d44e843", "9d8a3ea2-add5-c0b6-204a-9e1d0d44e843" }).withPeriod(14400)
                    .withStartTime("1665305264").withEndTime("1667441264").withPageNo(1).withPage(1).withPageSize(10);
            EcsMemHistoryMetricDataRequest request = new EcsMemHistoryMetricDataRequest().withBody(body);
            CTResponse<EcsMemHistoryMetricDataResponseData> response = client.ecsMemHistoryMetricData(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
