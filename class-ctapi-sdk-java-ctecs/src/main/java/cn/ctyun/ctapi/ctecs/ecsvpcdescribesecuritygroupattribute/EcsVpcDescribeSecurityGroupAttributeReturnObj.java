package cn.ctyun.ctapi.ctecs.ecsvpcdescribesecuritygroupattribute;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询用户安全组详情>
 * Entity: EcsVpcDescribeSecurityGroupAttributeReturnObj
 */
public class EcsVpcDescribeSecurityGroupAttributeReturnObj {
    /**
     * results
     * 分页明细
     */
    private EcsVpcDescribeSecurityGroupAttributeResults[] results;

    /**
     * set results
     * @param results 分页明细
     * @return this
     */
    public EcsVpcDescribeSecurityGroupAttributeReturnObj withResults(EcsVpcDescribeSecurityGroupAttributeResults[] results) {
        this.results = results;
        return this;
    }

    public EcsVpcDescribeSecurityGroupAttributeResults[] getResults() {
        return results;
    }

    public void setResults(EcsVpcDescribeSecurityGroupAttributeResults[] results) {
        this.results = results;
    }
}
