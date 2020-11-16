package net.ssd.InterfaceService.gxsmswc.model.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 智能网格最低温预报
 * </p>
 *
 * @author JeramTough
 * @since 2020-09-16
 */
@ApiModel(value="GridTemMinForecast对象", description="智能网格最低温预报")
public class GridTemMinForecast implements Serializable {

    private static final long serialVersionUID=1L;

    private Long id;

    @TableField("validTime")
    private String validTime;

    private String val;

    @TableField("insertTime")
    private LocalDateTime insertTime;

    private String lon;

    @TableField("dateTime")
    private String dateTime;

    private String lat;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValidTime() {
        return validTime;
    }

    public void setValidTime(String validTime) {
        this.validTime = validTime;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public LocalDateTime getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(LocalDateTime insertTime) {
        this.insertTime = insertTime;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "GridTemMinForecast{" +
        "id=" + id +
        ", validTime=" + validTime +
        ", val=" + val +
        ", insertTime=" + insertTime +
        ", lon=" + lon +
        ", dateTime=" + dateTime +
        ", lat=" + lat +
        "}";
    }
}