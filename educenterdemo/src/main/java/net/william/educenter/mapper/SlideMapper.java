package net.william.educenter.mapper;

import java.util.List;
import net.william.educenter.entity.Slide;
import net.william.educenter.entity.SlideExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SlideMapper {
    int countByExample(SlideExample example);

    int deleteByExample(SlideExample example);

    int insert(Slide record);

    int insertSelective(Slide record);

    List<Slide> selectByExample(SlideExample example);

    int updateByExampleSelective(@Param("record") Slide record, @Param("example") SlideExample example);

    int updateByExample(@Param("record") Slide record, @Param("example") SlideExample example);
}