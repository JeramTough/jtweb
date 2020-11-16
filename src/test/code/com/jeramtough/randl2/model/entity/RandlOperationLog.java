package com.jeramtough.randl2.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author JeramTough
 * @since 2020-10-26
 */
@ApiModel(value="RandlOperationLog对象", description="")
public class RandlOperationLog implements Serializable {

    private static final long serialVersionUID=1L;

  /**
   * 主键
   */
    @TableId(value = "fid", type = IdType.AUTO)
    private Long fid;

  /**
   * 操作机ip地址
   */
    private String ip;

  /**
   * 管理员id
   */
    private Long adminId;

  /**
   * 管理员名字
   */
    private String adminName;

  /**
   * 接口名
   */
    private String apiName;

  /**
   * 接口描述
   */
    private String apiDescription;

  /**
   * 操作内容
   */
    private String content;

  /**
   * 日志记录创建时间
   */
    private LocalDateTime createTime;

  /**
   * 接口标签 使用英文,逗号分隔
   */
    private String tags;

  /**
   * 执行是否成功
   */
    private Integer result;


    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiDescription() {
        return apiDescription;
    }

    public void setApiDescription(String apiDescription) {
        this.apiDescription = apiDescription;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "RandlOperationLog{" +
        "fid=" + fid +
        ", ip=" + ip +
        ", adminId=" + adminId +
        ", adminName=" + adminName +
        ", apiName=" + apiName +
        ", apiDescription=" + apiDescription +
        ", content=" + content +
        ", createTime=" + createTime +
        ", tags=" + tags +
        ", result=" + result +
        "}";
    }
}
