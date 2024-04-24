package cn.ctyun.ctapi.ctecs.ecsbatchrebuild;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-重装多台云主机>
 * Entity: EcsBatchRebuildRebuildInfo
 */
public class EcsBatchRebuildRebuildInfo {
    /**
     * ID
     * 云主机ID
     */
    private String ID;
    /**
     * imageID
     * 镜像ID，您可以调用[imageID](https://www.ctyun.cn/document/10027726/10040047)查看最新的天翼云具体资源池的镜像列表
     */
    private String imageID;
    /**
     * password
     * 用户密码，满足以下规则：<br />长度在8～30个字符；<br />必须包含大写字母、小写字母、数字以及特殊符号中的三项；<br />特殊符号可选：()`~!@#$%^&*_-+=｜{}[]:;'<>,.?/\且不能以斜线号 / 开头；<br />不能包含3个及以上连续字符；<br />Linux镜像不能包含镜像用户名（root）、用户名的倒序（toor）、用户名大小写变化（如RoOt、rOot等）；<br />Windows镜像不能包含镜像用户名（Administrator）、用户名大小写变化（adminiSTrator等）
     */
    private String password;
    /**
     * userData
     * 用户自定义数据，需要以Base64方式编码，需要以Base64方式编码，Base64编码后的长度限制为1-16384字符
     */
    private String userData;

    /**
     * set ID
     * @param ID 云主机ID
     * @return this
     */
    public EcsBatchRebuildRebuildInfo withID(String ID) {
        this.ID = ID;
        return this;
    }

    /**
     * set imageID
     * @param imageID 镜像ID，您可以调用[imageID](https://www.ctyun.cn/document/10027726/10040047)查看最新的天翼云具体资源池的镜像列表
     * @return this
     */
    public EcsBatchRebuildRebuildInfo withImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    /**
     * set password
     * @param password 用户密码，满足以下规则：<br />长度在8～30个字符；<br />必须包含大写字母、小写字母、数字以及特殊符号中的三项；<br />特殊符号可选：()`~!@#$%^&*_-+=｜{}[]:;'<>,.?/\且不能以斜线号 / 开头；<br />不能包含3个及以上连续字符；<br />Linux镜像不能包含镜像用户名（root）、用户名的倒序（toor）、用户名大小写变化（如RoOt、rOot等）；<br />Windows镜像不能包含镜像用户名（Administrator）、用户名大小写变化（adminiSTrator等）
     * @return this
     */
    public EcsBatchRebuildRebuildInfo withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * set userData
     * @param userData 用户自定义数据，需要以Base64方式编码，需要以Base64方式编码，Base64编码后的长度限制为1-16384字符
     * @return this
     */
    public EcsBatchRebuildRebuildInfo withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }
}
