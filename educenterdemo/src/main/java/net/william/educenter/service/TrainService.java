package net.william.educenter.service;
import net.william.educenter.entity.Train;
import net.william.educenter.entity.TrainExample;
import net.william.educenter.mapper.TrainMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TrainService {

    @Resource
    private net.william.educenter.mapper.TrainMapper TrainMapper;

    public List<Train> selectByExample(TrainExample TrainExample) {
        return TrainMapper.selectByExample(TrainExample);
    }
    public void insertTrain(Train Train) {
        TrainMapper.insert(Train);
    }
    public void deleteTrain(TrainExample TrainExample) {
        TrainMapper.deleteByExample(TrainExample);
    }
    public void updateTrain(Train Train, TrainExample TrainExample) {
        TrainMapper.updateByExample(Train, TrainExample);
    }
}