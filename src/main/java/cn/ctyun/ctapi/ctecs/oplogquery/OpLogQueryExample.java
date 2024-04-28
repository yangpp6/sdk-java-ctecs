package cn.ctyun.ctapi.ctecs.oplogquery;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-查询用户资源操作日志>
 * Example: OpLogQueryExample
 */
public class OpLogQueryExample {
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
            OpLogQueryRequest request = new OpLogQueryRequest().withRegionID("41f64827f25f468595ffa3a5deb5d15d").withProduct("compute").withActionType("")
                    .withAction("").withDelegateType("1").withQueryContent("").withPageNo(1).withPageSize(10);
            CTResponse<OpLogQueryResponseData> response = client.opLogQuery(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
