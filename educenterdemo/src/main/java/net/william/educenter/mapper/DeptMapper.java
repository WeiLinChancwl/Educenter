package net.william.educenter.mapper;

import java.util.List;
import net.william.educenter.entity.Dept;
import net.william.educenter.entity.DeptExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DeptMapper {
    int countByExample(DeptExample example);

    int deleteByExample(DeptExample example);

    int insert(Dept record);

    int insertSelective(Dept record);

    List<Dept> selectByExampleWithBLOBs(DeptExample example);

    List<Dept> selectByExample(DeptExample example);

    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByExampleWithBLOBs(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);
}