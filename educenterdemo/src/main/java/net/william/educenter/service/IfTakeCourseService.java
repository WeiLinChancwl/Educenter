package net.william.educenter.service;
import net.william.educenter.entity.IfTakeCourse;
import net.william.educenter.entity.IfTakeCourseExample;
import net.william.educenter.mapper.IfTakeCourseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IfTakeCourseService {
    @Resource
    private IfTakeCourseMapper ifTakeCourseMapper;
    public List<IfTakeCourse> selectByExample(IfTakeCourseExample example) {
        return ifTakeCourseMapper.selectByExample(example);
    }
}