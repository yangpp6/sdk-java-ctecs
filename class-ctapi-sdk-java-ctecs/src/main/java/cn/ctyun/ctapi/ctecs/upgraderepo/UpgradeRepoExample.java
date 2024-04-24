package cn.ctyun.ctapi.ctecs.upgraderepo;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-扩容云主机备份存储库>
 * Example: UpgradeRepoExample
 */
public class UpgradeRepoExample {
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
            UpgradeRepoRequestBody body = new UpgradeRepoRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withRepositoryID("508e06e4-1911-4d93-8d3e-16f050aa3e280").withClientToken("4cf2962d-e92c-4c00-9181-cfbb2218636c").withSize(150)
                    .withPayVoucherPrice(20.55f);
            UpgradeRepoRequest request = new UpgradeRepoRequest().withBody(body);
            CTResponse<UpgradeRepoResponseData> response = client.upgradeRepo(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
