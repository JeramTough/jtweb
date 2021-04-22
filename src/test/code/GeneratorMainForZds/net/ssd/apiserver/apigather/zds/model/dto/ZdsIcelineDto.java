package net.ssd.apiserver.apigather.zds.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author WeiBoWen
 * @since 2021-03-08
 */
@TableName("ZDS_ICELINE")
@ApiModel(value="ZdsIceline对象", description="")
public class ZdsIcelineDto implements Serializable{

    private static final long serialVersionUID=1L;

    @TableId("LDATE")
    private String ldate;

    @TableField("LTIME")
    private String ltime;

    @TableField("DAT")
    private String dat;

    @TableField("LTYPE")
    private String ltype;


    public String getLdate() {
        return ldate;
    }

    public void setLdate(String ldate) {
        this.ldate = ldate;
    }

    public String getLtime() {
        return ltime;
    }

    public void setLtime(String ltime) {
        this.ltime = ltime;
    }

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat;
    }

    public String getLtype() {
        return ltype;
    }

    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    @Override
    public String toString() {
        return "ZdsIceline{" +
        "ldate=" + ldate +
        ", ltime=" + ltime +
        ", dat=" + dat +
        ", ltype=" + ltype +
        "}";
    }
}
