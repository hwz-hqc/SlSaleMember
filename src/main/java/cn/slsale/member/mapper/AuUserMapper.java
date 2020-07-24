package cn.slsale.member.mapper;

import cn.slsale.member.entity.AuUser;
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
public interface AuUserMapper  {
    /**
     * getLoginUser
     * @param user
     * @return
     * @throws Exception
     */
    public AuUser getLoginUser(AuUser user)throws Exception;

    /**
     * loginCodeIsExit
     * @param user
     * @return
     * @throws Exception
     */
    public int loginCodeIsExit(AuUser user)throws Exception;
    /**
     * modifyUser
     * @param user
     * @return
     * @throws Exception
     */
    public int modifyUser(AuUser user)throws Exception;
    /**
     * 获取总数量
     * @param user
     * @return
     * @throws Exception
     */
    public int count(AuUser user)throws Exception;

    /**
     * 获取分页用户列表
     * @param user
     * @return
     * @throws Exception
     */
    public List<AuUser> getUserList(AuUser user)throws Exception;

    /**
     * addUser
     * @param user
     * @return
     */
    public int addUser(AuUser user) throws Exception;
    /**
     * delUserPic
     * @param user
     * @return
     * @throws Exception
     */
    public int delUserPic(AuUser user)throws Exception;
    /**
     * getUserById
     * @param user
     * @return
     * @throws Exception
     */
    public AuUser getUserById(AuUser user)throws Exception;

    /**
     * deleteUser
     * @param user
     * @return
     * @throws Exception
     */
    public int deleteUser(AuUser user)throws Exception;


    /**
     * modifyUserRole
     * @param user
     * @return
     */
    public int modifyUserRole(AuUser user) throws Exception;
    /**
     * getUserListBySearch
     * @param user
     * @return
     */
    public List<AuUser> getUserListBySearch(AuUser user) throws Exception;
}
