package cn.ctyun.ctapi.ctecs.getcustomerquotas;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-用户配额查询>
 * Entity: GetCustomerQuotasQuotas
 */
public class GetCustomerQuotasQuotas {
    /**
     * max_count_of_nic_per_vm
     * 单台虚机可添加网卡数量上限
     */
    private Integer max_count_of_nic_per_vm;
    /**
     * security_groups_limit
     * 安全组个数上限(资源池内)
     */
    private Integer security_groups_limit;
    /**
     * nic_relate_security_group_limit
     * 网卡可绑定的安全组数量上限
     */
    private Integer nic_relate_security_group_limit;
    /**
     * security_group_rules_limit
     * 安全组规则个数上限(资源池内)
     */
    private Integer security_group_rules_limit;

    /**
     * set max_count_of_nic_per_vm
     * @param max_count_of_nic_per_vm 单台虚机可添加网卡数量上限
     * @return this
     */
    public GetCustomerQuotasQuotas withMax_count_of_nic_per_vm(Integer max_count_of_nic_per_vm) {
        this.max_count_of_nic_per_vm = max_count_of_nic_per_vm;
        return this;
    }

    /**
     * set security_groups_limit
     * @param security_groups_limit 安全组个数上限(资源池内)
     * @return this
     */
    public GetCustomerQuotasQuotas withSecurity_groups_limit(Integer security_groups_limit) {
        this.security_groups_limit = security_groups_limit;
        return this;
    }

    /**
     * set nic_relate_security_group_limit
     * @param nic_relate_security_group_limit 网卡可绑定的安全组数量上限
     * @return this
     */
    public GetCustomerQuotasQuotas withNic_relate_security_group_limit(Integer nic_relate_security_group_limit) {
        this.nic_relate_security_group_limit = nic_relate_security_group_limit;
        return this;
    }

    /**
     * set security_group_rules_limit
     * @param security_group_rules_limit 安全组规则个数上限(资源池内)
     * @return this
     */
    public GetCustomerQuotasQuotas withSecurity_group_rules_limit(Integer security_group_rules_limit) {
        this.security_group_rules_limit = security_group_rules_limit;
        return this;
    }

    public Integer getMax_count_of_nic_per_vm() {
        return max_count_of_nic_per_vm;
    }

    public void setMax_count_of_nic_per_vm(Integer max_count_of_nic_per_vm) {
        this.max_count_of_nic_per_vm = max_count_of_nic_per_vm;
    }

    public Integer getSecurity_groups_limit() {
        return security_groups_limit;
    }

    public void setSecurity_groups_limit(Integer security_groups_limit) {
        this.security_groups_limit = security_groups_limit;
    }

    public Integer getNic_relate_security_group_limit() {
        return nic_relate_security_group_limit;
    }

    public void setNic_relate_security_group_limit(Integer nic_relate_security_group_limit) {
        this.nic_relate_security_group_limit = nic_relate_security_group_limit;
    }

    public Integer getSecurity_group_rules_limit() {
        return security_group_rules_limit;
    }

    public void setSecurity_group_rules_limit(Integer security_group_rules_limit) {
        this.security_group_rules_limit = security_group_rules_limit;
    }
}
