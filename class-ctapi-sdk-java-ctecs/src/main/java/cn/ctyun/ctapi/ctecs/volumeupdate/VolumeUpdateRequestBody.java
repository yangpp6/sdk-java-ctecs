package cn.ctyun.ctapi.ctecs.volumeupdate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <修改云硬盘属性>
 * Entity: VolumeUpdateRequestBody
 */
public class VolumeUpdateRequestBody {
    /**
     * regionID
     * 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8317&data=87">查询账户启用的资源池信息</a>
     */
    private String regionID;
    /**
     * diskName
     * 云硬盘名称，长度限制2~63字符，不支持中文
     */
    private String diskName;
    /**
     * diskID
     * 云硬盘资源ID
     */
    private String diskID;

    /**
     * set regionID
     * @param regionID 资源池ID，您可以查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>来了解资源池 <br />获取：<br /><span style="background-color: rgb(73, 204, 144);color: rgb(255,255,255);padding: 2px; margin:2px">查</span> <a  href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8317&data=87">查询账户启用的资源池信息</a>
     * @return this
     */
    public VolumeUpdateRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set diskName
     * @param diskName 云硬盘名称，长度限制2~63字符，不支持中文
     * @return this
     */
    public VolumeUpdateRequestBody withDiskName(String diskName) {
        this.diskName = diskName;
        return this;
    }

    /**
     * set diskID
     * @param diskID 云硬盘资源ID
     * @return this
     */
    public VolumeUpdateRequestBody withDiskID(String diskID) {
        this.diskID = diskID;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }

    public String getDiskID() {
        return diskID;
    }

    public void setDiskID(String diskID) {
        this.diskID = diskID;
    }
}
