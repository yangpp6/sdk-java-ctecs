package cn.ctyun.ctapi.ctecs.getcustomerresources;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-用户已有资源查询>
 * Entity: GetCustomerResourcesResources
 */
public class GetCustomerResourcesResources {
    /**
     * VM
     * 云主机
     */
    private GetCustomerResourcesVM VM;
    /**
     * Volume
     * 磁盘
     */
    private GetCustomerResourcesVolume Volume;
    /**
     * VPC
     * VPC
     */
    private GetCustomerResourcesVPC VPC;
    /**
     * BMS
     * 物理机
     */
    private GetCustomerResourcesBMS BMS;
    /**
     * NAT
     * NAT
     */
    private GetCustomerResourcesNAT NAT;
    /**
     * SNAPSHOT
     * 云主机快照
     */
    private GetCustomerResourcesSNAPSHOT SNAPSHOT;
    /**
     * ACLLIST
     * ACL
     */
    private GetCustomerResourcesACLLIST ACLLIST;
    /**
     * IMAGE
     * 私有镜像
     */
    private GetCustomerResourcesIMAGE IMAGE;
    /**
     * LOADBALANCER
     * 负载均衡
     */
    private GetCustomerResourcesLOADBALANCER LOADBALANCER;
    /**
     * CBR
     * 云主机备份
     */
    private GetCustomerResourcesCBR CBR;
    /**
     * CERT
     * 负载均衡证书
     */
    private GetCustomerResourcesCERT CERT;

    /**
     * set VM
     * @param VM 云主机
     * @return this
     */
    public GetCustomerResourcesResources withVM(GetCustomerResourcesVM VM) {
        this.VM = VM;
        return this;
    }

    /**
     * set Volume
     * @param Volume 磁盘
     * @return this
     */
    public GetCustomerResourcesResources withVolume(GetCustomerResourcesVolume Volume) {
        this.Volume = Volume;
        return this;
    }

    /**
     * set VPC
     * @param VPC VPC
     * @return this
     */
    public GetCustomerResourcesResources withVPC(GetCustomerResourcesVPC VPC) {
        this.VPC = VPC;
        return this;
    }

    /**
     * set BMS
     * @param BMS 物理机
     * @return this
     */
    public GetCustomerResourcesResources withBMS(GetCustomerResourcesBMS BMS) {
        this.BMS = BMS;
        return this;
    }

    /**
     * set NAT
     * @param NAT NAT
     * @return this
     */
    public GetCustomerResourcesResources withNAT(GetCustomerResourcesNAT NAT) {
        this.NAT = NAT;
        return this;
    }

    /**
     * set SNAPSHOT
     * @param SNAPSHOT 云主机快照
     * @return this
     */
    public GetCustomerResourcesResources withSNAPSHOT(GetCustomerResourcesSNAPSHOT SNAPSHOT) {
        this.SNAPSHOT = SNAPSHOT;
        return this;
    }

    /**
     * set ACLLIST
     * @param ACLLIST ACL
     * @return this
     */
    public GetCustomerResourcesResources withACLLIST(GetCustomerResourcesACLLIST ACLLIST) {
        this.ACLLIST = ACLLIST;
        return this;
    }

    /**
     * set IMAGE
     * @param IMAGE 私有镜像
     * @return this
     */
    public GetCustomerResourcesResources withIMAGE(GetCustomerResourcesIMAGE IMAGE) {
        this.IMAGE = IMAGE;
        return this;
    }

    /**
     * set LOADBALANCER
     * @param LOADBALANCER 负载均衡
     * @return this
     */
    public GetCustomerResourcesResources withLOADBALANCER(GetCustomerResourcesLOADBALANCER LOADBALANCER) {
        this.LOADBALANCER = LOADBALANCER;
        return this;
    }

    /**
     * set CBR
     * @param CBR 云主机备份
     * @return this
     */
    public GetCustomerResourcesResources withCBR(GetCustomerResourcesCBR CBR) {
        this.CBR = CBR;
        return this;
    }

    /**
     * set CERT
     * @param CERT 负载均衡证书
     * @return this
     */
    public GetCustomerResourcesResources withCERT(GetCustomerResourcesCERT CERT) {
        this.CERT = CERT;
        return this;
    }

    public GetCustomerResourcesVM getVM() {
        return VM;
    }

    public void setVM(GetCustomerResourcesVM VM) {
        this.VM = VM;
    }

    public GetCustomerResourcesVolume getVolume() {
        return Volume;
    }

    public void setVolume(GetCustomerResourcesVolume Volume) {
        this.Volume = Volume;
    }

    public GetCustomerResourcesVPC getVPC() {
        return VPC;
    }

    public void setVPC(GetCustomerResourcesVPC VPC) {
        this.VPC = VPC;
    }

    public GetCustomerResourcesBMS getBMS() {
        return BMS;
    }

    public void setBMS(GetCustomerResourcesBMS BMS) {
        this.BMS = BMS;
    }

    public GetCustomerResourcesNAT getNAT() {
        return NAT;
    }

    public void setNAT(GetCustomerResourcesNAT NAT) {
        this.NAT = NAT;
    }

    public GetCustomerResourcesSNAPSHOT getSNAPSHOT() {
        return SNAPSHOT;
    }

    public void setSNAPSHOT(GetCustomerResourcesSNAPSHOT SNAPSHOT) {
        this.SNAPSHOT = SNAPSHOT;
    }

    public GetCustomerResourcesACLLIST getACLLIST() {
        return ACLLIST;
    }

    public void setACLLIST(GetCustomerResourcesACLLIST ACLLIST) {
        this.ACLLIST = ACLLIST;
    }

    public GetCustomerResourcesIMAGE getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(GetCustomerResourcesIMAGE IMAGE) {
        this.IMAGE = IMAGE;
    }

    public GetCustomerResourcesLOADBALANCER getLOADBALANCER() {
        return LOADBALANCER;
    }

    public void setLOADBALANCER(GetCustomerResourcesLOADBALANCER LOADBALANCER) {
        this.LOADBALANCER = LOADBALANCER;
    }

    public GetCustomerResourcesCBR getCBR() {
        return CBR;
    }

    public void setCBR(GetCustomerResourcesCBR CBR) {
        this.CBR = CBR;
    }

    public GetCustomerResourcesCERT getCERT() {
        return CERT;
    }

    public void setCERT(GetCustomerResourcesCERT CERT) {
        this.CERT = CERT;
    }
}
