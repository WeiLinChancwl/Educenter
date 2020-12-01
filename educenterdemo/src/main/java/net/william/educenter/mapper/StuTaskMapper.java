package net.william.educenter.mapper;

import java.util.List;
import net.william.educenter.entity.StuTask;
import net.william.educenter.entity.StuTaskExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StuTaskMapper {
    int countByExample(StuTaskExample example);

    int deleteByExample(StuTaskExample example);

    int insert(StuTask record);

    int insertSelective(StuTask record);

    List<StuTask> selectByExample(StuTaskExample example);

    int updateByExampleSelective(@Param("record") StuTask record, @Param("example") StuTaskExample example);

    int updateByExample(@Param("record") StuTask record, @Param("example") StuTaskExample example);
}