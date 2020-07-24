package cn.slsale.member.mapper;

import cn.slsale.member.entity.DataDictionary;
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
public interface DataDictionaryMapper  {
    /**
     * getDataDictionaries
     * @param dataDictionary
     * @return
     * @throws Exception
     */
    public List<DataDictionary> getDataDictionaries(DataDictionary dataDictionary)throws Exception;
}
