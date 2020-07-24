package cn.slsale.member.mapper;

import cn.slsale.member.entity.AuRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author testpage
 * @since 2020-07-24
 */
@Mapper
public interface AuRoleMapper  {
    /**
     * getRoleList
     * @param role
     * @return
     */
    public List<AuRole> getRoleList() throws Exception;

    /**
     * getRole
     * @param role
     * @return
     */
    public AuRole getRole(AuRole role) throws Exception;
    /**
     * getRoleR
     * @param role
     * @return
     * @throws Exception
     */
    public AuRole getRoleR(AuRole role) throws Exception;

    /**
     * addRole
     * @param role
     * @return
     */
    public int addRole(AuRole role) throws Exception;

    /**
     * modifyRole
     * @param role
     * @return
     */
    public int modifyRole(AuRole role) throws Exception;

    /**
     * deleteRole
     * @param role
     * @return
     */
    public int deleteRole(AuRole role) throws Exception;

    /**
     * getRoleIdAndNameList
     * @return
     */
    public List<AuRole> getRoleIdAndNameList() throws Exception;
}
