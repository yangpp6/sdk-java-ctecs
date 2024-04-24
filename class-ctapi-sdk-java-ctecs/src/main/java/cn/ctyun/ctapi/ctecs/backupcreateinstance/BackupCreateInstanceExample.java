package cn.ctyun.ctapi.ctecs.backupcreateinstance;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <一类节点-*-云主机ctecs-备份创建一台云主机>
 * Example: BackupCreateInstanceExample
 */
public class BackupCreateInstanceExample {
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
            BackupCreateInstanceLabelList labelList1 = new BackupCreateInstanceLabelList().withLabelKey("test-key").withLabelValue("test-value");
            BackupCreateInstanceRequestBody body = new BackupCreateInstanceRequestBody().withClientToken("4cf2962d-e92c-4c00-9181-cfbb2218636c")
                    .withRegionID("bb9fdb42056f11eda1610242ac110002").withInstanceName("ecm-3300").withDisplayName("ecm-3300")
                    .withInstanceBackupID("b6e2966d-7b1c-385e-abe4-d940caa273b7").withVpcID("4797e8a1-722d-4996-9362-458001813e41").withOnDemand(false)
                    .withSecGroupList(new String[] { "sg-ulk99r4wja" }).withExtIP("2").withIpVersion("ipv4").withBandwidth(100)
                    .withIpv6AddressID("ddabc7f0-2121-4121-bf85-ec090b3a73fc").withEipID("eip-9jpeyl0frh")
                    .withAffinityGroupID("924b95c4-68d9-3fbe-835d-fee46397feda").withKeyPairID("c57d0626-8a82-407b-a910-b454907778c3")
                    .withUserPassword("HelloCtyun.13").withCycleCount(6).withCycleType("MONTH").withAutoRenewStatus(1)
                    .withUserData("ZWNobyBoZWxsbyBnb3N0YWNrIQ==").withProjectID("0").withPayVoucherPrice(20.55f)
                    .withLabelList(new BackupCreateInstanceLabelList[] { labelList1 }).withMonitorService(true);
            BackupCreateInstanceRequest request = new BackupCreateInstanceRequest().withBody(body);
            CTResponse<BackupCreateInstanceResponseData> response = client.backupCreateInstance(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
