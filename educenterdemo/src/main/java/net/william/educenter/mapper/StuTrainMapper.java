package net.william.educenter.mapper;

import java.util.List;
import net.william.educenter.entity.StuTrain;
import net.william.educenter.entity.StuTrainExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StuTrainMapper {
    int countByExample(StuTrainExample example);

    int deleteByExample(StuTrainExample example);

    int insert(StuTrain record);

    int insertSelective(StuTrain record);

    List<StuTrain> selectByExample(StuTrainExample example);

    int updateByExampleSelective(@Param("record") StuTrain record, @Param("example") StuTrainExample example);

    int updateByExample(@Param("record") StuTrain record, @Param("example") StuTrainExample example);
}