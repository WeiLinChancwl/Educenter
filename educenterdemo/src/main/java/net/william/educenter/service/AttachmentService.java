package net.william.educenter.service;
import net.william.educenter.entity.Attachment;
import net.william.educenter.entity.AttachmentExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AttachmentService {

    @Resource
    private net.william.educenter.mapper.AttachmentMapper AttachmentMapper;

    public List<Attachment> selectByExample(AttachmentExample AttachmentExample) {
        return AttachmentMapper.selectByExample(AttachmentExample);
    }
    public void insertAttachment(Attachment Attachment) {
        AttachmentMapper.insert(Attachment);
    }
    public void deleteAttachment(AttachmentExample AttachmentExample) {
        AttachmentMapper.deleteByExample(AttachmentExample);
    }
    public void updateAttachment(Attachment Attachment, AttachmentExample AttachmentExample) {
        AttachmentMapper.updateByExample(Attachment, AttachmentExample);
    }
}