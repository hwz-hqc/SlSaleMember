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
public class AuFunction implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 功能编码
     */
    @TableField("functionCode")
    private String functionCode;

    /**
     * 功能名称
     */
    @TableField("functionName")
    private String functionName;

    /**
     * 功能URL
     */
    @TableField("funcUrl")
    private String funcUrl;

    /**
     * 父节点功能ID
     */
    @TableField("parentId")
    private Long parentId;

    /**
     * 创建时间
     */
    @TableField("creationTime")
    private LocalDateTime creationTime;


}
