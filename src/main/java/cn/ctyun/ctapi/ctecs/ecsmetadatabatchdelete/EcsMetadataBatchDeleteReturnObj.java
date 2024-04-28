package cn.ctyun.ctapi.ctecs.ecsmetadatabatchdelete;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-批量删除云主机元数据>
 * Entity: EcsMetadataBatchDeleteReturnObj
 */
public class EcsMetadataBatchDeleteReturnObj {
    /**
     * instanceIDList
     * 云主机ID列表,多台则使用英文逗号分割
     */
    private String instanceIDList;
    /**
     * failedInstanceIDList
     * 返回删除失败的云主机id
     */
    private String[] failedInstanceIDList;

    /**
     * set instanceIDList
     * @param instanceIDList 云主机ID列表,多台则使用英文逗号分割
     * @return this
     */
    public EcsMetadataBatchDeleteReturnObj withInstanceIDList(String instanceIDList) {
        this.instanceIDList = instanceIDList;
        return this;
    }

    /**
     * set failedInstanceIDList
     * @param failedInstanceIDList 返回删除失败的云主机id
     * @return this
     */
    public EcsMetadataBatchDeleteReturnObj withFailedInstanceIDList(String[] failedInstanceIDList) {
        this.failedInstanceIDList = failedInstanceIDList;
        return this;
    }

    public String getInstanceIDList() {
        return instanceIDList;
    }

    public void setInstanceIDList(String instanceIDList) {
        this.instanceIDList = instanceIDList;
    }

    public String[] getFailedInstanceIDList() {
        return failedInstanceIDList;
    }

    public void setFailedInstanceIDList(String[] failedInstanceIDList) {
        this.failedInstanceIDList = failedInstanceIDList;
    }
}
