package net.william.educenter.controller;
import net.william.educenter.entity.New;
import net.william.educenter.entity.NewExample;
import net.william.educenter.service.NewService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class NewController {
    @Resource
    private NewService newService;

    @RequestMapping("/news")
    public String getNews(Model model, String newType) {
        NewExample newExample = new NewExample();
        if(newType != null) {
            NewExample.Criteria criteria = newExample.createCriteria();
            criteria.andNewTypeEqualTo(newType);
            List<New> news = newService.selectByExample(newExample);
            if(news != null && news.size() > 0)
                model.addAttribute("news", news);
        } else {
            List<New> news = newService.selectByExample(newExample);
            model.addAttribute("news", news);
        }
        return "news";
    }

    @RequestMapping("/new-single")
    public String newSingle(Model model, Integer newId) {
        NewExample newExample = new NewExample();
        NewExample.Criteria criteria = newExample.createCriteria();
        criteria.andNewIdEqualTo(newId);
        List<New> news = newService.selectByExample(newExample);
        if(news!=null && news.size()>0) {
            model.addAttribute("new", news.get(0));
        }
        NewExample newExample1 = new NewExample();
        List<New> news1 = newService.selectByExample(newExample1);
        model.addAttribute("news", news1);
        return "new-single";
    }

    @RequestMapping("/student-news")
    public String getStudentNews(Model model, String newType) {
        NewExample newExample = new NewExample();
        if(newType != null) {
            NewExample.Criteria criteria = newExample.createCriteria();
            criteria.andNewTypeEqualTo(newType);
            List<New> news = newService.selectByExample(newExample);
            if(news != null && news.size() > 0)
                model.addAttribute("news", news);
        } else {
            List<New> news = newService.selectByExample(newExample);
            model.addAttribute("news", news);
        }
        return "student/news";
    }

    @RequestMapping("/student-new-single")
    public String studentNew(Model model, Integer newId) {
        NewExample newExample = new NewExample();
        NewExample.Criteria criteria = newExample.createCriteria();
        criteria.andNewIdEqualTo(newId);
        List<New> news = newService.selectByExample(newExample);
        if(news!=null && news.size()>0) {
            model.addAttribute("new", news.get(0));
        }
        NewExample newExample1 = new NewExample();
        List<New> news1 = newService.selectByExample(newExample1);
        model.addAttribute("news", news1);
        return "student/new-single";
    }

    @RequestMapping("/teacher-news")
    public String getTeacherNews(Model model, String newType) {
        NewExample newExample = new NewExample();
        if(newType != null) {
            NewExample.Criteria criteria = newExample.createCriteria();
            criteria.andNewTypeEqualTo(newType);
            List<New> news = newService.selectByExample(newExample);
            if(news != null && news.size() > 0)
                model.addAttribute("news", news);
        } else {
            List<New> news = newService.selectByExample(newExample);
            model.addAttribute("news", news);
        }
        return "teacher/news";
    }

    @RequestMapping("/teacher-new-single")
    public String teacherNew(Model model, Integer newId) {
        NewExample newExample = new NewExample();
        NewExample.Criteria criteria = newExample.createCriteria();
        criteria.andNewIdEqualTo(newId);
        List<New> news = newService.selectByExample(newExample);
        if(news!=null && news.size()>0) {
            model.addAttribute("new", news.get(0));
        }
        NewExample newExample1 = new NewExample();
        List<New> news1 = newService.selectByExample(newExample1);
        model.addAttribute("news", news1);
        return "teacher/new-single";
    }

    @RequestMapping("/newtable")
    public String getNewTable(Model model) {
        NewExample newExample = new NewExample();
        List<New> news = newService.selectByExample(newExample);
        model.addAttribute("news", news);
        return "superuser/newtable";
    }

    @RequestMapping("/organization-newtable")
    public String getOrganizationNewTable(Model model) {
        NewExample newExample = new NewExample();
        List<New> news = newService.selectByExample(newExample);
        model.addAttribute("news", news);
        return "organization/newtable";
    }
}