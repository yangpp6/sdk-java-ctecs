package cn.ctyun.ctapi.ctecs.ecsaffinitygroupbindcheck;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-云主机加入主机组校验>
 * Entity: EcsAffinityGroupBindCheckReturnObj
 */
public class EcsAffinityGroupBindCheckReturnObj {
    /**
     * needMigrate
     * 需要迁移的次数
     */
    private Integer needMigrate;

    /**
     * set needMigrate
     * @param needMigrate 需要迁移的次数
     * @return this
     */
    public EcsAffinityGroupBindCheckReturnObj withNeedMigrate(Integer needMigrate) {
        this.needMigrate = needMigrate;
        return this;
    }

    public Integer getNeedMigrate() {
        return needMigrate;
    }

    public void setNeedMigrate(Integer needMigrate) {
        this.needMigrate = needMigrate;
    }
}
