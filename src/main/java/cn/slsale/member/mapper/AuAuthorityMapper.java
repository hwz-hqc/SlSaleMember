package cn.slsale.member.mapper;

import cn.slsale.member.entity.AuAuthority;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author testpage
 * @since 2020-07-24
 */
@Mapper
public interface AuAuthorityMapper {
    /**
     * addAuthority
     * @param authority
     * @return
     */
    public int addAuthority(AuAuthority authority) throws Exception;
    /**
     * modifyAuthority
     * @param authority
     * @return
     */
    public int modifyAuthority(AuAuthority authority) throws Exception;
    /**
     * modifyAuthority
     * @param authority
     * @return
     */
    public int deleteAuthority(AuAuthority authority) throws Exception;

    /**
     * getAuthority
     * @param authority
     * @return
     * @throws Exception
     */
    public AuAuthority getAuthority(AuAuthority authority)throws Exception;
}
