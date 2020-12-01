package net.william.educenter.controller;
import net.william.educenter.entity.Contact;
import net.william.educenter.entity.ContactExample;
import net.william.educenter.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class ContactController {
    @Resource
    private ContactService ContactService;

    @RequestMapping("/supercontact")
    public String Contact(Model model, Integer contactId) {
        ContactExample ContactExample = new ContactExample();
        ContactExample.Criteria criteria = ContactExample.createCriteria();
        criteria.andContactIdEqualTo(contactId);
        List<Contact> Contacts = ContactService.selectByExample(ContactExample);
        if(Contacts!=null && Contacts.size()>0) {
            model.addAttribute("contact", Contacts.get(0));
        }
        return "superuser/contact";
    }

    @RequestMapping("/contactlist")
    public String ContactList(Model model) {
        ContactExample contactExample = new ContactExample();
        List<Contact> contacts = ContactService.selectByExample(contactExample);
        if(contacts!=null && contacts.size()>0) {
            model.addAttribute("contacts", contacts);
        }
        return "superuser/contactlist";
    }

    @RequestMapping("/contacttable")
    public String getContactTable(Model model) {
        ContactExample contactExample = new ContactExample();
        List<Contact> contacts = ContactService.selectByExample(contactExample);
        model.addAttribute("contacts", contacts);
        return "superuser/contacttable";
    }

    @RequestMapping("/organization-contacttable")
    public String getOrganizationContactTable(Model model) {
        ContactExample contactExample = new ContactExample();
        List<Contact> contacts = ContactService.selectByExample(contactExample);
        model.addAttribute("contacts", contacts);
        return "organization/contacttable";
    }

    @RequestMapping("/contact.do")
    public void Contact(String username, String time, String useremail, String usertel, String useraddress, String content, String title) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(date);
        if(title == null || content == null) {
            title = "商业合作";
            content = "我方想与你合作";
            time =  dateNowStr;
        }
        Contact contact = new Contact();
        contact.setContactName(username);
        contact.setContactEmail(useremail);
        contact.setContactTel(usertel);
        contact.setContactContent(content);
        contact.setContactTitle(title);
        contact.setContactTime(time);
        ContactService.insert(contact);
    }
}