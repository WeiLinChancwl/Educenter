package net.william.educenter.service;
import net.william.educenter.entity.Course;
import net.william.educenter.entity.CourseExample;
import net.william.educenter.mapper.CourseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseService {
    @Resource
    private CourseMapper courseMapper;
    public List<Course> selectByExample(CourseExample example) {
        return courseMapper.selectByExample(example);
    }
}