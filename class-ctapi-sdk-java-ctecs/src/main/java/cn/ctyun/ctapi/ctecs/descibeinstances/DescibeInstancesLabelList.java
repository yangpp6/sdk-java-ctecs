package cn.ctyun.ctapi.ctecs.descibeinstances;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询一台或多台云主机详细信息>
 * Entity: DescibeInstancesLabelList
 */
public class DescibeInstancesLabelList {
    /**
     * labelKey
     * 标签键，长度限制1~32字符
     */
    private String labelKey;
    /**
     * labelValue
     * 标签值，长度限制1~32字符
     */
    private String labelValue;

    /**
     * set labelKey
     * @param labelKey 标签键，长度限制1~32字符
     * @return this
     */
    public DescibeInstancesLabelList withLabelKey(String labelKey) {
        this.labelKey = labelKey;
        return this;
    }

    /**
     * set labelValue
     * @param labelValue 标签值，长度限制1~32字符
     * @return this
     */
    public DescibeInstancesLabelList withLabelValue(String labelValue) {
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
