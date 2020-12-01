package net.william.educenter.service;
import net.william.educenter.entity.StuCourse;
import net.william.educenter.entity.StuCourseExample;
import net.william.educenter.mapper.StuCourseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StuCourseService {
    @Resource
    private StuCourseMapper stuCourseMapper;
    public List<StuCourse> selectByExample(StuCourseExample example) {
        return stuCourseMapper.selectByExample(example);
    }
    public void insertStuCourse(StuCourse stuCourse) {
        stuCourseMapper.insert(stuCourse);
    }
}