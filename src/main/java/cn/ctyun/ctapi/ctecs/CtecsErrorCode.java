package cn.ctyun.ctapi.ctecs;

public enum CtecsErrorCode {
    OPENAPI_PATTERNCHECK_NOTVALID_200(200, "Openapi_PatternCheck_NotValid", "900", "请求参数无效"),

    ECS_REGIONINFO_EMPTY_200(200, "Ecs_RegionInfo_Empty", "900", "资源池信息为空"),

    OPENAPI_EBSCHECK_QUOTAEXCEED_200(200, "Openapi_EbsCheck_QuotaExceed", "900", "1、单个主机的磁盘个数超出系统限额2、单次创建磁盘个数超出系统限额3、单个订单磁盘大小不合理超出系统限额4、单笔订单磁盘合计超出系统限额"),

    OPENAPI_KMSCHECK_UNKNOWNERROR_200(200, "Openapi_KmsCheck_UnknownError", "900", "磁盘检查失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_IMPLEMENTATION_ERROR_200(200, "Openapi_Implementation_Error", "900", "请求参数错误"),

    OPENAPI_QUATOCHECK_UNKNOWNERROR_200(200, "Openapi_QuatoCheck_UnknownError", "900", "内部错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_FLAVORADMIN_ACCESSFAILED_200(200, "Openapi_FlavorAdmin_AccessFailed", "900", "查询云主机规格失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_FLAVORADMIN_FORMATERROR_200(200, "Openapi_FlavorAdmin_FormatError", "900", "查询云主机规格信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_ECSFORMAT_FORMATERROR_200(200, "Openapi_EcsFormat_FormatError", "900", "查询云主机信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SALEYACOS_ACCESSFAILED_200(200, "Openapi_SaleYacos_AccessFailed", "900", "查询售罄信息错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SALEFORMATS_FORMATERROR_200(200, "Openapi_SaleFormats_FormatError", "900", "查询售罄信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SALECHECK_UNKNOWNERROR_200(200, "Openapi_SaleCheck_UnknownError", "900", "售罄信息检查失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_ECSCHECK_UNKNOWNERROR_200(200, "Openapi_EcsCheck_UnknownError", "900", "云主机检查失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_WORKORDER_ACCESSFAILED_200(200, "Openapi_Workorder_AccessFailed", "900", "资源订单信息数据异常，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SALECHECK_UNKOWNERROR_200(200, "Openapi_SaleCheck_UnkownError", "900", "云主机规格检查失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_EBSCHECK_NOTSUPPORT_200(200, "Openapi_EbsCheck_NotSupport", "900", "数据盘类型不支持"),

    OPENAPI_KMSCHECK_NOTSUPPORT_200(200, "Openapi_KmsCheck_NotSupport", "900", "磁盘加密不支持"),

    OPENAPI_KMSYACOS_ACCESSFAILED_200(200, "Openapi_KmsYacos_AccessFailed", "900", "查询密钥信息错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_KMSFORMAT_FORMATERROR_200(200, "Openapi_KmsFormat_FormatError", "900", "查询密钥信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_EBSCHECK_NOTFOUND_200(200, "Openapi_EbsCheck_NotFound", "900", "未找到对应的密钥信息，请确认输入的密钥信息是否有效"),

    OPENAPI_VPCFORMAT_FORMATERROR_200(200, "Openapi_VpcFormat_FormatError", "900", "查询VPC信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_VPCCHECK_NOTFOUND_200(200, "Openapi_VpcCheck_NotFound", "900", "未找到对应的VPC信息，请确认输入的VPC信息是否有效"),

    OPENAPI_SUBNETCHECK_NOTFOUND_200(200, "Openapi_SubnetCheck_NotFound", "900", "未找到对应的子网信息，请确认输入的子网信息是否有效"),

    OPENAPI_QUOTACHECK_QUOTAEXCEED_200(200, "Openapi_QuotaCheck_QuotaExceed", "900", "用户限额信息超出系统限额"),

    OPENAPI_SUBNETFORMAT_FORMATERROR_200(200, "Openapi_SubnetFormat_FormatError", "900", "查询vpc ip信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_VPCCHECK_UNKNOWNERROR_200(200, "Openapi_VpcCheck_UnknownError", "900", "vpc检查失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_PUBLICIPCHECK_NOTFOUND_200(200, "Openapi_PublicIpCheck_NotFound", "900", "未找到对应的公网ip地址，请确认输入的ip信息是否有效"),

    OPENAPI_KEYPAIRCHECK_NOTFOUND_200(200, "Openapi_KeypairCheck_NotFound", "900", "未找到对应的密钥对，请确认输入的密钥对信息是否有效"),

    OPENAPI_VMGROUPCHECK_NOTFOUND_200(200, "Openapi_VmgroupCheck_NotFound", "900", "未找到对应的云主机组，请确认输入的云主机组信息是否有效"),

    OPENAPI_SECGROUPSCHECK_NOTFOUND_200(200, "Openapi_SecGroupsCheck_NotFound", "900", "未找到对应的安全组，请确认输入的安全组组信息是否有效"),

    OPENAPI_ADMIN_ACCESSFAILED_200(200, "Openapi_Admin_AccessFailed", "900", "查询用户资源池信息失败，请重试。如果多次尝试失败，请提交工单。"),

    OPENAPI_QUOTACHECK_UNKNOWNERROR_200(200, "Openapi_QuotaCheck_UnknownError", "900", "配额检查失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_CTAPI_ACCESSFAILED_200(200, "Openapi_Ctapi_AccessFailed", "900", "1、连接ctapi服务超时2、ctapi请求异常"),

    OPENAPI_FLAVORFORMAT_FORMATERROR_200(200, "Openapi_FlavorFormat_FormatError", "900", "查询规格信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_DECCHECK_UNKNOWNERROR_200(200, "Openapi_DecCheck_UnknownError", "900", "云主机检查失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_DECFORMAT_FORMATERROR_200(200, "Openapi_DecFormat_FormatError", "900", "查询专属云信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_ECSCHECK_NOTFOUND_200(200, "Openapi_EcsCheck_notFound", "900", "未找到对应云主机，请确认云主机ID是否正确"),

    ECS_INSTANCE_NAMENOTVALID_200(200, "Ecs_Instance_NameNotValid", "900", "云主机名称无效"),

    ECS_INSTANCE_PARAMETERINVALID_200(200, "Ecs_Instance_ParameterInvalid", "900", "请求参数错误"),

    ECS_PARAMETER_INVALIDERROR_200(200, "Ecs_Parameter_InvalidError", "900", "请求参数错误"),

    ECS_REGIONINFO_ACCESSFAILED_200(200, "Ecs_RegionInfo_AccessFailed", "900", "查询资源池失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_INSTANCE_STATENOTSTOPPED_200(200, "Ecs_Instance_StateNotStopped", "900", "云主机必须处于关机状态，请确认云主机状态"),

    ECS_INSTANCE_STATENOTRUNNING_200(200, "Ecs_Instance_StateNotRunning", "900", "云主机必须处于运行状态，请确认云主机状态"),

    ECS_INSTANCE_STATENOTVALID_200(200, "Ecs_Instance_StateNotValid", "900", "云主机状态错误，请确认云主机状态"),

    ECS_INSTANCE_NAMENOCHANGE_200(200, "Ecs_Instance_NameNoChange", "900", "名称没有发生变化，请确认输入的名称信息是否有效"),

    ECS_INSTANCE_STATUSNOTVALID_200(200, "Ecs_Instance_StatusNotValid", "900", "当前云主机状态不可进行操作，请确认云主机状态"),

    ECS_INSTANCE_IMAGENOTFOUND_200(200, "Ecs_Instance_ImageNotFound", "900", "未找到对应镜像，请确认镜像ID是否正确"),

    ECS_TASK_ASYNCRESULTEMPTY_200(200, "Ecs_Task_AsyncResultEmpty", "900", "未查询到对应任务，请检查您的jobID是否正确"),

    ECS_INSTANCE_ORDERINFONOTEXISTS_200(200, "Ecs_Instance_OrderInfoNotExists", "900", "查不到实例的订单信息，请确认"),

    ECS_STATUSCHECK_NOTVALID_200(200, "Ecs_StatusCheck_NotValid", "900", "云主机状态无效，请确认云主机状态是否符合操作条件"),

    ECS_INSTANCE_STATUSNOTSTOPPED_200(200, "Ecs_Instance_StatusNotStopped", "900", "云主机没有处于关机状态，请确认云主机状态"),

    ECS_INSTANCE_STATUSNOTRUNNING_200(200, "Ecs_Instance_StatusNotRunning", "900", "云主机没有处于运行状态，请确认云主机状态"),

    ECS_IMAGE_NOTFOUND_200(200, "Ecs_Image_NotFound", "900", "镜像不存在或不符合要求，请确认镜像信息是否正确"),

    ECS_INSTANCE_ACTIONFAILED_200(200, "Ecs_Instance_ActionFailed", "900", "云主机执行动作失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_PARAMETER_REGIONID_200(200, "Ecs_Parameter_RegionID", "900", "请求参数错误"),

    ECS_PARAMETER_ERROR_200(200, "Ecs_Parameter_Error", "900", "请求参数错误"),

    ECS_ECSCHECK_NOTFOUND_200(200, "Ecs_EcsCheck_NotFound", "900", "云主机不存在"),

    ECS_AFFINITYGROUP_NOTFOUND_200(200, "Ecs_AffinityGroup_NotFound", "900", "未找到云主机组信息"),

    ECS_AFFINITYGROUP_NOTVALID_200(200, "Ecs_AffinityGroup_NotValid", "900", "（绑定判断时使用）该云主机已经处于某个云主机组中（解绑判断时使用）该云主机并未处于该云主机组中"),

    ECS_AFFINITYGROUP_OPERATEFAIL_200(200, "Ecs_AffinityGroup_OperateFail", "900", "主机组操作失败"),

    ECS_PATTERNCHECK_SORTNOTVALID_200(200, "Ecs_PatternCheck_SortNotValid", "900", "排序参数不合法"),

    ECS_REGIONINFO_DATADAMAGED_200(200, "Ecs_RegionInfo_DataDamaged", "900", "查询资源池信息不符预期，请重试。如果多次尝试失败，请提交工单"),

    ECS_REGIONVERSION_NOTSUPPORT_200(200, "Ecs_RegionVersion_NotSupport", "900", "当前API不支持该资源池，请切换资源池重试"),

    ECS_PARAMETER_INVALIDAZNAME_200(200, "Ecs_Parameter_InvalidAzName", "900", "资源池中不存在该azName，请确认azName是否有效"),

    ECS_INSTANCE_DISKTYPENOTSUPPORT_200(200, "Ecs_Instance_DiskTypeNotSupport", "900", "该资源池不支持此系统盘或数据盘磁盘类型，请确认参数是否正确"),

    ECS_USERQUOTA_ACCESSFAILED_200(200, "Ecs_UserQuota_AccessFailed", "900", "查询用户配额信息失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_USERQUOTA_EMPTY_200(200, "Ecs_UserQuota_Empty", "900", "查询用户配额信息为空，请重试。如果多次尝试失败，请提交工单"),

    ECS_USERQUOTA_DATADAMAGED_200(200, "Ecs_UserQuota_DataDamaged", "900", "查询用户配额信息不符预期，请重试。如果多次尝试失败，请提交工单"),

    ECS_INSTANCE_FLAVORNOTFOUND_200(200, "Ecs_Instance_FlavorNotFound", "900", "未找到对应的云主机规格，请确认输入的云主机规格信息是否有效"),

    ECS_INSTANCE_QUOTAEXCEED_200(200, "Ecs_Instance_QuotaExceed", "900", "用户限额信息超出系统限额"),

    ECS_INSTANCE_UNKNOWNERROR_200(200, "Ecs_Instance_UnknownError", "900", "配额检查失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_AFFINITYGROUP_QUERYFAIL_200(200, "Ecs_AffinityGroup_QueryFail", "900", "未找到云主机组信息"),

    ECS_KEYPAIRNAMECHECK_NULL_200(200, "Ecs_KeypairNameCheck_Null", "900", "密钥对名称不可为空"),

    ECS_KEYPAIRNAMECHECK_NOTVALID_200(200, "Ecs_KeypairNameCheck_NotValid", "900", "密钥对名称无效，应满足以下规则：名称长度为2-63字符,只能由数字、字母、-组成,不能以数字和-开头、以-结尾"),

    ECS_ECSWORKORDER_ACCESSFAILED_200(200, "Ecs_EcsWorkorder_AccessFailed", "900", "查询云主机失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_ECSFORMAT_FORMATERROR_200(200, "Ecs_EcsFormat_FormatError", "900", "查询云主机信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    ECS_OSTYPECHECK_NOTVALID_200(200, "Ecs_OSTypeCheck_NotValid", "900", "云主机操作系统类型无效，请检查输入参数是否正确"),

    ECS_KEYPAIRCHECK_NOTEXIST_200(200, "Ecs_KeypairCheck_NotExist", "900", "密钥对不存在，请重新输入"),

    ECS_KEYPAIRPROJECTCHECK_NOTMATCH_200(200, "Ecs_KeypairProjectCheck_NotMatch", "900", "密钥对与云主机不处于同一企业项目"),

    ECS_CHECK_NOTFOUND_200(200, "Ecs_Check_NotFound", "900", "云主机不存在"),

    ECS_KEYPAIRCHECK_NOTATTACH_200(200, "Ecs_KeypairCheck_NotAttach", "900", "云主机未绑定密钥对，请重新输入"),

    ECS_IAM_ACTIONERROR_200(200, "Ecs_IAM_ActionError", "900", "用户权限失败，请检查是否有该api权限"),

    ECS_USERPERMISSION_ACCESSFAILED_200(200, "Ecs_UserPermission_AccessFailed", "900", "查询用户权限失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_USERPERMISSION_EMPTY_200(200, "Ecs_UserPermission_Empty", "900", "查询用户权限信息为空，请重试。如果多次尝试失败，请提交工单"),

    ECS_USERPERMISSION_DATADAMAGED_200(200, "Ecs_UserPermission_DataDamaged", "900", "查询用户权限信息不符预期，请重试。如果多次尝试失败，请提交工单"),

    ECS_ORDERCHECK_INVALIDPROJECTID_200(200, "Ecs_OrderCheck_InvalidProjectID", "900", "企业项目ID不存在，请确认企业项目ID是否有效"),

    ECS_USERDETAIL_ACCESSFAILED_200(200, "Ecs_UserDetail_AccessFailed", "900", "查询用户详情信息失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_USERDETAIL_EMPTY_200(200, "Ecs_UserDetail_Empty", "900", "查询用户详情信息为空，请重试。如果多次尝试失败，请提交工单"),

    ECS_USERDETAIL_DATADAMAGED_200(200, "Ecs_UserDetail_DataDamaged", "900", "查询用户详情信息不符预期，请重试。如果多次尝试失败，请提交工单"),

    ECS_PARAMETER_INVALIDCYCLECOUNT_200(200, "Ecs_Parameter_InvalidCycleCount", "900", "请求参数错误"),

    ECS_PARAMETER_INVALIDCYCLETYPE_200(200, "Ecs_Parameter_InvalidCycleType", "900", "请求参数错误：[cycleType]参数错误，请重新输入"),

    ECS_METADATACHECK_NOTFOUND_200(200, "Ecs_MetadataCheck_NotFound", "900", "云主机元数据不存在，请确认云主机ID是否有效"),

    ECS_ORDERCHECK_RESOURCELIMITED_200(200, "Ecs_OrderCheck_ResourceLimited", "900", "批量资源不能大于10个"),

    ECS_INSTANCEIDCHECK_REPEAT_200(200, "Ecs_InstanceIDCheck_Repeat", "900", "云主机ID不能重复，请检查参数是否正确"),

    ECS_INSTANCE_FLAVORCPUNOTVALID_200(200, "Ecs_Instance_FlavorCPUNotValid", "900", "flavorCPU类型为int并且数量应大于0，请输入有效的flavorCPU"),

    ECS_INSTANCE_FLAVORRAMNOTVALID_200(200, "Ecs_Instance_FlavorRAMNotValid", "900", "flavorRAM类型为int并且数量应大于0，请输入有效的flavorRAM"),

    ECS_INSTANCE_FLAVORNOCHANGE_200(200, "Ecs_Instance_FlavorNoChange", "900", "规格没有发生变化，请输入有效的规格信息"),

    ECS_INSTANCE_FLAVORQUERYFAIL_200(200, "Ecs_Instance_FlavorQueryFail", "900", "查询支持的变配规格失败"),

    ECS_INSTANCE_FLAVORZONECHECKFAIL_200(200, "Ecs_Instance_FlavorZoneCheckFail", "900", "云主机规格与云主机不在同一个可用区，请输入同一可用区下的规格信息"),

    ECS_INSTANCE_FLAVORNOTSUPPORT_200(200, "Ecs_Instance_FlavorNotSupport", "900", "只能变配到同代或更高代规格"),

    ECS_USERCONSUMPTION_ACCESSFAILED_200(200, "Ecs_UserConsumption_AccessFailed", "900", "查询用户已用资源量失败"),

    ECS_USERCONSUMPTION_EMPTY_200(200, "Ecs_UserConsumption_Empty", "900", "用户已用资源量信息为空"),

    ECS_USERCONSUMPTION_DATADAMAGED_200(200, "Ecs_Userconsumption_DataDamaged", "900", "用户已用资源信息不符预期"),

    ECS_PARAMETER_INVALIDREGIONID_200(200, "Ecs_Parameter_InvalidRegionID", "900", "请求参数错误"),

    ECS_INSTANCE_NETCARDINVALID_200(200, "Ecs_Instance_NetcardInvalid", "900", "必须且只能配置一个主网卡，请确认输入的主网卡信息是否有效"),

    ECS_INSTANCE_VPCNOPERMISSION_200(200, "Ecs_Instance_VpcNoPermission", "900", "用户无该VPC所属企业项目权限，请确认输入的VPC信息是否有效"),

    ECS_INSTANCE_FIXEDIPREPEAT_200(200, "Ecs_Instance_FixedIPRepeat", "900", "内网IP不可重复，请确认输入的内网IP是否有效"),

    ECS_FIXEDIP_NOTVALID_200(200, "Ecs_FixedIP_notValid", "900", "内网ip地址已被使用或不属于所选子网网段"),

    ECS_INSTANCE_PUBLICIPINVALID_200(200, "Ecs_Instance_PublicIpInvalid", "900", "自动分配公网ip参数错误 "),

    ECS_INSTANCE_VMGROUPNOPERMISSION_200(200, "Ecs_Instance_VmGroupNoPermission", "900", "用户无该云主机组所属企业项目权限，请确认输入的云主机组是否有效"),

    ECS_INSTANCE_VMGROUPQUOTAFAILED_200(200, "Ecs_Instance_VmGroupQuotaFailed", "900", "云主机组配额校验失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_INSTANCE_FLAVORSOLDOUT_200(200, "Ecs_Instance_FlavorSoldOut", "900", "该规格云主机已售罄，请提交工单"),

    ECS_INSTANCE_EBSSOLDOUT_200(200, "Ecs_Instance_EbsSoldOut", "900", "该规格磁盘已售罄，请提交工单"),

    ECS_KEYPAIR_ACCESSFAILED_200(200, "Ecs_Keypair_AccessFailed", "900", "密钥对查询失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_KEYPAIR_FORMATERROR_200(200, "Ecs_Keypair_FormatError", "900", "密钥对格式不正确，请重试。如果多次尝试失败，请提交工单"),

    ECS_KEYPAIRCHECK_EXISTED_200(200, "Ecs_KeypairCheck_Existed", "900", "密钥对已存在，请检查输入参数是否正确"),

    ECS_KEYPAIR_CREATEFAILED_200(200, "Ecs_Keypair_CreateFailed", "900", "密钥对创建失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_KEYPAIR_PUBLICKEYFORMATERROR_200(200, "Ecs_Keypair_PublickeyFormatError", "900", "公钥格式不正确,密钥对的类型必须是ssh或x509，请重新输入"),

    ECS_KEYPAIR_QUERYFAILED_200(200, "Ecs_Keypair_QueryFailed", "900", "密钥对查询失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_INSTANCE_PUBLICIPSOLDOUT_200(200, "Ecs_Instance_PublicIpSoldOut", "900", "该公网ip已售罄，请提交工单"),

    ECS_INSTANCE_SNAPSHOTEXISTED_200(200, "Ecs_Instance_SnapShotExisted", "900", "云主机存在快照，不允许该操作"),

    ECS_INSTANCE_RESOURCELIMITED_200(200, "Ecs_Instance_ResourceLimited", "900", "批量资源不能大于10个，请确认输入的信息是否有效"),

    ECS_INSTANCE_STATUSEXPIRED_200(200, "Ecs_Instance_StatusExpired", "900", "当前云主机已过期，请确认云主机状态"),

    ECS_INSTANCE_STATUSFREEZE_200(200, "Ecs_Instance_StatusFreeze", "900", "当前云主机已冻结，请确认云主机状态"),

    ECS_INSTANCE_ONLYSUPPORTSHUTOFF_200(200, "Ecs_Instance_OnlySupportShutoff", "900", "只有关机状态才可以进行此操作，请确认云主机状态"),

    ECS_INSTANCE_CUSTOMERNOTSUPPORT_200(200, "Ecs_Instance_CustomerNotSupport", "900", "预付费用户不支持自动审批退订，请联系管理员"),

    ECS_INSTANCE_DELZABBIXERROR_200(200, "Ecs_Instance_DelZabbixError", "900", "删除云主机自定义监控异常，请联系管理员"),

    ECS_INSTANCE_RESOURCEEMPTY_200(200, "Ecs_Instance_ResourceEmpty", "900", "查询资源结果为空，请重试。如果多次尝试失败，请提交工单"),

    ECS_SNAPSHOT_NAMENOTVALID_200(200, "Ecs_Snapshot_NameNotValid", "900", "快照名称无效，应满足以下规则：长度为2-63字符,包含字母（区分大小写）、数字和特殊字符（~!@#$%^*_-+{[]}:,.?）的组合"),

    ECS_SNAPSHOTPOLICY_NAMENOTVALID_200(200, "Ecs_SnapshotPolicy_NameNotValid", "900", "云主机快照策略名称长度为2-63字符，由数字、字母、-组成，且只能以字母开头，以数字和字母结尾。请输入有效的快照策略名称"),

    ECS_SNAPSHOTPOLICY_NAMEREPEAT_200(200, "Ecs_SnapshotPolicy_NameRepeat", "900", "快照策略名称重复，请输入有效的快照策略名称"),

    ECS_SNAPSHOTPOLICY_QUOTAEXCEED_200(200, "Ecs_SnapshotPolicy_QuotaExceed", "900", "用户快照策略配额已达到上限"),

    ECS_SNAPSHOTPOLICY_CREATEERROR_200(200, "Ecs_SnapshotPolicy_CreateError", "900", "创建快照策略失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_SNAPSHOTPOLICY_IDNOTVALID_200(200, "Ecs_SnapshotPolicy_IDNotValid", "900", "快照策略ID长度应为32字节，请输入有效的快照策略ID"),

    ECS_SNAPSHOTPOLICY_ACCESSFAILED_200(200, "Ecs_SnapshotPolicy_AccessFailed", "900", "查询快照策略失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_SNAPSHOTPOLICY_NOTFOUND_200(200, "Ecs_SnapshotPolicy_NotFound", "900", "快照策略查询结果为空，请确认输入的快照策略ID是否有效"),

    ECS_SNAPSHOTPOLICY_UPDATEERROR_200(200, "Ecs_SnapshotPolicy_UpdateError", "900", "更新快照策略失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_SNAPSHOTPOLICY_ENABLEERROR_200(200, "Ecs_SnapshotPolicy_EnableError", "900", "启用快照策略失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_SNAPSHOTPOLICY_DISABLEERROR_200(200, "Ecs_SnapshotPolicy_DisableError", "900", "停用快照策略失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_SNAPSHOTPOLICY_DELETEERROR_200(200, "Ecs_SnapshotPolicy_DeleteError", "900", "删除快照策略失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_SNAPSHOTPOLICY_BINDNOTVALID_200(200, "Ecs_SnapshotPolicy_BindNotValid", "900", "当前快照策略已绑定了云主机"),

    ECS_SNAPSHOTPOLICY_BINDERROR_200(200, "Ecs_SnapshotPolicy_BindError", "900", "快照策略绑定云主机失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_SNAPSHOTPOLICY_UNBINDERROR_200(200, "Ecs_SnapshotPolicy_UnBindError", "900", "快照策略解绑云主机失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_SNAPSHOTPOLICY_NOTBOUND_200(200, "Ecs_SnapshotPolicy_NotBound", "900", "快照策略未绑定云主机"),

    ECS_SNAPSHOTPOLICY_EXECUTEERROR_200(200, "Ecs_SnapshotPolicy_ExecuteError", "900", "执行快照策略失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_SNAPSHOTPOLICY_TASKGETERROR_200(200, "Ecs_SnapshotPolicy_TaskGetError", "900", "查询快照策略任务列表失败，请重试。如果多次尝试失败，请提交工单"),

    IMAGE_IMAGEFORMAT_FORMATERROR_200(200, "Image_ImageFormat_FormatError", "900", "查询镜像信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    IMAGE_IMAGEADMIN_ACCESSFAILED_200(200, "Image_ImageAdmin_AccessFailed", "900", "查询镜像信息错误，请重试。如果多次尝试失败，请提交工单"),

    IMAGE_IMAGECHECK_NOTFOUND_200(200, "Image_ImageCheck_NotFound", "900", "镜像不存在或不符合要求，请确认镜像信息是否正确"),

    IMAGE_IMAGECHECK_UNKNOWNERROR_200(200, "Image_ImageCheck_UnknownError", "900", "查询镜像信息失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_PARAMETER_INVALIDNOTVALID_200(200, "Ecs_Parameter_InvalidNotValid", "900", "请求参数非法"),

    ECS_INSTANCE_OSTYPENOTALLOW_200(200, "Ecs_Instance_OsTypeNotAllow", "900", "云主机操作系统类型不被允许，请确定云主机操作系统是否为linux"),

    ECS_KEYPAIR_NOTEXIST_200(200, "Ecs_Keypair_NotExist", "900", "密钥对不存在 ，请确认输入密钥对信息是否正确"),

    ECS_INSTANCE_NOTBINDKEYPAIR_200(200, "Ecs_Instance_NotBindKeypair", "900", "云主机未绑定该密钥对，请确定密钥对名称是否正确"),

    ECS_KEYPAIR_NAMENOTVALID_200(200, "Ecs_Keypair_NameNotValid", "900", "密钥对名称无效，应满足以下规则：名称长度为2-63字符,只能由数字、字母、-组成，不能以数字和-开头、以-结尾，请输入有效的密钥对名称"),

    ECS_KEYPAIR_NAMEEXISTED_200(200, "Ecs_Keypair_NameExisted", "900", "密钥对名称重复，请输入有效的密钥对名称"),

    ECS_KEYPAIR_PUBLICKEYNOTVALID_200(200, "Ecs_Keypair_PublicKeyNotValid", "900", "公钥格式不正确,密钥对的类型必须是ssh或x509，请输入有效的公钥"),

    ECS_KEYPAIR_PROJECTNOTSAME_200(200, "Ecs_Keypair_ProjectNotSame", "900", "密钥对与云主机不处于相同企业项目，请确定密钥对与云主机的企业项目信息"),

    ECS_REGIONVERSION_NOTSUPPORTED_200(200, "Ecs_RegionVersion_NotSupported", "900", "当前API不支持该资源池，请切换资源池重试"),

    ECS_INSTANCE_METADATAEMPTY_200(200, "Ecs_Instance_MetadataEmpty", "900", "云主机不存在元数据信息，请确认云主机ID是否正确"),

    ECS_METADATA_NOTFOUND_200(200, "Ecs_Metadata_NotFound", "900", "未找到元数据信息，请确定元数据ID是否正确"),

    ECS_INSTANCE_METADATANOTEXIST_200(200, "Ecs_Instance_MetadataNotExist", "900", "云主机不存在该元数据信息，请确认云主机ID和元数据字段是否正确"),

    ECSBACKUP_BACKUP_QUERYFAILED_200(200, "EcsBackup_Backup_QueryFailed", "900", "查询云主机备份失败"),

    ECSBACKUP_REGIONINFO_EMPTY_200(200, "EcsBackup_RegionInfo_Empty", "900", "查询资源池信息为空或资源池不存在，请确认资源池ID是否有效"),

    ECSBACKUP_POLICYCHECK_NOTFOUND_200(200, "EcsBackup_PolicyCheck_NotFound", "900", "备份策略未找到"),

    ECSBACKUP_POLICYCHECK_UNBINDREPO_200(200, "EcsBackup_PolicyCheck_UnbindRepo", "900", "备份策略未绑定备份存储库"),

    ECSBACKUP_POLICYCHECK_UNBINDECS_200(200, "EcsBackup_PolicyCheck_UnbindEcs", "900", "备份策略未绑定云主机"),

    ECSBACKUP_ADMIN_ACCESSFAILED_200(200, "EcsBackup_Admin_AccessFailed", "900", "系统错误"),

    OPENAPI_NAMECHECK_NOTVALID_200(200, "Openapi_NameCheck_NotValid", "900", "name格式非法"),

    ECSBACKUP_PARAMETER_REGIONID_200(200, "EcsBackup_Parameter_RegionID", "900", "可见资源池信息为空，请确认regionID是否正确"),

    ECSBACKUP_INSTANCE_FLAVORSOLDOUT_200(200, "EcsBackup_Instance_FlavorSoldOut", "900", "该规格云主机已售罄，请提交工单"),

    ECSBACKUP_INSTANCE_EBSSOLDOUT_200(200, "EcsBackup_Instance_EbsSoldOut", "900", "该规格磁盘已售罄"),

    ECSBACKUP_FIXEDIP_NOTVALID_200(200, "EcsBackup_FixedIP_NotValid", "900", "内网ip地址已被使用或不属于所选子网网段"),

    ECSBACKUP_PUBLICIPCHECK_NOTFOUND_200(200, "EcsBackup_PublicIpCheck_NotFound", "900", "未找到对应的公网ip地址，请确认输入的ip信息是否有效"),

    ECSBACKUP_PUBLICIPCHECK_SOLDOUT_200(200, "EcsBackup_PublicIpCheck_SoldOut", "900", "该公网ip已售罄，请提交工单"),

    ECS_SNAPSHOT_NAMEEXISTED_200(200, "Ecs_Snapshot_NameExisted", "900", "快照名称重复，请输入有效的快照名称"),

    ECS_SNAPSHOT_INFONOTFOUND_200(200, "Ecs_Snapshot_InfoNotFound", "900", "未查询到云主机快照信息，请确认云主机快照是否存在"),

    ECS_SNAPSHOT_NAMENULL_200(200, "Ecs_Snapshot_NameNull", "900", "快照名称不可为空，请输入有效的快照名称"),

    ECS_SNAPSHOT_NAMENOCHANGE_200(200, "Ecs_Snapshot_NameNoChange", "900", "快照名称无变化，请输入有效的快照名称"),

    ECS_SNAPSHOT_DESCRIPTIONNOCHANGE_200(200, "Ecs_Snapshot_DescriptionNoChange", "900", "快照描述无变化，请输入有效的快照描述信息"),

    ECS_SNAPSHOT_IDNULL_200(200, "Ecs_Snapshot_IDNull", "900", "快照ID不能为空，请输入有效的快照ID"),

    ECSBACKUP_UPDATEINFO_NOTVALID_200(200, "EcsBackup_UpdateInfo_NotValid", "900", "更新云主机备份信息参数错误：备份名称与备份描述不可全为空"),

    ECSBACKUP_NAMECHECK_NOCHANGE_200(200, "EcsBackup_NameCheck_NoChange", "900", "名字未改变"),

    ECSBACKUP_REPOCHECK_NOTFOUND_200(200, "EcsBackup_RepoCheck_NotFound", "900", "存储库不存在"),

    ECSBACKUP_PARAMETER_ERROR_200(200, "EcsBackup_Parameter_Error", "900", "请求参数错误"),

    ECSBACKUP_POLICYCHECK_NOTVALID_200(200, "EcsBackup_PolicyCheck_NotValid", "900", "该备份策略已经绑定了存储库 / 该备份策略未绑定存储库"),

    ECSBACKUP_REPOCHECK_EXPIRED_200(200, "EcsBackup_RepoCheck_Expired", "900", "存储库已到期"),

    ECSBACKUP_POLICYCHECK_NOTCHANGE_200(200, "EcsBackup_PolicyCheck_NotChange", "900", "修改内容无效"),

    ECSBACKUP_POLICYCHECK_OVERQUOTA_200(200, "EcsBackup_PolicyCheck_OverQuota", "900", "用户云主机备份策略超出限额"),

    ECS_SNAPSHOT_IDREPEAT_200(200, "Ecs_Snapshot_IDRepeat", "900", "快照ID重复，请输入有效的快照ID"),

    ECS_SNAPSHOT_STATUSNOTVALID_200(200, "Ecs_Snapshot_StatusNotValid", "900", "快照状态无效,应符合以下状态：创建中,成功,恢复中,错误，请重新输入"),

    ECS_SNAPSHOT_SYSDISKNOTFOUND_200(200, "Ecs_Snapshot_SysDiskNotFound", "900", "未查询到快照的云主机系统盘信息，请检查系统盘是否存在"),

    ECS_SNAPSHOT_IMAGENOTFOUND_200(200, "Ecs_Snapshot_ImageNotFound", "900", "快照所用镜像不存在，请检查镜像信息是否有效"),

    ECS_SNAPSHOT_FLAVORNOTFOUND_200(200, "Ecs_Snapshot_FlavorNotFound", "900", "快照所用规格不存在，请检查规格信息是否有效"),

    ECS_SNAPSHOT_EBSNOTFOUND_200(200, "Ecs_Snapshot_EbsNotFound", "900", "快照所用数据盘不存在，请检查数据盘信息是否有效"),

    ECS_EBSINFO_ACCESSFAILED_200(200, "Ecs_EbsInfo_AccessFailed", "900", "查询云硬盘信息失败"),

    ECS_EBSINFO_DATADAMAGED_200(200, "Ecs_EbsInfo_DataDamaged", "900", "云硬盘信息数据不符预期"),

    OPENAPI_VMGROUPCHECK_UNKNOWERROR_200(200, "Openapi_VmgroupCheck_UnknowError", "900", "云主机组检查失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SALEFORMAT_FORMATERROR_200(200, "Openapi_SaleFormat_FormatError", "900", "查询售罄信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_AUTORENEW_UNKNOWNERROR_200(200, "Openapi_AutoRenew_UnknownError", "900", "续订信息检查失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_ORDER_PROCFAILED_200(200, "Ecs_Order_ProcFailed", "900", "订单处理失败"),

    ECSBACKUP_REPOSITORY_NOTFOUND_200(200, "EcsBackup_Repository_NotFound", "900", "未找到备份库信息"),

    ECSBACKUP_WORKORDER_CREATEFAIL_200(200, "EcsBackup_WorkOrder_CreateFail", "900", "创建备份失败"),

    ECSBACKUP_REPOSITORY_QUERYFAIL_200(200, "EcsBackup_Repository_QueryFail", "900", "云主机备份存储库查询失败"),

    ECSBACKUP_REPOSITORY_EXPIRED_200(200, "EcsBackup_Repository_Expired", "900", "云主机备份存储库已到期"),

    ECSBACKUP_REPOSITORY_FREEZE_200(200, "EcsBackup_Repository_Freeze", "900", "云主机备份存储库已冻结"),

    ECSBACKUP_BACKUP_NAMEEXIST_200(200, "EcsBackup_Backup_NameExist", "900", "云主机备份名称已存在"),

    ECSBACKUP_WORKORDER_UPDATEFAIL_200(200, "EcsBackup_WorkOrder_UpdateFail", "900", "云主机备份修改失败"),

    ECSBACKUP_BACKUP_NOCHANGE_200(200, "EcsBackup_Backup_NoChange", "900", "备份信息无变化"),

    ECSBACKUP_BACKUP_NAMEREPEAT_200(200, "EcsBackup_Backup_NameRepeat", "900", "云主机备份名称重复"),

    ECSBACKUP_BACKUP_IDREPEAT_200(200, "EcsBackup_Backup_IdRepeat", "900", "云主机备份ID重复"),

    ECS_SALEYACOS_ACCESSFAILED_200(200, "Ecs_SaleYacos_AccessFailed", "900", "查询售罄信息错误，请重试。如果多次尝试失败，请提交工单"),

    ECS_SALECHECK_UNKNOWERROR_200(200, "Ecs_SaleCheck_UnknowError", "900", "查询售罄信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    ECSBACKUP_ORDER_PROCFAILED_200(200, "EcsBackup_Order_ProcFailed", "900", "订单处理失败"),

    ECSBACKUP_BACKUPCHECK_NOTFOUND_200(200, "EcsBackup_BackupCheck_NotFound", "900", "未找到备份"),

    ECS_SALEFORMAT_FORMATERROR_200(200, "Ecs_Saleformat_FormatError", "900", "查询售罄信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    ECSBACKUP_BACKUP_NOTFOUND_200(200, "EcsBackup_Backup_NotFound", "900", "未找到云主机备份信息"),

    ECSBACKUP_WORKORDER_QUERYFAIL_200(200, "EcsBackup_WorkOrder_QueryFail", "900", "查询云主机备份失败"),

    ECS_AFFINITYGROUP_NOCHANGE_200(200, "Ecs_AffinityGroup_NoChange", "900", "名称没有发生变化"),

    ECSBACKUP_REGIONINFO_DATADAMAGED_200(200, "EcsBackup_RegionInfo_DataDamaged", "900", "资源池信息不符合预期"),

    ECS_FLAVOR_NOTFOUND_200(200, "Ecs_Flavor_NotFound", "900", "未找到规格信息，请确定规格ID是否正确"),

    ECS_AFFINITYGROUP_NOTBOUND_200(200, "Ecs_AffinityGroup_NotBound", "900", "该云主机未绑定主机组"),

    ECS_AFFINITYGROUP_ECSBOUND_200(200, "Ecs_AffinityGroup_EcsBound", "900", "主机组已绑定"),

    ECS_AFFINITYGROUP_ECSUNBIND_200(200, "Ecs_AffinityGroup_EcsUnbind", "900", "云主机并未处于指定的云主机组"),

    ECS_ORDERCHECK_NOTFOUND_200(200, "Ecs_OrderCheck_NotFound", "900", "未找到当前masterOrderID对应订单"),

    ECS_ORDERCHECK_CPUQUOTALIMITED_200(200, "Ecs_OrderCheck_CpuQuotaLimited", "900", "实例规格vcpu配额不足"),

    ECS_FLAVOR_ZONENOTSAME_200(200, "Ecs_Flavor_ZoneNotSame", "900", "云主机规格与云主机不在同一个可用区，请重新输入有效的规格ID"),

    ECS_FLAVOR_NOTSUPPORT_200(200, "Ecs_Flavor_NotSupport", "900", "仅允许变配到同代系规格，请重新输入有效的规格ID"),

    ECS_FLAVOR_NOCHANGE_200(200, "Ecs_Flavor_NoChange", "900", "规格没有发生变化"),

    ECS_ORDER_USERFROZEN_200(200, "Ecs_Order_UserFrozen", "900", "用户受限，可能是被冻结的账户，或者余额不足"),

    OPENAPI_ECSWORKORDER_ACTIONERROR_200(200, "Openapi_Ecsworkorder_ActionError", "900", "添加共享网卡失败"),

    ECS_STATE_NOTVALID_200(200, "Ecs_State_NotValid", "900", "云主机状态非法"),

    ECS_COMMON_CHECKERROR_200(200, "Ecs_Common_CheckError", "900", "内部错误，请重试"),

    ECS_COMMON_TIMEOUT_200(200, "Ecs_Common_TimeOut", "900", "请求超时"),

    UNKNOWN_REGIONINFO_EMPTY_200(200, "Unknown_RegionInfo_Empty", "900", "regionID有误，资源信息为空"),

    OPENAPI_CUSTOMERPATTERNCHECK_NOTVALID_200(200, "Openapi_CustomerPatternCheck_NotValid", "900", "请求参数无效"),

    OPENAPI_CUSTOMERADMIN_ACCESSFAILED_200(200, "Openapi_CustomerAdmin_AccessFailed", "900", "查询用户信息错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_CUSTOMERADMIN_FORMATERROR_200(200, "Openapi_CustomerAdmin_FormatError", "900", "查询用户信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_CUSTOMERCHECK_UNKNOWNERROR_200(200, "Openapi_CustomerCheck_UnknownError", "900", "查询用户信息失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_PERMISSIONADMIN_ACCESSFAILED_200(200, "Openapi_PermissionAdmin_AccessFailed", "900", "查询用户许可信息错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_PERMISSIONADMIN_FORMATERROR_200(200, "Openapi_PermissionAdmin_FormatError", "900", "查询用户资源池许可信息错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_PERMISSIONCHECK_UNKNOWNERROR_200(200, "Openapi_PermissionCheck_UnknownError", "900", "查询用户许可信息失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_ECSWORKORDER_ACCESSFAILED_200(200, "Openapi_EcsWorkorder_AccessFailed", "900", "内部错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_AUTORENEWCHECK_UNKNOWNERROR_200(200, "Openapi_AutoRenewCheck_UnknownError", "900", "内部错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_RESOURCESPATTERNCHECK_NOTVALID_200(200, "Openapi_ResourcespatternCheck_NotValid", "900", "请求参数无效"),

    OPENAPI_RESOURCESWORKORDER_ACCESSFAILED_200(200, "Openapi_ResourcesWorkorder_AccessFailed", "900", "查询用户已有资源错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_RESOURCESFORMAT_FORMATERROR_200(200, "Openapi_ResourcesFormat_FormatError", "900", "查询用户已有资源格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_RESOURCESCHECK_UNKNOWNERROR_200(200, "Openapi_ResourcesCheck_UnknownError", "900", "查询用户已有资源失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_VPCWORKORDER_ACCESSFAILED_200(200, "Openapi_VpcWorkorder_AccessFailed", "900", "查询VPC信息错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SUBNETWORKORDER_ACCESSFAILED_200(200, "Openapi_SubnetWorkorder_AccessFailed", "900", "查询vpc ip信息错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_PUBLICIPWORKORDER_ACCESSFAILED_200(200, "Openapi_PublicIpWorkorder_AccessFailed", "900", "查询公网ip信息错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_PUBLICIPFORMAT_FORMATERROR_200(200, "Openapi_PublicIpFormat_FormatError", "900", "查询公网ip信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_KEYPAIRWORKORDER_ACCESSFAILED_200(200, "Openapi_KeypairWorkorder_AccessFailed", "900", "查询密钥对信息错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_KEYPAIRFORMAT_FORMATERROR_200(200, "Openapi_KeypairFormat_FormatError", "900", "查询密钥对信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_KEYPAIRCHECK_UNKNOWNERROR_200(200, "Openapi_KeypairCheck_UnknownError", "900", "密钥对检查失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_VMGROUPWORKORDER_ACCESSFAILED_200(200, "Openapi_VmgroupWorkorder_AccessFailed", "900", "查询云主机组信息错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_VMGROUPFORMAT_FORMATERROR_200(200, "Openapi_VmgroupFormat_FormatError", "900", "查询云主机组信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_VMGROUPCHECK_UNKNOWNERROR_200(200, "Openapi_VmgroupCheck_UnknownError", "900", "云主机组检查失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SECGROUPSWORKORDER_ACCESSFAILED_200(200, "Openapi_SecGroupsWorkorder_AccessFailed", "900", "查询安全组组信息错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SECGROUPSFORMAT_FORMATERROR_200(200, "Openapi_SecGroupsFormat_FormatError", "900", "查询安全组信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SECGROUPSCHECK_UNKNOWNERROR_200(200, "Openapi_SecGroupsCheck_UnknownError", "900", "安全组检查失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_EBSWORKORDER_ACCESSFAILED_200(200, "Openapi_EbsWorkorder_AccessFailed", "900", "查询云硬盘失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_ECSSNAPSHOTWORKORDER_ACCESSFAILED_200(200, "Openapi_EcsSnapshotWorkorder_AccessFailed", "900", "查询云主机快照失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_RESOURCESADMIN_ACCESSFAILED_200(200, "Openapi_ResourcesAdmin_AccessFailed", "900", "内部错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_RESOURCESADMIN_FORMATERROR_200(200, "Openapi_ResourcesAdmin_FormatError", "900", "内部错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_PARAMETER_INVALIDNOTVALID_200(200, "Openapi_Parameter_InvalidNotValid", "900", "请求参数无效：[主机状态]不在可取范围['active', 'shutoff', 'expired']内"),

    OPENAPI_SNAPSHOTWORKORDER_ACCESSFAILED_200(200, "Openapi_Snapshotworkorder_AccessFailed", "900", "查询快照信息失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_INSTANCEWORKORDER_ACCESSFAILED_200(200, "Openapi_InstanceWorkorder_AccessFailed", "900", "查询云主机失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_INSTANCECHECK_UNKNOWNERROR_200(200, "Openapi_InstanceCheck_UnknownError", "900", "云主机检查失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SNAPSHOTWORKORDER_CREATEERROR_200(200, "Openapi_SnapshotWorkorder_CreateError", "900", "创建快照失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SNAPSHOTWORKORDER_DELETEERROR_200(200, "Openapi_SnapshotWorkorder_DeleteError", "900", "删除快照失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SNAPSHOTWORKORDER_UPDATEERROR_200(200, "Openapi_SnapshotWorkorder_UpdateError", "900", "更新快照失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SNAPSHOTWORKORDER_ACTIONERROR_200(200, "Openapi_SnapshotWorkorder_ActionError", "900", "快照恢复云主机失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SNAPSHOTPOLICYFORMAT_FORMATERROR_200(200, "Openapi_SnapshotPolicyFormat_FormatError", "900", "查询快照策略信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    LITEECS_INSTANCE_PARAMETERINVALID_200(200, "LiteEcs_Instance_ParameterInvalid", "900", "请求参数错误"),

    LITEECS_USERVISIBLEREGIONS_DATADAMAGED_200(200, "LiteEcs_UserVisibleRegions_DataDamaged", "900", "查询用戶可见资源池信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    LITEECS_USERVISIBLEREGIONS_ACCESSFAILED_200(200, "LiteEcs_UserVisibleRegions_AccessFailed", "900", "查询用戶可见资源池失败，请重试。如果多次尝试失败，请提交工单"),

    LITEECS_PARAMETER_INVALIDREGIONID_200(200, "LiteEcs_Parameter_InvalidRegionID", "900", "请求参数错误"),

    LITEECS_INSTANCE_QUOTAUNKNOWNERROR_200(200, "LiteEcs_Instance_QuotaUnknownError", "900", "配额检查失败，请重试。如果多次尝试失败，请提交工单"),

    LITEECS_USERPERMISSION_ACCESSFAILED_200(200, "LiteEcs_UserPermission_AccessFailed", "900", "查询用户权限失败，请重试。如果多次尝试失败，请提交工单"),

    LITEECS_USERPERMISSION_DATADAMAGED_200(200, "LiteEcs_UserPermission_DataDamaged", "900", "查询用户权限信息不符预期，请重试。如果多次尝试失败，请提交工单"),

    LITEECS_ORDERCHECK_INVALIDPROJECTID_200(200, "LiteEcs_OrderCheck_InvalidProjectID", "900", "企业项目ID不存在，请确认企业项目ID是否有效"),

    LITEECS_ORDERCHECK_USERFORBIDDENONDEMAND_200(200, "LiteEcs_OrderCheck_UserForbiddenOnDemand", "900", "用户不允许订购按需类订单，请确认用户是否有该操作权限"),

    LITEECS_PARAMETER_INVALIDCYCLECOUNT_200(200, "LiteEcs_Parameter_InvalidCycleCount", "900", "请求参数错误"),

    LITEECS_PARAMETER_INVALIDCYCLETYPE_200(200, "LiteEcs_Parameter_InvalidCycleType", "900", "请求参数错误：[cycleType]参数错误，请重新输入"),

    LITEECS_INSTANCE_ORDERINFONOTEXISTS_200(200, "LiteEcs_Instance_OrderInfoNotExists", "900", "查不到实例的订单信息，请确认"),

    LITEECS_INSTANCE_RENEWNOTSUPPORTONDEMAND_200(200, "LiteEcs_Instance_RenewNotSupportOndemand", "900", "续费仅支持包年包月实例，请确认实例类型"),

    LITEECS_INSTANCE_FLAVORNOTSUPPORT_200(200, "LiteEcs_Instance_FlavorNotSupport", "900", "轻量型云主机只支持套餐升级操作(即目标套餐的CPU、内存、系统盘、带宽均大于等于当前套餐)，不支持套餐降级操作"),

    LITEECS_INSTANCE_ONLYSUPPORTSHUTOFF_200(200, "LiteEcs_Instance_OnlySupportShutoff", "900", "只有关机状态才可以进行此操作，请确认云主机状态"),

    LITEECS_INSTANCE_CUSTOMERNOTSUPPORT_200(200, "LiteEcs_Instance_CustomerNotSupport", "900", "预付费用户不支持自动审批退订，请确认用户信息"),

    LITEECS_INSTANCE_STATUSNOTSTOPPED_200(200, "LiteEcs_Instance_StatusNotStopped", "900", "云主机 没有处于关机状态，请确认云主机状态"),

    LITEECS_INSTANCE_STATUSNOTRUNNING_200(200, "LiteEcs_Instance_StatusNotRunning", "900", "云主机没有处于运行状态，请确认云主机状态"),

    OPENAPI_DECWORKORDER_ACCESSFAILED_200(200, "Openapi_DecWorkorder_AccessFailed", "900", "查询专属云信息失败，请重试。如果多次尝试失败，请提交工单"),

    DEC_INSTANCE_PUBLICIPQUOTALIMITED_200(200, "Dec_Instance_PublicIpQuotaLimited", "900", "弹性公网IP配额有限"),

    DEC_USERVISIBLEREGIONS_DATADAMAGED_200(200, "Dec_UserVisibleRegions_DataDamaged", "900", "查询用戶可见资源池信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    DEC_USERVISIBLEREGIONS_ACCESSFAILED_200(200, "Dec_UserVisibleRegions_AccessFailed", "900", "查询用戶可见资源池失败，请重试。如果多次尝试失败，请提交工单"),

    DEC_INSTANCE_SECURITYGROUPNOPERMISSION_200(200, "Dec_Instance_SecurityGroupNoPermission", "900", "用户无该安全组所属企业项目权限，请确认输入的安全组组是否有效"),

    ECS_INSTANCE_PUBLICIPQUOTALIMITED_200(200, "Ecs_Instance_PublicIpQuotaLimited", "900", "弹性公网IP超出系统限额"),

    ECS_ORDERCHECK_USERFORBIDDENONDEMAND_200(200, "Ecs_OrderCheck_UserForbiddenOnDemand", "900", "用户不允许订购按需类订单，请确认用户是否有该操作权限"),

    ECS_USERVISIBLEREGIONS_DATADAMAGED_200(200, "Ecs_UserVisibleRegions_DataDamaged", "900", "查询用戶可见资源池信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    ECS_USERVISIBLEREGIONS_ACCESSFAILED_200(200, "Ecs_UserVisibleRegions_AccessFailed", "900", "查询用戶可见资源池失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_INSTANCE_SECURITYGROUPNOPERMISSION_200(200, "Ecs_Instance_SecurityGroupNoPermission", "900", "用户无该安全组所属企业项目权限，请确认输入的安全组组是否有效"),

    ECS_INSTANCE_RENEWNOTSUPPORTONDEMAND_200(200, "Ecs_Instance_RenewNotSupportOndemand", "900", "续费仅支持包年包月实例，请确认实例类型"),

    ECS_METADATAWORKORDER_ACCESSFAILED_200(200, "Ecs_MetadataWorkorder_AccessFailed", "900", "查询元数据信息失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_AFFINITYGROUPCHECK_NOPERMISSION_200(200, "Ecs_AffinityGroupCheck_NoPermission", "900", "用户无该云主机组所属企业项目权限"),

    OPENAPI_KEYPAIRWORKORDER_UNBINDERROR_200(200, "Openapi_KeypairWorkorder_UnBindError", "900", "解绑密钥对失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_KEYPAIRWORKORDER_CREATEERROR_200(200, "Openapi_KeypairWorkorder_CreateError", "900", "创建或导入密钥对失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_KEYPAIRWORKORDER_BINDERROR_200(200, "Openapi_KeypairWorkorder_BindError", "900", "绑定密钥对失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_KEYPAIRWORKORDER_DELETEERROR_200(200, "Openapi_KeypairWorkorder_DeleteError", "900", "删除密钥对失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_METADATAWORKORDER_CREATEERROR_200(200, "Openapi_MetadataWorkorder_CreateError", "900", "创建元数据失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_METADATAWORKORDER_DELETEERROR_200(200, "Openapi_MetadataWorkorder_DeleteError", "900", "删除元数据失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_METADATAWORKORDER_UPDATEERROR_200(200, "Openapi_MetadataWorkorder_UpdateError", "900", "更新元数据失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_METADATAWORKORDER_ACCESSFAILED_200(200, "Openapi_MetadataWorkorder_AccessFailed", "900", "查询元数据信息失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SNAPSHOTFORMAT_FORMATERROR_200(200, "Openapi_SnapshotFormat_FormatError", "900", "查询快照信息格式失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SNAPSHOTWORKORDER_RESTOREERROR_200(200, "Openapi_SnapshotWorkorder_RestoreError", "900", "快照恢复云主机失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_SECGROUPSCHECK_UNKNOWERROR_200(200, "Openapi_SecGroupsCheck_UnknowError", "900", "安全组检查失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_PARAMETER_INVALIDAUTORENEWSTATUS_200(200, "Ecs_Parameter_InvalidAutoRenewStatus", "900", "请求参数错误：autoRenewStatus只支持0或1"),

    ECS_SNAPSHOTPOLICY_EXECUTETIMENOTVALID_200(200, "Ecs_SnapshotPolicy_ExecuteTimeNotValid", "900", "[快照执行时间]中含有不在规定[0, 23]区间整数的值，请输入有效的快照执行时间"),

    ECS_SNAPSHOTPOLICY_CYCLEDAYNOTNULL_200(200, "Ecs_SnapshotPolicy_CycleDayNotNull", "900", "[云主机快照周期（天数）]不能为空，请输入有效的云主机快照周期（天数）"),

    ECS_SNAPSHOTPOLICY_CYCLEDAYTYPENOTVALID_200(200, "Ecs_SnapshotPolicy_CycleDayTypeNotValid", "900", "云主机快照周期（天数）类型错误，请输入有效的云主机快照周期（天数）"),

    ECS_SNAPSHOTPOLICY_CYCLEDAYSCOPENOTVALID_200(200, "Ecs_SnapshotPolicy_CycleDayScopeNotValid", "900", "[云主机快照周期（天数）]不在取值范围[1, 10]内，请输入有效的云主机快照周期（天数）"),

    ECS_SNAPSHOTPOLICY_CYCLEWEEKNOTNULL_200(200, "Ecs_SnapshotPolicy_CycleWeekNotNull", "900", "[云主机快照周期（星期）]不能为空，请输入有效的云主机快照周期（星期）"),

    ECS_SNAPSHOTPOLICY_CYCLEWEEKNOTVALID_200(200, "Ecs_SnapshotPolicy_CycleWeekNotValid", "900",
            "[云主机快照周期（星期）]有值不在规定列表[0, 1, 2, 3, 4, 5, 6]内，请输入有效的云主机快照周期（星期）"),

    ECS_SNAPSHOTPOLICY_RETENTIONDAYNOTNULL_200(200, "Ecs_SnapshotPolicy_RetentionDayNotNull", "900", "[云主机快照保留天数]不能为空，请输入有效的云主机快照保留天数"),

    ECS_SNAPSHOTPOLICY_RETENTIONDAYTYPENOTVALID_200(200, "Ecs_SnapshotPolicy_RetentionDayTypeNotValid", "900", "云主机快照保留天数类型错误，请输入有效的云主机快照保留天数"),

    ECS_SNAPSHOTPOLICY_RETENTIONDAYSCOPENOTVALID_200(200, "Ecs_SnapshotPolicy_RetentionDayScopeNotValid", "900", "[云主机快照保留天数]不在取值范围[1, 365]内，请输入有效的云主机快照保留天数"),

    ECS_SNAPSHOTPOLICY_RETENTIONNUMNOTNULL_200(200, "Ecs_SnapshotPolicy_RetentionNumNotNull", "900", "[云主机快照保留数量]不能为空，请输入有效的云主机快照保留数量"),

    ECS_SNAPSHOTPOLICY_RETENTIONNUMTYPENOTVALID_200(200, "Ecs_SnapshotPolicy_RetentionNumTypeNotValid", "900", "云主机快照保留数量类型错误，请输入有效的云主机快照保留数量"),

    ECS_SNAPSHOTPOLICY_RETENTIONNUMSCOPENOTVALID_200(200, "Ecs_SnapshotPolicy_RetentionNumScopeNotValid", "900", "[云主机快照保留数量]不在取值范围[1, 30]内，请输入有效的云主机快照保留数量"),

    ECS_SNAPSHOTPOLICY_STATUSNOTVALID_200(200, "Ecs_SnapshotPolicy_StatusNotValid", "900", "快照策略已经停用"),

    ECS_SNAPSHOTPOLICY_INSTANCEGETERROR_200(200, "Ecs_SnapshotPolicy_InstanceGetError", "900", "查询快照策略绑定云主机列表失败，请重试。如果多次尝试失败，请提交工单"),

    IMAGE_IMAGEWORKORDER_ACCESSFAILED_200(200, "Image_ImageWorkorder_AccessFailed", "900", "查询镜像信息错误，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_ECSBACKUPWORKORDER_ACCESSFAILED_200(200, "Openapi_EcsBackupWorkorder_AccessFailed", "900", "获取备份失败"),

    ECSBACKUP_POLICYCHECK_POLICYIDNOTUUIDFORMAT_200(200, "EcsBackup_PolicyCheck_PolicyIdNotUUIDFormat", "900", "备份策略ID必须是UUID格式"),

    ECSBACKUP_REPOSITORYCHECK_POLICYNOTVALID_200(200, "EcsBackup_RepositoryCheck_PolicyNotValid", "900", "云主机备份策略状态无效"),

    ECSBACKUP_REPOSITORYCHECK_ACCESSFAILED_200(200, "EcsBackup_RepositoryCheck_AccessFailed", "900", "查询云主机存储库失败"),

    ECSBACKUP_REPOSITORYCHECK_NOTFOUND_200(200, "EcsBackup_RepositoryCheck_NotFound", "900", "存储库未找到"),

    ECSBACKUP_REPOSITORYCHECK_DATADAMAGED_200(200, "EcsBackup_RepositoryCheck_DataDamaged", "900", "存储库数据不符合预期"),

    ECSBACKUP_REPOSITORYCHECK_EXPIRED_200(200, "EcsBackup_RepositoryCheck_Expired", "900", "存储库已过期"),

    ECSBACKUP_REPOSITORYCHECK_SIZENULL_200(200, "EcsBackup_RepositoryCheck_SizeNull", "900", "存储库容量必须大于0"),

    ECSBACKUP_POLICYCHECK_INSTANCESTATENOTVALID_200(200, "EcsBackup_PolicyCheck_InstanceStateNotValid", "900", "云主机必须处于运行中或关机状态"),

    OPENAPI_ECSBACKUPWORKORDER_CREATEERROR_200(200, "Openapi_EcsBackupWorkorder_CreateError", "900", "创建备份失败"),

    OPENAPI_ECSBACKUPWORKORDER_DELETEERROR_200(200, "Openapi_EcsBackupWorkorder_DeleteError", "900", "删除云主机备份失败"),

    ECSBACKUP_REGIONINFO_ACCESSFAILED_200(200, "EcsBackup_RegionInfo_AccessFailed", "900", "查询资源池失败，请重试。如果多次尝试失败，请提交工单"),

    ECSBACKUP_INSTANCE_FLAVORNOTFOUND_200(200, "EcsBackup_Instance_FlavorNotFound", "900", "未找到对应的云主机规格，请确认输入的云主机规格信息是否有效"),

    ECSBACKUP_INSTANCE_DISKTYPENOTSUPPORT_200(200, "EcsBackup_Instance_DiskTypeNotSupport", "900", "数据盘类型不支持"),

    ECSBACKUP_INSTANCE_PUBLICIPINVALID_200(200, "EcsBackup_Instance_PublicIpInvalid", "900", "自动分配公网ip参数错误"),

    ECSBACKUP_PUBLICIPWORKORDER_ACCESSFAILED_200(200, "EcsBackup_PublicIpWorkorder_AccessFailed", "900", "查询公网ip信息错误，请重试。如果多次尝试失败，请提交工单"),

    ECSBACKUP_PUBLICIPFORMAT_FORMATERROR_200(200, "EcsBackup_PublicIpFormat_FormatError", "900", "查询公网ip信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    ECSBACKUP_ORDERCHECK_USERFORBIDDENONDEMAND_200(200, "EcsBackup_OrderCheck_UserForbiddenOnDemand", "900", "用户不允许订购按需类订单"),

    OPENAPI_ECSBACKUPWORKORDER_UPDATEERROR_200(200, "Openapi_EcsBackupWorkorder_UpdateError", "900", "更新失败"),

    OPENAPI_ECSBACKUPPARAMETER_NOTVALID_200(200, "Openapi_EcsBackupParameter_NotValid", "900", "请求参数非法"),

    OPENAPI_ECSBACKUPCHECK_UNKNOWNERROR_200(200, "Openapi_EcsBackupCheck_UnknownError", "900", "内部错误，请重试。如果多次尝试失败，请提交工单"),

    ECSBACKUP_POLICYCHECK_POLICYNAMEEXIST_200(200, "EcsBackup_PolicyCheck_PolicyNameExist", "900", "云主机备份策略名称已存在"),

    ECSBACKUP_POLICYCHECK_TIMENOTVALID_200(200, "EcsBackup_PolicyCheck_TimeNotValid", "900", "time参数错误"),

    ECSBACKUP_POLICYCHECK_STATUSNOTVALID_200(200, "EcsBackup_PolicyCheck_StatusNotValid", "900", "status仅支持0/1"),

    ECSBACKUP_POLICYCHECK_RETENTIONTYPENOTVALID_200(200, "EcsBackup_PolicyCheck_RetentionTypeNotValid", "900", "retentionType只支持num/date/all"),

    ECSBACKUP_POLICYCHECK_RETENTIONDAYNOTVALID_200(200, "EcsBackup_PolicyCheck_RetentionDayNotValid", "900", "retentionDay无效"),

    ECSBACKUP_POLICYCHECK_RETENTIONNUMNOTVALID_200(200, "EcsBackup_PolicyCheck_RetentionNumNotValid", "900", "retentionNum无效"),

    ECSBACKUP_POLICYCHECK_CYCLETYPENOTVALID_200(200, "EcsBackup_PolicyCheck_CycleTypeNotValid", "900", "cycleType只支持day或者week"),

    ECSBACKUP_POLICYCHECK_CYCLEWEEKNOTVALID_200(200, "EcsBackup_PolicyCheck_CycleWeekNotValid", "900", "cycleWeek参数错误"),

    ECSBACKUP_POLICYCHECK_CYCLEDAYNOTVALID_200(200, "EcsBackup_PolicyCheck_CycleDayNotValid", "900", "cycleDay参数错误"),

    ECSBACKUP_POLICYCHECK_NAMENOTVALID_200(200, "EcsBackup_PolicyCheck_NameNotValid", "900", "policyName命名不合法"),

    ECSBACKUP_ORDERCHECK_INVALIDPROJECTID_200(200, "EcsBackup_OrderCheck_InvalidProjectID", "900", "企业项目不存在"),

    ECSBACKUP_POLICYCHECK_PROJECTIDMISMATCH_200(200, "EcsBackup_PolicyCheck_ProjectIDMismatch", "900", "云主机备份策略企业项目ID与云主机不匹配"),

    ECSBACKUP_USERVISIBLEREGIONS_ACCESSFAILED_200(200, "EcsBackup_UserVisibleRegions_AccessFailed", "900", "查询用户可见资源池失败"),

    ECSBACKUP_REPOSITORYCHECK_NAMENOTVALID_200(200, "EcsBackup_RepositoryCheck_NameNotValid", "900", "云主机备份存储库名称无效"),

    ECSBACKUP_REPOSITORYCHECK_SIZENOTVALID_200(200, "EcsBackup_RepositoryCheck_SizeNotValid", "900", "云主机备份存储库容量不合法"),

    ECSBACKUP_REPOORDERCHECK_ONLYSUPPORTUPGRADE_200(200, "EcsBackup_RepoOrderCheck_OnlySupportUpgrade", "900", "仅支持升级云主机备份存储库容量"),

    ECSBACKUP_REPOORDERCHECK_REPOFREEZE_200(200, "EcsBackup_RepoOrderCheck_RepoFreeze", "900", "云主机备份存储库已冻结"),

    ECSBACKUP_REPOORDERCHECK_REPOEXPIRED_200(200, "EcsBackup_RepoOrderCheck_RepoExpired", "900", "云主机备份存储库已到期"),

    ECSBACKUP_REPOORDERCHECK_NOTSUPPORTONDEMAND_200(200, "EcsBackup_RepoOrderCheck_NotSupportOnDemand", "900", "不支持调整按需存储库"),

    ECSBACKUP_PARAMETER_INVALIDCYCLECOUNT_200(200, "EcsBackup_Parameter_InvalidCycleCount", "900", "请求参数错误: 最大允许包周期为60月，请重新输入"),

    ECSBACKUP_REPOSITORY_UNDERCAPACITY_200(200, "EcsBackup_Repository_Undercapacity", "900", "存储库容量不足"),

    ECSBACKUP_BACKUP_UPDATEINFONOTVALID_200(200, "EcsBackup_Backup_UpdateInfoNotValid", "900", "备份修改参数无效：请指定备份名称或描述"),

    ECSBACKUP_REPOSITORYINFO_NOTFOUND_200(200, "EcsBackup_RepositoryInfo_NotFound", "900", "云主机备份存储库未找到"),

    ECS_ORDERCHECK_ONLYSUPPORTONDEMAND_200(200, "Ecs_OrderCheck_OnlySupportOndemand", "900", "仅支持调整按需实例"),

    ECS_ORDERCHECK_MEMORYQUOTALIMITED_200(200, "Ecs_OrderCheck_MemoryQuotaLimited", "900", "实例规格内存配额不足"),

    UNKNOWN_PARAMETER_INVALIDREGIONID_200(200, "Unknown_Parameter_InvalidRegionID", "900", "请求参数错误"),

    ECS_QUERYASYNCRESULT_EMPTY_200(200, "Ecs_QueryAsyncResult_Empty", "900", " 结果为空,请检查您的jobID是否正确    "),

    OPENAPI_ECS_ACCESSFAILED_200(200, "Openapi_Ecs_AccessFailed", "900", "内部错误,请重试。如果多次尝试失败,请提交工单"),

    ECS_INSTANCE_NOTFOUND_200(200, "Ecs_Instance_NotFound", "900", "云主机不存在，请确认云主机ID是否有效 "),

    OPENAPI_VMGROUPWORKORDER_CREATEERROR_200(200, "Openapi_VmGroupWorkOrder_CreateError", "900", "云主机组创建失败 "),

    ECS_VMGROUP_POLICYNOTVALID_200(200, "Ecs_VmGroup_PolicyNotValid", "900", "云主机亲和组策略非法      "),

    ECS_QUOTACHECK_UNKNOWERROR_200(200, "Ecs_QuotaCheck_UnknowError", "900", "用户配额校验失败，请重试。 "),

    ECS_QUOTACHECK_QUOTAEXCEED_200(200, "Ecs_QuotaCheck_QuotaExceed", "900", "用户限额信息超出系统限额  "),

    ECS_AFFINITYGROUP_CREATEFAIL_200(200, "Ecs_AffinityGroup_CreateFail", "900", "主机组创建失败"),

    CS_SNAPSHOT_DESCRIPTIONNOTVALID_200(200, "cs_Snapshot_DescriptionNotValid", "900", "快照描述的字符长度不可超过256字符，请输入有效的快照描述"),

    ECS_SNAPSHOT_DESCRIPTIONNOTVALID_200(200, "Ecs_Snapshot_DescriptionNotValid", "900", "快照描述的字符长度不可超过256字符，请输入有效的快照描述  "),

    MONITOR_DATAQUERY_RESPONSEERROR_200(200, "Monitor_DataQuery_ResponseError", "900", "访问内部系统返回错误"),

    MONITOR_DATAQUERY_ACCESSFAILED_200(200, "Monitor_DataQuery_AccessFailed", "900", "访问内部系统失败"),

    ECS_MONITORHISTORYNETMETRIC_NOTVALID_200(200, "Ecs_MonitorHistoryNetMetric_NotValid", "900", "deviceIDList 必须存在"),

    OPENAPI_PARAMETER_ERROR_200(200, "Openapi_Parameter_Error", "900", "请求参数错误，可能是未传入必填项、参数类型错误、参数范围错误"),

    OPENAPI_REGIONINFO_EMPTY_200(200, "Openapi_RegionInfo_Empty", "900", "找不到资源池"),

    ECS_AFFINITYGROUP_CHECKFAIL_200(200, "Ecs_AffinityGroup_CheckFail", "900", "主机组添加云主机校验失败"),

    ECSAFFINITYGROUP_QUOTACHECK_FAILED_200(200, "EcsAffinityGroup_QuotaCheck_Failed", "900", "云主机组配额校验失败，请重试。如果多次尝试失败，请提交工单 "),

    OPENAPI_VMGROUPWORKORDER_DELETEERROR_200(200, "Openapi_VmgroupWorkorder_DeleteError", "900", "云主机组删除失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_ORDERCHECK_RESOURCEUPGRADE_200(200, "Ecs_OrderCheck_ResourceUpgrade", "900", "一次只能升级一个资源，不能批量升级"),

    OPENAPI_ECSWORDER_ACCESSFAILED_200(200, "Openapi_EcsWorder_AccessFailed", "900", "查询云主机信息失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_ECSBACKUPWORKORDER_RESTOREFAILED_200(200, "Openapi_EcsBackupWorkorder_RestoreFailed", "900", "恢复备份失败"),

    ECS_STATE_NOTSTOPPED_200(200, "Ecs_State_NotStopped", "900", "必须处于关机状态"),

    OPENAPI_ECSBACKUPWORKORDER_ABORTERROR_200(200, "Openapi_EcsBackupWorkorder_AbortError", "900", "中断备份失败"),

    OPENAPI_SNAPSHOTPOLICYADMIN_FORMATERROR_200(200, "Openapi_snapshotPolicyAdmin_FormatError", "900", "查询快照策略信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    ECS_SNAPSHOTPOLICY_UNBINDNOTVALID_200(200, "Ecs_SnapshotPolicy_UnBindNotValid", "900", "当前快照策略未绑定任何云主机实例  "),

    ECS_ORDER_ACCESSFAILED_200(200, "Ecs_Order_AccessFailed", "900", "访问订单系统失败"),

    ECS_INSTANCE_VIPEXISTED_200(200, "Ecs_Instance_VipExisted", "900", "云主机存在vip，不允许该操作"),

    ECSAFFINITYGROUP_AFFINITYGROUPCHECK_ACCESSFAILED_200(200, "EcsAffinityGroup_AffinityGroupCheck_AccessFailed", "900", "云主机组存在校验失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_SNAP6SHOTPOLICY_EXECUTETIMENOTVALID_200(200, "Ecs_Snap6shotPolicy_ExecuteTimeNotValid", "900", "[快照执行时间]中含有不在规定[0, 23]区间整数的值，请输入有效的快照执行时间 "),

    ECS_SNAPSHOTPOLICY_QUOTALIMITED_200(200, "Ecs_SnapshotPolicy_QuotaLimited", "900", "云主机快照策略配额不足"),

    ECS_PARAMETER_NOTVALID_200(200, "Ecs_Parameter_NotValid", "900", "请求参数非法"),

    OPENAPI_ECSWORKORDER_ACCESSERROR_200(200, "Openapi_EcsWorkOrder_AccessError", "900", "添加共享网卡失败"),

    ECS_EIP_CHECKFAILED_200(200, "Ecs_Eip_CheckFailed", "900", "校验云主机弹性IP失败"),

    ECS_SECGROUPS_NOTFOUND_200(200, "Ecs_SecGroups_NotFound", "900", "未找到默认安全组，请指定安全组后重试"),

    ECSBACKUP_PARAMETER_INVALIDREGIONID_200(200, "EcsBackup_Parameter_InvalidregionID", "900", "请求参数错误 "),

    OPENAPI_PERMISSIONPATTERNCHECK_NOTVALID_200(200, "Openapi_PermissionpatternCheck_NotValid", "900", "请求参数无效"),

    OPENAPI_PERMISSIONCHECK_UNKNOWERROR_200(200, "Openapi_PermissionCheck_UnknowError", "900", "查询用户许可信息失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_RESOURCESCHECK_UNKNOWERROR_200(200, "Openapi_ResourcesCheck_UnknowError", "900", "查询用户已有资源失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_QUOTACHECK_UNKNOWERROR_200(200, "Openapi_QuotaCheck_UnknowError", "900", "配额检查失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_EBSCHECK_NOTSUPPORTED_200(200, "Openapi_EbsCheck_NotSupported", "900", "数据盘类型不支持"),

    OPENAPI_KMSCHECK_UNKNOWERROR_200(200, "Openapi_KmsCheck_UnknowError", "900", "查询密钥信息失败，请重试。如果多次尝试失败，请提交工单"),

    OPENAPI_NETCARDCHECK_QUOTAEXCEED_200(200, "Openapi_NetcardCheck_QuotaExceed", "900", "网卡超出系统限额"),

    ECS_PUBLICIPWORKORDER_ACCESSFAILED_200(200, "Ecs_PublicIpWorkorder_AccessFailed", "900", "查询公网ip信息错误，请重试。如果多次尝试失败，请提交工"),

    ECS_PUBLICIPFORMAT_FORMATERROR_200(200, "Ecs_PublicIpFormat_FormatError", "900", "查询公网ip信息格式错误，请重试。如果多次尝试失败，请提交工单"),

    ECS_PUBLICIPCHECK_NOTFOUND_200(200, "Ecs_PublicIpCheck_NotFound", "900", "未找到对应的公网ip地址，请确认输入的ip信息是否有效"),

    ECS_PUBLICIPCHECK_SOLDOUT_200(200, "Ecs_PublicIpCheck_SoldOut", "900", "该公网ip已售罄，请提交工单"),

    OPENAPI_KEYPAIRCHECK_UNKNOWERROR_200(200, "Openapi_KeypairCheck_UnknowError", "900", "密钥对检查失败，请重试。如果多次尝试失败，请提交工单"),

    IMAGE_IMAGECHECK_UNKNOWERROR_200(200, "Image_ImageCheck_UnknowError", "900", "查询镜像信息失败，请重试。如果多次尝试失败，请提交工单 "),

    OPENAPI_FLAVORCHECK_UNKNOWNERROR_200(200, "Openapi_FlavorCheck_UnknownError", "900", "云主机规格检查失败，请重试。如果多次尝试失败，请提交工单 "),

    ECS_FLAVOR_QUERYFAIL_200(200, "Ecs_Flavor_QueryFail", "900", "查询支持的变配规格失败，请重试。"),

    OPENAPI_ECSCHECK_UNKNOWERROR_200(200, "Openapi_EcsCheck_UnknowError", "900", "云主机检查失败，请重试。如果多次尝试失败，请提交工单"),

    ECS_ORDERCHECK_RENEWNOTSUPPORTONDEMAND_200(200, "Ecs_OrderCheck_RenewNotSupportOndemand", "900", "续费仅支持包年包月实例，请确认实例类型"),

    ECS_ORDERCHECK_INVALIDBANDWIDTH_200(200, "Ecs_OrderCheck_InvalidBandwidth", "900", "带宽范围1Mbit/s--2000Mbit/s，请输入有效的带宽大小"),

    ECS_ORDERCHECK_RESOURCEUPGRADELIMITED_200(200, "Ecs_OrderCheck_ResourceUpgradeLimited", "900", "一次只能升级一个资源，不能批量升级"),

    ECS_QUOTAADMIN_ACCESSFAILE_200(200, "Ecs_Quotaadmin_AccessFaile", "900", "内部错误，请重试。如果多次尝试失败，请提交工单"),

    ECS_QUOTAADMIN_FORMATERROR_200(200, "Ecs_Quotaadmin_FormatError", "900", "内部错误，请重试。如果多次尝试失败，请提交工单"),

    EBS_REGIONINFO_ACCESSFAILED_200(200, "Ebs_RegionInfo_AccessFailed", "900", "查询资源池失败"),

    EBS_REGIONINFO_EMPTY_200(200, "Ebs_RegionInfo_Empty", "900", "资源池信息为空"),

    EBS_REGIONINFO_DATADAMAGED_200(200, "Ebs_RegionInfo_DataDamaged", "900", "资源池信息不符预期"),

    EBS_USERPERMISSION_ACCESSFAILED_200(200, "Ebs_UserPermission_AccessFailed", "900", "查询用户权限失败"),

    EBS_USERPERMISSION_EMPTY_200(200, "Ebs_UserPermission_Empty", "900", "用户权限信息为空"),

    EBS_USERPERMISSION_DATADAMAGED_200(200, "Ebs_UserPermission_DataDamaged", "900", "用户权限信息不符预期"),

    EBS_USERDETAIL_ACCESSFAILED_200(200, "Ebs_UserDetail_AccessFailed", "900", "查询用户详情失败"),

    EBS_USERDETAIL_EMPTY_200(200, "Ebs_UserDetail_Empty", "900", "用户详情信息为空"),

    EBS_USERDETAIL_DATADAMAGED_200(200, "Ebs_UserDetail_DataDamaged", "900", "用户详情信息不符预期"),

    EBS_USERKMS_ACCESSFAILED_200(200, "Ebs_UserKms_AccessFailed", "900", "查询用户加密密钥信息失败"),

    EBS_USERKMS_DATADAMAGED_200(200, "Ebs_UserKms_DataDamaged", "900", "用户加密密钥数据不符预期"),

    EBS_USERQUOTA_ACCESSFAILED_200(200, "Ebs_UserQuota_AccessFailed", "900", "查询用户配额失败"),

    EBS_USERQUOTA_EMPTY_200(200, "Ebs_UserQuota_Empty", "900", "用户配额信息为空"),

    EBS_USERQUOTA_DATADAMAGED_200(200, "Ebs_UserQuota_DataDamaged", "900", "用户配额信息不符预期"),

    EBS_RESOURCEINFO_ACCESSFAILED_200(200, "Ebs_ResourceInfo_AccessFailed", "900", "查询资源失败"),

    EBS_RESOURCEINFO_NOTEXISTS_200(200, "Ebs_ResourceInfo_NotExists", "900", "资源信息不存在"),

    EBS_RESOURCEINFO_DATADAMAGED_200(200, "Ebs_ResourceInfo_DataDamaged", "900", "资源信息不符预期"),

    EBS_RESOURCEORDERINFO_ACCESSFAILED_200(200, "Ebs_ResourceOrderInfo_AccessFailed", "900", "查询资源订单信息失败"),

    EBS_RESOURCEORDERINFO_NOTEXISTS_200(200, "Ebs_ResourceOrderInfo_NotExists", "900", "资源订单信息不存在"),

    EBS_RESOURCEORDERINFO_DATADAMAGED_200(200, "Ebs_ResourceOrderInfo_DataDamaged", "900", "资源订单信息不符预期"),

    EBS_USERCONSUMPTION_ACCESSFAILED_200(200, "Ebs_UserConsumption_AccessFailed", "900", "查询用户已用资源量失败"),

    EBS_USERCONSUMPTION_EMPTY_200(200, "Ebs_UserConsumption_Empty", "900", "用户已用资源信息为空"),

    EBS_USERCONSUMPTION_DATADAMAGED_200(200, "Ebs_UserConsumption_DataDamaged", "900", "用户已用资源信息不符预期"),

    EBS_USERRESOURCES_ACCESSFAILED_200(200, "Ebs_UserResources_AccessFailed", "900", "查询用户资源信息失败"),

    EBS_USERRESOURCES_DATADAMAGED_200(200, "Ebs_UserResources_DataDamaged", "900", "用户资源信息不符预期"),

    EBS_USERVISIBLEREGIONS_ACCESSFAILED_200(200, "Ebs_UserVisibleRegions_AccessFailed", "900", "查询用户可见资源池失败"),

    EBS_USERVISIBLEREGIONS_DATADAMAGED_200(200, "Ebs_UserVisibleRegions_DataDamaged", "900", "用户可见资源池信息不符预期"),

    EBS_EBSINFO_NOTEXISTS_200(200, "Ebs_EbsInfo_NotExists", "900", "磁盘不存在"),

    EBS_EBSINFO_ACCESSFAILED_200(200, "Ebs_EbsInfo_AccessFailed", "900", "查询云硬盘信息失败"),

    EBS_EBSINFO_DATADAMAGED_200(200, "Ebs_EbsInfo_DataDamaged", "900", "云硬盘信息数据不符预期"),

    EBS_SYSVOLUMEINFO_ACCESSFAILED_200(200, "Ebs_SysVolumeInfo_AccessFailed", "900", "查询云硬盘信息失败"),

    EBS_SYSVOLUMEINFO_DATADAMAGED_200(200, "Ebs_SysVolumeInfo_DataDamaged", "900", "系统盘信息数据不符预期"),

    EBS_VOLUMEOPERATE_ACCESSFAILED_200(200, "Ebs_VolumeOperate_AccessFailed", "900", "操作网络通讯失败"),

    EBS_VOLUMEOPERATE_DATADAMAGED_200(200, "Ebs_VolumeOperate_DataDamaged", "900", "操作结果数据不符预期"),

    OPENAPI_COMMON_403_200(200, "Openapi_Common_403", "900", "用户不存在, user not found"),

    REGION_REGIONINFO_ACCESSFAILED_200(200, "Region_RegionInfo_AccessFailed", "900", "资源池访问失败"),

    UNKNOWN_PARAMETER_INVALIDERROR_200(200, "Unknown_Parameter_InvalidError", "900", "请求参数有误"),

    EBS_ORDER_ACCESSFAILED_200(200, "Ebs_Order_AccessFailed", "900", "订单系统访问失败，可使用clientToken重试订单"),

    EBS_ORDER_INPROGRESS_200(200, "Ebs_Order_InProgress", "900", "订单处理中，可使用订单ID查询确认或使用原clientToken重试下单"),

    EBS_ORDER_PROCFAILED_200(200, "Ebs_Order_ProcFailed", "900", "订单处理失败。无需重试。通过errorDetail确认具体失败原因"),

    EBS_ORDER_ORDERCHANGED_200(200, "Ebs_Order_OrderChanged", "900", "订单状态变更，比如发生了撤单，取消等"),

    EBS_ORDER_ACCEPTED_200(200, "Ebs_Order_Accepted", "900", "订单已成功，资源创建中。可以使用clientToken或者返回的masterOrderID重试订单，以确认订单状态。时不返回masterResourceID及resources"),

    EBS_ORDER_REGIONSERVICEACCESSFAILED_200(200, "Ebs_Order_RegionServiceAccessFailed", "900", "访问资源池失败"),

    EBS_ORDER_USERFROZEN_200(200, "Ebs_Order_UserFrozen", "900", "用户受限，可能是被冻结的账户，或者余额不足"),

    EBS_ORDER_UNEXPECTEDRESPONSE_200(200, "Ebs_Order_UnexpectedResponse", "900", "订单返回响应不符合预期"),

    EBS_ORDER_RESOURCEDEPLOYFAILED_200(200, "Ebs_Order_ResourceDeployFailed", "900", "资源施工失败"),

    EBS_ORDERCHECK_INVALIDNAME_200(200, "Ebs_OrderCheck_InvalidName", "900", "名称非法"),

    EBS_ORDERCHECK_USERFORBIDDENONDEMAND_200(200, "Ebs_OrderCheck_UserForbiddenOnDemand", "900", "用户不允许创建按需订购资源"),

    EBS_ORDERCHECK_MULTIATTACHNOTSUPPORTED_200(200, "Ebs_OrderCheck_MultiAttachNotSupported", "900", "资源可用区不支持多主机共享挂载云硬盘"),

    EBS_ORDERCHECK_ENCRYTNOTSUPPORTED_200(200, "Ebs_OrderCheck_EncrytNotSupported", "900", "资源可用区不支持云硬盘加密"),

    EBS_ORDERCHECK_INVALIDENCRYPTKEY_200(200, "Ebs_OrderCheck_InvalidEncryptKey", "900", "密钥UUID不存在"),

    EBS_ORDERCHECK_INVALIDPROJECTID_200(200, "Ebs_OrderCheck_InvalidProjectID", "900", "订单关联的projectID不存在"),

    EBS_ORDERCHECK_DISKMODENOTSUPPORTED_200(200, "Ebs_OrderCheck_DiskModeNotSupported", "900", "不支持的磁盘模式；各资源池支持规格不同"),

    EBS_ORDERCHECK_DISKTYPENOTSUPPORTED_200(200, "Ebs_OrderCheck_DiskTypeNotSupported", "900", "不支持的磁盘类型；各资源池支持规格不同"),

    EBS_ORDERCHECK_INVALIDSIZE_200(200, "Ebs_OrderCheck_InvalidSize", "900", "云盘大小超过限制；各资源池的规格不同"),

    EBS_ORDERCHECK_DISKCOUNTQUOTALIMITED_200(200, "Ebs_OrderCheck_DiskCountQuotaLimited", "900", "云盘配额数目不足"),

    EBS_ORDERCHECK_DISKSIZEQUOTALIMITED_200(200, "Ebs_OrderCheck_DiskSizeQuotaLimited", "900", "云盘配额大小不足"),

    EBS_ORDERCHECK_TOOMANYINONEORDER_200(200, "Ebs_OrderCheck_TooManyInOneOrder", "900", "单次创建磁盘个数上限为5 <br />（当前不支持多盘批量下单，不会出现此错误"),

    EBS_ORDERCHECK_SHRINKNOTSUPPORTED_200(200, "Ebs_OrderCheck_ShrinkNotSupported", "900", "云硬盘不支持缩容"),

    EBS_ORDERCHECK_NOTALLOWEDFORONDEMAND_200(200, "Ebs_OrderCheck_NotAllowedForOnDemand", "900", "针对按需资源做续期"),

    VM_ORDERPRICE_INVALIDSYSDISKTYPE_200(200, "Vm_OrderPrice_InvalidSysDiskType", "900", "系统盘类型不正确"),

    VM_ORDERPRICE_SYSDISKSIZEERROR_200(200, "Vm_OrderPrice_SysDiskSizeError", "900", "系统盘大小不正确"),

    VM_ORDERPRICE_DISKSIZEERROR_200(200, "Vm_OrderPrice_DiskSizeError", "900", "数据盘大小不正确"),

    VM_ORDERPRICE_INVALIDDISKTYPE_200(200, "Vm_OrderPrice_InvalidDiskType", "900", "数据盘类型不正确"),

    VM_ORDERPRICE_INVALIDFLAVOR_200(200, "Vm_OrderPrice_InvalidFlavor", "900", "云主机规格不正确"),

    VM_ORDERPRICE_INVALIDIMAGE_200(200, "Vm_OrderPrice_InvalidImage", "900", "云主机镜像不正确"),

    IP_ORDERPRICE_INVALIDBANDWIDTH_200(200, "Ip_OrderPrice_InvalidBandwidth", "900", "弹性公网IP带宽大小错误"),

    EBS_ORDERPRICE_SIZEERROR_200(200, "Ebs_OrderPrice_SizeError", "900", "云硬盘大小错误"),

    UNKNOWN_ORDERPRICE_RESOURCENOTEXIST_200(200, "Unknown_OrderPrice_ResourceNotExist", "900", "资源未查询到"),

    UNKNOWN_ORDERPRICE_NOTSUPPORTONDEMAND_200(200, "Unknown_OrderPrice_NotSupportOndemand", "900", "按需资源不支持续订"),

    REGION_FLAVORSALECHECK_SALEOUT_200(200, "Region_FlavorSaleCheck_SaleOut", "900", "已售罄"),

    REGION_DEMANDCHECK_USERQUOTALIMITED_200(200, "Region_DemandCheck_UserQuotaLimited", "900", "用户配额不满足");
    CtecsErrorCode(int stateCode, String errorCode, String errorCodeInfo, String errorCodeDescribe) {
        this.stateCode = stateCode;
        this.errorCode = errorCode;
        this.errorCodeInfo = errorCodeInfo;
        this.errorCodeDescribe = errorCodeDescribe;
    }

    private int stateCode;
    private String errorCode;
    private String errorCodeInfo;
    private String errorCodeDescribe;

    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCodeInfo() {
        return errorCodeInfo;
    }

    public void setErrorCodeInfo(String errorCodeInfo) {
        this.errorCodeInfo = errorCodeInfo;
    }

    public String getErrorCodeDescribe() {
        return errorCodeDescribe;
    }

    public void setErrorCodeDescribe(String errorCodeDescribe) {
        this.errorCodeDescribe = errorCodeDescribe;
    }
}
