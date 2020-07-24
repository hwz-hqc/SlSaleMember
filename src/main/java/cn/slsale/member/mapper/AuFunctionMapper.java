package cn.slsale.member.mapper;

import cn.slsale.member.entity.AuFunction;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
public interface AuFunctionMapper  {

    /**
     * getMainFunctionList
     * @param authority
     * @return
     * @throws Exception
     */
    public List<AuFunction> getMainFunctionList(AuFunction authority) throws Exception;

    /**
     * getSubFunctionList
     * @param function
     * @return
     * @throws Exception
     */
    public List<AuFunction> getSubFunctionList(AuFunction function) throws Exception;

    /**
     * getSubFuncList
     * @param function
     * @return
     * @throws Exception
     */
    public List<AuFunction> getSubFuncList(AuFunction function)throws Exception;

    /**
     * getFuntionListByIn
     * @param sqlInString
     * @return
     * @throws Exception
     */
    public List<AuFunction> getFuntionListByIn(@Param(value = "sqlInString") String sqlInString)throws Exception;

    /**
     * getFunctionListByRoleId
     * @param authority
     * @return
     * @throws Exception
     */
    public List<AuFunction> getFunctionListByRoleId(AuFunction authority)throws Exception;
}
