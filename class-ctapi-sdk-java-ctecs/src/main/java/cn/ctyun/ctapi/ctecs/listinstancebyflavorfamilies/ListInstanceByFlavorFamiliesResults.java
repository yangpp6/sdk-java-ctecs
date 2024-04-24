package cn.ctyun.ctapi.ctecs.listinstancebyflavorfamilies;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询指定规格族下的云主机信息>
 * Entity: ListInstanceByFlavorFamiliesResults
 */
public class ListInstanceByFlavorFamiliesResults {
    /**
     * instanceID
     * 云主机ID
     */
    private String instanceID;
    /**
     * instanceName
     * 云主机名称
     */
    private String instanceName;
    /**
     * flavor
     * 云主机规格详情
     */
    private ListInstanceByFlavorFamiliesFlavor flavor;

    /**
     * set instanceID
     * @param instanceID 云主机ID
     * @return this
     */
    public ListInstanceByFlavorFamiliesResults withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }

    /**
     * set instanceName
     * @param instanceName 云主机名称
     * @return this
     */
    public ListInstanceByFlavorFamiliesResults withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * set flavor
     * @param flavor 云主机规格详情
     * @return this
     */
    public ListInstanceByFlavorFamiliesResults withFlavor(ListInstanceByFlavorFamiliesFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ListInstanceByFlavorFamiliesFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(ListInstanceByFlavorFamiliesFlavor flavor) {
        this.flavor = flavor;
    }
}
