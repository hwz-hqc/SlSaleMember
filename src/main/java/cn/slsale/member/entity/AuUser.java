package cn.slsale.member.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;
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
public class AuUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 登录账号
     */
    @TableField("loginCode")
    private String loginCode;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 二级密码
     */
    private String password2;

    /**
     * 用户真实姓名
     */
    @TableField("userName")
    private String userName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 生日
     */
    private LocalDate birthday;

    /**
     * 证件类型id
     */
    @TableField("cardType")
    private Long cardType;

    /**
     * 证件类型name
     */
    @TableField("cardTypeName")
    private String cardTypeName;

    /**
     * 证件号码
     */
    @TableField("idCard")
    private String idCard;

    /**
     * 收货国家
     */
    private String country;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 收货住址
     */
    @TableField("userAddress")
    private String userAddress;

    /**
     * 邮政编码
     */
    @TableField("postCode")
    private String postCode;

    /**
     * 创建时间
     */
    @TableField("createTime")
    private LocalDateTime createTime;

    /**
     * 推荐人id
     */
    @TableField("referId")
    private Long referId;

    /**
     * 推荐人编码
     */
    private String refercode;

    /**
     * 所属角色id
     */
    @TableField("roleId")
    private Long roleId;

    /**
     * 所属角色名称
     */
    @TableField("roleName")
    private String roleName;

    /**
     * 用户角色id
     */
    @TableField("userType")
    private Long userType;

    /**
     * 用户类型name
     */
    @TableField("userTypeName")
    private String userTypeName;

    /**
     * 是否启用（1、启用 2、未启用）
     */
    @TableField("isStart")
    private String isStart;

    /**
     * 最后更新时间
     */
    @TableField("lastUpdateTime")
    private LocalDateTime lastUpdateTime;

    /**
     * 最后登录时间
     */
    @TableField("lastLoginTime")
    private LocalDateTime lastLoginTime;

    /**
     * 开户卡号
     */
    @TableField("bankAccount")
    private String bankAccount;

    /**
     * 开户人
     */
    @TableField("accountHolder")
    private String accountHolder;

    /**
     * 身份证照片存放路径
     */
    @TableField("idCardPicPath")
    private String idCardPicPath;

    /**
     * 银行卡照片存放路径
     */
    @TableField("bankPicPath")
    private String bankPicPath;


}
