package net.william.educenter.mapper;

import java.util.List;
import net.william.educenter.entity.IfTakeCourse;
import net.william.educenter.entity.IfTakeCourseExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface IfTakeCourseMapper {
    int countByExample(IfTakeCourseExample example);

    int deleteByExample(IfTakeCourseExample example);

    int insert(IfTakeCourse record);

    int insertSelective(IfTakeCourse record);

    List<IfTakeCourse> selectByExample(IfTakeCourseExample example);

    int updateByExampleSelective(@Param("record") IfTakeCourse record, @Param("example") IfTakeCourseExample example);

    int updateByExample(@Param("record") IfTakeCourse record, @Param("example") IfTakeCourseExample example);
}