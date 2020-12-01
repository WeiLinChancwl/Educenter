package net.william.educenter.service;
import net.william.educenter.entity.StuTrain;
import net.william.educenter.entity.StuTrainExample;
import net.william.educenter.mapper.StuTrainMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StuTrainService {
    @Resource
    private StuTrainMapper stuTrainMapper;
    public List<StuTrain> selectByExample(StuTrainExample example) {
        return stuTrainMapper.selectByExample(example);
    }
}