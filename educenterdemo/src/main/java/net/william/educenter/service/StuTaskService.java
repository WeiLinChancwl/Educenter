package net.william.educenter.service;
import net.william.educenter.entity.StuTask;
import net.william.educenter.entity.StuTaskExample;
import net.william.educenter.mapper.StuTaskMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StuTaskService {

    @Resource
    private net.william.educenter.mapper.StuTaskMapper StuTaskMapper;

    public List<StuTask> selectByExample(StuTaskExample StuTaskExample) {
        return StuTaskMapper.selectByExample(StuTaskExample);
    }
    public void insertStuTask(StuTask StuTask) {
        StuTaskMapper.insert(StuTask);
    }
    public void deleteStuTask(StuTaskExample StuTaskExample) {
        StuTaskMapper.deleteByExample(StuTaskExample);
    }
    public void updateStuTask(StuTask StuTask, StuTaskExample StuTaskExample) {
        StuTaskMapper.updateByExample(StuTask, StuTaskExample);
    }
}