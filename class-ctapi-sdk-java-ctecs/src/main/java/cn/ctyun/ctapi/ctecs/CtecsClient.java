package cn.ctyun.ctapi.ctecs;

import cn.ctyun.ctapi.CTClient;
import cn.ctyun.ctapi.CTResponse;
import cn.ctyun.ctapi.ctecs.ecsvncshow.*;
import cn.ctyun.ctapi.ctecs.ecspasswordupdate.*;
import cn.ctyun.ctapi.ctecs.ecsdisklist.*;
import cn.ctyun.ctapi.ctecs.ecsstart.*;
import cn.ctyun.ctapi.ctecs.ecsstop.*;
import cn.ctyun.ctapi.ctecs.ecsreboot.*;
import cn.ctyun.ctapi.ctecs.ecsaffinitygroupcreate.*;
import cn.ctyun.ctapi.ctecs.ecsaffinitygroupdelete.*;
import cn.ctyun.ctapi.ctecs.ecsaffinitygrouplist.*;
import cn.ctyun.ctapi.ctecs.ecsinstancelist.*;
import cn.ctyun.ctapi.ctecs.ecsattachshareinterface.*;
import cn.ctyun.ctapi.ctecs.ecsbatchstart.*;
import cn.ctyun.ctapi.ctecs.ecsbatchstop.*;
import cn.ctyun.ctapi.ctecs.ecsbatchreboot.*;
import cn.ctyun.ctapi.ctecs.ecsstatuslist.*;
import cn.ctyun.ctapi.ctecs.ecsupdate.*;
import cn.ctyun.ctapi.ctecs.ecsaffinitygroupupdate.*;
import cn.ctyun.ctapi.ctecs.ecsdetails.*;
import cn.ctyun.ctapi.ctecs.ecsmigratetime.*;
import cn.ctyun.ctapi.ctecs.ecsmaintainstatus.*;
import cn.ctyun.ctapi.ctecs.ecsdescriberegions.*;
import cn.ctyun.ctapi.ctecs.ecsdescribeavailabilityzones.*;
import cn.ctyun.ctapi.ctecs.ecsportslist.*;
import cn.ctyun.ctapi.ctecs.ecsportsshow.*;
import cn.ctyun.ctapi.ctecs.ecsportscreate.*;
import cn.ctyun.ctapi.ctecs.ecsportsdelete.*;
import cn.ctyun.ctapi.ctecs.ecsportsupdate.*;
import cn.ctyun.ctapi.ctecs.ecsportsassignsecondaryprivateips.*;
import cn.ctyun.ctapi.ctecs.ecsportsunassignsecondaryprivateips.*;
import cn.ctyun.ctapi.ctecs.ecsportsassignipv6.*;
import cn.ctyun.ctapi.ctecs.ecsportsunassignipv6.*;
import cn.ctyun.ctapi.ctecs.ecsportsattach.*;
import cn.ctyun.ctapi.ctecs.ecsportsdetach.*;
import cn.ctyun.ctapi.ctecs.ecsaffinitygroupbindone.*;
import cn.ctyun.ctapi.ctecs.ecsaffinitygroupunbindone.*;
import cn.ctyun.ctapi.ctecs.ecstypefamilies.*;
import cn.ctyun.ctapi.ctecs.ecsuserdata.*;
import cn.ctyun.ctapi.ctecs.ecsvolumecreate.*;
import cn.ctyun.ctapi.ctecs.ecsvolumedelete.*;
import cn.ctyun.ctapi.ctecs.ecsvolumeupdate.*;
import cn.ctyun.ctapi.ctecs.ecsvolumeattach.*;
import cn.ctyun.ctapi.ctecs.ecsvolumedetach.*;
import cn.ctyun.ctapi.ctecs.ecsvolumeshow.*;
import cn.ctyun.ctapi.ctecs.ecsvolumeextend.*;
import cn.ctyun.ctapi.ctecs.ecsqueryasyncresult.*;
import cn.ctyun.ctapi.ctecs.ecsqueryasyncresults.*;
import cn.ctyun.ctapi.ctecs.ecsbatchnew.*;
import cn.ctyun.ctapi.ctecs.ecsbatchdelete.*;
import cn.ctyun.ctapi.ctecs.ecskeypaircreate.*;
import cn.ctyun.ctapi.ctecs.ecskeypairimport.*;
import cn.ctyun.ctapi.ctecs.ecsbackupcreate.*;
import cn.ctyun.ctapi.ctecs.ecsfixiplist.*;
import cn.ctyun.ctapi.ctecs.ecsvpccreatesecuritygroup.*;
import cn.ctyun.ctapi.ctecs.ecsvpcquerysecuritygroups.*;
import cn.ctyun.ctapi.ctecs.ecsvpcdeletesecuritygroup.*;
import cn.ctyun.ctapi.ctecs.ecsvpccreatesecuritygroupingress.*;
import cn.ctyun.ctapi.ctecs.ecsvpccreatesecuritygroupegress.*;
import cn.ctyun.ctapi.ctecs.ecsvpcmodifysecuritygroupingress.*;
import cn.ctyun.ctapi.ctecs.ecsvpcmodifysecuritygroupegress.*;
import cn.ctyun.ctapi.ctecs.ecsvpcrevokesecuritygroupingress.*;
import cn.ctyun.ctapi.ctecs.ecsvpcrevokesecurityggroupegress.*;
import cn.ctyun.ctapi.ctecs.ecsvpcjoinsecuritygroup.*;
import cn.ctyun.ctapi.ctecs.ecsvpcleavesecuritygroup.*;
import cn.ctyun.ctapi.ctecs.ecsvpcdescribesecuritygroupattribute.*;
import cn.ctyun.ctapi.ctecs.ecsrebuild.*;
import cn.ctyun.ctapi.ctecs.ecsflavornetworkupdate.*;
import cn.ctyun.ctapi.ctecs.ecsnetworkspecupdate.*;
import cn.ctyun.ctapi.ctecs.ecstypelist.*;
import cn.ctyun.ctapi.ctecs.ecskeypairdetach.*;
import cn.ctyun.ctapi.ctecs.ecskeypairdescribe.*;
import cn.ctyun.ctapi.ctecs.ecskeypairdelete.*;
import cn.ctyun.ctapi.ctecs.ecssnapshotcreate.*;
import cn.ctyun.ctapi.ctecs.ecssnapshotdelete.*;
import cn.ctyun.ctapi.ctecs.ecskeypairattach.*;
import cn.ctyun.ctapi.ctecs.ecssnapshotlist.*;
import cn.ctyun.ctapi.ctecs.ecssnapshotdetails.*;
import cn.ctyun.ctapi.ctecs.ecssnapshotrestore.*;
import cn.ctyun.ctapi.ctecs.ecsbackupdetails.*;
import cn.ctyun.ctapi.ctecs.ecsbackupdelete.*;
import cn.ctyun.ctapi.ctecs.ecsbackuprestore.*;
import cn.ctyun.ctapi.ctecs.ecsbackupupdate.*;
import cn.ctyun.ctapi.ctecs.ecsbackupusage.*;
import cn.ctyun.ctapi.ctecs.ecsbackupstatus.*;
import cn.ctyun.ctapi.ctecs.ecsbackuplist.*;
import cn.ctyun.ctapi.ctecs.ecscreate.*;
import cn.ctyun.ctapi.ctecs.ecsunsubscribe.*;
import cn.ctyun.ctapi.ctecs.ecsresubscribe.*;
import cn.ctyun.ctapi.ctecs.ecsresize.*;
import cn.ctyun.ctapi.ctecs.ecsmetadataget.*;
import cn.ctyun.ctapi.ctecs.ecsmetadatacreate.*;
import cn.ctyun.ctapi.ctecs.ecsmetadataupdate.*;
import cn.ctyun.ctapi.ctecs.ecsmetadatadelete.*;
import cn.ctyun.ctapi.ctecs.regionlist.*;
import cn.ctyun.ctapi.ctecs.regionproducts.*;
import cn.ctyun.ctapi.ctecs.regionzones.*;
import cn.ctyun.ctapi.ctecs.oldregioncheckdemand.*;
import cn.ctyun.ctapi.ctecs.regionsummary.*;
import cn.ctyun.ctapi.ctecs.jobinfo.*;
import cn.ctyun.ctapi.ctecs.neworderprice.*;
import cn.ctyun.ctapi.ctecs.reneworderprice.*;
import cn.ctyun.ctapi.ctecs.upgradeorderprice.*;
import cn.ctyun.ctapi.ctecs.ecsbatchrebuild.*;
import cn.ctyun.ctapi.ctecs.ecsmetadatabatchdelete.*;
import cn.ctyun.ctapi.ctecs.ecsnetworklatestmetricdata.*;
import cn.ctyun.ctapi.ctecs.ecscpuhistorymetricdata.*;
import cn.ctyun.ctapi.ctecs.ecsmemhistorymetricdata.*;
import cn.ctyun.ctapi.ctecs.ecsdiskhistorymetricdata.*;
import cn.ctyun.ctapi.ctecs.ecsnetworkhistorymetricdata.*;
import cn.ctyun.ctapi.ctecs.ecssnapshotupdate.*;
import cn.ctyun.ctapi.ctecs.ecssnapshotstatus.*;
import cn.ctyun.ctapi.ctecs.ecsquerysnapshot.*;
import cn.ctyun.ctapi.ctecs.ecsaffinitygroupbindcheck.*;
import cn.ctyun.ctapi.ctecs.ecssnapshotbatchupdate.*;
import cn.ctyun.ctapi.ctecs.ecsaffinitygroupecslist.*;
import cn.ctyun.ctapi.ctecs.ecsbatchpasswordupdate.*;
import cn.ctyun.ctapi.ctecs.ecsbackupbatchupdate.*;
import cn.ctyun.ctapi.ctecs.orderqueryuuid.*;
import cn.ctyun.ctapi.ctecs.deleterepo.*;
import cn.ctyun.ctapi.ctecs.renewrepo.*;
import cn.ctyun.ctapi.ctecs.listrepo.*;
import cn.ctyun.ctapi.ctecs.createrepo.*;
import cn.ctyun.ctapi.ctecs.upgraderepo.*;
import cn.ctyun.ctapi.ctecs.createbackuppolicy.*;
import cn.ctyun.ctapi.ctecs.deletebackuppolicy.*;
import cn.ctyun.ctapi.ctecs.updatebackuppolicy.*;
import cn.ctyun.ctapi.ctecs.ecsbackup.*;
import cn.ctyun.ctapi.ctecs.backuppolicybindecs.*;
import cn.ctyun.ctapi.ctecs.backuppolicyunbindecs.*;
import cn.ctyun.ctapi.ctecs.backuppolicybindrepo.*;
import cn.ctyun.ctapi.ctecs.backuppolicyunbindrepo.*;
import cn.ctyun.ctapi.ctecs.listbackuppolicy.*;
import cn.ctyun.ctapi.ctecs.ordernewqueryprice.*;
import cn.ctyun.ctapi.ctecs.orderrenewqueryprice.*;
import cn.ctyun.ctapi.ctecs.orderupgradequeryprice.*;
import cn.ctyun.ctapi.ctecs.regioncheckdemand.*;
import cn.ctyun.ctapi.ctecs.oplogquery.*;
import cn.ctyun.ctapi.ctecs.regioncustomerquotas.*;
import cn.ctyun.ctapi.ctecs.regioncustomerresources.*;
import cn.ctyun.ctapi.ctecs.queryresizeflavor.*;
import cn.ctyun.ctapi.ctecs.backuppolicylistinstances.*;
import cn.ctyun.ctapi.ctecs.snapshotcreateinstance.*;
import cn.ctyun.ctapi.ctecs.backupcreateinstance.*;
import cn.ctyun.ctapi.ctecs.cloneinstance.*;
import cn.ctyun.ctapi.ctecs.createinstance.*;
import cn.ctyun.ctapi.ctecs.batchcreateinstances.*;
import cn.ctyun.ctapi.ctecs.resubscribeinstance.*;
import cn.ctyun.ctapi.ctecs.unsubscribeinstance.*;
import cn.ctyun.ctapi.ctecs.updateinstance.*;
import cn.ctyun.ctapi.ctecs.batchupdateinstances.*;
import cn.ctyun.ctapi.ctecs.resetpassword.*;
import cn.ctyun.ctapi.ctecs.batchresetpassword.*;
import cn.ctyun.ctapi.ctecs.vncdetails.*;
import cn.ctyun.ctapi.ctecs.volumelist.*;
import cn.ctyun.ctapi.ctecs.volumestatistics.*;
import cn.ctyun.ctapi.ctecs.updateinstancespec.*;
import cn.ctyun.ctapi.ctecs.updateflavorspec.*;
import cn.ctyun.ctapi.ctecs.shareinterfaceattach.*;
import cn.ctyun.ctapi.ctecs.updatenetworkspec.*;
import cn.ctyun.ctapi.ctecs.startinstance.*;
import cn.ctyun.ctapi.ctecs.stopinstance.*;
import cn.ctyun.ctapi.ctecs.rebootinstance.*;
import cn.ctyun.ctapi.ctecs.rebuildinstance.*;
import cn.ctyun.ctapi.ctecs.batchstartinstance.*;
import cn.ctyun.ctapi.ctecs.batchstopinstance.*;
import cn.ctyun.ctapi.ctecs.batchrebootinstance.*;
import cn.ctyun.ctapi.ctecs.batchrebuildinstance.*;
import cn.ctyun.ctapi.ctecs.fixediplist.*;
import cn.ctyun.ctapi.ctecs.instancestatuslist.*;
import cn.ctyun.ctapi.ctecs.listinstances.*;
import cn.ctyun.ctapi.ctecs.instancedetails.*;
import cn.ctyun.ctapi.ctecs.userdatadetails.*;
import cn.ctyun.ctapi.ctecs.affinitygroupbindvmcheck.*;
import cn.ctyun.ctapi.ctecs.affinitygroupunbindvm.*;
import cn.ctyun.ctapi.ctecs.availabilityzonesdetails.*;
import cn.ctyun.ctapi.ctecs.affinitygroupbindvm.*;
import cn.ctyun.ctapi.ctecs.affinitygroupccreate.*;
import cn.ctyun.ctapi.ctecs.metadatadetails.*;
import cn.ctyun.ctapi.ctecs.affinitygrouplistvm.*;
import cn.ctyun.ctapi.ctecs.affinitygroupdetails.*;
import cn.ctyun.ctapi.ctecs.updatemetadata.*;
import cn.ctyun.ctapi.ctecs.deletemetadata.*;
import cn.ctyun.ctapi.ctecs.affinitygrouplist.*;
import cn.ctyun.ctapi.ctecs.listinstancebyflavorfamilies.*;
import cn.ctyun.ctapi.ctecs.listflavorfamilies.*;
import cn.ctyun.ctapi.ctecs.listflavor.*;
import cn.ctyun.ctapi.ctecs.backupstatistics.*;
import cn.ctyun.ctapi.ctecs.backupvmdetails.*;
import cn.ctyun.ctapi.ctecs.backupcreate.*;
import cn.ctyun.ctapi.ctecs.backupbatchupdate.*;
import cn.ctyun.ctapi.ctecs.backupupdate.*;
import cn.ctyun.ctapi.ctecs.keypairdetachinstance.*;
import cn.ctyun.ctapi.ctecs.keypairattachinstance.*;
import cn.ctyun.ctapi.ctecs.keypairdetails.*;
import cn.ctyun.ctapi.ctecs.backupstatus.*;
import cn.ctyun.ctapi.ctecs.keypaircreate.*;
import cn.ctyun.ctapi.ctecs.keypairimport.*;
import cn.ctyun.ctapi.ctecs.snapshotdetails.*;
import cn.ctyun.ctapi.ctecs.snapshotstatus.*;
import cn.ctyun.ctapi.ctecs.snapshotcount.*;
import cn.ctyun.ctapi.ctecs.instancesnapshotlist.*;
import cn.ctyun.ctapi.ctecs.snapshotbatchupdate.*;
import cn.ctyun.ctapi.ctecs.snapshotupdate.*;
import cn.ctyun.ctapi.ctecs.snapshotcreate.*;
import cn.ctyun.ctapi.ctecs.backupdetails.*;
import cn.ctyun.ctapi.ctecs.backuplist.*;
import cn.ctyun.ctapi.ctecs.createmetadata.*;
import cn.ctyun.ctapi.ctecs.descibeinstances.*;
import cn.ctyun.ctapi.ctecs.jobquery.*;
import cn.ctyun.ctapi.ctecs.snapshotpolicyupdate.*;
import cn.ctyun.ctapi.ctecs.snapshotpolicydisable.*;
import cn.ctyun.ctapi.ctecs.snapshotpolicycreate.*;
import cn.ctyun.ctapi.ctecs.snapshotpolicyenable.*;
import cn.ctyun.ctapi.ctecs.snapshotpolicybindinstances.*;
import cn.ctyun.ctapi.ctecs.snapshotpolicyunbindinstances.*;
import cn.ctyun.ctapi.ctecs.snapshotpolicytasklist.*;
import cn.ctyun.ctapi.ctecs.snapshotpolicylist.*;
import cn.ctyun.ctapi.ctecs.snapshotpolicydetails.*;
import cn.ctyun.ctapi.ctecs.snapshotpolicyinstancelist.*;
import cn.ctyun.ctapi.ctecs.snapshotpolicyexecute.*;
import cn.ctyun.ctapi.ctecs.ecsorderqueryuuid.*;
import cn.ctyun.ctapi.ctecs.snapshotpolicydelete.*;
import cn.ctyun.ctapi.ctecs.getcustomerresources.*;
import cn.ctyun.ctapi.ctecs.getcustomerquotas.*;
import cn.ctyun.ctapi.ctecs.getorderuuid.*;
import cn.ctyun.ctapi.ctecs.volumecreate.*;
import cn.ctyun.ctapi.ctecs.volumeupdate.*;
import cn.ctyun.ctapi.ctecs.ecslitecreate.*;
import cn.ctyun.ctapi.ctecs.ecslitelist.*;
import cn.ctyun.ctapi.ctecs.ecslitedetails.*;
import cn.ctyun.ctapi.ctecs.ecsliteresubscribe.*;
import cn.ctyun.ctapi.ctecs.ecsliteunsubscribe.*;
import cn.ctyun.ctapi.ctecs.ecslitevncdetails.*;
import cn.ctyun.ctapi.ctecs.ecslitestart.*;
import cn.ctyun.ctapi.ctecs.ecslitestop.*;
import cn.ctyun.ctapi.ctecs.ecslitereboot.*;
import cn.ctyun.ctapi.ctecs.ecsliteresetpassword.*;
import cn.ctyun.ctapi.ctecs.ecsliteupdatespec.*;
import cn.ctyun.ctapi.ctecs.volumedetach.*;
import cn.ctyun.ctapi.ctecs.volumeextend.*;
import cn.ctyun.ctapi.ctecs.volumeattach.*;
import cn.ctyun.ctapi.ctecs.volumedelete.*;
import cn.ctyun.ctapi.ctecs.ecsliteflavorlist.*;
import cn.ctyun.ctapi.ctecs.volumeshow.*;
import cn.ctyun.ctapi.ctecs.ecssnapshotstatistics.*;
import cn.ctyun.ctapi.ctecs.liveresizeflavorlist.*;
import cn.ctyun.ctapi.ctecs.livereiszeinstance.*;
import cn.ctyun.ctapi.ctecs.ecsagentbatchaction.*;
import cn.ctyun.ctapi.ctecs.ecsagentbatchdetails.*;
import cn.ctyun.ctapi.ctecs.ecsagentbatchresults.*;
import cn.ctyun.ctapi.ctecs.updatedeletionprotection.*;
import cn.ctyun.ctapi.ctecs.sfsvmslist.*;
import cn.ctyun.ctapi.ctecs.ecssfslist.*;
import cn.ctyun.ctapi.ctecs.ecssfsattach.*;
import cn.ctyun.ctapi.ctecs.ecssfsdetach.*;
import cn.ctyun.ctapi.ctecs.ecsaffinitygroupunbindinstances.*;
import cn.ctyun.ctapi.ctecs.ecsshelveinstance.*;
import cn.ctyun.ctapi.ctecs.ecsbatchshelveinstances.*;
import cn.ctyun.ctapi.ctecs.ecsgpudriverlist.*;

