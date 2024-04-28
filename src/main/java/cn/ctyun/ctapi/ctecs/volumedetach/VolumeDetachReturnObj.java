package cn.ctyun.ctapi.ctecs.volumedetach;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <卸载云硬盘>
 * Entity: VolumeDetachReturnObj
 */
public class VolumeDetachReturnObj {
    /**
     * diskJobID
     * 异步任务ID，可通过公共接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5865&data=87">通用任务状态查询</a>该jobID的异步任务最终执行结果
     */
    private String diskJobID;
    /**
     * diskRequestID
     * 异步任务ID，可通过公共接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5865&data=87">通用任务状态查询</a>该jobID的异步任务最终执行结果
     */
    private String diskRequestID;

    /**
     * set diskJobID
     * @param diskJobID 异步任务ID，可通过公共接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5865&data=87">通用任务状态查询</a>该jobID的异步任务最终执行结果
     * @return this
     */
    public VolumeDetachReturnObj withDiskJobID(String diskJobID) {
        this.diskJobID = diskJobID;
        return this;
    }

    /**
     * set diskRequestID
     * @param diskRequestID 异步任务ID，可通过公共接口<a href="https://eop.ctyun.cn/ebp/ctapiDocument/search?sid=25&api=5865&data=87">通用任务状态查询</a>该jobID的异步任务最终执行结果
     * @return this
     */
    public VolumeDetachReturnObj withDiskRequestID(String diskRequestID) {
        this.diskRequestID = diskRequestID;
        return this;
    }

    public String getDiskJobID() {
        return diskJobID;
    }

    public void setDiskJobID(String diskJobID) {
        this.diskJobID = diskJobID;
    }

    public String getDiskRequestID() {
        return diskRequestID;
    }

    public void setDiskRequestID(String diskRequestID) {
        this.diskRequestID = diskRequestID;
    }
}
