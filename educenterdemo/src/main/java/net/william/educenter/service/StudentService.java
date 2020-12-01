package net.william.educenter.service;

import javax.annotation.Resource;
import net.william.educenter.entity.Student;
import net.william.educenter.entity.StudentExample;
import net.william.educenter.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Resource
    private StudentMapper studentMapper;

    public List<Student> selectByExample(StudentExample studentExample) {
        return studentMapper.selectByExample(studentExample);
    }
    public void insertstudent(Student student) {
        studentMapper.insert(student);
    }
    public void deletestudent(StudentExample studentExample) {
        studentMapper.deleteByExample(studentExample);
    }
    public void updatestudent(Student student, StudentExample studentExample) {
        studentMapper.updateByExample(student, studentExample);
    }
}