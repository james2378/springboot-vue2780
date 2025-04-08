package com.entity.model;

import com.entity.TosuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 投诉信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TosuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 投诉标题
     */
    private String tosuName;


    /**
     * 投诉类型
     */
    private Integer tosuTypes;


    /**
     * 投诉原因
     */
    private String tosuText;


    /**
     * 投诉状态
     */
    private Integer tosuYesnoTypes;


    /**
     * 投诉详情
     */
    private String tosuYesnoText;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：投诉标题
	 */
    public String getTosuName() {
        return tosuName;
    }


    /**
	 * 设置：投诉标题
	 */
    public void setTosuName(String tosuName) {
        this.tosuName = tosuName;
    }
    /**
	 * 获取：投诉类型
	 */
    public Integer getTosuTypes() {
        return tosuTypes;
    }


    /**
	 * 设置：投诉类型
	 */
    public void setTosuTypes(Integer tosuTypes) {
        this.tosuTypes = tosuTypes;
    }
    /**
	 * 获取：投诉原因
	 */
    public String getTosuText() {
        return tosuText;
    }


    /**
	 * 设置：投诉原因
	 */
    public void setTosuText(String tosuText) {
        this.tosuText = tosuText;
    }
    /**
	 * 获取：投诉状态
	 */
    public Integer getTosuYesnoTypes() {
        return tosuYesnoTypes;
    }


    /**
	 * 设置：投诉状态
	 */
    public void setTosuYesnoTypes(Integer tosuYesnoTypes) {
        this.tosuYesnoTypes = tosuYesnoTypes;
    }
    /**
	 * 获取：投诉详情
	 */
    public String getTosuYesnoText() {
        return tosuYesnoText;
    }


    /**
	 * 设置：投诉详情
	 */
    public void setTosuYesnoText(String tosuYesnoText) {
        this.tosuYesnoText = tosuYesnoText;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
