package net.william.educenter.mapper;

import java.util.List;
import net.william.educenter.entity.StuCourse;
import net.william.educenter.entity.StuCourseExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StuCourseMapper {
    int countByExample(StuCourseExample example);

    int deleteByExample(StuCourseExample example);

    int insert(StuCourse record);

    int insertSelective(StuCourse record);

    List<StuCourse> selectByExample(StuCourseExample example);

    int updateByExampleSelective(@Param("record") StuCourse record, @Param("example") StuCourseExample example);

    int updateByExample(@Param("record") StuCourse record, @Param("example") StuCourseExample example);
}