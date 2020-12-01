package net.william.educenter.service;
import net.william.educenter.entity.New;
import net.william.educenter.entity.NewExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NewService {

    @Resource
    private net.william.educenter.mapper.NewMapper NewMapper;

    public List<New> selectByExample(NewExample NewExample) {
        return NewMapper.selectByExample(NewExample);
    }
    public void insertNew(New New) {
        NewMapper.insert(New);
    }
    public void deleteNew(NewExample NewExample) {
        NewMapper.deleteByExample(NewExample);
    }
    public void updateNew(New New, NewExample NewExample) {
        NewMapper.updateByExample(New, NewExample);
    }
}