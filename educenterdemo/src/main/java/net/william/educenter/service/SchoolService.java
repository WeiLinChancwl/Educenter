package net.william.educenter.service;
import net.william.educenter.entity.School;
import net.william.educenter.entity.SchoolExample;
import net.william.educenter.mapper.SchoolMapper;

import javax.annotation.Resource;
import java.util.List;

@org.springframework.stereotype.Service
public class SchoolService {
    @Resource
    private SchoolMapper schoolMapper;

    public List<School> selectByExample(SchoolExample example) {
        return schoolMapper.selectByExample(example);
    }
}