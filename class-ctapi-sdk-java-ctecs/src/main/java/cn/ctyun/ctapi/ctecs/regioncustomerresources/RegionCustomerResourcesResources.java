package cn.ctyun.ctapi.ctecs.regioncustomerresources;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-根据regionID查询用户资源>
 * Entity: RegionCustomerResourcesResources
 */
public class RegionCustomerResourcesResources {
    /**
     * VM
     * 云主机
     */
    private RegionCustomerResourcesVM VM;
    /**
     * Volume
     * 磁盘
     */
    private RegionCustomerResourcesVolume Volume;
    /**
     * VPC
     * VPC
     */
    private RegionCustomerResourcesVPC VPC;
    /**
     * BMS
     * 物理机
     */
    private RegionCustomerResourcesBMS BMS;
    /**
     * NAT
     * NAT
     */
    private RegionCustomerResourcesNAT NAT;
    /**
     * SNAPSHOT
     * 云主机快照
     */
    private RegionCustomerResourcesSNAPSHOT SNAPSHOT;
    /**
     * ACLLIST
     * ACL
     */
    private RegionCustomerResourcesACLLIST ACLLIST;
    /**
     * IMAGE
     * 私有镜像
     */
    private RegionCustomerResourcesIMAGE IMAGE;
    /**
     * LOADBALANCER
     * 负载均衡
     */
    private RegionCustomerResourcesLOADBALANCER LOADBALANCER;
    /**
     * CBR
     * 云主机备份
     */
    private RegionCustomerResourcesCBR CBR;
    /**
     * CERT
     * 负载均衡证书
     */
    private RegionCustomerResourcesCERT CERT;

    /**
     * set VM
     * @param VM 云主机
     * @return this
     */
    public RegionCustomerResourcesResources withVM(RegionCustomerResourcesVM VM) {
        this.VM = VM;
        return this;
    }

    /**
     * set Volume
     * @param Volume 磁盘
     * @return this
     */
    public RegionCustomerResourcesResources withVolume(RegionCustomerResourcesVolume Volume) {
        this.Volume = Volume;
        return this;
    }

    /**
     * set VPC
     * @param VPC VPC
     * @return this
     */
    public RegionCustomerResourcesResources withVPC(RegionCustomerResourcesVPC VPC) {
        this.VPC = VPC;
        return this;
    }

    /**
     * set BMS
     * @param BMS 物理机
     * @return this
     */
    public RegionCustomerResourcesResources withBMS(RegionCustomerResourcesBMS BMS) {
        this.BMS = BMS;
        return this;
    }

    /**
     * set NAT
     * @param NAT NAT
     * @return this
     */
    public RegionCustomerResourcesResources withNAT(RegionCustomerResourcesNAT NAT) {
        this.NAT = NAT;
        return this;
    }

    /**
     * set SNAPSHOT
     * @param SNAPSHOT 云主机快照
     * @return this
     */
    public RegionCustomerResourcesResources withSNAPSHOT(RegionCustomerResourcesSNAPSHOT SNAPSHOT) {
        this.SNAPSHOT = SNAPSHOT;
        return this;
    }

    /**
     * set ACLLIST
     * @param ACLLIST ACL
     * @return this
     */
    public RegionCustomerResourcesResources withACLLIST(RegionCustomerResourcesACLLIST ACLLIST) {
        this.ACLLIST = ACLLIST;
        return this;
    }

    /**
     * set IMAGE
     * @param IMAGE 私有镜像
     * @return this
     */
    public RegionCustomerResourcesResources withIMAGE(RegionCustomerResourcesIMAGE IMAGE) {
        this.IMAGE = IMAGE;
        return this;
    }

    /**
     * set LOADBALANCER
     * @param LOADBALANCER 负载均衡
     * @return this
     */
    public RegionCustomerResourcesResources withLOADBALANCER(RegionCustomerResourcesLOADBALANCER LOADBALANCER) {
        this.LOADBALANCER = LOADBALANCER;
        return this;
    }

    /**
     * set CBR
     * @param CBR 云主机备份
     * @return this
     */
    public RegionCustomerResourcesResources withCBR(RegionCustomerResourcesCBR CBR) {
        this.CBR = CBR;
        return this;
    }

    /**
     * set CERT
     * @param CERT 负载均衡证书
     * @return this
     */
    public RegionCustomerResourcesResources withCERT(RegionCustomerResourcesCERT CERT) {
        this.CERT = CERT;
        return this;
    }

    public RegionCustomerResourcesVM getVM() {
        return VM;
    }

    public void setVM(RegionCustomerResourcesVM VM) {
        this.VM = VM;
    }

    public RegionCustomerResourcesVolume getVolume() {
        return Volume;
    }

    public void setVolume(RegionCustomerResourcesVolume Volume) {
        this.Volume = Volume;
    }

    public RegionCustomerResourcesVPC getVPC() {
        return VPC;
    }

    public void setVPC(RegionCustomerResourcesVPC VPC) {
        this.VPC = VPC;
    }

    public RegionCustomerResourcesBMS getBMS() {
        return BMS;
    }

    public void setBMS(RegionCustomerResourcesBMS BMS) {
        this.BMS = BMS;
    }

    public RegionCustomerResourcesNAT getNAT() {
        return NAT;
    }

    public void setNAT(RegionCustomerResourcesNAT NAT) {
        this.NAT = NAT;
    }

    public RegionCustomerResourcesSNAPSHOT getSNAPSHOT() {
        return SNAPSHOT;
    }

    public void setSNAPSHOT(RegionCustomerResourcesSNAPSHOT SNAPSHOT) {
        this.SNAPSHOT = SNAPSHOT;
    }

    public RegionCustomerResourcesACLLIST getACLLIST() {
        return ACLLIST;
    }

    public void setACLLIST(RegionCustomerResourcesACLLIST ACLLIST) {
        this.ACLLIST = ACLLIST;
    }

    public RegionCustomerResourcesIMAGE getIMAGE() {
        return IMAGE;
    }

    public void setIMAGE(RegionCustomerResourcesIMAGE IMAGE) {
        this.IMAGE = IMAGE;
    }

    public RegionCustomerResourcesLOADBALANCER getLOADBALANCER() {
        return LOADBALANCER;
    }

    public void setLOADBALANCER(RegionCustomerResourcesLOADBALANCER LOADBALANCER) {
        this.LOADBALANCER = LOADBALANCER;
    }

    public RegionCustomerResourcesCBR getCBR() {
        return CBR;
    }

    public void setCBR(RegionCustomerResourcesCBR CBR) {
        this.CBR = CBR;
    }

    public RegionCustomerResourcesCERT getCERT() {
        return CERT;
    }

    public void setCERT(RegionCustomerResourcesCERT CERT) {
        this.CERT = CERT;
    }
}
