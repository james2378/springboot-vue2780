package com.entity.view;

import com.entity.JiedanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 接单信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiedan")
public class JiedanView extends JiedanEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 接单状态的值
		*/
		private String jiedanStatusValue;



		//级联表 renwu
			/**
			* 任务编号
			*/
			private String renwuUuidNumber;
			/**
			* 任务信息 的 用户
			*/
			private Integer renwuYonghuId;
			/**
			* 任务标题
			*/
			private String renwuName;
			/**
			* 任务类型
			*/
			private Integer renwuTypes;
				/**
				* 任务类型的值
				*/
				private String renwuValue;
			/**
			* 单价
			*/
			private Double renwuMoney;
			/**
			* 任务状态
			*/
			private Integer renwuStatusTypes;
				/**
				* 任务状态的值
				*/
				private String renwuStatusValue;
			/**
			* 任务详情
			*/
			private String renwuContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public JiedanView() {

	}

	public JiedanView(JiedanEntity jiedanEntity) {
		try {
			BeanUtils.copyProperties(this, jiedanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 接单状态的值
			*/
			public String getJiedanStatusValue() {
				return jiedanStatusValue;
			}
			/**
			* 设置： 接单状态的值
			*/
			public void setJiedanStatusValue(String jiedanStatusValue) {
				this.jiedanStatusValue = jiedanStatusValue;
			}













				//级联表的get和set renwu
					/**
					* 获取： 任务编号
					*/
					public String getRenwuUuidNumber() {
						return renwuUuidNumber;
					}
					/**
					* 设置： 任务编号
					*/
					public void setRenwuUuidNumber(String renwuUuidNumber) {
						this.renwuUuidNumber = renwuUuidNumber;
					}
					/**
					* 获取：任务信息 的 用户
					*/
					public Integer getRenwuYonghuId() {
						return renwuYonghuId;
					}
					/**
					* 设置：任务信息 的 用户
					*/
					public void setRenwuYonghuId(Integer renwuYonghuId) {
						this.renwuYonghuId = renwuYonghuId;
					}

					/**
					* 获取： 任务标题
					*/
					public String getRenwuName() {
						return renwuName;
					}
					/**
					* 设置： 任务标题
					*/
					public void setRenwuName(String renwuName) {
						this.renwuName = renwuName;
					}
					/**
					* 获取： 任务类型
					*/
					public Integer getRenwuTypes() {
						return renwuTypes;
					}
					/**
					* 设置： 任务类型
					*/
					public void setRenwuTypes(Integer renwuTypes) {
						this.renwuTypes = renwuTypes;
					}


						/**
						* 获取： 任务类型的值
						*/
						public String getRenwuValue() {
							return renwuValue;
						}
						/**
						* 设置： 任务类型的值
						*/
						public void setRenwuValue(String renwuValue) {
							this.renwuValue = renwuValue;
						}
					/**
					* 获取： 单价
					*/
					public Double getRenwuMoney() {
						return renwuMoney;
					}
					/**
					* 设置： 单价
					*/
					public void setRenwuMoney(Double renwuMoney) {
						this.renwuMoney = renwuMoney;
					}
					/**
					* 获取： 任务状态
					*/
					public Integer getRenwuStatusTypes() {
						return renwuStatusTypes;
					}
					/**
					* 设置： 任务状态
					*/
					public void setRenwuStatusTypes(Integer renwuStatusTypes) {
						this.renwuStatusTypes = renwuStatusTypes;
					}


						/**
						* 获取： 任务状态的值
						*/
						public String getRenwuStatusValue() {
							return renwuStatusValue;
						}
						/**
						* 设置： 任务状态的值
						*/
						public void setRenwuStatusValue(String renwuStatusValue) {
							this.renwuStatusValue = renwuStatusValue;
						}
					/**
					* 获取： 任务详情
					*/
					public String getRenwuContent() {
						return renwuContent;
					}
					/**
					* 设置： 任务详情
					*/
					public void setRenwuContent(String renwuContent) {
						this.renwuContent = renwuContent;
					}







				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
