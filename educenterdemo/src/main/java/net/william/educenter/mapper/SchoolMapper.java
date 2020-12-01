package net.william.educenter.mapper;

import java.util.List;
import net.william.educenter.entity.School;
import net.william.educenter.entity.SchoolExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SchoolMapper {
    int countByExample(SchoolExample example);

    int deleteByExample(SchoolExample example);

    int insert(School record);

    int insertSelective(School record);

    List<School> selectByExample(SchoolExample example);

    int updateByExampleSelective(@Param("record") School record, @Param("example") SchoolExample example);

    int updateByExample(@Param("record") School record, @Param("example") SchoolExample example);
}