package cn.ctyun.ctapi.ctecs.rebootinstance;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-重启一台云主机>
 * Entity: RebootInstanceReturnObj
 */
public class RebootInstanceReturnObj {
    /**
     * jobID
     * 重启任务ID，您可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5543&data=87">查询一个异步任务的结果</a>来查询操作是否成功
     */
    private String jobID;

    /**
     * set jobID
     * @param jobID 重启任务ID，您可以调用<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5543&data=87">查询一个异步任务的结果</a>来查询操作是否成功
     * @return this
     */
    public RebootInstanceReturnObj withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }
}
