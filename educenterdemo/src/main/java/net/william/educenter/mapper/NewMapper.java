package net.william.educenter.mapper;

import java.util.List;
import net.william.educenter.entity.New;
import net.william.educenter.entity.NewExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface NewMapper {
    int countByExample(NewExample example);

    int deleteByExample(NewExample example);

    int insert(New record);

    int insertSelective(New record);

    List<New> selectByExample(NewExample example);

    int updateByExampleSelective(@Param("record") New record, @Param("example") NewExample example);

    int updateByExample(@Param("record") New record, @Param("example") NewExample example);
}