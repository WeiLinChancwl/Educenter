package net.william.educenter.service;
import net.william.educenter.entity.Event;
import net.william.educenter.entity.EventExample;
import net.william.educenter.mapper.EventMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EventService {
    @Resource
    private EventMapper eventMapper;
    public List<Event> selectByExample(EventExample example) {
        return eventMapper.selectByExample(example);
    }
}