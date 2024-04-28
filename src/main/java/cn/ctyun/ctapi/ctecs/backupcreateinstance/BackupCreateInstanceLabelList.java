package cn.ctyun.ctapi.ctecs.backupcreateinstance;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-备份创建一台云主机>
 * Entity: BackupCreateInstanceLabelList
 */
public class BackupCreateInstanceLabelList {
    /**
     * labelKey
     * 标签键，长度限制1~32字符，注：同一台云主机绑定多个标签时，标签键不可重复
     */
    private String labelKey;
    /**
     * labelValue
     * 标签值，长度限制1~32字符
     */
    private String labelValue;

    /**
     * set labelKey
     * @param labelKey 标签键，长度限制1~32字符，注：同一台云主机绑定多个标签时，标签键不可重复
     * @return this
     */
    public BackupCreateInstanceLabelList withLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }

    /**
     * set labelValue
     * @param labelValue 标签值，长度限制1~32字符
     * @return this
     */
    public BackupCreateInstanceLabelList withLabelValue(String labelValue) {
        this.labelValue = labelValue;
        return this;
    }

    public String getLabelKey() {
        return labelKey;
    }

    public void setLabelKey(String labelKey) {
        this.labelKey = labelKey;
    }

    public String getLabelValue() {
        return labelValue;
    }

    public void setLabelValue(String labelValue) {
        this.labelValue = labelValue;
    }
}
