package cn.slsale.member.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
public class GoodsPackAffilated implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品套餐主表ID
     */
    @TableField("goodsPackId")
    private Long goodsPackId;

    /**
     * 商品ID
     */
    @TableField("goodsInfoId")
    private Long goodsInfoId;

    /**
     * 商品数量
     */
    @TableField("goodsNum")
    private Long goodsNum;


}
