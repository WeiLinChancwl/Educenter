package net.william.educenter.service;

import net.william.educenter.entity.Dept;
import net.william.educenter.entity.DeptExample;
import net.william.educenter.mapper.DeptMapper;

import javax.annotation.Resource;
import java.util.List;

@org.springframework.stereotype.Service
public class DeptService {
    @Resource
    private DeptMapper deptMapper;

    public List<Dept> selectByExample(DeptExample example) {
        return deptMapper.selectByExample(example);
    }
}