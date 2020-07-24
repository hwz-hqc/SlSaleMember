package cn.slsale.member.mapper;

import cn.slsale.member.entity.LeaveMessage;
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
public interface LeaveMessageMapper {

    /**
     * getLeaveMessageList
     * @return
     */
    public List<LeaveMessage> getLeaveMessageList(LeaveMessage leaveMessage) throws Exception;

    /**
     * getLeaveMessage
     * @param leaveMessage
     * @return
     * @throws Exception
     */
    public LeaveMessage getLeaveMessage(LeaveMessage leaveMessage) throws Exception;

    /**
     * count
     * @param leaveMessage
     * @return
     * @throws Exception
     */
    public int count(LeaveMessage leaveMessage) throws Exception;

    /**
     * addLeaveMessage
     * @param leaveMessage
     * @return
     */
    public int addLeaveMessage(LeaveMessage leaveMessage) throws Exception;

    /**
     * modifyLeaveMessage
     * @param leaveMessage
     * @return
     */
    public int modifyLeaveMessage(LeaveMessage leaveMessage);

    /**
     * deleteLeaveMessage
     * @param deleteLeaveMessage
     * @return
     */
    public int deleteLeaveMessage(LeaveMessage deleteLeaveMessage);

}
