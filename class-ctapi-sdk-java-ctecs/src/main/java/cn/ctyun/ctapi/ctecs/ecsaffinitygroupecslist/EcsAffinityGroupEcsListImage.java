package cn.ctyun.ctapi.ctecs.ecsaffinitygroupecslist;

import cn.ctyun.ctapi.CTFile;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.*;

/**
 * <一类节点-*-云主机ctecs-查询云主机组内的云主机>
 * Entity: EcsAffinityGroupEcsListImage
 */
public class EcsAffinityGroupEcsListImage {
    /**
     * imageID
     * 镜像ID
     */
    private String imageID;
    /**
     * imageName
     * 镜像名称
     */
    private String imageName;

    /**
     * set imageID
     * @param imageID 镜像ID
     * @return this
     */
    public EcsAffinityGroupEcsListImage withImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    /**
     * set imageName
     * @param imageName 镜像名称
     * @return this
     */
    public EcsAffinityGroupEcsListImage withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
