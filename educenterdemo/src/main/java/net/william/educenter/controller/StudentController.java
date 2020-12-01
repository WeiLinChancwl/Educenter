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
public class StudentController {
    @Resource
    private StudentService studentService;
    @Resource
    private CourseService courseService;
    @Resource
    private EventService eventService;
    @Resource
    private BlogService blogService;
    @Resource
    private TeacherService teacherService;
    @Resource
    private StuCourseService stuCourseService;
    @Resource
    private StuTrainService stuTrainService;
    @Resource
    private StuTaskService stuTaskService;
    @Resource
    private SlideService slideService;
    @Resource
    private NoticeService noticeService;


    @RequestMapping("/studentlogin.do")
    public String login(HttpSession session) {
        String useraccount = (String) session.getAttribute("useraccount");
        String password = (String) session.getAttribute("password");
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        if (useraccount != null && useraccount.trim() != "" && password != null && password.trim() != "") {
            criteria.andSAccountEqualTo(useraccount);
            criteria.andSPswEqualTo(password);
            List<Student> students = studentService.selectByExample(studentExample);
            if (students!=null && students.size()>0) {
                Student student = students.get(0);
                session.setAttribute("sId", student.getsId());
                session.setAttribute("username", student.getsName());
                System.out.println("登录成功");
                return "student-index";
            } else {
                System.out.println("账号或密码有误");
            }
        }
        return "signin";
    }

    @RequestMapping("/studentregister.do")
    public String register(Model model, HttpSession session) {
        String newaccount = (String) session.getAttribute("newaccount");
        String newpassword = (String) session.getAttribute("newpassword");
        String newemail = (String) session.getAttribute("newemail");
        String newusername = (String) session.getAttribute("newusername");
        String newtel = (String) session.getAttribute("newtel");
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        if (newaccount != null && newaccount.trim() != "" && newpassword != null && newpassword.trim() != "") {
            criteria.andSAccountEqualTo(newaccount);
            criteria.andSPswEqualTo(newpassword);
            List<Student> students = studentService.selectByExample(studentExample);
            if (students!=null && students.size()>0) {
                System.out.println("已存在该账户");
            } else {
                Student student = new Student();
                student.setsAccount(newaccount);
                student.setsPsw(newpassword);
                student.setsEmail(newemail);
                student.setsName(newusername);
                student.setsTel(newtel);
                studentService.insertstudent(student);
                System.out.println("注册成功");
                return "/signin";
            }
        }
        return "/signup";
    }

    @RequestMapping("/studenttable")
    public String getStudentTable(Model model) {
        StudentExample studentExample = new StudentExample();
        List<Student> students = studentService.selectByExample(studentExample);
        model.addAttribute("students", students);
        return "superuser/studenttable";
    }

    @RequestMapping("/organization-studenttable")
    public String getOrganizationStudentTable(Model model) {
        StudentExample studentExample = new StudentExample();
        List<Student> students = studentService.selectByExample(studentExample);
        model.addAttribute("students", students);
        return "organization/studenttable";
    }

    @RequestMapping("/deleteStudent")
    public String deleteStudent(Integer[] sIds) {
        for(Integer sid : sIds) {
            if (sid != null) {
                StudentExample StudentExample = new StudentExample();
                StudentExample.Criteria criteria = StudentExample.createCriteria();
                criteria.andSIdEqualTo(sid);
                studentService.deletestudent(StudentExample);
            }
        }
        System.out.println("删除成功");
        return "redirect:/studenttable";
    }

