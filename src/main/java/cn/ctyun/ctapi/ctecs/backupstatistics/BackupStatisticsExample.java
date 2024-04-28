package cn.ctyun.ctapi.ctecs.backupstatistics;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-云主机备份查询虚机磁盘大小>
 * Example: BackupStatisticsExample
 */
public class BackupStatisticsExample {
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
            BackupStatisticsRequest request = new BackupStatisticsRequest().withRegionID("bb9fdb42056f11eda1610242ac110002").withInstanceID(
                    "69aac66c-78e8-e704-e6e1-311b3f40a278");
            CTResponse<BackupStatisticsResponseData> response = client.backupStatistics(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
