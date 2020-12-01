package net.william.educenter.mapper;

import java.util.List;
import net.william.educenter.entity.Event;
import net.william.educenter.entity.EventExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface EventMapper {
    int countByExample(EventExample example);

    int deleteByExample(EventExample example);

    int insert(Event record);

    int insertSelective(Event record);

    List<Event> selectByExample(EventExample example);

    int updateByExampleSelective(@Param("record") Event record, @Param("example") EventExample example);

    int updateByExample(@Param("record") Event record, @Param("example") EventExample example);
}