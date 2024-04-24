package cn.ctyun.ctapi.ctecs.ecsbackupcreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份>
 * Entity: EcsBackupCreateBlockDeviceMappingS
 */
public class EcsBackupCreateBlockDeviceMappingS {
    /**
     * backup_id
     * 云硬盘备份ID
     */
    private String backup_id;
    /**
     * volume_id
     * 云硬盘ID
     */
    private String volume_id;
    /**
     * boot_volume
     * 是否为启动盘
     */
    private Boolean boot_volume;
    /**
     * mount_device
     * 云硬盘所挂载的设备
     */
    private String mount_device;
    /**
     * volume_size
     * 云硬盘大小
     */
    private String volume_size;
    /**
     * volume_type
     * 云硬盘类型，取值范围：<br />SATA：普通IO<br />SAS：高IO<br />SSD：超高IO<br />SSD-genric：通用型SSD<br />FAST-SSD：极速型SSD
     */
    private String volume_type;
    /**
     * delete_on_termination
     * 是否随所挂载的云主机一起销毁
     */
    private Boolean delete_on_termination;
    /**
     * boot_index
     * 启动次序
     */
    private Integer boot_index;
    /**
     * device_name
     * 挂载的设备名称
     */
    private String device_name;
    /**
     * container
     * container
     */
    private String container;
    /**
     * service_metadata
     * 服务元数据
     */
    private String service_metadata;

    /**
     * set backup_id
     * @param backup_id 云硬盘备份ID
     * @return this
     */
    public EcsBackupCreateBlockDeviceMappingS withBackup_id(String backup_id) {
        this.backup_id = backup_id;
        return this;
    }

    /**
     * set volume_id
     * @param volume_id 云硬盘ID
     * @return this
     */
    public EcsBackupCreateBlockDeviceMappingS withVolume_id(String volume_id) {
        this.volume_id = volume_id;
        return this;
    }

    /**
     * set boot_volume
     * @param boot_volume 是否为启动盘
     * @return this
     */
    public EcsBackupCreateBlockDeviceMappingS withBoot_volume(Boolean boot_volume) {
        this.boot_volume = boot_volume;
        return this;
    }

    /**
     * set mount_device
     * @param mount_device 云硬盘所挂载的设备
     * @return this
     */
    public EcsBackupCreateBlockDeviceMappingS withMount_device(String mount_device) {
        this.mount_device = mount_device;
        return this;
    }

    /**
     * set volume_size
     * @param volume_size 云硬盘大小
     * @return this
     */
    public EcsBackupCreateBlockDeviceMappingS withVolume_size(String volume_size) {
        this.volume_size = volume_size;
        return this;
    }

    /**
     * set volume_type
     * @param volume_type 云硬盘类型，取值范围：<br />SATA：普通IO<br />SAS：高IO<br />SSD：超高IO<br />SSD-genric：通用型SSD<br />FAST-SSD：极速型SSD
     * @return this
     */
    public EcsBackupCreateBlockDeviceMappingS withVolume_type(String volume_type) {
        this.volume_type = volume_type;
        return this;
    }

    /**
     * set delete_on_termination
     * @param delete_on_termination 是否随所挂载的云主机一起销毁
     * @return this
     */
    public EcsBackupCreateBlockDeviceMappingS withDelete_on_termination(Boolean delete_on_termination) {
        this.delete_on_termination = delete_on_termination;
        return this;
    }

    /**
     * set boot_index
     * @param boot_index 启动次序
     * @return this
     */
    public EcsBackupCreateBlockDeviceMappingS withBoot_index(Integer boot_index) {
        this.boot_index = boot_index;
        return this;
    }

    /**
     * set device_name
     * @param device_name 挂载的设备名称
     * @return this
     */
    public EcsBackupCreateBlockDeviceMappingS withDevice_name(String device_name) {
        this.device_name = device_name;
        return this;
    }

    /**
     * set container
     * @param container container
     * @return this
     */
    public EcsBackupCreateBlockDeviceMappingS withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * set service_metadata
     * @param service_metadata 服务元数据
     * @return this
     */
    public EcsBackupCreateBlockDeviceMappingS withService_metadata(String service_metadata) {
        this.service_metadata = service_metadata;
        return this;
    }

    public String getBackup_id() {
        return backup_id;
    }

    public void setBackup_id(String backup_id) {
        this.backup_id = backup_id;
    }

    public String getVolume_id() {
        return volume_id;
    }

    public void setVolume_id(String volume_id) {
        this.volume_id = volume_id;
    }

    public Boolean getBoot_volume() {
        return boot_volume;
    }

    public void setBoot_volume(Boolean boot_volume) {
        this.boot_volume = boot_volume;
    }

    public String getMount_device() {
        return mount_device;
    }

    public void setMount_device(String mount_device) {
        this.mount_device = mount_device;
    }

    public String getVolume_size() {
        return volume_size;
    }

    public void setVolume_size(String volume_size) {
        this.volume_size = volume_size;
    }

    public String getVolume_type() {
        return volume_type;
    }

    public void setVolume_type(String volume_type) {
        this.volume_type = volume_type;
    }

    public Boolean getDelete_on_termination() {
        return delete_on_termination;
    }

    public void setDelete_on_termination(Boolean delete_on_termination) {
        this.delete_on_termination = delete_on_termination;
    }

    public Integer getBoot_index() {
        return boot_index;
    }

    public void setBoot_index(Integer boot_index) {
        this.boot_index = boot_index;
    }

    public String getDevice_name() {
        return device_name;
    }

    public void setDevice_name(String device_name) {
        this.device_name = device_name;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public String getService_metadata() {
        return service_metadata;
    }

    public void setService_metadata(String service_metadata) {
        this.service_metadata = service_metadata;
    }
}
