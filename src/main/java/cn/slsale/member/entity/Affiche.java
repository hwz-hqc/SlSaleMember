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
public class Affiche implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编码
     */
    private String code;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 发布人
     */
    private String publisher;

    /**
     * 发布时间
     */
    @TableField("publishTime")
    private LocalDateTime publishTime;

    /**
     * 生效时间
     */
    @TableField("startTime")
    private LocalDateTime startTime;

    /**
     * 失效时间
     */
    @TableField("endTime")
    private LocalDateTime endTime;


}