public class CtecsClient extends CTClient {
    /**
     * 一类节点-*-云主机ctecs-查询一台云主机的Web管理终端地址
     * 查询一台云主机的Web管理终端地址。
     */
    public CTResponse<EcsVncShowResponseData> ecsVncShow(EcsVncShowRequest request) {
        return request(request, EcsVncShowResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-更新云主机密码
     * 更新云主机的密码,此接口为同步接口。
     */
    public CTResponse<EcsPasswordUpdateResponseData> ecsPasswordUpdate(EcsPasswordUpdateRequest request) {
        return request(request, EcsPasswordUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机的云硬盘列表
     * 查询云主机的云硬盘列表。
     */
    public CTResponse<EcsDiskListResponseData> ecsDiskList(EcsDiskListRequest request) {
        return request(request, EcsDiskListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-开启一台云主机
     * 该接口提供用户开启一台云主机功能。
     */
    public CTResponse<EcsStartResponseData> ecsStart(EcsStartRequest request) {
        return request(request, EcsStartResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-关闭一台云主机
     * 该接口提供用户关闭一台云主机功能。
     */
    public CTResponse<EcsStopResponseData> ecsStop(EcsStopRequest request) {
        return request(request, EcsStopResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-重启一台云主机
     * 该接口提供用户重启一台云主机功能。
     */
    public CTResponse<EcsRebootResponseData> ecsReboot(EcsRebootRequest request) {
        return request(request, EcsRebootResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建云主机组
     * 创建云主机组
     */
    public CTResponse<EcsAffinityGroupCreateResponseData> ecsAffinityGroupCreate(EcsAffinityGroupCreateRequest request) {
        return request(request, EcsAffinityGroupCreateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-删除云主机组
     * 该接口提供用户删除云主机组的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsAffinityGroupDeleteResponseData> ecsAffinityGroupDelete(EcsAffinityGroupDeleteRequest request) {
        return request(request, EcsAffinityGroupDeleteResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机组列表或者详情
     * 查询云主机组列表或者详情
     */
    public CTResponse<EcsAffinityGroupListResponseData> ecsAffinityGroupList(EcsAffinityGroupListRequest request) {
        return request(request, EcsAffinityGroupListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机列表
     * 该接口提供用户多台云主机信息查询功能，用户可以根据此接口的返回值得到多台云主机的部分信息。
     */
    public CTResponse<EcsInstanceListResponseData> ecsInstanceList(EcsInstanceListRequest request) {
        return request(request, EcsInstanceListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机添加共享网卡
     * 给云主机添加共享网卡
     */
    public CTResponse<EcsAttachShareInterfaceResponseData> ecsAttachShareInterface(EcsAttachShareInterfaceRequest request) {
        return request(request, EcsAttachShareInterfaceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-开启多台云主机
     * 该接口提供用户开启多台云主机功能。
     */
    public CTResponse<EcsBatchStartResponseData> ecsBatchStart(EcsBatchStartRequest request) {
        return request(request, EcsBatchStartResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-关闭多台云主机
     * 该接口提供用户关闭多台云主机功能。
     */
    public CTResponse<EcsBatchStopResponseData> ecsBatchStop(EcsBatchStopRequest request) {
        return request(request, EcsBatchStopResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-重启多台云主机
     * 该接口提供用户重启多台云主机功能。
     */
    public CTResponse<EcsBatchRebootResponseData> ecsBatchReboot(EcsBatchRebootRequest request) {
        return request(request, EcsBatchRebootResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-获取多台云主机的状态信息
     * 该接口提供用户多台云主机状态信息查询功能，用户可以根据此接口的返回值得到多台云主机的状态信息。
     */
    public CTResponse<EcsStatusListResponseData> ecsStatusList(EcsStatusListRequest request) {
        return request(request, EcsStatusListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-更新云主机的部分信息
     * 更新云主机的部分信息
     */
    public CTResponse<EcsUpdateResponseData> ecsUpdate(EcsUpdateRequest request) {
        return request(request, EcsUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-更新云主机组信息
     * 该接口提供用户更新云主机组的部分信息的功能<br />当前支持更新云主机组的信息：云主机组名称（affinityGroupName）<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsAffinityGroupUpdateResponseData> ecsAffinityGroupUpdate(EcsAffinityGroupUpdateRequest request) {
        return request(request, EcsAffinityGroupUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询一台或多台云主机详细信息
     * 该接口提供用户一台或多台云主机信息查询功能，用户可以根据此接口的返回值了解自己云主机的详细信息。
     */
    public CTResponse<EcsDetailsResponseData> ecsDetails(EcsDetailsRequest request) {
        return request(request, EcsDetailsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-获取云主机迁移时间预估
     * 获取云主机的迁移时间预估接口，计算其热迁移所需时间，仅限于ACTIVE状态的云主机。
     */
    public CTResponse<EcsMigrateTimeResponseData> ecsMigrateTime(EcsMigrateTimeRequest request) {
        return request(request, EcsMigrateTimeResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-获取云主机维护属性
     * 获取云主机的维护属性
     */
    public CTResponse<EcsMaintainStatusResponseData> ecsMaintainStatus(EcsMaintainStatusRequest request) {
        return request(request, EcsMaintainStatusResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询账户启用的资源池信息
     * 查询账户启用的资源池信息
     */
    public CTResponse<EcsDescribeRegionsResponseData> ecsDescribeRegions(EcsDescribeRegionsRequest request) {
        return request(request, EcsDescribeRegionsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询账户资源池下可用区信息
     * 查询账户指定资源池中可用区的信息。
     */
    public CTResponse<EcsDescribeAvailabilityZonesResponseData> ecsDescribeAvailabilityZones(EcsDescribeAvailabilityZonesRequest request) {
        return request(request, EcsDescribeAvailabilityZonesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询网卡列表
     * 查询虚拟网卡列表<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<EcsPortsListResponseData> ecsPortsList(EcsPortsListRequest request) {
        return request(request, EcsPortsListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询网卡信息
     * 查询网卡信息<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<EcsPortsShowResponseData> ecsPortsShow(EcsPortsShowRequest request) {
        return request(request, EcsPortsShowResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建弹性网卡
     * 创建弹性网卡<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<EcsPortsCreateResponseData> ecsPortsCreate(EcsPortsCreateRequest request) {
        return request(request, EcsPortsCreateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-删除弹性网卡
     * 删除弹性网卡<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<EcsPortsDeleteResponseData> ecsPortsDelete(EcsPortsDeleteRequest request) {
        return request(request, EcsPortsDeleteResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-修改网卡属性
     * 修改网卡属性<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<EcsPortsUpdateResponseData> ecsPortsUpdate(EcsPortsUpdateRequest request) {
        return request(request, EcsPortsUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-网卡关联辅助私网Ips
     * null
     */
    public CTResponse<EcsPortsAssignSecondaryPrivateIpsResponseData> ecsPortsAssignSecondaryPrivateIps(EcsPortsAssignSecondaryPrivateIpsRequest request) {
        return request(request, EcsPortsAssignSecondaryPrivateIpsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-网卡解绑辅助私网IPs
     * 网卡解绑辅助私网IPs<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<EcsPortsUnassignSecondaryPrivateIpsResponseData> ecsPortsUnassignSecondaryPrivateIps(EcsPortsUnassignSecondaryPrivateIpsRequest request) {
        return request(request, EcsPortsUnassignSecondaryPrivateIpsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-网卡关联多个IPv6地址
     * 网卡关联多个IPv6地址<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<EcsPortsAssignIpv6ResponseData> ecsPortsAssignIpv6(EcsPortsAssignIpv6Request request) {
        return request(request, EcsPortsAssignIpv6ResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-网卡解绑多个IPv6地址
     * 网卡解绑多个IPv6地址<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<EcsPortsUnassignIpv6ResponseData> ecsPortsUnassignIpv6(EcsPortsUnassignIpv6Request request) {
        return request(request, EcsPortsUnassignIpv6ResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-网卡绑定云主机
     * null
     */
    public CTResponse<EcsPortsAttachResponseData> ecsPortsAttach(EcsPortsAttachRequest request) {
        return request(request, EcsPortsAttachResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-网卡解绑云主机
     * 网卡解绑实例<br /><b>准备工作</b>：<br />      &emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />      &emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<EcsPortsDetachResponseData> ecsPortsDetach(EcsPortsDetachRequest request) {
        return request(request, EcsPortsDetachResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机组中添加单台云主机
     * 可以根据用户给定的云主机与云主机组，将云主机添加进云主机组
     */
    public CTResponse<EcsAffinityGroupBindOneResponseData> ecsAffinityGroupBindOne(EcsAffinityGroupBindOneRequest request) {
        return request(request, EcsAffinityGroupBindOneResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机组中删除单台云主机
     * 可以根据用户给定的云主机与云主机组，将云主机移除出云主机组
     */
    public CTResponse<EcsAffinityGroupUnbindOneResponseData> ecsAffinityGroupUnbindOne(EcsAffinityGroupUnbindOneRequest request) {
        return request(request, EcsAffinityGroupUnbindOneResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机规格族列表
     * 该接口提供用户可用规格族列表查询功能，每种规格族代表不同种类的云主机规格，用户可以根据此接口的返回值了解自己可使用的规格族有哪些。
     规格族说明如下：
     云主机-二代机：X86云主机,包含通用型s2、内存优化型m2。s2、m2实例规格簇均为cpu共享型，上线时间较早。
     云主机-三代机：X86云主机,包含通用型S3、计算增强型c3、内存优化型m3。S3实例规格簇为cpu共享型，c3、m3实例规格簇为cpu独享,软硬件升级，性能增强。
     云主机-六代机：X86云主机,包含通用型s6、通用计算增强c6、内存优化型m6。S6实例规格簇为cpu共享型，c6、m6实例规格簇为cpu独享,性能优良，能承载不同业务需求。
     云主机-七代机：X86云主机,包含通用型s7、通用计算增强c7、内存优化型m7。通用型S7实例规格簇为cpu共享型，c7、m7实例规格簇为cpu独享,提供更大规格更优性能，能满足更高业务需要。
     国产化云主机：X86与ARM云主机,包含鲲鹏计算增强型kc1、海光计算增强型hc1、飞腾计算增强型fc1、鲲鹏内存优化型km1、海光内存优化型hm1、飞腾内存优化型fm1，对安全性有较高要求的政府或企业应用。
     本地盘云主机：X86云主机，包含云主机规格（ip3），提供数据盘为本地盘的云主机。
     GPU云主机：包含图形加速基础型G5、图形加速基础型G7；计算加速型P2V、计算加速型PI7、计算加速型P8A、计算加速型PS4、计算加速型PI3、计算加速型PI2；图形加速基础型G6、图形加速基础型G7。
     */
    public CTResponse<EcsTypeFamiliesResponseData> ecsTypeFamilies(EcsTypeFamiliesRequest request) {
        return request(request, EcsTypeFamiliesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询一台云主机的自定义数据
     * 根据云主机ID，查询云主机的用户自定义数据。
     */
    public CTResponse<EcsUserdataResponseData> ecsUserdata(EcsUserdataRequest request) {
        return request(request, EcsUserdataResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建一块按量付费或包年包月云硬盘
     * 支持创建一块按量付费或包年包月云硬盘
     */
    public CTResponse<EcsVolumeCreateResponseData> ecsVolumeCreate(EcsVolumeCreateRequest request) {
        return request(request, EcsVolumeCreateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-释放一块按量付费云硬盘
     * 释放云硬盘
     */
    public CTResponse<EcsVolumeDeleteResponseData> ecsVolumeDelete(EcsVolumeDeleteRequest request) {
        return request(request, EcsVolumeDeleteResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-修改云硬盘属性
     * 支持修改云硬盘的名称
     */
    public CTResponse<EcsVolumeUpdateResponseData> ecsVolumeUpdate(EcsVolumeUpdateRequest request) {
        return request(request, EcsVolumeUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-为云主机挂载云硬盘
     * 支持云主机挂载云硬盘
     */
    public CTResponse<EcsVolumeAttachResponseData> ecsVolumeAttach(EcsVolumeAttachRequest request) {
        return request(request, EcsVolumeAttachResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-卸载按量付费云硬盘
     * 支持云主机卸载云硬盘
     */
    public CTResponse<EcsVolumeDetachResponseData> ecsVolumeDetach(EcsVolumeDetachRequest request) {
        return request(request, EcsVolumeDetachResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询已将创建好的云硬盘
     * 根据卷的id查询卷的详情
     */
    public CTResponse<EcsVolumeShowResponseData> ecsVolumeShow(EcsVolumeShowRequest request) {
        return request(request, EcsVolumeShowResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-扩容云硬盘
     * 支持扩容云硬盘
     */
    public CTResponse<EcsVolumeExtendResponseData> ecsVolumeExtend(EcsVolumeExtendRequest request) {
        return request(request, EcsVolumeExtendResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询一个异步任务的结果
     * 该接口通过一个异步任务的jobID查询任务执行的结果<br/><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br/>&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br/><b>注意事项：</b><br/>&emsp;&emsp;异步任务结果查询：请先通过异步接口得到对应的任务ID（jobID），注：异步任务查询不支持查询订单接口（即涉及付费的接口，如创建云主机）<br/>&emsp;&emsp;单个任务查询：当前接口只能查询单个任务结果，查询同资源池下多个任务结果，请使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9271&data=87">查询多个异步任务的结果</a>来查询
     */
    public CTResponse<EcsQueryAsyncResultResponseData> ecsQueryAsyncResult(EcsQueryAsyncResultRequest request) {
        return request(request, EcsQueryAsyncResultResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-批量查询异步任务的结果
     * 该接口通过一个或多个异步任务的jobID查询任务执行的结果。
     */
    public CTResponse<EcsQueryAsyncResultsResponseData> ecsQueryAsyncResults(EcsQueryAsyncResultsRequest request) {
        return request(request, EcsQueryAsyncResultsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-批量创建按量付费或者包年包月云主机
     * 支持批量创建按量付费或包年包月云主机
     */
    public CTResponse<EcsBatchNewResponseData> ecsBatchNew(EcsBatchNewRequest request) {
        return request(request, EcsBatchNewResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-批量释放云主机
     * 批量释放云主机，对于包周期的云主机为退订，对于按量付费的云主机为删除。<br/><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<b><br />注意事项</b>：<br />&emsp;&emsp;释放前请确保文件已进行备份，释放后不可恢复。在云主机订购时，一起订购的其他资源，比如绑定的网卡、云硬盘、弹性IP等资源，会一起被释放。非一起订购的资源，比如绑定的网卡、云硬盘、弹性IP等资源会被解绑。
     */
    public CTResponse<EcsBatchDeleteResponseData> ecsBatchDelete(EcsBatchDeleteRequest request) {
        return request(request, EcsBatchDeleteResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建一对SSH密钥对
     * 此接口用来创建一对SSH密钥对。系统会为您保管密钥的公钥部分，并返回未加密私钥。您需要自行妥善保管私钥部分。
     */
    public CTResponse<EcsKeypairCreateResponseData> ecsKeypairCreate(EcsKeypairCreateRequest request) {
        return request(request, EcsKeypairCreateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-导入RSA密钥对公钥
     * 导入由其他工具产生的RSA密钥对的公钥部分，密钥对的类型必须是SSH或x509。
     */
    public CTResponse<EcsKeypairImportResponseData> ecsKeypairImport(EcsKeypairImportRequest request) {
        return request(request, EcsKeypairImportResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建云主机备份
     * 创建云主机备份
     */
    public CTResponse<EcsBackupCreateResponseData> ecsBackupCreate(EcsBackupCreateRequest request) {
        return request(request, EcsBackupCreateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机的固定IP列表
     * 根据云主机ID，查询云主机的固定IP。
     */
    public CTResponse<EcsFixIpListResponseData> ecsFixIpList(EcsFixIpListRequest request) {
        return request(request, EcsFixIpListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建安全组
     * 该接口提供用户创建安全组功能<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;企业项目：保证资源隔离，需确保所有资源与云主机处于相同企业项目下才可进行挂载操作，如网络资源：VPC、安全组、弹性IP、子网。请确认安全组是否创建当前企业项目下。
     */
    public CTResponse<EcsVpcCreateSecurityGroupResponseData> ecsVpcCreateSecurityGroup(EcsVpcCreateSecurityGroupRequest request) {
        return request(request, EcsVpcCreateSecurityGroupResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询用户安全组列表
     * 该接口提供用户查询用户安全组列表的功能<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;分页查询：当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />
     */
    public CTResponse<EcsVpcQuerySecurityGroupsResponseData> ecsVpcQuerySecurityGroups(EcsVpcQuerySecurityGroupsRequest request) {
        return request(request, EcsVpcQuerySecurityGroupsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-删除安全组
     * 该接口提供用户删除安全组功能<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;对于删除不存在的安全组，则会返回成功。
     */
    public CTResponse<EcsVpcDeleteSecurityGroupResponseData> ecsVpcDeleteSecurityGroup(EcsVpcDeleteSecurityGroupRequest request) {
        return request(request, EcsVpcDeleteSecurityGroupResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建安全组入向规则
     * 该接口提供用户创建安全组入向规则功能<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;入向规则：direction参数填写”ingress“
     */
    public CTResponse<EcsVpcCreateSecurityGroupIngressResponseData> ecsVpcCreateSecurityGroupIngress(EcsVpcCreateSecurityGroupIngressRequest request) {
        return request(request, EcsVpcCreateSecurityGroupIngressResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建安全组出向规则
     * 该接口提供用户创建安全组出向规则功能<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;出向规则：direction参数填写”egress“
     */
    public CTResponse<EcsVpcCreateSecurityGroupEgressResponseData> ecsVpcCreateSecurityGroupEgress(EcsVpcCreateSecurityGroupEgressRequest request) {
        return request(request, EcsVpcCreateSecurityGroupEgressResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-修改安全组入方向规则描述
     * 该接口提供用户修改安全组入方向规则描述的功能<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsVpcModifySecurityGroupIngressResponseData> ecsVpcModifySecurityGroupIngress(EcsVpcModifySecurityGroupIngressRequest request) {
        return request(request, EcsVpcModifySecurityGroupIngressResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-修改安全组出方向规则描述
     * 该接口提供用户修改安全组出方向规则描述的功能<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsVpcModifySecurityGroupEgressResponseData> ecsVpcModifySecurityGroupEgress(EcsVpcModifySecurityGroupEgressRequest request) {
        return request(request, EcsVpcModifySecurityGroupEgressResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-删除一条入方向安全组规则
     * 该接口提供用户删除一条入方向安全组规则的功能<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;对于删除不存在的安全组规则，则会返回成功。
     */
    public CTResponse<EcsVpcRevokeSecurityGroupIngressResponseData> ecsVpcRevokeSecurityGroupIngress(EcsVpcRevokeSecurityGroupIngressRequest request) {
        return request(request, EcsVpcRevokeSecurityGroupIngressResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-删除一条出方向安全组规则
     * 该接口提供用户删除一条出方向安全组规则的功能<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;对于删除不存在的安全组规则，则会返回成功。
     */
    public CTResponse<EcsVpcRevokeSecurityGgroupEgressResponseData> ecsVpcRevokeSecurityGgroupEgress(EcsVpcRevokeSecurityGgroupEgressRequest request) {
        return request(request, EcsVpcRevokeSecurityGgroupEgressResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-绑定安全组
     * 该接口提供用户云主机绑定安全组功能<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;绑定操作：action参数填写”joinSecurityGroup“；如不填写弹性网卡参数（networkInterfaceID），则默认选择主网卡
     */
    public CTResponse<EcsVpcJoinSecurityGroupResponseData> ecsVpcJoinSecurityGroup(EcsVpcJoinSecurityGroupRequest request) {
        return request(request, EcsVpcJoinSecurityGroupResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-解绑安全组
     * 解绑安全组<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsVpcLeaveSecurityGroupResponseData> ecsVpcLeaveSecurityGroup(EcsVpcLeaveSecurityGroupRequest request) {
        return request(request, EcsVpcLeaveSecurityGroupResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询用户安全组详情
     * 查询云主机快照详情<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsVpcDescribeSecurityGroupAttributeResponseData> ecsVpcDescribeSecurityGroupAttribute(EcsVpcDescribeSecurityGroupAttributeRequest request) {
        return request(request, EcsVpcDescribeSecurityGroupAttributeResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-重装一台云主机
     * 该接口提供用户重装一台云主机功能，通过填写相应云主机ID、镜像ID和密码对云主机进行重装。
     */
    public CTResponse<EcsRebuildResponseData> ecsRebuild(EcsRebuildRequest request) {
        return request(request, EcsRebuildResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机修改带宽或规格
     * 支持对一台已经关机中的云主机进行带宽或规格的变更
     */
    public CTResponse<EcsFlavorNetworkUpdateResponseData> ecsFlavorNetworkUpdate(EcsFlavorNetworkUpdateRequest request) {
        return request(request, EcsFlavorNetworkUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机修改带宽
     * 支持对一台已经关机中的云主机进行带宽变更
     */
    public CTResponse<EcsNetworkSpecUpdateResponseData> ecsNetworkSpecUpdate(EcsNetworkSpecUpdateRequest request) {
        return request(request, EcsNetworkSpecUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询一个或多个云主机规格资源
     * 该接口提供用户可用规格列表查询功能，可返回云主机规格的详细信息，并允许用户根据云主机规格的特殊字段进行筛选。用户可以根据此接口的返回值了解自己可使用的云主机规格有哪些。
     */
    public CTResponse<EcsTypeListResponseData> ecsTypeList(EcsTypeListRequest request) {
        return request(request, EcsTypeListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-为Linux云主机解绑SSH密钥对
     * 为Linux云主机解绑SSH密钥对
     */
    public CTResponse<EcsKeypairDetachResponseData> ecsKeypairDetach(EcsKeypairDetachRequest request) {
        return request(request, EcsKeypairDetachResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询一个或多个密钥对
     * 此接口提供用户查询SSH密钥对功能。系统会接收用户输入的查询条件，并返回符合条件的密钥对详细信息。用户可根据此接口的返回值了解对应条件下的密钥对信息。
     */
    public CTResponse<EcsKeypairDescribeResponseData> ecsKeypairDescribe(EcsKeypairDescribeRequest request) {
        return request(request, EcsKeypairDescribeResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-删除SSH密钥对
     * 此接口供用户用来删除SSH密钥对。系统会根据您输入的SSH密钥对的名称删除对应的密钥对，并返回删除成功信息。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsKeypairDeleteResponseData> ecsKeypairDelete(EcsKeypairDeleteRequest request) {
        return request(request, EcsKeypairDeleteResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建云主机快照
     * 创建云主机快照
     */
    public CTResponse<EcsSnapshotCreateResponseData> ecsSnapshotCreate(EcsSnapshotCreateRequest request) {
        return request(request, EcsSnapshotCreateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-删除云主机快照
     * 删除云主机快照<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsSnapshotDeleteResponseData> ecsSnapshotDelete(EcsSnapshotDeleteRequest request) {
        return request(request, EcsSnapshotDeleteResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-绑定SSH密钥对到云主机
     * 此接口提供用户绑定SSH密钥对到云主机功能。系统会接收用户输入的云主机id和SSH密钥对，将对应SSH密钥对绑定到对应云主机上。
     */
    public CTResponse<EcsKeypairAttachResponseData> ecsKeypairAttach(EcsKeypairAttachRequest request) {
        return request(request, EcsKeypairAttachResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机快照列表
     * 查询云主机快照列表
     */
    public CTResponse<EcsSnapshotListResponseData> ecsSnapshotList(EcsSnapshotListRequest request) {
        return request(request, EcsSnapshotListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机快照详情
     * 查询云主机快照详情
     */
    public CTResponse<EcsSnapshotDetailsResponseData> ecsSnapshotDetails(EcsSnapshotDetailsRequest request) {
        return request(request, EcsSnapshotDetailsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-恢复云主机快照
     * 恢复云主机快照<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsSnapshotRestoreResponseData> ecsSnapshotRestore(EcsSnapshotRestoreRequest request) {
        return request(request, EcsSnapshotRestoreResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机备份详情
     * 查询云主机备份详情
     */
    public CTResponse<EcsBackupDetailsResponseData> ecsBackupDetails(EcsBackupDetailsRequest request) {
        return request(request, EcsBackupDetailsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-删除云主机备份
     * 删除云主机备份<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsBackupDeleteResponseData> ecsBackupDelete(EcsBackupDeleteRequest request) {
        return request(request, EcsBackupDeleteResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-恢复云主机备份
     * 恢复云主机备份到原云主机实例，将使用备份时间点数据覆盖云主机数据，一旦执行无法取消。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsBackupRestoreResponseData> ecsBackupRestore(EcsBackupRestoreRequest request) {
        return request(request, EcsBackupRestoreResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-更新云主机备份信息
     * 更改云主机备份名称和描述
     */
    public CTResponse<EcsBackupUpdateResponseData> ecsBackupUpdate(EcsBackupUpdateRequest request) {
        return request(request, EcsBackupUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查看云主机备份空间占用大小
     * 查看云主机备份空间占用大小<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsBackupUsageResponseData> ecsBackupUsage(EcsBackupUsageRequest request) {
        return request(request, EcsBackupUsageResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机备份状态
     * 查询云主机备份状态
     */
    public CTResponse<EcsBackupStatusResponseData> ecsBackupStatus(EcsBackupStatusRequest request) {
        return request(request, EcsBackupStatusResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机备份列表
     * 查询云主机备份列表
     */
    public CTResponse<EcsBackupListResponseData> ecsBackupList(EcsBackupListRequest request) {
        return request(request, EcsBackupListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建一台按量付费或者包年包月云主机
     * 支持创建一台按量付费或包年包月的云主机
     */
    public CTResponse<EcsCreateResponseData> ecsCreate(EcsCreateRequest request) {
        return request(request, EcsCreateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-释放云主机
     * 释放云主机
     */
    public CTResponse<EcsUnsubscribeResponseData> ecsUnsubscribe(EcsUnsubscribeRequest request) {
        return request(request, EcsUnsubscribeResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-续订一台包周期的云主机
     * 续订一台包年或者包月的云主机。
     */
    public CTResponse<EcsResubscribeResponseData> ecsResubscribe(EcsResubscribeRequest request) {
        return request(request, EcsResubscribeResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机修改规格
     * 支持对一台已经关机中的云主机进行规格变更
     */
    public CTResponse<EcsResizeResponseData> ecsResize(EcsResizeRequest request) {
        return request(request, EcsResizeResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机元数据查询
     * 查询云主机的元数据
     */
    public CTResponse<EcsMetadataGetResponseData> ecsMetadataGet(EcsMetadataGetRequest request) {
        return request(request, EcsMetadataGetResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机元数据创建
     * 为云主机创建元数据
     */
    public CTResponse<EcsMetadataCreateResponseData> ecsMetadataCreate(EcsMetadataCreateRequest request) {
        return request(request, EcsMetadataCreateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机元数据更新
     * 为云主机更新元数据
     */
    public CTResponse<EcsMetadataUpdateResponseData> ecsMetadataUpdate(EcsMetadataUpdateRequest request) {
        return request(request, EcsMetadataUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机元数据删除
     * 删除云主机元数据
     */
    public CTResponse<EcsMetadataDeleteResponseData> ecsMetadataDelete(EcsMetadataDeleteRequest request) {
        return request(request, EcsMetadataDeleteResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-资源池列表查询
     * 查询租户可见的资源池列表。
     */
    public CTResponse<RegionListResponseData> regionList(RegionListRequest request) {
        return request(request, RegionListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-资源池产品信息查询
     * 查询一个资源池支持的云产品信息列表，以及云产品的产品特性信息。
     */
    public CTResponse<RegionProductsResponseData> regionProducts(RegionProductsRequest request) {
        return request(request, RegionProductsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-资源池可用区查询
     * 查询单个资源池的可用区信息
     */
    public CTResponse<RegionZonesResponseData> regionZones(RegionZonesRequest request) {
        return request(request, RegionZonesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-资源池产品可售查询
     * 查询用户可用的某个产品是否可售。产品售罄不可售，产品未售罄看用户当前配额余量是否满足。
     */
    public CTResponse<OldRegionCheckDemandResponseData> oldRegionCheckDemand(OldRegionCheckDemandRequest request) {
        return request(request, OldRegionCheckDemandResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-资源池概况信息查询
     * 查询资源池概况，比如地域，多az信息，支持的cpu架构，资源池占用类型，资源池版本信息等
     */
    public CTResponse<RegionSummaryResponseData> regionSummary(RegionSummaryRequest request) {
        return request(request, RegionSummaryResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询异步任务状态
     * 查看异步任务job任务状态等
     */
    public CTResponse<JobInfoResponseData> jobInfo(JobInfoRequest request) {
        return request(request, JobInfoResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-下单询价
     * 购买云产品时询价接口，支持云主机、云硬盘、弹性公网IP、NAT网关、共享带宽、物理机、性能保障型负载均衡、云主机备份存储库和云硬盘备份存储库产品的包年/包月或按量订单的询价功能
     */
    public CTResponse<NewOrderPriceResponseData> newOrderPrice(NewOrderPriceRequest request) {
        return request(request, NewOrderPriceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-续订询价(根据resourceId查询)
     * 支持云主机、云硬盘、弹性公网IP、NAT网关、共享带宽、物理机、性能保障型负载均衡、云主机备份存储库和云硬盘备份存储库产品的包年/包月订单的续订询价功能
     */
    public CTResponse<RenewOrderPriceResponseData> renewOrderPrice(RenewOrderPriceRequest request) {
        return request(request, RenewOrderPriceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-升级订单询价(根据resourceId查询)
     * 支持云主机、云硬盘、弹性公网IP、NAT网关、共享带宽、性能保障型负载均衡、云主机备份存储库和云硬盘备份存储库产品的包年/包月或按量订单变配时的询价功能
     */
    public CTResponse<UpgradeOrderPriceResponseData> upgradeOrderPrice(UpgradeOrderPriceRequest request) {
        return request(request, UpgradeOrderPriceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-重装多台云主机
     * 该接口提供用户重装多台云主机功能，通过填写相应云主机ID、镜像ID和密码对云主机进行重装。
     */
    public CTResponse<EcsBatchRebuildResponseData> ecsBatchRebuild(EcsBatchRebuildRequest request) {
        return request(request, EcsBatchRebuildResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-批量删除云主机元数据
     * 批量删除云主机元数据，如果某个云主机的元数据删除失败则于返回值返回该云主机id。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsMetadataBatchDeleteResponseData> ecsMetadataBatchDelete(EcsMetadataBatchDeleteRequest request) {
        return request(request, EcsMetadataBatchDeleteResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机的网卡实时监控数据
     * 该接口提供用户查询云主机的网卡实时监控数据的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />&emsp;&emsp;调用接口时，如果监控项返回的值为"-1"则说明未获取到监控项
     */
    public CTResponse<EcsNetworkLatestMetricDataResponseData> ecsNetworkLatestMetricData(EcsNetworkLatestMetricDataRequest request) {
        return request(request, EcsNetworkLatestMetricDataResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询指定时间段内的CPU监控数据
     * 该接口提供用户查询指定时间段内的CPU监控数据的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />&emsp;&emsp;调用接口时，如果监控项返回的值为"[]"则说明未获取到监控项
     */
    public CTResponse<EcsCpuHistoryMetricDataResponseData> ecsCpuHistoryMetricData(EcsCpuHistoryMetricDataRequest request) {
        return request(request, EcsCpuHistoryMetricDataResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询指定时间段内的内存监控数据
     * 该接口提供用户查询指定时间段内的内存监控数据功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />&emsp;&emsp;调用接口时，如果监控项返回的值为"[]"则说明未获取到监控项
     */
    public CTResponse<EcsMemHistoryMetricDataResponseData> ecsMemHistoryMetricData(EcsMemHistoryMetricDataRequest request) {
        return request(request, EcsMemHistoryMetricDataResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询指定时间段内的磁盘监控数据
     * 该接口提供用户查询指定时间段内的磁盘监控数据功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />&emsp;&emsp;调用接口时，如果监控项返回的值为"[]"则说明未获取到监控项
     */
    public CTResponse<EcsDiskHistoryMetricDataResponseData> ecsDiskHistoryMetricData(EcsDiskHistoryMetricDataRequest request) {
        return request(request, EcsDiskHistoryMetricDataResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询指定时间段内的网卡监控数据
     * 该接口提供用户查询指定时间段内的网卡监控数据功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />&emsp;&emsp;调用接口时，如果监控项返回的值为"[]"则说明未获取到监控项
     */
    public CTResponse<EcsNetworkHistoryMetricDataResponseData> ecsNetworkHistoryMetricData(EcsNetworkHistoryMetricDataRequest request) {
        return request(request, EcsNetworkHistoryMetricDataResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-更新云主机快照信息
     * 更改云主机快照名称和描述
     */
    public CTResponse<EcsSnapshotUpdateResponseData> ecsSnapshotUpdate(EcsSnapshotUpdateRequest request) {
        return request(request, EcsSnapshotUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机快照状态
     * 查询云主机快照状态
     */
    public CTResponse<EcsSnapshotStatusResponseData> ecsSnapshotStatus(EcsSnapshotStatusRequest request) {
        return request(request, EcsSnapshotStatusResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机快照个数统计
     * 统计云主机快照个数
     */
    public CTResponse<EcsQuerySnapshotResponseData> ecsQuerySnapshot(EcsQuerySnapshotRequest request) {
        return request(request, EcsQuerySnapshotResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机加入主机组校验
     * 可以根据用户给定的云主机与云主机组，校验当前情况下是否可以将云主机加入主机组。如果可以则返回值中needMigrate字段为0，反之则需要将云主机迁移。
     */
    public CTResponse<EcsAffinityGroupBindCheckResponseData> ecsAffinityGroupBindCheck(EcsAffinityGroupBindCheckRequest request) {
        return request(request, EcsAffinityGroupBindCheckResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-批量更新云主机快照信息
     * 批量更改云主机快照名称和描述
     */
    public CTResponse<EcsSnapshotBatchUpdateResponseData> ecsSnapshotBatchUpdate(EcsSnapshotBatchUpdateRequest request) {
        return request(request, EcsSnapshotBatchUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机组内的云主机
     * 可以根据用户给定的云主机组，查询云主机组内云主机的详细信息
     */
    public CTResponse<EcsAffinityGroupEcsListResponseData> ecsAffinityGroupEcsList(EcsAffinityGroupEcsListRequest request) {
        return request(request, EcsAffinityGroupEcsListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-更新多台云主机的密码
     * 更新多台云主机的密码
     */
    public CTResponse<EcsBatchPasswordUpdateResponseData> ecsBatchPasswordUpdate(EcsBatchPasswordUpdateRequest request) {
        return request(request, EcsBatchPasswordUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-批量更新云主机备份信息
     * 批量更改云主机备份名称和描述
     */
    public CTResponse<EcsBackupBatchUpdateResponseData> ecsBackupBatchUpdate(EcsBackupBatchUpdateRequest request) {
        return request(request, EcsBackupBatchUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-根据订单号查询uuid
     * 根据订单号masterOrderId，输出订单状态、资源类型、资源uuid列表
     */
    public CTResponse<OrderQueryUuidResponseData> orderQueryUuid(OrderQueryUuidRequest request) {
        return request(request, OrderQueryUuidResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-退订云主机备份存储库
     * 退订云主机备份存储库<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<DeleteRepoResponseData> deleteRepo(DeleteRepoRequest request) {
        return request(request, DeleteRepoResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-续订云主机备份存储库
     * 续订云主机备份存储库。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />&emsp;&emsp;计费模式：确认云主机备份存储库的计费模式，详细查看<a href="https://www.ctyun.cn/document/10051003/10100892">计费模式</a><br />
     */
    public CTResponse<RenewRepoResponseData> renewRepo(RenewRepoRequest request) {
        return request(request, RenewRepoResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机备份存储库
     * 根据过滤参数查询满足条件的云主机备份存储库，并返回云主机备份存储库列表<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<ListRepoResponseData> listRepo(ListRepoRequest request) {
        return request(request, ListRepoResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建云主机备份存储库
     * 创建云主机备份存储库。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />&emsp;&emsp;计费模式：确认云主机备份存储库的计费模式，详细查看<a href="https://www.ctyun.cn/document/10051003/10100892">计费模式</a><br />
     */
    public CTResponse<CreateRepoResponseData> createRepo(CreateRepoRequest request) {
        return request(request, CreateRepoResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-扩容云主机备份存储库
     * 扩容云主机备份存储库。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />&emsp;&emsp;计费模式：确认云主机备份存储库的计费模式，详细查看<a href="https://www.ctyun.cn/document/10051003/10100892">计费模式</a><br />
     */
    public CTResponse<UpgradeRepoResponseData> upgradeRepo(UpgradeRepoRequest request) {
        return request(request, UpgradeRepoResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建云主机备份策略
     * 创建云主机备份策略<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<CreateBackupPolicyResponseData> createBackupPolicy(CreateBackupPolicyRequest request) {
        return request(request, CreateBackupPolicyResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-删除云主机备份策略
     * 删除云主机备份策略，其绑定的磁盘将无法按照策略继续执行备份<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<DeleteBackupPolicyResponseData> deleteBackupPolicy(DeleteBackupPolicyRequest request) {
        return request(request, DeleteBackupPolicyResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-修改启用停用云主机备份策略
     * 修改、启用、停用云主机备份策略
     */
    public CTResponse<UpdateBackupPolicyResponseData> updateBackupPolicy(UpdateBackupPolicyRequest request) {
        return request(request, UpdateBackupPolicyResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机立即备份
     * 该接口提供立即备份能力，将对所有绑定了此备份策略的云主机执行备份<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<EcsBackupResponseData> ecsBackup(EcsBackupRequest request) {
        return request(request, EcsBackupResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-备份策略绑定云主机
     * 该接口备份策略绑定云主机<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<BackupPolicyBindEcsResponseData> backupPolicyBindEcs(BackupPolicyBindEcsRequest request) {
        return request(request, BackupPolicyBindEcsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-备份策略解绑云主机
     * 该接口备份策略解绑云主机<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<BackupPolicyUnbindEcsResponseData> backupPolicyUnbindEcs(BackupPolicyUnbindEcsRequest request) {
        return request(request, BackupPolicyUnbindEcsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机备份策略绑定存储库
     * 云主机备份策略绑定存储库<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<BackupPolicyBindRepoResponseData> backupPolicyBindRepo(BackupPolicyBindRepoRequest request) {
        return request(request, BackupPolicyBindRepoResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机备份策略解绑存储库
     * 云主机备份策略解绑存储库<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<BackupPolicyUnbindRepoResponseData> backupPolicyUnbindRepo(BackupPolicyUnbindRepoRequest request) {
        return request(request, BackupPolicyUnbindRepoResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机备份策略列表
     * 查询云主机备份策略列表<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<ListBackupPolicyResponseData> listBackupPolicy(ListBackupPolicyRequest request) {
        return request(request, ListBackupPolicyResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-新订单询价
     * 购买云产品时询价接口，支持云主机、云硬盘、弹性公网IP、NAT网关、共享带宽、物理机、性能保障型负载均衡、云主机备份存储库和云硬盘备份存储库产品的包年/包月或按量订单的询价功能
     */
    public CTResponse<OrderNewQueryPriceResponseData> orderNewQueryPrice(OrderNewQueryPriceRequest request) {
        return request(request, OrderNewQueryPriceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-续订单询价(根据资源uuid查询)
     * 支持云主机、云硬盘、弹性公网IP、NAT网关、共享带宽、物理机、性能保障型负载均衡、云主机备份存储库和云硬盘备份存储库产品的包年/包月订单的续订询价功能
     */
    public CTResponse<OrderRenewQueryPriceResponseData> orderRenewQueryPrice(OrderRenewQueryPriceRequest request) {
        return request(request, OrderRenewQueryPriceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-升级订单询价(根据资源uuid查询)
     * 支持云主机、云硬盘、弹性公网IP、NAT网关、共享带宽、性能保障型负载均衡、云主机备份存储库和云硬盘备份存储库产品的包年/包月或按量订单变配时的询价功能
     */
    public CTResponse<OrderUpgradeQueryPriceResponseData> orderUpgradeQueryPrice(OrderUpgradeQueryPriceRequest request) {
        return request(request, OrderUpgradeQueryPriceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询资源池产品可售信息
     * 查询用户可用的产品是否可售，支持云主机、云硬盘、弹性公网IP产品的可售查询。
     */
    public CTResponse<RegionCheckDemandResponseData> regionCheckDemand(RegionCheckDemandRequest request) {
        return request(request, RegionCheckDemandResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询用户资源操作日志
     * 查询租户资源操作日志。
     */
    public CTResponse<OpLogQueryResponseData> opLogQuery(OpLogQueryRequest request) {
        return request(request, OpLogQueryResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-根据regionID查询用户配额
     * 根据regionID查询用户配额
     */
    public CTResponse<RegionCustomerQuotasResponseData> regionCustomerQuotas(RegionCustomerQuotasRequest request) {
        return request(request, RegionCustomerQuotasResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-根据regionID查询用户资源
     * 根据regionID查询用户已有资源
     */
    public CTResponse<RegionCustomerResourcesResponseData> regionCustomerResources(RegionCustomerResourcesRequest request) {
        return request(request, RegionCustomerResourcesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机可变配的规格
     * 判断一台云主机是否可以通过指定规格进行变配
     */
    public CTResponse<QueryResizeFlavorResponseData> queryResizeFlavor(QueryResizeFlavorRequest request) {
        return request(request, QueryResizeFlavorResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机备份策略绑定云主机信息
     * 通过云主机备份策略ID获取备份信息，主要获取绑定的云主机信息<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<BackupPolicyListInstancesResponseData> backupPolicyListInstances(BackupPolicyListInstancesRequest request) {
        return request(request, BackupPolicyListInstancesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-快照创建一台云主机
     * 使用已创建成功的云主机快照，去申请新的云主机。新云主机的规格、镜像、数据盘、系统盘及数据等均与快照一致。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />&emsp;&emsp;计费模式：确认开通云主机的计费模式，详细查看<a href="https://www.ctyun.cn/document/10026730/10030877">计费模式</a><br /><b>注意事项：</b><br />&emsp;&emsp;成本估算：了解云主机的<a href="https://www.ctyun.cn/document/10026730/10028700">计费项</a><br />&emsp;&emsp;标签绑定：云主机绑定标签时，标签键和值存在的情况下，绑定对应标签；不存在的情况下，创建新的标签并绑定云主机。主机创建完成后，云主机变为运行状态，此时标签仍可能未绑定，需等待一段时间（0~10分钟）。新的云主机不会绑定快照对应的云主机上的标签，如需标签请重新添加。
     */
    public CTResponse<SnapshotCreateInstanceResponseData> snapshotCreateInstance(SnapshotCreateInstanceRequest request) {
        return request(request, SnapshotCreateInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-备份创建一台云主机
     * 使用已创建成功的云主机备份，去申请新的云主机。新云主机的规格、镜像、数据盘、系统盘及数据等均与备份一致。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />&emsp;&emsp;计费模式：确认备份申请云主机的计费模式，详细查看<a href="https://www.ctyun.cn/document/10026730/10030877">计费模式</a><br />&emsp;&emsp;网络规划：规划云主机的网络环境，详细查看<a href="https://www.ctyun.cn/document/10026730/10237410">弹性云主机-网络</a><br /><b>注意事项</b><br />&emsp;&emsp;成本估算：了解云主机的<a href="https://www.ctyun.cn/document/10026730/10028700">计费项</a><br />&emsp;&emsp;用户配额：确认个人在不同资源池下资源配额，可以通过<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9714&data=87">用户配额查询</a>接口进行查询<br />&emsp;&emsp;异步接口：该接口为异步接口，下单过后会拿到主订单ID（masterOrderID），后续可以调用<a href="https://www.ctyun.cn/document/10026730/10069118">根据订单号查询uuid</a>，使用主订单ID来对订单情况与开通成功后的资源ID进行查询<br />&emsp;&emsp;企业项目：保证资源隔离，需确保所有资源与云主机处于相同企业项目下才可进行挂载操作，如网络资源：VPC、安全组、弹性IP、子网<br />&emsp;&emsp;标签绑定：云主机绑定标签时，标签键和值存在的情况下，绑定对应标签；不存在的情况下，创建新的标签并绑定云主机。主机创建完成后，云主机变为运行状态，此时标签仍可能未绑定，需等待一段时间（0~10分钟）。新的云主机不会绑定备份对应的云主机上的标签，如需标签请重新添加。
     */
    public CTResponse<BackupCreateInstanceResponseData> backupCreateInstance(BackupCreateInstanceRequest request) {
        return request(request, BackupCreateInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-克隆云主机
     * 使用已创建成功的云主机，克隆一台新的云主机。新云主机的规格、镜像、数据盘、系统盘及数据等均与备份一致。<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />&emsp;&emsp;计费模式：确认开通云主机的计费模式，详细查看<a href="https://www.ctyun.cn/document/10026730/10030877">计费模式</a><br />&emsp;&emsp;网络规划：规划云主机的网络环境，详细查看<a href="https://www.ctyun.cn/document/10026730/10237410">弹性云主机-网络</a><br /><b>注意事项：</b><br />&emsp;&emsp;成本估算：了解云主机的<a href="https://www.ctyun.cn/document/10026730/10028700">计费项</a><br />&emsp;&emsp;用户配额：确认个人在不同资源池下资源配额，可以通过<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9714&data=87">用户配额查询</a>接口进行查询<br />&emsp;&emsp;异步接口：该接口为异步接口，下单过后会拿到主订单ID（masterOrderID），后续可以调用<a href="https://www.ctyun.cn/document/10026730/10222980">根据masterOrderID查询云主机ID</a>，使用主订单ID来对订单情况与开通成功后的资源ID进行查询<br />&emsp;&emsp;企业项目：保证资源隔离，需确保所有资源与云主机处于相同企业项目下才可进行挂载操作，如网络资源：VPC、安全组、弹性IP、子网<br />&emsp;&emsp;标签绑定：云主机绑定标签时，标签键和值存在的情况下，绑定对应标签；不存在的情况下，创建新的标签并绑定云主机。主机创建完成后，云主机变为运行状态，此时标签仍可能未绑定，需等待一段时间（0~10分钟）。新的云主机不会克隆原云主机的标签，如需标签请重新添加。
     */
    public CTResponse<CloneInstanceResponseData> cloneInstance(CloneInstanceRequest request) {
        return request(request, CloneInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建云主机
     * 支持创建一台按量付费或包年包月的云主机<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />&emsp;&emsp;计费模式：确认开通云主机的计费模式，详细查看<a href="https://www.ctyun.cn/document/10026730/10030877">计费模式</a><br />&emsp;&emsp;地域选择：选择创建云主机的资源池，详细查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a><br />&emsp;&emsp;产品选型：购买弹性云主机前，请先阅读<a href="https://www.ctyun.cn/document/10026730/10118193">规格说明</a>了解弹性云主机的选型基本信息，并通过<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8327&data=87">查询一个或多个云主机规格资源</a>接口，获取当前资源池可用云主机规格信息<br />&emsp;&emsp;网络规划：规划云主机的网络环境，详细查看<a href="https://www.ctyun.cn/document/10026730/10237410">弹性云主机-网络</a><br /><b>注意事项：</b><br />&emsp;&emsp;成本估算：了解云主机的<a href="https://www.ctyun.cn/document/10026730/10028700">计费项</a><br />&emsp;&emsp;用户配额：确认个人在不同资源池下资源配额，可以通过<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9714&data=87">用户配额查询</a>接口进行查询<br />&emsp;&emsp;异步接口：该接口为异步接口，下单过后会拿到主订单ID（masterOrderID），后续可以调用<a href="https://www.ctyun.cn/document/10026730/10222980">根据masterOrderID查询云主机ID</a>，使用主订单ID来对订单情况与开通成功后的资源ID进行查询<br />&emsp;&emsp;单台创建：当前接口只能创建单台同类型云主机，批量创建同类型云主机请使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8282&data=87">批量创建按量付费或包年包月云主机</a>进行创建<br />&emsp;&emsp;企业项目：保证资源隔离，需确保所有资源与云主机处于相同企业项目下才可进行挂载操作，如网络资源：VPC、安全组、弹性IP、子网<br />&emsp;&emsp;标签绑定：云主机绑定标签时，标签键和值存在的情况下，绑定对应标签；不存在的情况下，创建新的标签并绑定云主机。主机创建完成后，云主机变为运行状态，此时标签仍可能未绑定，需等待一段时间（0~10分钟）
     */
    public CTResponse<CreateInstanceResponseData> createInstance(CreateInstanceRequest request) {
        return request(request, CreateInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-批量创建云主机
     * 支持批量创建按量付费或包年包月云主机<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />&emsp;&emsp;计费模式：确认开通云主机的计费模式，详细查看<a href="https://www.ctyun.cn/document/10026730/10030877">计费模式</a><br />&emsp;&emsp;地域选择：选择创建云主机的资源池，详细查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a><br />&emsp;&emsp;产品选型：购买弹性云主机前，请先阅读<a href="https://www.ctyun.cn/document/10026730/10118193">规格说明</a>了解弹性云主机的选型基本信息，并通过<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8327&data=87">查询一个或多个云主机规格资源</a>接口，获取当前资源池可用云主机规格信息<br />&emsp;&emsp;网络规划：规划云主机的网络环境，详细查看<a href="https://www.ctyun.cn/document/10026730/10237410">弹性云主机-网络</a><br /><b>注意事项：</b><br />&emsp;&emsp;成本估算：了解云主机的<a href="https://www.ctyun.cn/document/10026730/10028700">计费项</a><br />&emsp;&emsp;用户配额：确认个人在不同资源池下资源配额，可以通过<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9714&data=87">用户配额查询</a>接口进行查询<br />&emsp;&emsp;异步接口：该接口为异步接口，下单过后会拿到主订单ID（masterOrderID），后续可以调用<a href="https://www.ctyun.cn/document/10026730/10222980">根据masterOrderID查询云主机ID</a>，使用主订单ID来对订单情况与开通成功后的资源ID进行查询<br />&emsp;&emsp;多台创建：当前接口只能创建多个同类型云主机，个性化创建不同类型云主机请使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8281&data=87">创建一台按量付费或包年包月的云主机</a>进行创建<br />&emsp;&emsp;企业项目：保证资源隔离，需确保所有资源与云主机处于相同企业项目下才可进行挂载操作，如网络资源：VPC、安全组、弹性IP、子网<br />&emsp;&emsp;标签绑定：云主机绑定标签时，标签键和值存在的情况下，绑定对应标签；不存在的情况下，创建新的标签并绑定云主机。主机创建完成后，云主机变为运行状态，此时标签仍可能未绑定，需等待一段时间（0~10分钟）（0~10分钟）
     */
    public CTResponse<BatchCreateInstancesResponseData> batchCreateInstances(BatchCreateInstancesRequest request) {
        return request(request, BatchCreateInstancesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-续订云主机
     * 通过填写续订周期与续订时长，续订一台包年或者包月的云主机，请求过后获取本次续订的订单信息。<br/><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项</b>：<br />&emsp;&emsp;成本估算：了解云主机的<a href="https://www.ctyun.cn/document/10026730/10028700">计费项</a><br />&emsp;&emsp;异步接口：该接口为异步接口，下单过后会拿到主订单ID（masterOrderID），后续可以调用<a href="https://www.ctyun.cn/document/10026730/10069118">根据订单号查询uuid</a>，使用主订单ID来对订单情况。
     */
    public CTResponse<ResubscribeInstanceResponseData> resubscribeInstance(ResubscribeInstanceRequest request) {
        return request(request, ResubscribeInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-释放云主机
     * 释放云主机，对于包周期的云主机为退订，对于按量付费的云主机为删除。<br/><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项</b>：<br />&emsp;&emsp;释放前请确保文件已进行备份，释放后不可恢复。在云主机订购时，一起订购的其他资源，比如绑定的网卡、云硬盘、弹性IP等资源，会一起被释放。非一起订购的资源，比如绑定的网卡、云硬盘、弹性IP等资源会被解绑。
     */
    public CTResponse<UnsubscribeInstanceResponseData> unsubscribeInstance(UnsubscribeInstanceRequest request) {
        return request(request, UnsubscribeInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-更新云主机
     * 该接口提供用户更新云主机的部分信息的功能<br />目前支持更新云主机的信息为：云主机显示名称（displayName）<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<UpdateInstanceResponseData> updateInstance(UpdateInstanceRequest request) {
        return request(request, UpdateInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-批量更新云主机
     * 该接口提供用户更新多台云主机的部分信息的功能<br />目前支持更新云主机的信息为：云主机显示名称（displayName）<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<BatchUpdateInstancesResponseData> batchUpdateInstances(BatchUpdateInstancesRequest request) {
        return request(request, BatchUpdateInstancesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-重置云主机密码
     * 该接口提供用户更新云主机的密码的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<ResetPasswordResponseData> resetPassword(ResetPasswordRequest request) {
        return request(request, ResetPasswordResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-批量重置云主机密码
     * 该接口提供用户更新多台云主机的密码的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<BatchResetPasswordResponseData> batchResetPassword(BatchResetPasswordRequest request) {
        return request(request, BatchResetPasswordResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-获取VNC详情
     * 查询一台云主机的Web管理终端地址。<br /><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />&emsp;&emsp;确认资源池类型：您可以查询<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5855&data=87">资源池信息</a>，查询结果中zoneList内，若返回存在可用区名称，则为多可用区类型资源池；若为空，则为非多可用区类型资源池
     <b>获取访问地址与使用：</b>
     多可用区获取到访问地址如下所示：
     &emsp;&emsp;wss://vm-vnc.ctyun.cn/vm_vnc/huadong1/az1/ws?token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2OTU3NTY0NTQsImlhdCI6MTY5MjE1NjQ1NCwidXNlcl9pZCI6ImVhYWZlNWRjOWU1OWRlMmM3NmQwNmQwOGFlZTQ0YWZkIiwicHJvamVjdF9pZCI6ImFkOTFkMmNjMDUwY2M0YmIyMTVhZDc0ZDE1OGYzMGQxIiwiZG9tYWluX2lkIjoiZGVmYXVsdCIsInJvbGVzIjpbInVzZXIiXSwiY29uc3VtZXJfaWQiOiIiLCJpc3N1ZWRfYXQiOiIyMDIzLTA4LTE2VDAzOjI3OjM0LjAwMDAwMFoiLCJleHBpcmVfYXQiOiIyMDIzLTA5LTI2VDE5OjI3OjM0LjAwMDAwMFoiLCJNZXRob2QiOlsicGFzc3dvcmQiXX0.1cf3TcvzUfH5I7b4oBYK2yQ2g_ASUllpM5QtOMsWBB0&instanceId=df5e3e31-6cea-05a9-cbce-d74504328bef&instance_name=ecm-f856(df5e3e31-6cea-05a9-cbce-d74504328bef)

     访问地址分几部分：
     &emsp;{WebSocket URL Prefix} + ws? + token={token} + instanceId={uuid}
     &emsp;WebSocket URL Prefix：即VNC的访问URL前缀，固定访问协议为“wss”，即使用“HTTPS”方式访问

     有如上信息后，可在调用OpenAPI获取VNC token后拼接访问地址，使用noVNC等client进行访问，以noVNC为例，具体操作步骤如下：
     &emsp;&emsp;1、本地启动noVNC服务，打开vnc页面；
     &emsp;&emsp;2、点击左侧⚙，打开“高级”-“WebSocket”，在“主机”中，填写去掉“wss”协议的地址“vm-vnc.ctyun.cn/vm_vnc/{region name}/{az name}/ws?instanceId=<uuid>&token=<token>”，选中“加密”，端口写入“443”
     &emsp;&emsp;3、点击右侧连接按钮，即可访问。单可用区获取到访问地址如下所示：http://55.7.114.250:60001/vnc_auto.html?token=9b661818-f700-4c33-8ada-94cfe0b9a528&instance_name=ctapi-new-1(1edcf309-4128-4db4-a0b5-99b0240ac27d)有如上信息后，可直接浏览器输入访问地址进行访问

     单可用区获取到访问地址如下所示：
     &emsp;http://55.7.114.250:60001/vnc_auto.html?token=9b661818-f700-4c33-8ada-94cfe0b9a528&instance_name=ctapi-new-1(1edcf309-4128-4db4-a0b5-99b0240ac27d)

     有如上信息后，可直接浏览器输入访问地址进行访问
     */
    public CTResponse<VncDetailsResponseData> vncDetails(VncDetailsRequest request) {
        return request(request, VncDetailsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机的云硬盘列表
     * 该接口提供查询云主机的云硬盘列表功能<br /><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;分页查询：当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />
     */
    public CTResponse<VolumeListResponseData> volumeList(VolumeListRequest request) {
        return request(request, VolumeListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-获取用户云硬盘统计信息
     * 查询用户云硬盘统计信息<br /><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<VolumeStatisticsResponseData> volumeStatistics(VolumeStatisticsRequest request) {
        return request(request, VolumeStatisticsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-更新云主机网络或者配置
     * 支持对一台处于关机状态的云主机进行带宽或规格的变更。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br/>&emsp;&emsp;成本估算：了解云主机的<a href="https://www.ctyun.cn/document/10026730/10028700">计费项</a><br/>&emsp;&emsp;异步接口：该接口为异步接口，下单成功不代表业务成功。
     */
    public CTResponse<UpdateInstanceSpecResponseData> updateInstanceSpec(UpdateInstanceSpecRequest request) {
        return request(request, UpdateInstanceSpecResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-更新云主机配置
     * 支持对一台处于关机状态的云主机进行规格变更<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br/>&emsp;&emsp;成本估算：了解云主机的<a href="https://www.ctyun.cn/document/10026730/10028700">计费项</a><br/>&emsp;&emsp;异步接口：该接口为异步接口，下单成功不代表业务成功。
     */
    public CTResponse<UpdateFlavorSpecResponseData> updateFlavorSpec(UpdateFlavorSpecRequest request) {
        return request(request, UpdateFlavorSpecResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-挂载共享网卡
     * 给云主机添加共享网卡<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;该接口给云主机添加共享网卡后，共享网卡不能通过普通网卡方式进行卸载，只能随着退订云主机时进行删除，请谨慎使用
     */
    public CTResponse<ShareInterfaceAttachResponseData> shareInterfaceAttach(ShareInterfaceAttachRequest request) {
        return request(request, ShareInterfaceAttachResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-更新云主机网络
     * 支持对一台处于关机状态的云主机进行带宽变更。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br/>&emsp;&emsp;成本估算：了解云主机的<a href="https://www.ctyun.cn/document/10026730/10028700">计费项</a><br/>&emsp;&emsp;异步接口：该接口为异步接口，下单成功不代表业务成功。
     */
    public CTResponse<UpdateNetworkSpecResponseData> updateNetworkSpec(UpdateNetworkSpecRequest request) {
        return request(request, UpdateNetworkSpecResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-开启一台云主机
     * 该接口提供用户开启一台云主机功能。<br/><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br/>&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br/><b>注意事项：</b><br />&emsp;&emsp;单台操作：当前接口只能操作单台云主机，开启多台云主机请使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8303&data=87">开启多台云主机</a>进行操作<br/>&emsp;&emsp;异步接口：该接口为异步接口，请求过后会拿到任务ID（jobID），后续可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5543&data=87">查询一个异步任务的结果</a>来查询操作是否成功
     */
    public CTResponse<StartInstanceResponseData> startInstance(StartInstanceRequest request) {
        return request(request, StartInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-关闭一台云主机
     * 该接口提供用户关闭一台云主机功能，可选两种关机模式：普通关机、强制关机。<br />请求下发后云主机变为关机中（stopping）状态，待异步任务完成后，云主机变为关机（stopped）状态。<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;单台操作：当前接口只能操作单台云主机，关闭多台云主机请使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8304&data=87">关闭多台云主机</a>进行操作<br />&emsp;&emsp;异步接口：该接口为异步接口，请求过后会拿到任务ID（jobID），后续可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5543&data=87">查询一个异步任务的结果</a>来查询操作是否成功
     */
    public CTResponse<StopInstanceResponseData> stopInstance(StopInstanceRequest request) {
        return request(request, StopInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-重启一台云主机
     * 该接口提供用户重启一台云主机功能。<br/><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br/>&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br/><b>注意事项：</b><br />&emsp;&emsp;单台操作：当前接口只能操作单台云主机，重启多台云主机请使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8305&data=87">重启多台云主机</a>进行操作<br/>&emsp;&emsp;异步接口：该接口为异步接口，请求过后会拿到任务ID（jobID），后续可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5543&data=87">查询一个异步任务的结果</a>来查询操作是否成功
     */
    public CTResponse<RebootInstanceResponseData> rebootInstance(RebootInstanceRequest request) {
        return request(request, RebootInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-重装一台云主机
     * 该接口提供用户重装一台云主机功能，通过填写相应云主机ID、镜像ID对云主机进行重装。<br/><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br/>&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br/><b>注意事项：</b><br />&emsp;&emsp;单台操作：当前接口只能操作单台云主机，重装多台云主机请使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8306&data=87">重装多台云主机</a>进行操作<br/>&emsp;&emsp;异步接口：该接口为异步接口，请求过后会拿到任务ID（jobID），后续可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5543&data=87">查询一个异步任务的结果</a>来查询操作是否成功
     */
    public CTResponse<RebuildInstanceResponseData> rebuildInstance(RebuildInstanceRequest request) {
        return request(request, RebuildInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-开启多台云主机
     * 该接口提供用户开启多台云主机功能。<br/><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br/>&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br/><b>注意事项：</b><br />&emsp;&emsp;多台操作：当前接口进行批量操作，开启一台云主机建议使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8296&data=87">开启一台云主机</a>进行操作<br/>&emsp;&emsp;异步接口：该接口为异步接口，请求过后会拿到任务ID（jobID），后续可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9271&data=87">查询多个异步任务的结果</a>来查询这些操作是否成功
     */
    public CTResponse<BatchStartInstanceResponseData> batchStartInstance(BatchStartInstanceRequest request) {
        return request(request, BatchStartInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-关闭多台云主机
     * 该接口提供用户关闭多台云主机功能，可选两种关机模式：普通关机、强制关机。<br />普通关机与强制关机模式下，请求下发后云主机变为关机中（stopping）状态，待异步任务完成后，云主机变为关机（stopped）状态。<br /><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br/>&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br/><b>注意事项：</b><br />&emsp;&emsp;多台操作：当前接口进行批量操作，关闭一台云主机建议使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8297&data=87">关闭一台云主机</a>进行操作<br/>&emsp;&emsp;异步接口：该接口为异步接口，请求过后会拿到任务ID（jobID），后续可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9271&data=87">查询多个异步任务的结果</a>来查询这些操作是否成功
     */
    public CTResponse<BatchStopInstanceResponseData> batchStopInstance(BatchStopInstanceRequest request) {
        return request(request, BatchStopInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-重启多台云主机
     * 该接口提供用户重启多台云主机功能。<br/><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br/>&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br/><b>注意事项：</b><br />&emsp;&emsp;多台操作：当前接口进行批量操作，重启一台云主机建议使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8298&data=87">重启一台云主机</a>进行操作<br/>&emsp;&emsp;异步接口：该接口为异步接口，请求过后会拿到任务ID（jobID），后续可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9271&data=87">查询多个异步任务的结果</a>来查询这些操作是否成功
     */
    public CTResponse<BatchRebootInstanceResponseData> batchRebootInstance(BatchRebootInstanceRequest request) {
        return request(request, BatchRebootInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-重装多台云主机
     * 该接口提供用户重装多台云主机功能，通过填写相应云主机ID、镜像ID对云主机进行重装。<br/>该接口提供用户开启多台云主机功能。<br/><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br/>&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br/><b>注意事项：</b><br />&emsp;&emsp;多台操作：当前接口进行批量操作，重装一台云主机建议使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8302&data=87">重装一台云主机</a>进行操作<br/>&emsp;&emsp;异步接口：该接口为异步接口，请求过后会拿到任务ID（jobID），后续可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9271&data=87">查询多个异步任务的结果</a>来查询这些操作是否成功
     */
    public CTResponse<BatchRebuildInstanceResponseData> batchRebuildInstance(BatchRebuildInstanceRequest request) {
        return request(request, BatchRebuildInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机的固定IP
     * 根据云主机ID，查询云主机的固定IP。<br/><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<FixedIpListResponseData> fixedIpList(FixedIpListRequest request) {
        return request(request, FixedIpListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-获取多台云主机状态
     * 该接口提供用户多台云主机状态信息查询功能，用户可以根据此接口的返回值得到多台云主机的状态信息。<br /><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;分页查询：当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />&emsp;&emsp;匹配查找：可以通过部分字段进行匹配筛选数据，无符合条件的为空，在指定多台云主机ID的情况下，只返回匹配到的云主机信息。推荐每次使用单个条件查找
     */
    public CTResponse<InstanceStatusListResponseData> instanceStatusList(InstanceStatusListRequest request) {
        return request(request, InstanceStatusListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机列表
     * 该接口提供用户多台云主机信息查询功能，用户可以根据此接口的返回值得到多台云主机信息。<br /><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;分页查询：当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />&emsp;&emsp;匹配查找：可以通过部分字段进行匹配筛选数据，无符合条件的为空，在指定多台云主机ID的情况下，只返回匹配到的云主机信息。推荐每次使用单个条件查找
     */
    public CTResponse<ListInstancesResponseData> listInstances(ListInstancesRequest request) {
        return request(request, ListInstancesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机详细信息
     * 该接口提供用户一台云主机信息查询功能，用户可以根据此接口的返回值了解自己云主机的详细信息。<br /><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;单台查询：当前接口只能查询单台云主机信息，查询多台云主机信息请使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8309&data=87">查询云主机列表</a>进行查询<br />
     */
    public CTResponse<InstanceDetailsResponseData> instanceDetails(InstanceDetailsRequest request) {
        return request(request, InstanceDetailsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机的用户自定义数据
     * 根据云主机ID，查询云主机的用户自定义数据。<br /><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<UserdataDetailsResponseData> userdataDetails(UserdataDetailsRequest request) {
        return request(request, UserdataDetailsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机加入主机组校验
     * 该接口提供用户云主机加入主机组校验的功能<br />可以根据用户给定的云主机与云主机组，校验当前情况下是否可以将云主机加入主机组。如果可以则返回值中needMigrate字段为0，反之则需要将云主机迁移。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;处于运行中状态的云主机加入新的云主机组过程中，云主机可能会被重启。<br />
     */
    public CTResponse<AffinityGroupBindVmCheckResponseData> affinityGroupBindVmCheck(AffinityGroupBindVmCheckRequest request) {
        return request(request, AffinityGroupBindVmCheckResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机组中删除单台云主机
     * 该接口提供用户云主机组中添加单台云主机的功能，可以根据用户给定的云主机与云主机组，将云主机移除出云主机组<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<AffinityGroupUnbindVmResponseData> affinityGroupUnbindVm(AffinityGroupUnbindVmRequest request) {
        return request(request, AffinityGroupUnbindVmResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询账户资源池中可用区信息
     * 查询账户指定资源池中可用区的信息。
     */
    public CTResponse<AvailabilityZonesDetailsResponseData> availabilityZonesDetails(AvailabilityZonesDetailsRequest request) {
        return request(request, AvailabilityZonesDetailsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机组中添加单台云主机
     * 该接口提供用户云主机组中添加单台云主机的功能，可以根据用户给定的云主机与云主机组，将云主机添加进云主机组<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;用户配额：确认个人在不同资源池下资源配额，可以通过<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9714&data=87">用户配额查询</a>接口进行查询<br />
     */
    public CTResponse<AffinityGroupBindVmResponseData> affinityGroupBindVm(AffinityGroupBindVmRequest request) {
        return request(request, AffinityGroupBindVmResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建云主机组
     * 该接口提供用户创建云主机组的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;用户配额：确认个人在不同资源池下资源配额，可以通过<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9714&data=87">用户配额查询</a>接口进行查询<br />
     */
    public CTResponse<AffinityGroupCcreateResponseData> affinityGroupCcreate(AffinityGroupCcreateRequest request) {
        return request(request, AffinityGroupCcreateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机元数据查询
     * 查询云主机的元数据，缺省metadataKey则查询所有的元数据，填充metadataKey则只查询指定键值元数据。<br />元数据的使用参考<a href="https://www.ctyun.cn/document/10026730/10387544">云主机自定义元数据</a><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<MetadataDetailsResponseData> metadataDetails(MetadataDetailsRequest request) {
        return request(request, MetadataDetailsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机组内的云主机
     * 查询云主机组内的云主机<br />可以根据用户给定的云主机组，查询云主机组内云主机的详细信息<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;分页查询：当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />
     */
    public CTResponse<AffinityGroupListVmResponseData> affinityGroupListVm(AffinityGroupListVmRequest request) {
        return request(request, AffinityGroupListVmResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机所在云主机组
     * 该接口提供用户查询云主机所在云主机组的功能，可以根据用户给定的云主机，查询云主机所在的云主机组信息<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<AffinityGroupDetailsResponseData> affinityGroupDetails(AffinityGroupDetailsRequest request) {
        return request(request, AffinityGroupDetailsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机元数据更新
     * 为云主机更新元数据：<br />&emsp;&emsp;如果元数据中没有待更新字段，则自动添加该字段<br />&emsp;&emsp;如果元数据中已存在待更新字段，则直接更新字段值<br />&emsp;&emsp;如果元数据中的字段不在请求参数中，则保持不变<br />&emsp;&emsp;如果isForce为true则覆盖原有的元数据信息<br /> 元数据的使用参考<a href="https://www.ctyun.cn/document/10026730/10387544">云主机自定义元数据</a><br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<UpdateMetadataResponseData> updateMetadata(UpdateMetadataRequest request) {
        return request(request, UpdateMetadataResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机元数据删除
     * 删除云主机元数据，删除成功则返回云主机ID<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<DeleteMetadataResponseData> deleteMetadata(DeleteMetadataRequest request) {
        return request(request, DeleteMetadataResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机组列表或者详情
     * 查询云主机组列表或者详情<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;分页查询：当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />&emsp;&emsp;匹配查找：可以通过部分字段进行匹配筛选数据，无符合条件的为空。
     */
    public CTResponse<AffinityGroupListResponseData> affinityGroupList(AffinityGroupListRequest request) {
        return request(request, AffinityGroupListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询指定规格族下的云主机信息
     * 该接口提供用户根据指定规格族查询云主机的名称、云主机ID及规格详情<br /><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;分页查询：当前查询结果以分页形式进行展示，单次查询最多显示50条数据
     */
    public CTResponse<ListInstanceByFlavorFamiliesResponseData> listInstanceByFlavorFamilies(ListInstanceByFlavorFamiliesRequest request) {
        return request(request, ListInstanceByFlavorFamiliesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机规格族列表
     * 该接口提供用户可用规格族列表查询功能，每种规格族代表不同种类的云主机规格，用户可以根据此接口的返回值了解自己可使用的规格族有哪些。<br />&emsp;&emsp;云主机-二代机：X86云主机,包含通用型s2、内存优化型m2。s2、m2实例规格簇均为cpu共享型，上线时间较早。<br />&emsp;&emsp;云主机-三代机：X86云主机,包含通用型S3、计算增强型c3、内存优化型m3。S3实例规格簇为cpu共享型，c3、m3实例规格簇为cpu独享,软硬件升级，性能增强。<br />&emsp;&emsp;云主机-六代机：X86云主机,包含通用型s6、通用计算增强c6、内存优化型m6。S6实例规格簇为cpu共享型，c6、m6实例规格簇为cpu独享,性能优良，能承载不同业务需求。<br />&emsp;&emsp;云主机-七代机：X86云主机,包含通用型s7、通用计算增强c7、内存优化型m7。通用型S7实例规格簇为cpu共享型，c7、m7实例规格簇为cpu独享,提供更大规格更优性能，能满足更高业务需要。<br />&emsp;&emsp;国产化云主机：X86与ARM云主机,包含鲲鹏计算增强型kc1、海光计算增强型hc1、飞腾计算增强型fc1、鲲鹏内存优化型km1、海光内存优化型hm1、飞腾内存优化型fm1，对安全性有较高要求的政府或企业应用。<br />&emsp;&emsp;本地盘云主机：X86云主机，包含云主机规格（ip3），提供数据盘为本地盘的云主机。<br />&emsp;&emsp;GPU云主机：包含图形加速基础型G5、图形加速基础型G7；计算加速型P2V、计算加速型PI7、计算加速型P8A、计算加速型PS4、计算加速型PI3、计算加速型PI2；图形加速基础型G6、图形加速基础型G7。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<ListFlavorFamiliesResponseData> listFlavorFamilies(ListFlavorFamiliesRequest request) {
        return request(request, ListFlavorFamiliesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询一个或多个云主机规格资源
     * 该接口提供用户可用规格列表查询功能，可返回云主机规格的详细信息，并允许用户根据云主机规格的特殊字段进行筛选。用户可以根据此接口的返回值了解自己可使用的云主机规格有哪些。<br />您可以通过<a href="https://www.ctyun.cn/document/10026730/10118193">规格说明</a>了解弹性云主机的选型基本信息<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<ListFlavorResponseData> listFlavor(ListFlavorRequest request) {
        return request(request, ListFlavorResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机备份查询虚机磁盘大小
     * 云主机备份查询虚机磁盘大小。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<BackupStatisticsResponseData> backupStatistics(BackupStatisticsRequest request) {
        return request(request, BackupStatisticsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-云主机备份查询虚机
     * 通过虚机ID获取虚拟机最新状态，主要获取虚拟机磁盘挂载信息<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<BackupVmDetailsResponseData> backupVmDetails(BackupVmDetailsRequest request) {
        return request(request, BackupVmDetailsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建云主机备份
     * 创建云主机备份<br/><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<BackupCreateResponseData> backupCreate(BackupCreateRequest request) {
        return request(request, BackupCreateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-批量更新云主机备份信息
     * 批量更改云主机备份名称和描述<br /><b>准备工作</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<BackupBatchUpdateResponseData> backupBatchUpdate(BackupBatchUpdateRequest request) {
        return request(request, BackupBatchUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-更新云主机备份信息
     * 更改云主机备份名称和描述<br/><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<BackupUpdateResponseData> backupUpdate(BackupUpdateRequest request) {
        return request(request, BackupUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-密钥对解绑云主机
     * 为Linux云主机解绑SSH密钥对<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<KeypairDetachInstanceResponseData> keypairDetachInstance(KeypairDetachInstanceRequest request) {
        return request(request, KeypairDetachInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-密钥对绑定云主机
     * 此接口提供用户绑定SSH密钥对到云主机功能。系统会接收用户输入的云主机id和SSH密钥对，将对应SSH密钥对绑定到对应云主机上。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项</b>：<br />&emsp;&emsp;如果实例已经绑定了SSH密钥对，新的SSH密钥对自动替换原来的SSH密钥对 <br />
     */
    public CTResponse<KeypairAttachInstanceResponseData> keypairAttachInstance(KeypairAttachInstanceRequest request) {
        return request(request, KeypairAttachInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-获取密钥对详情
     * 此接口提供用户查询SSH密钥对功能。系统会接收用户输入的查询条件，并返回符合条件的密钥对详细信息。用户可根据此接口的返回值了解对应条件下的密钥对信息。 <br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<KeypairDetailsResponseData> keypairDetails(KeypairDetailsRequest request) {
        return request(request, KeypairDetailsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机备份状态
     * 查询云主机备份状态<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<BackupStatusResponseData> backupStatus(BackupStatusRequest request) {
        return request(request, BackupStatusResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建密钥对
     * 此接口用来创建一对SSH密钥对。系统会为您保管密钥的公钥部分，并返回未加密私钥。您需要自行妥善保管私钥部分。 <br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<KeypairCreateResponseData> keypairCreate(KeypairCreateRequest request) {
        return request(request, KeypairCreateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-导入密钥对
     * 导入由其他工具产生的RSA密钥对的公钥部分，密钥对的类型必须是SSH或x509。 <br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<KeypairImportResponseData> keypairImport(KeypairImportRequest request) {
        return request(request, KeypairImportResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-获取云主机快照详情
     * 查询云主机快照详情<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<SnapshotDetailsResponseData> snapshotDetails(SnapshotDetailsRequest request) {
        return request(request, SnapshotDetailsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-获取云主机快照状态
     * 查询云主机快照状态<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<SnapshotStatusResponseData> snapshotStatus(SnapshotStatusRequest request) {
        return request(request, SnapshotStatusResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-获取云主机快照数量
     * 统计云主机快照个数
     */
    public CTResponse<SnapshotCountResponseData> snapshotCount(SnapshotCountRequest request) {
        return request(request, SnapshotCountResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-获取云主机快照列表
     * 查询云主机快照列表<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<InstanceSnapshotListResponseData> instanceSnapshotList(InstanceSnapshotListRequest request) {
        return request(request, InstanceSnapshotListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-批量更新云主机快照
     * 批量更改云主机快照名称和描述<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<SnapshotBatchUpdateResponseData> snapshotBatchUpdate(SnapshotBatchUpdateRequest request) {
        return request(request, SnapshotBatchUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-更新云主机快照
     * 更改云主机快照名称和描述<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<SnapshotUpdateResponseData> snapshotUpdate(SnapshotUpdateRequest request) {
        return request(request, SnapshotUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建云主机快照
     * 创建云主机快照<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项</b>：<br />&emsp;&emsp;用户配额：确认个人在不同资源池下资源配额，可以通过<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9714&data=87">用户配额查询</a>接口进行查询<br />
     */
    public CTResponse<SnapshotCreateResponseData> snapshotCreate(SnapshotCreateRequest request) {
        return request(request, SnapshotCreateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机备份详情
     * 查询云主机备份详情<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<BackupDetailsResponseData> backupDetails(BackupDetailsRequest request) {
        return request(request, BackupDetailsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机备份列表
     * 查询云主机备份列表<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<BackupListResponseData> backupList(BackupListRequest request) {
        return request(request, BackupListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建云主机元数据
     * 为云主机创建元数据，创建成功则会返回创建的元数据信息 <br />元数据的使用参考<a href="https://www.ctyun.cn/document/10026730/10387544">云主机自定义元数据</a><br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<CreateMetadataResponseData> createMetadata(CreateMetadataRequest request) {
        return request(request, CreateMetadataResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询一台或多台云主机详细信息
     * 该接口提供用户多台云主机信息查询功能，用户可以根据此接口的返回值得到多台云主机信息。该接口相较于/v4/ecs/list-instances提供更精简的云主机信息，拥有更高的查找效率<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;分页查询：当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />&emsp;&emsp;匹配查找：可以通过部分字段进行匹配筛选数据，无符合条件的为空，在指定多台云主机ID的情况下，只返回匹配到的云主机信息。推荐每次使用单个条件查找
     */
    public CTResponse<DescibeInstancesResponseData> descibeInstances(DescibeInstancesRequest request) {
        return request(request, DescibeInstancesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询一个或多个异步任务的结果
     * 该接口通过一个或多个异步任务的jobID查询任务执行的结果。<br/><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br/>&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br/><b>注意事项：</b><br/>&emsp;&emsp;异步任务结果查询：请先通过异步接口得到对应的任务ID（jobID），注：异步任务查询不支持查询订单接口（即涉及付费的接口，如创建云主机）<br/>&emsp;&emsp;多个任务查询：当前接口可以查询同一资源池内多个任务结果，查询单个任务结果，推荐使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5543&data=87">查询一个异步任务的结果</a>来查询
     */
    public CTResponse<JobQueryResponseData> jobQuery(JobQueryRequest request) {
        return request(request, JobQueryResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-修改云主机快照策略
     * 该接口提供用户修改云主机快照策略的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<SnapshotPolicyUpdateResponseData> snapshotPolicyUpdate(SnapshotPolicyUpdateRequest request) {
        return request(request, SnapshotPolicyUpdateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-停用云主机快照策略
     * 该接口提供用户停用云主机快照策略的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<SnapshotPolicyDisableResponseData> snapshotPolicyDisable(SnapshotPolicyDisableRequest request) {
        return request(request, SnapshotPolicyDisableResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-创建云主机快照策略
     * 该接口提供用户创建云主机快照策略的功能，快照策略可以通过设置相关参数，定时进行快照任务。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;用户配额：创建快照策略时需要注意配额，确认个人在不同资源池下资源配额，可以通过<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9714&data=87">用户配额查询</a>接口进行查询<br />
     */
    public CTResponse<SnapshotPolicyCreateResponseData> snapshotPolicyCreate(SnapshotPolicyCreateRequest request) {
        return request(request, SnapshotPolicyCreateResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-启用云主机快照策略
     * 该接口提供用户启用云主机快照策略的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<SnapshotPolicyEnableResponseData> snapshotPolicyEnable(SnapshotPolicyEnableRequest request) {
        return request(request, SnapshotPolicyEnableResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-快照策略绑定云主机
     * 快照策略绑定云主机<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<SnapshotPolicyBindInstancesResponseData> snapshotPolicyBindInstances(SnapshotPolicyBindInstancesRequest request) {
        return request(request, SnapshotPolicyBindInstancesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-快照策略解绑云主机
     * 该接口提供用户快照策略解绑云主机的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<SnapshotPolicyUnbindInstancesResponseData> snapshotPolicyUnbindInstances(SnapshotPolicyUnbindInstancesRequest request) {
        return request(request, SnapshotPolicyUnbindInstancesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机快照任务列表
     * 该接口提供用户查询云主机快照任务列表的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;分页查询：当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />
     */
    public CTResponse<SnapshotPolicyTaskListResponseData> snapshotPolicyTaskList(SnapshotPolicyTaskListRequest request) {
        return request(request, SnapshotPolicyTaskListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机快照策略列表
     * 该接口提供用户查询云主机快照策略列表的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;分页查询：当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />&emsp;&emsp;匹配查找：可以通过部分字段进行匹配筛选数据，无符合条件的为空
     */
    public CTResponse<SnapshotPolicyListResponseData> snapshotPolicyList(SnapshotPolicyListRequest request) {
        return request(request, SnapshotPolicyListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询云主机快照策略详情
     * 该接口提供用户查询云主机快照策略详情的功能，通过资源池ID和快照策略ID查询当前快照策略的具体信息<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<SnapshotPolicyDetailsResponseData> snapshotPolicyDetails(SnapshotPolicyDetailsRequest request) {
        return request(request, SnapshotPolicyDetailsResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-查询快照策略绑定云主机列表
     * 该接口提供用户查询快照策略绑定云主机列表的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;分页查询：当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />
     */
    public CTResponse<SnapshotPolicyInstanceListResponseData> snapshotPolicyInstanceList(SnapshotPolicyInstanceListRequest request) {
        return request(request, SnapshotPolicyInstanceListResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-立即执行云主机快照策略
     * 该接口提供用户立即执行云主机快照策略的功能，通过该接口可以立即对当前快照策略绑定的云主机执行快照<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<SnapshotPolicyExecuteResponseData> snapshotPolicyExecute(SnapshotPolicyExecuteRequest request) {
        return request(request, SnapshotPolicyExecuteResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-根据masterOrderID查询云主机ID
     * 根据输入订单号masterOrderID查询出云主机的UUID<br/><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;订单查询：通过创建云主机接口得到对应的主订单ID后，使用该接口获取订单状态，并在订单状态为成功之后获取对应的云主机ID
     */
    public CTResponse<EcsOrderQueryUuidResponseData> ecsOrderQueryUuid(EcsOrderQueryUuidRequest request) {
        return request(request, EcsOrderQueryUuidResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-删除云主机快照策略
     * 该接口提供用户删除云主机快照策略的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<SnapshotPolicyDeleteResponseData> snapshotPolicyDelete(SnapshotPolicyDeleteRequest request) {
        return request(request, SnapshotPolicyDeleteResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-用户已有资源查询
     * 根据regionID查询用户已有资源
     */
    public CTResponse<GetCustomerResourcesResponseData> getCustomerResources(GetCustomerResourcesRequest request) {
        return request(request, GetCustomerResourcesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-用户配额查询
     * 根据regionID查询用户配额
     */
    public CTResponse<GetCustomerQuotasResponseData> getCustomerQuotas(GetCustomerQuotasRequest request) {
        return request(request, GetCustomerQuotasResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-根据masterOrderId查询资源uuid
     * 根据订单号masterOrderId，输出订单状态、资源类型、资源uuid列表
     */
    public CTResponse<GetOrderUuidResponseData> getOrderUuid(GetOrderUuidRequest request) {
        return request(request, GetOrderUuidResponseData.class);
    }

    /**
     * 创建一块按量付费或包年包月云硬盘
     * 支持创建一块按量付费或包年包月云硬盘<br />
     <b>准备工作</b>：<br />
     &emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求
     &emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     &emsp;&emsp;计费模式：确认开通云硬盘的计费模式，详细查看<a href="https://www.ctyun.cn/document/10027696/10028345">计费模式</a>
     &emsp;&emsp;地域选择：选择创建云主机的资源池，详细查看<a href="https://www.ctyun.cn/document/10026730/10028695">地域和可用区</a>
     <b>注意事项：</b>
     &emsp;&emsp;成本估算：了解云硬盘的<a href="https://www.ctyun.cn/document/10027696/10043184">云硬盘计费说明</a>
     &emsp;&emsp;用户配额：确认个人在不同资源池下资源配额，可以通过<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9714&data=87">用户配额查询</a>接口进行查询
     &emsp;&emsp;异步接口：该接口为异步接口，下单成功不代表云硬盘创建成功
     &emsp;&emsp;企业项目：保证资源隔离
     */
    public CTResponse<VolumeCreateResponseData> volumeCreate(VolumeCreateRequest request) {
        return request(request, VolumeCreateResponseData.class);
    }

    /**
     * 修改云硬盘属性
     * 支持修改云硬盘的名称 
     <b>准备工作</b>：
     &emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求
     &emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<VolumeUpdateResponseData> volumeUpdate(VolumeUpdateRequest request) {
        return request(request, VolumeUpdateResponseData.class);
    }

    /**
     * 创建轻量型云主机
     * 该接口提供用户创建一台包年包月的轻量型云主机<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />&emsp;&emsp;计费模式：确认开通云主机的计费模式及计费项，详细查看<a href="https://www.ctyun.cn/document/10114925/10115664">计费方式及计费项</a><br />&emsp;&emsp;产品选型：购买轻量型云主机前，请先阅读<a href="https://www.ctyun.cn/document/10114925/10268652">实例套餐</a>了解轻量型云主机的规格套餐，并通过<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11998&data=87">查询轻量型云主机的规格套餐资源</a>接口，获取当前资源池可用轻量型云主机规格信息<br /><b>注意事项：</b><br />&emsp;&emsp;成本估算：了解云主机的计费项，详细查看<a href="https://www.ctyun.cn/document/10114925/10115703">价格总览</a>进行成本估算<br />&emsp;&emsp;用户配额：确认个人在不同资源池下资源配额，可以通过<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=9714&data=87">用户配额查询</a>接口进行查询<br />&emsp;&emsp;异步接口：该接口为异步接口，下单过后会拿到主订单ID（masterOrderID），后续可以调用<a href="https://www.ctyun.cn/document/10026730/10222980">根据masterOrderID查询云主机ID</a>，使用主订单ID来对订单情况与开通成功后的资源ID进行查询<br />
     */
    public CTResponse<EcsLiteCreateResponseData> ecsLiteCreate(EcsLiteCreateRequest request) {
        return request(request, EcsLiteCreateResponseData.class);
    }

    /**
     * 查询轻量型云主机列表
     * 该接口提供用户多台轻量型云主机信息查询功能，用户可以根据此接口的返回值得到多轻量型台云主机信息。<br /><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;分页查询：当前查询结果以分页形式进行展示，单次查询最多显示50条数据<br />
     */
    public CTResponse<EcsLiteListResponseData> ecsLiteList(EcsLiteListRequest request) {
        return request(request, EcsLiteListResponseData.class);
    }

    /**
     * 查询轻量型云主机详情
     * 该接口提供用户轻量型云主机信息查询功能，用户可以根据此接口的返回值了解自己轻量型云主机的详细信息。<br /><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;单台查询：当前接口只能查询单台云主机信息，查询多台云主机信息请使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=11981&data=87">查询轻量型云主机列表</a>进行查询<br />
     */
    public CTResponse<EcsLiteDetailsResponseData> ecsLiteDetails(EcsLiteDetailsRequest request) {
        return request(request, EcsLiteDetailsResponseData.class);
    }

    /**
     * 续订轻量型云主机
     * 该接口提供用户续订一台包年或者包月的轻量型云主机功能。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项</b>：<br />&emsp;&emsp;成本估算：了解云主机的计费项，详细查看<a href="https://www.ctyun.cn/document/10114925/10115703">价格总览</a>进行成本估算<br />&emsp;&emsp;异步接口：该接口为异步接口，下单过后会拿到主订单ID（masterOrderID），后续可以调用<a href="https://www.ctyun.cn/document/10026730/10069118">根据订单号查询uuid</a>，使用主订单ID来对订单情况与开通成功后的资源ID进行查询<br />
     */
    public CTResponse<EcsLiteResubscribeResponseData> ecsLiteResubscribe(EcsLiteResubscribeRequest request) {
        return request(request, EcsLiteResubscribeResponseData.class);
    }

    /**
     * 退订轻量型云主机
     * 该接口提供用户退订一台轻量型云主机功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项</b>：<br />&emsp;&emsp;释放前请确保文件已进行备份，释放后不可恢复。
     */
    public CTResponse<EcsLiteUnsubscribeResponseData> ecsLiteUnsubscribe(EcsLiteUnsubscribeRequest request) {
        return request(request, EcsLiteUnsubscribeResponseData.class);
    }

    /**
     * 获取轻量型云主机的VNC
     * 该接口提供用户查询一台轻量型云主机的Web管理终端地址。<br /><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />获取到轻量型云主机访问地址如下所示：<br />&emsp;&emsp;http://203.193.231.250:60001/vnc_auto.html?token=f0b6ed3f-e049-4961-8c87-07815e058662&instance_name=VM-fbb407b6(aca51c6e-3c72-47ce-894e-1e2fbfdbabf9)<br />有如上信息后，在轻量型云主机为开机状态时，直接浏览器输入访问地址进行访问
     */
    public CTResponse<EcsLiteVncDetailsResponseData> ecsLiteVncDetails(EcsLiteVncDetailsRequest request) {
        return request(request, EcsLiteVncDetailsResponseData.class);
    }

    /**
     * 轻量型云主机开机
     * 该接口提供用户开启一台轻量型云主机功能。<br/><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br/>&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br/><b>注意事项：</b><br />&emsp;&emsp;异步接口：该接口为异步接口，请求过后会拿到任务ID（jobID），后续可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5543&data=87">查询一个异步任务的结果</a>来查询操作是否成功
     */
    public CTResponse<EcsLiteStartResponseData> ecsLiteStart(EcsLiteStartRequest request) {
        return request(request, EcsLiteStartResponseData.class);
    }

    /**
     * 轻量型云主机关机
     * 该接口提供用户关闭一台轻量型云主机功能。<br/><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;异步接口：该接口为异步接口，请求过后会拿到任务ID（jobID），后续可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5543&data=87">查询一个异步任务的结果</a>来查询操作是否成功
     */
    public CTResponse<EcsLiteStopResponseData> ecsLiteStop(EcsLiteStopRequest request) {
        return request(request, EcsLiteStopResponseData.class);
    }

    /**
     * 轻量型云主机重启
     * 该接口提供用户重启一台轻量型云主机功能。<br/><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;异步接口：该接口为异步接口，请求过后会拿到任务ID（jobID），后续可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5543&data=87">查询一个异步任务的结果</a>来查询操作是否成功
     */
    public CTResponse<EcsLiteRebootResponseData> ecsLiteReboot(EcsLiteRebootRequest request) {
        return request(request, EcsLiteRebootResponseData.class);
    }

    /**
     * 轻量型云主机修改密码
     * 该接口提供用户更新轻量型云主机的密码功能，此接口为同步接口。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsLiteResetPasswordResponseData> ecsLiteResetPassword(EcsLiteResetPasswordRequest request) {
        return request(request, EcsLiteResetPasswordResponseData.class);
    }

    /**
     * 变配轻量型云主机
     * 该接口提供用户升级一台轻量型云主机规格套餐<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br/>&emsp;&emsp;成本估算：了解云主机的计费项，详细查看<a href="https://www.ctyun.cn/document/10114925/10115703">价格总览</a>进行成本估算<br />&emsp;&emsp;异步接口：该接口为异步接口，下单成功不代表业务成功。
     */
    public CTResponse<EcsLiteUpdateSpecResponseData> ecsLiteUpdateSpec(EcsLiteUpdateSpecRequest request) {
        return request(request, EcsLiteUpdateSpecResponseData.class);
    }

    /**
     * 卸载云硬盘
     * 支持云主机卸载云硬盘。 
     <b>准备工作</b>：
     &emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求
     &emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<VolumeDetachResponseData> volumeDetach(VolumeDetachRequest request) {
        return request(request, VolumeDetachResponseData.class);
    }

    /**
     * 扩容云硬盘
     * <b>准备工作</b>：
     &emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求
     &emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     &emsp;&emsp;计费模式：确认开通云硬盘的计费模式，详细查看<a href="https://www.ctyun.cn/document/10027696/10028345">计费模式</a>
     <b>注意事项：</b>
     &emsp;&emsp;成本估算：了解云硬盘的<a href="https://www.ctyun.cn/document/10027696/10059594">计费说明</a>
     */
    public CTResponse<VolumeExtendResponseData> volumeExtend(VolumeExtendRequest request) {
        return request(request, VolumeExtendResponseData.class);
    }

    /**
     * 挂载云硬盘
     * 支持云主机挂载云硬盘。
     <b>准备工作</b>：
     &emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求
     &emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<VolumeAttachResponseData> volumeAttach(VolumeAttachRequest request) {
        return request(request, VolumeAttachResponseData.class);
    }

    /**
     * 释放云硬盘
     * 支持退订一块包周期计费/按需的云硬盘。退订云硬盘后，将退还对应部分云硬盘费用。
     <b>准备工作</b>：
     &emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求
     &emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<VolumeDeleteResponseData> volumeDelete(VolumeDeleteRequest request) {
        return request(request, VolumeDeleteResponseData.class);
    }

    /**
     * 查询轻量型云主机的规格套餐资源
     * 该接口提供用户可用规格列表查询功能，可返回轻量型云主机规格的详细信息，用户可以根据此接口的返回值了解自己可使用的云主机规格有哪些。<br />您可以通过<a href="https://www.ctyun.cn/document/10114925/10268652">实例套餐</a>了解轻量型云主机的规格套餐信息<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsLiteFlavorListResponseData> ecsLiteFlavorList(EcsLiteFlavorListRequest request) {
        return request(request, EcsLiteFlavorListResponseData.class);
    }

    /**
     * 云硬盘信息查询
     * 基于磁盘ID查询云硬盘详情
     <b>准备工作</b>：
     &emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求
     &emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权
     */
    public CTResponse<VolumeShowResponseData> volumeShow(VolumeShowRequest request) {
        return request(request, VolumeShowResponseData.class);
    }

    /**
     * 云主机快照个数统计
     * 统计云主机快照个数<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsSnapshotStatisticsResponseData> ecsSnapshotStatistics(EcsSnapshotStatisticsRequest request) {
        return request(request, EcsSnapshotStatisticsResponseData.class);
    }

    /**
     * 查询云主机支持的热变配规格信息
     * 该接口提供查询当前云主机支持热变配的规格信息，用户可以根据此接口的返回值了解自己可使用的云主机规格有哪些<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项</b>：<br />&emsp;&emsp;确认云主机是否存在于当前资源池<br />&emsp;&emsp;如无法进行热变配，则返回规格结果为空
     */
    public CTResponse<LiveResizeFlavorListResponseData> liveResizeFlavorList(LiveResizeFlavorListRequest request) {
        return request(request, LiveResizeFlavorListResponseData.class);
    }

    /**
     * 云主机热变配
     * 该接口提供云主机热变配功能，即开机状态实现变更规格<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;确认当前云主机是否可进行热变配，您可以通过接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=13078&data=87">查询云主机支持的热变配规格信息</a>获取当前云主机是否可以进行热变配，以及可以热变配规格信息<br /><b>热变配当前支持规格和镜像信息为（不同资源池下的镜像和规格支持情况不同，以查询云主机支持热变配规格信息接口的返回值为准）：</b><br />支持的云主机镜像：<br />&emsp;&emsp;CentOS：CentOS 7.6 64位、CentOS 7.8 64位、CentOS 7.9 64位、CentOS 8.0 64位、CentOS 8.1 64位、CentOS 8.2 64位、CentOS 8.4 64位<br />&emsp;&emsp;CTyunOS：CTyunOS 2.0.1-21.06.4 64位、CTyunOS 3-23.01 64位<br />&emsp;&emsp;KylinOS：KylinOS V10 SP1 64位、KylinOS V10 SP2 64位<br />&emsp;&emsp;其他：openEuler 22.03 SP2 64位、UnionTechOS V20 1050u1e 64位<br />支持的云主机规格：<br />&emsp;&emsp;除二代机以外的规格
     */
    public CTResponse<LiveReiszeInstanceResponseData> liveReiszeInstance(LiveReiszeInstanceRequest request) {
        return request(request, LiveReiszeInstanceResponseData.class);
    }

    /**
     * 操作云主机监控插件
     * 支持用户批量执行升级/安装、启动、停止、卸载监控插件操作<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsAgentBatchActionResponseData> ecsAgentBatchAction(EcsAgentBatchActionRequest request) {
        return request(request, EcsAgentBatchActionResponseData.class);
    }

    /**
     * 查询云主机监控插件信息
     * 支持用户批量查询云主机监控版本、最新版本、状态、异常等信息<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsAgentBatchDetailsResponseData> ecsAgentBatchDetails(EcsAgentBatchDetailsRequest request) {
        return request(request, EcsAgentBatchDetailsResponseData.class);
    }

    /**
     * 查询云主机监控插件操作结果
     * 支持用户批量查询云主机监控插件的操作命令执行结果<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsAgentBatchResultsResponseData> ecsAgentBatchResults(EcsAgentBatchResultsRequest request) {
        return request(request, EcsAgentBatchResultsResponseData.class);
    }

    /**
     * 更新云主机实例删除保护信息
     * 更新云主机实例删除保护状态<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<UpdateDeletionProtectionResponseData> updateDeletionProtection(UpdateDeletionProtectionRequest request) {
        return request(request, UpdateDeletionProtectionResponseData.class);
    }

    /**
     * 查询文件系统关联虚机列表
     * 可以根据用户查询对应的文件系统关联的云主机列表<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<SfsVmsListResponseData> sfsVmsList(SfsVmsListRequest request) {
        return request(request, SfsVmsListResponseData.class);
    }

    /**
     * 查询虚机绑定文件系统列表
     * 可以根据虚机查询绑定的文件系统列表<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看<a href="https://www.ctyun.cn/document/10026730/10107303">构造请求 </a><br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsSfsListResponseData> ecsSfsList(EcsSfsListRequest request) {
        return request(request, EcsSfsListResponseData.class);
    }

    /**
     * 云主机挂载文件系统
     * 此接口提供用户实现云主机挂载一个或多个文件系统的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsSfsAttachResponseData> ecsSfsAttach(EcsSfsAttachRequest request) {
        return request(request, EcsSfsAttachResponseData.class);
    }

    /**
     * 云主机卸载文件系统
     * 此接口提供用户实现云主机卸载一个或多个文件系统的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsSfsDetachResponseData> ecsSfsDetach(EcsSfsDetachRequest request) {
        return request(request, EcsSfsDetachResponseData.class);
    }

    /**
     * 云主机组批量移除云主机
     * 此接口提供用户实现云主机组中移除多台云主机的功能<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsAffinityGroupUnbindInstancesResponseData> ecsAffinityGroupUnbindInstances(EcsAffinityGroupUnbindInstancesRequest request) {
        return request(request, EcsAffinityGroupUnbindInstancesResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-节省关机一台云主机
     * 该接口提供用户对一台云主机节省关机功能，请求下发后云主机变为节省关机中（shelving）状态，待异步任务完成后，云主机变为节省关机（shelve）状态。<br /><b>准备工作：</b><br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br /><b>注意事项：</b><br />&emsp;&emsp;单台操作：当前接口只能操作单台云主机，关闭多台云主机请使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8304&data=87">关闭多台云主机</a>进行操作<br />&emsp;&emsp;异步接口：该接口为异步接口，当云主机状态变为节省关机（shelve）状态时，异步操作结果成功
     */
    public CTResponse<EcsShelveInstanceResponseData> ecsShelveInstance(EcsShelveInstanceRequest request) {
        return request(request, EcsShelveInstanceResponseData.class);
    }

    /**
     * 一类节点-*-云主机ctecs-节省关机多台云主机
     * 该接口提供用户节省关机多台云主机功能，请求下发后云主机变为节省关机中（shelving）状态，待异步任务完成后，云主机变为节省关机（shelve）状态。<br /><b>准备工作：</b><br/>&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br/>&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br/><b>注意事项：</b><br />&emsp;&emsp;多台操作：当前接口进行批量操作，关闭一台云主机建议使用接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=8297&data=87">关闭一台云主机</a>进行操作<br/>&emsp;&emsp;异步接口：该接口为异步接口，当云主机状态变为节省关机（shelve）状态时，异步操作结果成功
     */
    public CTResponse<EcsBatchShelveInstancesResponseData> ecsBatchShelveInstances(EcsBatchShelveInstancesRequest request) {
        return request(request, EcsBatchShelveInstancesResponseData.class);
    }

    /**
     * 查询GPU云主机驱动版本
     * 该接口提供用户使用GPU 云主机规格查询可用驱动版本。<br /><b>准备工作</b>：<br />&emsp;&emsp;构造请求：在调用前需要了解如何构造请求，详情查看构造请求<br />&emsp;&emsp;认证鉴权：openapi请求需要进行加密调用，详细查看认证鉴权<br />
     */
    public CTResponse<EcsGpuDriverListResponseData> ecsGpuDriverList(EcsGpuDriverListRequest request) {
        return request(request, EcsGpuDriverListResponseData.class);
    }

}
