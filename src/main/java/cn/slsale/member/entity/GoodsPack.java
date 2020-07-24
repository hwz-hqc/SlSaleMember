package cn.slsale.member.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author testpage
 * @since 2020-07-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class GoodsPack implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 套餐名称
     */
    @TableField("goodsPackName")
    private String goodsPackName;

    /**
     * 套餐编号
     */
    @TableField("goodsPackCode")
    private String goodsPackCode;

    /**
     * 套餐类型ID
     */
    @TableField("typeId")
    private Long typeId;

    /**
     * 套餐类型NAME
     */
    @TableField("typeName")
    private String typeName;

    /**
     * 套餐总价
     */
    @TableField("totalPrice")
    private BigDecimal totalPrice;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 备注说明
     */
    private String note;

    /**
     * 库存数量
     */
    private Long num;

    /**
     * 创建人
     */
    @TableField("createdBy")
    private String createdBy;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 最后更新时间
     */
    @TableField("lastUpdateTime")
    private LocalDateTime lastUpdateTime;


}
