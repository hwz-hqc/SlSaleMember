package cn.slsale.member.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

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
public class Reply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 取自leave_message表的主键id
     */
    @TableField("messageId")
    private Integer messageId;

    @TableField("replyContent")
    private String replyContent;

    /**
     * 取自au_user表中的loginCode
     */
    @TableField("createdBy")
    private String createdBy;

    @TableField("createTime")
    private LocalDate createTime;


}
