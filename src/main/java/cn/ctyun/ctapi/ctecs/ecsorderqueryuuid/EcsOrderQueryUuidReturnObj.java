package cn.ctyun.ctapi.ctecs.ecsorderqueryuuid;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-根据masterOrderID查询云主机ID>
 * Entity: EcsOrderQueryUuidReturnObj
 */
public class EcsOrderQueryUuidReturnObj {
    /**
     * orderStatus
     * 订单状态，具体值代表含义：
     1    待支付     
     2    已支付     
     3    完成       
     4    取消       
     5    施工失败   
     7    正在支付中 
     8    待审核     
     9    审核通过   
     10   审核未通过 
     11   撤单完成   
     12   退订中     
     13   退订完成   
     14   开通中     
     15   变更移除   
     16   自动撤单中 
     17   手动撤单中 
     18   终止中     
     22   支付失败   
     -2   待撤单     
     -1   未知       
     0    错误       
     140  已初始化   
     999  逻辑删除   
     */
    private String orderStatus;
    /**
     * instanceIDList
     * 云主机的ID列表，订单处于创建中，返回为空列表。待订单完成后才能正常返回ID
     */
    private String[] instanceIDList;

    /**
     * set orderStatus
     * @param orderStatus 订单状态，具体值代表含义：
     1    待支付     
     2    已支付     
     3    完成       
     4    取消       
     5    施工失败   
     7    正在支付中 
     8    待审核     
     9    审核通过   
     10   审核未通过 
     11   撤单完成   
     12   退订中     
     13   退订完成   
     14   开通中     
     15   变更移除   
     16   自动撤单中 
     17   手动撤单中 
     18   终止中     
     22   支付失败   
     -2   待撤单     
     -1   未知       
     0    错误       
     140  已初始化   
     999  逻辑删除   
     * @return this
     */
    public EcsOrderQueryUuidReturnObj withOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    /**
     * set instanceIDList
     * @param instanceIDList 云主机的ID列表，订单处于创建中，返回为空列表。待订单完成后才能正常返回ID
     * @return this
     */
    public EcsOrderQueryUuidReturnObj withInstanceIDList(String[] instanceIDList) {
        this.instanceIDList = instanceIDList;
        return this;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String[] getInstanceIDList() {
        return instanceIDList;
    }

    public void setInstanceIDList(String[] instanceIDList) {
        this.instanceIDList = instanceIDList;
    }
}
