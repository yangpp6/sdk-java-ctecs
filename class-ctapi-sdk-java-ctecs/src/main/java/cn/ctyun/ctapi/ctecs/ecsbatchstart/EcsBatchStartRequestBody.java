package cn.ctyun.ctapi.ctecs.ecsbatchstart;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-开启多台云主机>
 * Entity: EcsBatchStartRequestBody
 */
public class EcsBatchStartRequestBody {
    /**
     * regionID
     * 资源池ID
     */
    private String regionID;
    /**
     * ID
     * 实例ID
     */
    private String ID;
    /**
     * instanceIDList
     * 虚机ID列表，字符串，英文逗号分割
     */
    private String instanceIDList;

    /**
     * set regionID
     * @param regionID 资源池ID
     * @return this
     */
    public EcsBatchStartRequestBody withRegionID(String regionID) {
        this.regionID = regionID;
        return this;
    }

    /**
     * set ID
     * @param ID 实例ID
     * @return this
     */
    public EcsBatchStartRequestBody withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set instanceIDList
     * @param instanceIDList 虚机ID列表，字符串，英文逗号分割
     * @return this
     */
    public EcsBatchStartRequestBody withInstanceIDList(String instanceIDList) {
        this.instanceIDList = instanceIDList;
        return this;
    }

    public String getRegionID() {
        return regionID;
    }

    public void setRegionID(String regionID) {
        this.regionID = regionID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getInstanceIDList() {
        return instanceIDList;
    }

    public void setInstanceIDList(String instanceIDList) {
        this.instanceIDList = instanceIDList;
    }
}
