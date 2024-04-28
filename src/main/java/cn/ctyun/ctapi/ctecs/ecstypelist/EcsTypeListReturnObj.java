package cn.ctyun.ctapi.ctecs.ecstypelist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一个或多个云主机规格资源>
 * Entity: EcsTypeListReturnObj
 */
public class EcsTypeListReturnObj {
    /**
     * flavors
     * 规格列表
     */
    private EcsTypeListFlavors[] flavors;

    /**
     * set flavors
     * @param flavors 规格列表
     * @return this
     */
    public EcsTypeListReturnObj withFlavors(EcsTypeListFlavors[] flavors) {
        this.flavors = flavors;
        return this;
    }

    public EcsTypeListFlavors[] getFlavors() {
        return flavors;
    }

    public void setFlavors(EcsTypeListFlavors[] flavors) {
        this.flavors = flavors;
    }
}
