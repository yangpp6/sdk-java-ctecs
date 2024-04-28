package cn.ctyun.ctapi.ctecs.ecssfslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询虚机绑定文件系统列表>
 * Entity: EcsSfsListResults
 */
public class EcsSfsListResults {
    /**
     * fileSysID
     * 文件系统ID
     */
    private String fileSysID;
    /**
     * fileSysName
     * 文件系统名称
     */
    private String fileSysName;
    /**
     * fileSysStatus
     * 文件系统状态
     */
    private String fileSysStatus;
    /**
     * storageType
     * 存储类型
     */
    private String storageType;
    /**
     * shareProtocol
     * 存储协议
     */
    private String shareProtocol;
    /**
     * expireTime
     * 到期时间
     */
    private String expireTime;
    /**
     * sharePath
     * 共享路径（文件提供的共享目录）
     */
    private String sharePath;
    /**
     * cephID
     * 文件系统ID（底层）
     */
    private String cephID;
    /**
     * resourceID
     * 文件系统资源ID（IT）
     */
    private String resourceID;

    /**
     * set fileSysID
     * @param fileSysID 文件系统ID
     * @return this
     */
    public EcsSfsListResults withFileSysID(String fileSysID) {
        this.fileSysID = fileSysID;
        return this;
    }

    /**
     * set fileSysName
     * @param fileSysName 文件系统名称
     * @return this
     */
    public EcsSfsListResults withFileSysName(String fileSysName) {
        this.fileSysName = fileSysName;
        return this;
    }

    /**
     * set fileSysStatus
     * @param fileSysStatus 文件系统状态
     * @return this
     */
    public EcsSfsListResults withFileSysStatus(String fileSysStatus) {
        this.fileSysStatus = fileSysStatus;
        return this;
    }

    /**
     * set storageType
     * @param storageType 存储类型
     * @return this
     */
    public EcsSfsListResults withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * set shareProtocol
     * @param shareProtocol 存储协议
     * @return this
     */
    public EcsSfsListResults withShareProtocol(String shareProtocol) {
        this.shareProtocol = shareProtocol;
        return this;
    }

    /**
     * set expireTime
     * @param expireTime 到期时间
     * @return this
     */
    public EcsSfsListResults withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * set sharePath
     * @param sharePath 共享路径（文件提供的共享目录）
     * @return this
     */
    public EcsSfsListResults withSharePath(String sharePath) {
        this.sharePath = sharePath;
        return this;
    }

    /**
     * set cephID
     * @param cephID 文件系统ID（底层）
     * @return this
     */
    public EcsSfsListResults withCephID(String cephID) {
        this.cephID = cephID;
        return this;
    }

    /**
     * set resourceID
     * @param resourceID 文件系统资源ID（IT）
     * @return this
     */
    public EcsSfsListResults withResourceID(String resourceID) {
        this.resourceID = resourceID;
        return this;
    }

    public String getFileSysID() {
        return fileSysID;
    }

    public void setFileSysID(String fileSysID) {
        this.fileSysID = fileSysID;
    }

    public String getFileSysName() {
        return fileSysName;
    }

    public void setFileSysName(String fileSysName) {
        this.fileSysName = fileSysName;
    }

    public String getFileSysStatus() {
        return fileSysStatus;
    }

    public void setFileSysStatus(String fileSysStatus) {
        this.fileSysStatus = fileSysStatus;
    }

    public String getStorageType() {
        return storageType;
    }

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    public String getShareProtocol() {
        return shareProtocol;
    }

    public void setShareProtocol(String shareProtocol) {
        this.shareProtocol = shareProtocol;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getSharePath() {
        return sharePath;
    }

    public void setSharePath(String sharePath) {
        this.sharePath = sharePath;
    }

    public String getCephID() {
        return cephID;
    }

    public void setCephID(String cephID) {
        this.cephID = cephID;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }
}
