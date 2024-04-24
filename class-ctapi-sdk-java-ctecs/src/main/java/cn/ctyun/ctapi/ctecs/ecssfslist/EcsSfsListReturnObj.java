package cn.ctyun.ctapi.ctecs.ecssfslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <查询虚机绑定文件系统列表>
 * Entity: EcsSfsListReturnObj
 */
public class EcsSfsListReturnObj {
    /**
     * totalCount
     * 总记录数
     */
    private Integer totalCount;
    /**
     * results
     * 分页明细
     */
    private EcsSfsListResults[] results;

    /**
     * set totalCount
     * @param totalCount 总记录数
     * @return this
     */
    public EcsSfsListReturnObj withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * set results
     * @param results 分页明细
     * @return this
     */
    public EcsSfsListReturnObj withResults(EcsSfsListResults[] results) {
        this.results = results;
        return this;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public EcsSfsListResults[] getResults() {
        return results;
    }

    public void setResults(EcsSfsListResults[] results) {
        this.results = results;
    }
}
