package net.william.educenter.mapper;

import java.util.List;
import net.william.educenter.entity.SuperUser;
import net.william.educenter.entity.SuperUserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SuperUserMapper {
    int countByExample(SuperUserExample example);

    int deleteByExample(SuperUserExample example);

    int insert(SuperUser record);

    int insertSelective(SuperUser record);

    List<SuperUser> selectByExample(SuperUserExample example);

    int updateByExampleSelective(@Param("record") SuperUser record, @Param("example") SuperUserExample example);

    int updateByExample(@Param("record") SuperUser record, @Param("example") SuperUserExample example);
}