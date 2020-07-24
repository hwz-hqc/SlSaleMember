package cn.slsale.member.mapper;

import cn.slsale.member.entity.Information;
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
public interface InformationMapper  {
    /**
     * getList
     * @param information
     * @return
     * @throws Exception
     */
    public List<Information> getList(Information information) throws Exception;
    /**
     * getInformationList
     * @param information
     * @return
     * @throws Exception
     */
    public List<Information> getInformationList(Information information) throws Exception;
    /**
     * getInformation
     * @param information
     * @return
     * @throws Exception
     */
    public Information getInformation(Information information) throws Exception;
    /**
     * addInformation
     * @param information
     * @return
     * @throws Exception
     */
    public int addInformation(Information information) throws Exception;
    /**
     * modifyInformation
     * @param information
     * @return
     * @throws Exception
     */
    public int modifyInformation(Information information) throws Exception;
    /**
     * modifyInformationFileInfo
     * @param information
     * @return
     * @throws Exception
     */
    public int modifyInformationFileInfo(Information information) throws Exception;
    /**
     * deleteAffiche
     * @param affiche
     * @return
     * @throws Exception
     */
    public int deleteInformation(Information information) throws Exception;
    /**
     * count
     * @return
     * @throws Exception
     */
    public int count(Information information) throws Exception;
}
