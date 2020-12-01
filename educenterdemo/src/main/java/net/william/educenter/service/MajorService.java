package net.william.educenter.service;
import net.william.educenter.entity.Major;
import net.william.educenter.entity.MajorExample;
import net.william.educenter.mapper.MajorMapper;

import javax.annotation.Resource;
import java.util.List;

@org.springframework.stereotype.Service
public class MajorService {
    @Resource
    private MajorMapper majorMapper;

    public List<Major> selectByExample(MajorExample example) {
        return majorMapper.selectByExample(example);
    }
}