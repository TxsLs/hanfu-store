package org.study.spring.entity;

import org.quincy.rock.core.dao.annotation.IgnoreInsert;
import org.quincy.rock.core.dao.annotation.IgnoreUpdate;
import org.quincy.rock.core.dao.annotation.Table;
import org.study.spring.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <b>订单实体</b>
 * <p><b>详细说明：</b></p>
 * <!-- 在此添加详细说明 -->
 * 无。
 * 
 * @version 1.0
 * @author Nymphet
 * @since 1.0
 */
@Getter
@Setter
@ApiModel(description = "订单实体(在执行更新操作时采取动态更新策略，如果属性值为空，则忽略该属性)")
@Table(name = "t_order_table", alias = "o")
public class Order extends Entity {

	/**
	 * serialVersionUID。
	 */
	private static final long serialVersionUID = 2091089369514862918L;

	@ApiModelProperty(value = "顾客id", required = true, position = 1)
	private String customerCode;

	@ApiModelProperty(value = "订单总价", position = 2)
	private String totalPrice;

	@ApiModelProperty(value = "订单状态", position = 3)
	@IgnoreInsert
	@IgnoreUpdate
	private String orderStatus;

	@ApiModelProperty(value = "地址", position = 4)
	private String address;

	@ApiModelProperty(value = "订单编号", position = 5)
	private String code;

	@ApiModelProperty(value = "手机号", position = 6)
	private String phone;

	@ApiModelProperty(value = "创建时间", position = 7)
	@IgnoreInsert
	@IgnoreUpdate
	private String createdTime;

	@ApiModelProperty(value = "更新时间", position = 8)
	@IgnoreInsert
	@IgnoreUpdate
	private String updatedTime;
}