    @RequestMapping("/insertStudent")
    public String InsertStudent(Model model, String newaccount, String newpassword, String newemail, String newtel, String newusername, String newsex, String newbirthday) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        if (newaccount != null && newaccount.trim() != "" && newpassword != null && newpassword.trim() != "") {
            criteria.andSAccountEqualTo(newaccount);
            criteria.andSPswEqualTo(newpassword);
            List<Student> Students = studentService.selectByExample(studentExample);
            if (Students!=null && Students.size()>0) {
                System.out.println("已存在该账户");
            } else {
                Student Student = new Student();
                Student.setsAccount(newaccount);
                Student.setsPsw(newpassword);
                Student.setsEmail(newemail);
                Student.setsName(newusername);
                Student.setsTel(newtel);
                Student.setsSex(newsex);
                Student.setsBirthday(newbirthday);
                studentService.insertstudent(Student);
                System.out.println("注册成功");
            }
        }
        return "redirect:/studenttable";
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(Model model, String newaccount, String newpassword, String newemail, String newtel, String newusername, String newsex, String newbirthday) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        if (newaccount != null && newaccount.trim() != "" && newpassword != null && newpassword.trim() != "") {
            Student Student = new Student();
            Student.setsAccount(newaccount);
            Student.setsPsw(newpassword);
            Student.setsEmail(newemail);
            Student.setsName(newusername);
            Student.setsTel(newtel);
            Student.setsSex(newsex);
            Student.setsBirthday(newbirthday);
            studentService.updatestudent(Student, studentExample);
            System.out.println("更新成功");
        }
        return "/studenttable";
    }

    @RequestMapping("/student-index")
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
        return "student/student-index";
    }

    @RequestMapping("/student-about")
    public String getAbout() {
        return "student/about";
    }

    @RequestMapping("/student-blog")
    public String getBlog(Model model) {
        BlogExample blogExample = new BlogExample();
        List<Blog> blogs = blogService.selectByExample(blogExample);
        model.addAttribute("blogs", blogs);
        return "student/blog";
    }

    @RequestMapping("/student-contact")
    public String getContact() {
        return "student/contact";
    }

    @RequestMapping("/student-courses")
    public String getCourses(Model model, HttpSession session) {
        Integer sId = (Integer)session.getAttribute("sId");
        StuCourseExample stuCourseExample = new StuCourseExample();
        StuCourseExample.Criteria criteria = stuCourseExample.createCriteria();
        if (sId != null) {
            criteria.andSIdEqualTo(sId);
            List<StuCourse> stucourses = stuCourseService.selectByExample(stuCourseExample);
            List<Course> courses = new ArrayList<>();
            for(StuCourse stuCourse : stucourses) {
                CourseExample courseExample = new CourseExample();
                CourseExample.Criteria criteria1 = courseExample.createCriteria();
                criteria1.andCIdEqualTo(stuCourse.getcId());
                courses.add((courseService.selectByExample(courseExample).get(0)));
            }
            model.addAttribute("courses", courses);
        }
        return "student/student-courses";
    }

    @RequestMapping("/student-ability")
    public String getAbility(Model model, HttpSession session) {
        Integer sId = (Integer)session.getAttribute("sId");
        StuCourseExample stuCourseExample = new StuCourseExample();
        StuCourseExample.Criteria criteria = stuCourseExample.createCriteria();
        StuTrainExample stuTrainExample = new StuTrainExample();
        StuTrainExample.Criteria stuTrainExampleCriteria = stuTrainExample.createCriteria();
        if (sId != null) {
            criteria.andSIdEqualTo(sId);
            stuTrainExampleCriteria.andSIdEqualTo(sId);
            List<StuCourse> stucourses = stuCourseService.selectByExample(stuCourseExample);
            List<StuTrain> stutrains = stuTrainService.selectByExample(stuTrainExample);
            model.addAttribute("stucourses", stucourses);
            model.addAttribute("stutrains", stutrains);
        }
        return "student/ability";
    }

    @RequestMapping("/student-events")
    public String getEvents(Model model) {
        EventExample eventExample = new EventExample();
        List<Event> events = eventService.selectByExample(eventExample);
        model.addAttribute("events", events);
        return "student/events";
    }

    @RequestMapping("/student-course")
    public String getCourse(Model model) {
        CourseExample courseExample = new CourseExample();
        List<Course> courses = courseService.selectByExample(courseExample);
        model.addAttribute("courses", courses);
        return "student/courses";
    }

    @RequestMapping("/student-notice")
    public String getNotice(Model model, HttpSession session) {
        Integer sId = (Integer)session.getAttribute("sId");
        NoticeExample noticeExample = new NoticeExample();
        NoticeExample.Criteria criteria = noticeExample.createCriteria();
        if(sId != null) {
            criteria.andSIdEqualTo(sId);
            List<Notice> notices = noticeService.selectByExample(noticeExample);
            model.addAttribute("notices", notices);
        }
        return "student/notice";
    }

    @RequestMapping("/student-notice-single")
    public String NoticeSingle(Model model, Integer noticeId) {
        NoticeExample noticeExample = new NoticeExample();
        NoticeExample.Criteria criteria = noticeExample.createCriteria();
        criteria.andNoticeIdEqualTo(noticeId);
        List<Notice> notices = noticeService.selectByExample(noticeExample);
        if(notices != null && notices.size()>0) {
            model.addAttribute("notice", notices.get(0));
        }
        return "student/notice-single";
    }


    @RequestMapping("/student-research")
    public String getResearch() {
        return "student/research";
    }

    @RequestMapping("/student-scholarship")
    public String getScholarship() {
        return "student/scholarship";
    }

    @RequestMapping("/student-teacher")
    public String getTeacher() {
        return "student/teacher";
    }

    @RequestMapping("/student-task")
    public String getTask(Model model, HttpSession session) {
        Integer sId = (Integer)session.getAttribute("sId");
        StuTaskExample stuTaskExample = new StuTaskExample();
        StuTaskExample.Criteria criteria = stuTaskExample.createCriteria();
        if (sId != null) {
            criteria.andSIdEqualTo(sId);
            List<StuTask> stuTasks = stuTaskService.selectByExample(stuTaskExample);
            model.addAttribute("stutasks", stuTasks);
        }
        return "student/task";
    }

    @RequestMapping("/student-grade")
    public String getGrade(Model model, HttpSession session) {
        Integer sId = (Integer)session.getAttribute("sId");
        StuCourseExample stuCourseExample = new StuCourseExample();
        StuCourseExample.Criteria criteria = stuCourseExample.createCriteria();
        if (sId != null) {
            criteria.andSIdEqualTo(sId);
            List<StuCourse> stucourses = stuCourseService.selectByExample(stuCourseExample);
            model.addAttribute("stucourses", stucourses);
        }
        return "student/grade";
    }
}