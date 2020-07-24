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
public class GoodsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品编码
     */
    @TableField("goodsSN")
    private String goodsSN;

    /**
     * 商品名称
     */
    @TableField("goodsName")
    private String goodsName;

    /**
     * 商品规格
     */
    @TableField("goodsFormat")
    private String goodsFormat;

    /**
     * 市场价
     */
    @TableField("marketPrice")
    private BigDecimal marketPrice;

    /**
     * 实际价格
     */
    @TableField("realPrice")
    private BigDecimal realPrice;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 商品说明
     */
    private String note;

    /**
     * 库存数量
     */
    private Long num;

    /**
     * 单位
     */
    private String unit;

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

    /**
     * 创建人
     */
    @TableField("createdBy")
    private String createdBy;


}
