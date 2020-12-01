package net.william.educenter.controller;
import net.william.educenter.entity.*;
import net.william.educenter.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GuideController {

    @Resource
    private CourseService courseService;
    @Resource
    private EventService eventService;
    @Resource
    private BlogService blogService;
    @Resource
    private TeacherService teacherService;
    @Resource
    private SlideService slideService;
    @Resource
    private NoticeService noticeService;

    @RequestMapping("/index")
    public String getIndex(Model model, HttpSession session) {
        CourseExample courseExample = new CourseExample();
        List<Course> courses = courseService.selectByExample(courseExample);
        model.addAttribute("courses", courses);
        EventExample eventExample = new EventExample();
        List<Event> events = eventService.selectByExample(eventExample);
        model.addAttribute("events", events);
        BlogExample blogExample = new BlogExample();
        List<Blog> blogs = blogService.selectByExample(blogExample);
        model.addAttribute("blogs", blogs);
        TeacherExample teacherExample = new TeacherExample();
        List<Teacher> teachers = teacherService.selectByExample(teacherExample);
        model.addAttribute("teachers", teachers);
        SlideExample slideExample = new SlideExample();
        List<Slide> slides = slideService.selectByExample(slideExample);
        model.addAttribute("slides", slides);
        return "index";
    }

    @RequestMapping("/login.do")
    public String login(Model model, HttpSession session, String user, String useraccount, String password) {
        session.setAttribute("useraccount", useraccount);
        session.setAttribute("password", password);
        if (user.equals("学生"))
            return "redirect:/studentlogin.do";
        else if (user.equals("老师"))
            return "redirect:/teacherlogin.do";
        else
            return "redirect:/organizationlogin.do";
    }

    @RequestMapping("/register.do")
    public String register(Model model, HttpSession session, String newuser, String newaccount, String newpassword,
                           String newemail, String newtel, String newusername) {
        session.setAttribute("newaccount", newaccount);
        session.setAttribute("newpassword", newpassword);
        session.setAttribute("newemail", newemail);
        session.setAttribute("newtel", newtel);
        session.setAttribute("newusername", newusername);
        if (newuser.equals("学生"))
            return "redirect:/studentregister.do";
        else if (newuser.equals("老师"))
            return "redirect:/teacherregister.do";
        else
            return "redirect:/organizationregister.do";
    }

    @RequestMapping("/signin")
    public String getSignin() {
        return "signin";
    }

    @RequestMapping("/signup")
    public String getSignup() {
        return "signup";
    }

    @RequestMapping("/about")
    public String getAbout() {
        return "about";
    }

    @RequestMapping("/blog")
    public String getBlog(Model model) {
        BlogExample blogExample = new BlogExample();
        List<Blog> blogs = blogService.selectByExample(blogExample);
        model.addAttribute("blogs", blogs);
        return "blog";
    }

    @RequestMapping("/contact")
    public String getContact() {
        return "contact";
    }

    @RequestMapping("/courses")
    public String getCourses(Model model) {
        CourseExample courseExample = new CourseExample();
        List<Course> courses = courseService.selectByExample(courseExample);
        model.addAttribute("courses", courses);
        return "courses";
    }

    @RequestMapping("/events")
    public String getEvents(Model model) {
        EventExample eventExample = new EventExample();
        List<Event> events = eventService.selectByExample(eventExample);
        model.addAttribute("events", events);
        return "events";
    }

    @RequestMapping("/notice-single")
    public String getNoticeSingle() {
        return "notice-single";
    }

    @RequestMapping("/notice")
    public String getNotice() {
        return "notice";
    }

    @RequestMapping("/research")
    public String getResearch() {
        return "research";
    }

    @RequestMapping("/scholarship")
    public String getScholarship() {
        return "scholarship";
    }

    @RequestMapping("/teacher")
    public String getTeacher() {
        return "teacher";
    }

}