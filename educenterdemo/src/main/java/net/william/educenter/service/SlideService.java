package net.william.educenter.service;
import net.william.educenter.entity.Slide;
import net.william.educenter.entity.SlideExample;
import net.william.educenter.mapper.SlideMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SlideService {

    @Resource
    private net.william.educenter.mapper.SlideMapper SlideMapper;

    public List<Slide> selectByExample(SlideExample SlideExample) {
        return SlideMapper.selectByExample(SlideExample);
    }
    public void insertSlide(Slide Slide) {
        SlideMapper.insert(Slide);
    }
    public void deleteSlide(SlideExample SlideExample) {
        SlideMapper.deleteByExample(SlideExample);
    }
    public void updateSlide(Slide Slide, SlideExample SlideExample) {
        SlideMapper.updateByExample(Slide, SlideExample);
    }
}