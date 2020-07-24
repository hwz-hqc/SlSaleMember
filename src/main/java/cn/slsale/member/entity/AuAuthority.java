package cn.slsale.member.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
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
public class AuAuthority implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    @TableField("roleId")
    private Long roleId;

    /**
     * 功能ID
     */
    @TableField("functionId")
    private Long functionId;

    /**
     * 用户类型ID
     */
    @TableField("userTypeId")
    private Long userTypeId;

    /**
     * 创建时间
     */
    @TableField("creationTime")
    private LocalDateTime creationTime;

    /**
     * 创建者
     */
    @TableField("createBy")
    private String createBy;


}
