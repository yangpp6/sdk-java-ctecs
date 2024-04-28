package cn.ctyun.ctapi.ctecs.ecsbatchpasswordupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-更新多台云主机的密码>
 * Entity: EcsBatchPasswordUpdateRequestBody
 */
public class EcsBatchPasswordUpdateRequestBody {
    /**
     * regionID
     * 资源池ID，您可以调用[regionID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87)查看最新的天翼云资源池列表。
     */
    private String regionID;
    /**
     * azName
     * 可用区名称，您可以调用获取[资源池信息](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87)，查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空(即为单可用区，本字段填写default),多可用区资源池下，必须指定可用区。
     */
    private String azName;
    /**
     * updatePwdInfo
     * 批量更新密码信息
     */
    private EcsBatchPasswordUpdateUpdatePwdInfo[] updatePwdInfo;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以调用[regionID](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87)查看最新的天翼云资源池列表。
     * @return this
     */
    public EcsBatchPasswordUpdateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set azName
     * @param azName 可用区名称，您可以调用获取[资源池信息](https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87)，查询结果中zoneList内返回存在可用区名称(即多可用区，本字段填写实际可用区名称)，若查询结果中zoneList为空(即为单可用区，本字段填写default),多可用区资源池下，必须指定可用区。
     * @return this
     */
    public EcsBatchPasswordUpdateRequestBody withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * set updatePwdInfo
     * @param updatePwdInfo 批量更新密码信息
     * @return this
     */
    public EcsBatchPasswordUpdateRequestBody withUpdatePwdInfo(EcsBatchPasswordUpdateUpdatePwdInfo[] updatePwdInfo) {
        this.updatePwdInfo = updatePwdInfo;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public EcsBatchPasswordUpdateUpdatePwdInfo[] getUpdatePwdInfo() {
        return updatePwdInfo;
    }

    public void setUpdatePwdInfo(EcsBatchPasswordUpdateUpdatePwdInfo[] updatePwdInfo) {
        this.updatePwdInfo = updatePwdInfo;
    }
}
