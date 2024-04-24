package cn.ctyun.ctapi.ctecs.ecssnapshotdetails;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机快照详情>
 * Entity: EcsSnapshotDetailsMembers
 */
public class EcsSnapshotDetailsMembers {
    /**
     * volume_type_name
     * 云硬盘类型，取值范围：<br />SATA：普通IO<br />SAS：高IO<br />SSD：超高IO<br />SSD-genric：通用型SSD<br />FAST-SSD：极速型SSD
     */
    private String volume_type_name;
    /**
     * volume_id
     * 云硬盘ID
     */
    private String volume_id;
    /**
     * volume_name
     * 云硬盘名称
     */
    private String volume_name;
    /**
     * is_bootable
     * 是否启动盘
     */
    private Boolean is_bootable;
    /**
     * is_encrypted
     * 是否加密盘
     */
    private Boolean is_encrypted;
    /**
     * volume_size
     * 云硬盘大小，单位为GB
     */
    private Integer volume_size;
    /**
     * snapshot_id
     * 云硬盘快照ID
     */
    private String snapshot_id;
    /**
     * snapshot_status
     * 云硬盘快照状态
     */
    private String snapshot_status;

    /**
     * set volume_type_name
     * @param volume_type_name 云硬盘类型，取值范围：<br />SATA：普通IO<br />SAS：高IO<br />SSD：超高IO<br />SSD-genric：通用型SSD<br />FAST-SSD：极速型SSD
     * @return this
     */
    public EcsSnapshotDetailsMembers withVolume_type_name(String volume_type_name) {
        this.volume_type_name = volume_type_name;
        return this;
    }

    /**
     * set volume_id
     * @param volume_id 云硬盘ID
     * @return this
     */
    public EcsSnapshotDetailsMembers withVolume_id(String volume_id) {
        this.volume_id = volume_id;
        return this;
    }

    /**
     * set volume_name
     * @param volume_name 云硬盘名称
     * @return this
     */
    public EcsSnapshotDetailsMembers withVolume_name(String volume_name) {
        this.volume_name = volume_name;
        return this;
    }

    /**
     * set is_bootable
     * @param is_bootable 是否启动盘
     * @return this
     */
    public EcsSnapshotDetailsMembers withIs_bootable(Boolean is_bootable) {
        this.is_bootable = is_bootable;
        return this;
    }

    /**
     * set is_encrypted
     * @param is_encrypted 是否加密盘
     * @return this
     */
    public EcsSnapshotDetailsMembers withIs_encrypted(Boolean is_encrypted) {
        this.is_encrypted = is_encrypted;
        return this;
    }

    /**
     * set volume_size
     * @param volume_size 云硬盘大小，单位为GB
     * @return this
     */
    public EcsSnapshotDetailsMembers withVolume_size(Integer volume_size) {
        this.volume_size = volume_size;
        return this;
    }

    /**
     * set snapshot_id
     * @param snapshot_id 云硬盘快照ID
     * @return this
     */
    public EcsSnapshotDetailsMembers withSnapshot_id(String snapshot_id) {
        this.snapshot_id = snapshot_id;
        return this;
    }

    /**
     * set snapshot_status
     * @param snapshot_status 云硬盘快照状态
     * @return this
     */
    public EcsSnapshotDetailsMembers withSnapshot_status(String snapshot_status) {
        this.snapshot_status = snapshot_status;
        return this;
    }

    public String getVolume_type_name() {
        return volume_type_name;
    }

    public void setVolume_type_name(String volume_type_name) {
        this.volume_type_name = volume_type_name;
    }

    public String getVolume_id() {
        return volume_id;
    }

    public void setVolume_id(String volume_id) {
        this.volume_id = volume_id;
    }

    public String getVolume_name() {
        return volume_name;
    }

    public void setVolume_name(String volume_name) {
        this.volume_name = volume_name;
    }

    public Boolean getIs_bootable() {
        return is_bootable;
    }

    public void setIs_bootable(Boolean is_bootable) {
        this.is_bootable = is_bootable;
    }

    public Boolean getIs_encrypted() {
        return is_encrypted;
    }

    public void setIs_encrypted(Boolean is_encrypted) {
        this.is_encrypted = is_encrypted;
    }

    public Integer getVolume_size() {
        return volume_size;
    }

    public void setVolume_size(Integer volume_size) {
        this.volume_size = volume_size;
    }

    public String getSnapshot_id() {
        return snapshot_id;
    }

    public void setSnapshot_id(String snapshot_id) {
        this.snapshot_id = snapshot_id;
    }

    public String getSnapshot_status() {
        return snapshot_status;
    }

    public void setSnapshot_status(String snapshot_status) {
        this.snapshot_status = snapshot_status;
    }
}
