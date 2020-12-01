package net.william.educenter.service;
import net.william.educenter.entity.Contact;
import net.william.educenter.entity.ContactExample;
import net.william.educenter.mapper.ContactMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContactService {
    @Resource
    private ContactMapper contactMapper;
    public List<Contact> selectByExample(ContactExample example) {
        return contactMapper.selectByExample(example);
    }
    public void insert(Contact contact) {
        contactMapper.insert(contact);
    }
}