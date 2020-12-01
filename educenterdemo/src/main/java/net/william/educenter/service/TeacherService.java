package net.william.educenter.service;
import net.william.educenter.entity.Teacher;
import net.william.educenter.entity.TeacherExample;
import net.william.educenter.mapper.TeacherMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherService {
    @Resource
    private TeacherMapper teacherMapper;

    public List<Teacher> selectByExample(TeacherExample TeacherUserExample) {
        return teacherMapper.selectByExample(TeacherUserExample);
    }
    public void insertTeacher(Teacher Teacher) {
        teacherMapper.insert(Teacher);
    }
}