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
public class Information implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 状态
     */
    private Integer state;

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
     * 附件类型ID
     */
    @TableField("typeId")
    private Long typeId;

    /**
     * 附件类型NAME
     */
    @TableField("typeName")
    private String typeName;

    /**
     * 附件名称
     */
    @TableField("fileName")
    private String fileName;

    /**
     * 附件存放路径
     */
    private String filepath;

    /**
     * 附件大小
     */
    @TableField("fileSize")
    private String fileSize;

    /**
     * 上传时间
     */
    @TableField("uploadTime")
    private LocalDateTime uploadTime;


}
