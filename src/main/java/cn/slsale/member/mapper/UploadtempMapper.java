package cn.slsale.member.mapper;

import cn.slsale.member.entity.Uploadtemp;
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
public interface UploadtempMapper {
    /**
     * getList
     * @param uploadTemp
     * @return
     * @throws Exception
     */
    public List<Uploadtemp> getList(Uploadtemp uploadTemp) throws Exception;
    /**
     * add
     * @param uploadTemp
     * @return
     * @throws Exception
     */
    public int add(Uploadtemp uploadTemp) throws Exception;
    /**
     * delete
     * @param uploadTemp
     * @return
     * @throws Exception
     */
    public int delete(Uploadtemp uploadTemp) throws Exception;
}
