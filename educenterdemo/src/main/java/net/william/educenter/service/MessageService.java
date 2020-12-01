package net.william.educenter.service;
import net.william.educenter.entity.Message;
import net.william.educenter.entity.MessageExample;
import net.william.educenter.mapper.MessageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MessageService {

    @Resource
    private net.william.educenter.mapper.MessageMapper MessageMapper;

    public List<Message> selectByExample(MessageExample MessageExample) {
        return MessageMapper.selectByExample(MessageExample);
    }
    public void insertMessage(Message Message) {
        MessageMapper.insert(Message);
    }
    public void deleteMessage(MessageExample MessageExample) {
        MessageMapper.deleteByExample(MessageExample);
    }
    public void updateMessage(Message Message, MessageExample MessageExample) {
        MessageMapper.updateByExample(Message, MessageExample);
    }
}