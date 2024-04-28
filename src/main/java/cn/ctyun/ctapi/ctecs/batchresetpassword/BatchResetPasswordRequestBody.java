package cn.ctyun.ctapi.ctecs.batchresetpassword;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量重置云主机密码>
 * Entity: BatchResetPasswordRequestBody
 */
public class BatchResetPasswordRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     */
    private String regionID;
    /**
     * updatePwdInfo
     * 批量更新密码信息列表
     */
    private BatchResetPasswordUpdatePwdInfo[] updatePwdInfo;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5851&data=87">资源池列表查询</a>
     * @return this
     */
    public BatchResetPasswordRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set updatePwdInfo
     * @param updatePwdInfo 批量更新密码信息列表
     * @return this
     */
    public BatchResetPasswordRequestBody withUpdatePwdInfo(BatchResetPasswordUpdatePwdInfo[] updatePwdInfo) {
        this.updatePwdInfo = updatePwdInfo;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public BatchResetPasswordUpdatePwdInfo[] getUpdatePwdInfo() {
        return updatePwdInfo;
    }

    public void setUpdatePwdInfo(BatchResetPasswordUpdatePwdInfo[] updatePwdInfo) {
        this.updatePwdInfo = updatePwdInfo;
    }
}
