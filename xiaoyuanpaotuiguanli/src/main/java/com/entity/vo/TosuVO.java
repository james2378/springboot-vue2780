package com.entity.vo;

import com.entity.TosuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 投诉信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("tosu")
public class TosuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 投诉标题
     */

    @TableField(value = "tosu_name")
    private String tosuName;


    /**
     * 投诉类型
     */

    @TableField(value = "tosu_types")
    private Integer tosuTypes;


    /**
     * 投诉原因
     */

    @TableField(value = "tosu_text")
    private String tosuText;


    /**
     * 投诉状态
     */

    @TableField(value = "tosu_yesno_types")
    private Integer tosuYesnoTypes;


    /**
     * 投诉详情
     */

    @TableField(value = "tosu_yesno_text")
    private String tosuYesnoText;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：投诉标题
	 */
    public String getTosuName() {
        return tosuName;
    }


    /**
	 * 获取：投诉标题
	 */

    public void setTosuName(String tosuName) {
        this.tosuName = tosuName;
    }
    /**
	 * 设置：投诉类型
	 */
    public Integer getTosuTypes() {
        return tosuTypes;
    }


    /**
	 * 获取：投诉类型
	 */

    public void setTosuTypes(Integer tosuTypes) {
        this.tosuTypes = tosuTypes;
    }
    /**
	 * 设置：投诉原因
	 */
    public String getTosuText() {
        return tosuText;
    }


    /**
	 * 获取：投诉原因
	 */

    public void setTosuText(String tosuText) {
        this.tosuText = tosuText;
    }
    /**
	 * 设置：投诉状态
	 */
    public Integer getTosuYesnoTypes() {
        return tosuYesnoTypes;
    }


    /**
	 * 获取：投诉状态
	 */

    public void setTosuYesnoTypes(Integer tosuYesnoTypes) {
        this.tosuYesnoTypes = tosuYesnoTypes;
    }
    /**
	 * 设置：投诉详情
	 */
    public String getTosuYesnoText() {
        return tosuYesnoText;
    }


    /**
	 * 获取：投诉详情
	 */

    public void setTosuYesnoText(String tosuYesnoText) {
        this.tosuYesnoText = tosuYesnoText;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
