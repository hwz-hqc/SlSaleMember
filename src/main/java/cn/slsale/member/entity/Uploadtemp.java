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
public class Uploadtemp implements Serializable {

    private static final long serialVersionUID = 1L;

    private String uploader;

    @TableField("uploadType")
    private String uploadType;

    @TableField("uploadFilePath")
    private String uploadFilePath;


}
