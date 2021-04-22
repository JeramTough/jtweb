package com.jeramtough.randl2.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author JeramTough
 * @since 2021-04-18
 */
@ApiModel(value="SourceSurfaceImage对象", description="")
public class SourceSurfaceImageDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

    @ApiModelProperty(value = "可以是url或者base64格式图片")
    private String surfaceImage;

    @ApiModelProperty(value = "0:base64 || 1:url")
    private Integer type;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getSurfaceImage() {
        return surfaceImage;
    }

    public void setSurfaceImage(String surfaceImage) {
        this.surfaceImage = surfaceImage;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SourceSurfaceImage{" +
        "fid=" + fid +
        ", surfaceImage=" + surfaceImage +
        ", type=" + type +
        "}";
    }
}
