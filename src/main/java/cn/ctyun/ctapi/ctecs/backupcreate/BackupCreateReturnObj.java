package cn.ctyun.ctapi.ctecs.backupcreate;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-创建云主机备份>
 * Entity: BackupCreateReturnObj
 */
public class BackupCreateReturnObj {
    /**
     * results
     * 备份结果
     */
    private BackupCreateResults results;

    /**
     * set results
     * @param results 备份结果
     * @return this
     */
    public BackupCreateReturnObj withResults(BackupCreateResults results) {
        this.results = results;
        return this;
    }

    public BackupCreateResults getResults() {
        return results;
    }

    public void setResults(BackupCreateResults results) {
        this.results = results;
    }
}
