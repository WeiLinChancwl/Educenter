package net.william.educenter.service;
import net.william.educenter.entity.Notice;
import net.william.educenter.entity.NoticeExample;
import net.william.educenter.mapper.NoticeMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NoticeService {

    @Resource
    private net.william.educenter.mapper.NoticeMapper NoticeMapper;

    public List<Notice> selectByExample(NoticeExample NoticeExample) {
        return NoticeMapper.selectByExample(NoticeExample);
    }
    public void insertNotice(Notice Notice) {
        NoticeMapper.insert(Notice);
    }
    public void deleteNotice(NoticeExample NoticeExample) {
        NoticeMapper.deleteByExample(NoticeExample);
    }
    public void updateNotice(Notice Notice, NoticeExample NoticeExample) {
        NoticeMapper.updateByExample(Notice, NoticeExample);
    }
}