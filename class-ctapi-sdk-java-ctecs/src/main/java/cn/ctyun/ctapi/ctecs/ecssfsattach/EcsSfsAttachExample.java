package cn.ctyun.ctapi.ctecs.ecssfsattach;

import com.alibaba.fastjson.JSONObject;
import cn.ctyun.ctapi.Credential;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.CTFile;
import java.util.*;
import cn.ctyun.ctapi.ctecs.CtecsClient;

/**
 * <云主机挂载文件系统>
 * Example: EcsSfsAttachExample
 */
public class EcsSfsAttachExample {
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
            EcsSfsAttachSysInfoList sysInfoList1 = new EcsSfsAttachSysInfoList().withFileSysID("56644622-41d1-5c35-8794-df55bffaff88")
                    .withFileSysRoute("55.243.4.20:/mnt/sfs_cap/e3aacef1e0be40559b38a5c2158aa62e_mqfb3ej839cdz7ub").withMountPoint("/mnt/docs")
                    .withOption("vers=3,async,nolock,noatime,nodiratime,wsize=1048576,rsize=1048576,timeo=600").withAutoMount(false).withProtocol("NFSv3");
            EcsSfsAttachRequestBody body = new EcsSfsAttachRequestBody().withRegionID("bb9fdb42056f11eda1610242ac110002")
                    .withInstanceID("b67b7f1f-095b-1249-b379-8dd5cc542a05").withSysInfoList(new EcsSfsAttachSysInfoList[] { sysInfoList1 });
            EcsSfsAttachRequest request = new EcsSfsAttachRequest().withBody(body);
            CTResponse<EcsSfsAttachResponseData> response = client.ecsSfsAttach(request);
            return JSONObject.toJSONString(response);
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
