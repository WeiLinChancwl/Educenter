package net.william.educenter.controller;

import net.william.educenter.entity.*;
import net.william.educenter.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TeacherController {
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
    @Resource
    private StuTaskService stuTaskService;
    @Resource
    private StuCourseService stuCourseService;
    @Resource
    private StuTrainService stuTrainService;

    @RequestMapping("/teacherlogin.do")
    public String login(HttpSession session) {
        String useraccount = (String) session.getAttribute("useraccount");
        String password = (String) session.getAttribute("password");
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        if (useraccount != null && useraccount.trim() != "" && password != null && password.trim() != "") {
            criteria.andTAccountEqualTo(useraccount);
            criteria.andTPswEqualTo(password);
            List<Teacher> Teachers = teacherService.selectByExample(teacherExample);
            if (Teachers != null && Teachers.size() > 0) {
                Teacher teacher = Teachers.get(0);
                session.setAttribute("useraccount", useraccount);
                session.setAttribute("username", teacher.gettName());
                session.setAttribute("tId", teacher.gettId());
                System.out.println("登录成功");
                return "teacher-index";
            } else {
                System.out.println("账号或密码有误");
            }
        }
        return "signin";
    }

    @RequestMapping("/teacherregister.do")
    public String register(Model model, HttpSession session) {
        String newaccount = (String) session.getAttribute("newaccount");
        String newpassword = (String) session.getAttribute("newpassword");
        String newemail = (String) session.getAttribute("newemail");
        String newusername = (String) session.getAttribute("newusername");
        String newtel = (String) session.getAttribute("newtel");
        TeacherExample TeacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = TeacherExample.createCriteria();
        if (newaccount != null && newaccount.trim() != "" && newpassword != null && newpassword.trim() != "") {
            criteria.andTAccountEqualTo(newaccount);
            criteria.andTPswEqualTo(newpassword);
            List<Teacher> Teachers = teacherService.selectByExample(TeacherExample);
            if (Teachers != null && Teachers.size() > 0) {
                System.out.println("已存在该账户");
            } else {
                Teacher Teacher = new Teacher();
                Teacher.settAccount(newaccount);
                Teacher.settPsw(newpassword);
                Teacher.settEmail(newemail);
                Teacher.settName(newusername);
                Teacher.settTel(newtel);
                System.out.println("注册成功");
                teacherService.insertTeacher(Teacher);
                return "/signin";
            }
        }
        return "/signup";
    }

    @RequestMapping("/teachertable")
    public String getTeacherTable(Model model) {
        TeacherExample TeacherExample = new TeacherExample();
        List<Teacher> Teachers = teacherService.selectByExample(TeacherExample);
        model.addAttribute("teachers", Teachers);
        return "superuser/teachertable";
    }

    @RequestMapping("/organization-teachertable")
    public String getOrganizationTeacherTable(Model model) {
        TeacherExample TeacherExample = new TeacherExample();
        List<Teacher> Teachers = teacherService.selectByExample(TeacherExample);
        model.addAttribute("teachers", Teachers);
        return "organization/teachertable";
    }

    @RequestMapping("/teacher-single")
    public String TeacherSingle(Model model, Integer teacherId) {
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andTIdEqualTo(teacherId);
        List<Teacher> teachers = teacherService.selectByExample(teacherExample);
        if(teachers!=null && teachers.size()>0) {
            model.addAttribute("teacher", teachers.get(0));
        }
        CourseExample CourseExample1 = new CourseExample();
        CourseExample.Criteria criteria1 = CourseExample1.createCriteria();
        List<Course> Courses1 = courseService.selectByExample(CourseExample1);
        model.addAttribute("courses", Courses1);
        return "teacher-single";
    }

    @RequestMapping("/student-teacher-single")
    public String StudentTeacherSingle(Model model, Integer teacherId) {
        TeacherExample teacherExample = new TeacherExample();
        TeacherExample.Criteria criteria = teacherExample.createCriteria();
        criteria.andTIdEqualTo(teacherId);
        List<Teacher> teachers = teacherService.selectByExample(teacherExample);
        if(teachers!=null && teachers.size()>0) {
            model.addAttribute("teacher", teachers.get(0));
        }
        CourseExample CourseExample1 = new CourseExample();
        CourseExample.Criteria criteria1 = CourseExample1.createCriteria();
        List<Course> Courses1 = courseService.selectByExample(CourseExample1);
        model.addAttribute("courses", Courses1);
        return "student/teacher-single";
    }

    @RequestMapping("/teacher-index")
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
        return "teacher/teacher-index";
    }

    @RequestMapping("/teacher-about")
    public String getAbout() {
        return "teacher/about";
    }

    @RequestMapping("/teacher-blog")
    public String getBlog(Model model) {
        BlogExample blogExample = new BlogExample();
        List<Blog> blogs = blogService.selectByExample(blogExample);
        model.addAttribute("blogs", blogs);
        return "teacher/blog";
    }

    @RequestMapping("/teacher-contact")
    public String getContact() {
        return "teacher/contact";
    }

    @RequestMapping("/teacher-courses")
    public String getCourses(Model model, HttpSession session) {
        Integer tId = (Integer)session.getAttribute("tId");
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria criteria = courseExample.createCriteria();
        if (tId != null) {
            criteria.andTIdEqualTo(tId);
            List<Course> courses = courseService.selectByExample(courseExample);
            model.addAttribute("courses", courses);
        }
        return "teacher/courses";
    }

    @RequestMapping("/teacher-course")
    public String getCourse(Model model) {
        CourseExample courseExample = new CourseExample();
        List<Course> courses = courseService.selectByExample(courseExample);
        model.addAttribute("courses", courses);
        return "teacher/courses";
    }

    @RequestMapping("/teacher-events")
    public String getEvents(Model model) {
        EventExample eventExample = new EventExample();
        List<Event> events = eventService.selectByExample(eventExample);
        model.addAttribute("events", events);
        return "teacher/events";
    }

    @RequestMapping("/teacher-notice")
    public String getNotice(Model model, HttpSession session) {
        Integer tId = (Integer)session.getAttribute("tId");
        NoticeExample noticeExample = new NoticeExample();
        NoticeExample.Criteria criteria = noticeExample.createCriteria();
        if(tId != null) {
            criteria.andTIdEqualTo(tId);
            List<Notice> notices = noticeService.selectByExample(noticeExample);
            model.addAttribute("notices", notices);
        }
        return "teacher/notice";
    }

    @RequestMapping("/teacher-notice-single")
    public String NoticeSingle(Model model, Integer noticeId) {
        NoticeExample noticeExample = new NoticeExample();
        NoticeExample.Criteria criteria = noticeExample.createCriteria();
        criteria.andNoticeIdEqualTo(noticeId);
        List<Notice> notices = noticeService.selectByExample(noticeExample);
        if(notices != null && notices.size()>0) {
            model.addAttribute("notice", notices.get(0));
        }
        return "teacher/notice-single";
    }

    @RequestMapping("/teacher-research")
    public String getResearch() {
        return "teacher/research";
    }

    @RequestMapping("/teacher-scholarship")
    public String getScholarship() {
        return "teacher/scholarship";
    }

    @RequestMapping("/teacher-task")
    public String getTask(Model model, HttpSession session) {
        Integer tId = (Integer)session.getAttribute("tId");
        StuTaskExample stuTaskExample = new StuTaskExample();
        StuTaskExample.Criteria criteria = stuTaskExample.createCriteria();
        if (tId != null) {
            criteria.andTIdEqualTo(tId);
            List<StuTask> stuTasks = stuTaskService.selectByExample(stuTaskExample);
            model.addAttribute("stutasks", stuTasks);
        }
        return "teacher/task";
    }

    @RequestMapping("/teacher-ability")
    public String getAbility(Model model, HttpSession session) {
        Integer tId = (Integer)session.getAttribute("tId");
        StuCourseExample stuCourseExample = new StuCourseExample();
        StuCourseExample.Criteria criteria = stuCourseExample.createCriteria();
        StuTrainExample stuTrainExample = new StuTrainExample();
        StuTrainExample.Criteria stuTrainExampleCriteria = stuTrainExample.createCriteria();
        if (tId != null) {
            criteria.andTIdEqualTo(tId);
            stuTrainExampleCriteria.andTIdEqualTo(tId);
            List<StuCourse> stucourses = stuCourseService.selectByExample(stuCourseExample);
            List<StuTrain> stutrains = stuTrainService.selectByExample(stuTrainExample);
            model.addAttribute("stucourses", stucourses);
            model.addAttribute("stutrains", stutrains);
        }
        return "teacher/ability";
    }

    @RequestMapping("/teacher-analysis")
    public String getAnalysis(Model model, HttpSession session) {
        Integer tId = (Integer)session.getAttribute("tId");
        StuCourseExample stuCourseExample = new StuCourseExample();
        StuCourseExample.Criteria criteria = stuCourseExample.createCriteria();
        StuTrainExample stuTrainExample = new StuTrainExample();
        StuTrainExample.Criteria stuTrainExampleCriteria = stuTrainExample.createCriteria();
        if (tId != null) {
            criteria.andTIdEqualTo(tId);
            stuTrainExampleCriteria.andTIdEqualTo(tId);
            List<StuCourse> stucourses = stuCourseService.selectByExample(stuCourseExample);
            List<StuTrain> stutrains = stuTrainService.selectByExample(stuTrainExample);
            model.addAttribute("stucourses", stucourses);
            model.addAttribute("stutrains", stutrains);
        }
        return "teacher/analysis";
    }

    @RequestMapping("/teacher-teacher")
    public String getTeacher() {
        return "teacher/teacher";
    }
}