package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 任务信息
 *
 * @author 
 * @email
 */
@TableName("renwu")
public class RenwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public RenwuEntity() {

	}

	public RenwuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 任务编号
     */
    @TableField(value = "renwu_uuid_number")

    private String renwuUuidNumber;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 任务标题
     */
    @TableField(value = "renwu_name")

    private String renwuName;


    /**
     * 任务类型
     */
    @TableField(value = "renwu_types")

    private Integer renwuTypes;


    /**
     * 单价
     */
    @TableField(value = "renwu_money")

    private Double renwuMoney;


    /**
     * 任务状态
     */
    @TableField(value = "renwu_status_types")

    private Integer renwuStatusTypes;


    /**
     * 任务详情
     */
    @TableField(value = "renwu_content")

    private String renwuContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：任务编号
	 */
    public String getRenwuUuidNumber() {
        return renwuUuidNumber;
    }


    /**
	 * 获取：任务编号
	 */

    public void setRenwuUuidNumber(String renwuUuidNumber) {
        this.renwuUuidNumber = renwuUuidNumber;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：任务标题
	 */
    public String getRenwuName() {
        return renwuName;
    }


    /**
	 * 获取：任务标题
	 */

    public void setRenwuName(String renwuName) {
        this.renwuName = renwuName;
    }
    /**
	 * 设置：任务类型
	 */
    public Integer getRenwuTypes() {
        return renwuTypes;
    }


    /**
	 * 获取：任务类型
	 */

    public void setRenwuTypes(Integer renwuTypes) {
        this.renwuTypes = renwuTypes;
    }
    /**
	 * 设置：单价
	 */
    public Double getRenwuMoney() {
        return renwuMoney;
    }


    /**
	 * 获取：单价
	 */

    public void setRenwuMoney(Double renwuMoney) {
        this.renwuMoney = renwuMoney;
    }
    /**
	 * 设置：任务状态
	 */
    public Integer getRenwuStatusTypes() {
        return renwuStatusTypes;
    }


    /**
	 * 获取：任务状态
	 */

    public void setRenwuStatusTypes(Integer renwuStatusTypes) {
        this.renwuStatusTypes = renwuStatusTypes;
    }
    /**
	 * 设置：任务详情
	 */
    public String getRenwuContent() {
        return renwuContent;
    }


    /**
	 * 获取：任务详情
	 */

    public void setRenwuContent(String renwuContent) {
        this.renwuContent = renwuContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Renwu{" +
            "id=" + id +
            ", renwuUuidNumber=" + renwuUuidNumber +
            ", yonghuId=" + yonghuId +
            ", renwuName=" + renwuName +
            ", renwuTypes=" + renwuTypes +
            ", renwuMoney=" + renwuMoney +
            ", renwuStatusTypes=" + renwuStatusTypes +
            ", renwuContent=" + renwuContent +
            ", createTime=" + createTime +
        "}";
    }
}
