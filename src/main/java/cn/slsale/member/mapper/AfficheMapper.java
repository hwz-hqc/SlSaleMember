package cn.slsale.member.mapper;

import cn.slsale.member.entity.Affiche;
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
public interface AfficheMapper  {
    /**
     * getList
     * @param affiche
     * @return
     * @throws Exception
     */
    public List<Affiche> getList(Affiche affiche) throws Exception;
    /**
     * getAfficheList
     * @param affiche
     * @return
     * @throws Exception
     */
    public List<Affiche> getAfficheList(Affiche affiche) throws Exception;
    /**
     * getAffiche
     * @param affiche
     * @return
     * @throws Exception
     */
    public Affiche getAffiche(Affiche affiche) throws Exception;
    /**
     * addAffiche
     * @param affiche
     * @return
     * @throws Exception
     */
    public int addAffiche(Affiche affiche) throws Exception;
    /**
     * modifyAffiche
     * @param affiche
     * @return
     * @throws Exception
     */
    public int modifyAffiche(Affiche affiche) throws Exception;
    /**
     * deleteAffiche
     * @param affiche
     * @return
     * @throws Exception
     */
    public int deleteAffiche(Affiche affiche) throws Exception;
    /**
     * count
     * @return
     * @throws Exception
     */
    public int count() throws Exception;

    /**
     * portalCount
     * @return
     * @throws Exception
     */
    public int portalCount() throws Exception;
    /**
     * getPortalAfficheList
     * @param affiche
     * @return
     * @throws Exception
     */
    public List<Affiche> getPortalAfficheList(Affiche affiche) throws Exception;
}
