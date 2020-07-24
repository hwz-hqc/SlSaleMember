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
public class DataDictionary implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 类型编码
     */
    @TableField("typeCode")
    private String typeCode;

    /**
     * 类型名称
     */
    @TableField("typeName")
    private String typeName;

    /**
     * 类型值ID
     */
    @TableField("valueId")
    private Long valueId;

    /**
     * 类型值名称
     */
    @TableField("valueName")
    private String valueName;


}
