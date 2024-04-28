package cn.ctyun.ctapi.ctecs.ecsstatuslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-获取多台云主机的状态信息>
 * Entity: EcsStatusListStatusList
 */
public class EcsStatusListStatusList {
    /**
     * ID
     * 主机id
     */
    private String ID;
    /**
     * status
     * 云主机状态，取值范围：<br />backingup: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中
     */
    private String status;

    /**
     * set ID
     * @param ID 主机id
     * @return this
     */
    public EcsStatusListStatusList withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set status
     * @param status 云主机状态，取值范围：<br />backingup: 备份中，<br />creating: 创建中，<br />expired: 已到期，<br />freezing: 冻结中，<br />rebuild: 重装，<br />restarting: 重启中，<br />running: 运行中，<br />starting: 开机中，<br />stopped: 已关机，<br />stopping: 关机中
     * @return this
     */
    public EcsStatusListStatusList withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
