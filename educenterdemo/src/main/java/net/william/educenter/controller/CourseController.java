package net.william.educenter.controller;
import net.william.educenter.entity.*;
import net.william.educenter.service.*;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CourseController {
    @Resource
    private CourseService courseService;
    @Resource
    private SchoolService schoolService;
    @Resource
    private DeptService deptService;
    @Resource
    private MajorService majorService;
    @Resource
    private IfTakeCourseService ifTakeCourseService;
    @Resource
    private StuCourseService stuCourseService;
    @Resource
    private StuTaskService stuTaskService;
    @Resource
    private MessageService messageService;
    @Resource
    private SlideService slideService;
    @Resource
    private AttachmentService attachmentService;
    @Resource
    private ProblemService problemService;

    @RequestMapping("/course-single")
    public String Course(Model model, Integer courseId) {
        CourseExample CourseExample = new CourseExample();
        CourseExample.Criteria criteria = CourseExample.createCriteria();
        criteria.andCIdEqualTo(courseId);
        List<Course> Courses = courseService.selectByExample(CourseExample);
        if(Courses!=null && Courses.size()>0) {
            model.addAttribute("course", Courses.get(0));
        }
        CourseExample CourseExample1 = new CourseExample();
        CourseExample.Criteria criteria1 = CourseExample1.createCriteria();
        List<Course> Courses1 = courseService.selectByExample(CourseExample1);
        model.addAttribute("courses", Courses1);
        return "course-single";
    }

    @RequestMapping("/student-course-single")
    public String studentCourseSingle(Model model, Integer courseId) {
        CourseExample CourseExample = new CourseExample();
        CourseExample.Criteria criteria = CourseExample.createCriteria();
        criteria.andCIdEqualTo(courseId);
        List<Course> Courses = courseService.selectByExample(CourseExample);
        if(Courses!=null && Courses.size()>0) {
            model.addAttribute("course", Courses.get(0));
        }
        CourseExample CourseExample1 = new CourseExample();
        CourseExample.Criteria criteria1 = CourseExample1.createCriteria();
        List<Course> Courses1 = courseService.selectByExample(CourseExample1);
        model.addAttribute("courses", Courses1);
        return "student/course-single";
    }

    @RequestMapping("/courselearn")
    public String CourseLearn(Model model, Integer courseId) {
        CourseExample CourseExample = new CourseExample();
        CourseExample.Criteria criteria = CourseExample.createCriteria();
        criteria.andCIdEqualTo(courseId);
        List<Course> Courses = courseService.selectByExample(CourseExample);
        if(Courses!=null && Courses.size()>0) {
            model.addAttribute("course", Courses.get(0));
        }
        CourseExample CourseExample1 = new CourseExample();
        CourseExample.Criteria criteria1 = CourseExample1.createCriteria();
        List<Course> Courses1 = courseService.selectByExample(CourseExample1);
        model.addAttribute("courses", Courses1);
        AttachmentExample attachmentExample = new AttachmentExample();
        AttachmentExample.Criteria criteria2 = attachmentExample.createCriteria();
        criteria2.andCIdEqualTo(courseId);
        List<Attachment> attachments = attachmentService.selectByExample(attachmentExample);
        model.addAttribute("attachments", attachments);
        return "student/courselearn";
    }

    @RequestMapping("/course-admin")
    public String CourseAdmin(Model model, Integer courseId) {
        CourseExample CourseExample = new CourseExample();
        CourseExample.Criteria criteria = CourseExample.createCriteria();
        criteria.andCIdEqualTo(courseId);
        List<Course> Courses = courseService.selectByExample(CourseExample);
        if(Courses!=null && Courses.size()>0) {
            model.addAttribute("course", Courses.get(0));
        }
        CourseExample CourseExample1 = new CourseExample();
        CourseExample.Criteria criteria1 = CourseExample1.createCriteria();
        List<Course> Courses1 = courseService.selectByExample(CourseExample1);
        model.addAttribute("courses", Courses1);
        AttachmentExample attachmentExample = new AttachmentExample();
        AttachmentExample.Criteria criteria2 = attachmentExample.createCriteria();
        criteria2.andCIdEqualTo(courseId);
        List<Attachment> attachments = attachmentService.selectByExample(attachmentExample);
        model.addAttribute("attachments", attachments);
        return "teacher/course-admin";
    }

    @RequestMapping("/course-test")
    public String CourseTest(Model model) {
        ProblemExample problemExample = new ProblemExample();
        List<Problem> problems = problemService.selectByExample(problemExample);
        model.addAttribute("problems", problems);
        return "student/course-test";
    }


    @RequestMapping("/ExamServlet")
    public String ExamServlet(Model model, HttpServletRequest req) {
        ProblemExample problemExample = new ProblemExample();
        List<Problem> problems = problemService.selectByExample(problemExample);
        int sum = 0;
        for(Problem problem : problems) {
            if(req.getParameter(String.valueOf(problem.getProblemId())).equals(problem.getResult())) {
                sum++;
            }
        }
        model.addAttribute("sum", sum);
        return "student/result";
    }

    @RequestMapping("/teacher-course-single")
    public String teacherCourseSingle(Model model, Integer courseId) {
        CourseExample CourseExample = new CourseExample();
        CourseExample.Criteria criteria = CourseExample.createCriteria();
        criteria.andCIdEqualTo(courseId);
        List<Course> Courses = courseService.selectByExample(CourseExample);
        if(Courses!=null && Courses.size()>0) {
            model.addAttribute("course", Courses.get(0));
        }
        CourseExample CourseExample1 = new CourseExample();
        CourseExample.Criteria criteria1 = CourseExample1.createCriteria();
        List<Course> Courses1 = courseService.selectByExample(CourseExample1);
        model.addAttribute("courses", Courses1);
        return "teacher/course-single";
    }

    @RequestMapping("/coursetable")
    public String getCourseTable(Model model) {
        CourseExample courseExample = new CourseExample();
        List<Course> courses = courseService.selectByExample(courseExample);
        model.addAttribute("courses", courses);
        return "superuser/coursetable";
    }

    @RequestMapping("/organization-coursetable")
    public String getOrganizationCourseTable(Model model) {
        CourseExample courseExample = new CourseExample();
        List<Course> courses = courseService.selectByExample(courseExample);
        model.addAttribute("courses", courses);
        return "organization/coursetable";
    }

    @RequestMapping("/schooltable")
    public String getSchoolTable(Model model) {
        SchoolExample schoolExample = new SchoolExample();
        List<School> schools = schoolService.selectByExample(schoolExample);
        model.addAttribute("schools", schools);
        return "superuser/schooltable";
    }

    @RequestMapping("/organization-schooltable")
    public String getOrganizationSchoolTable(Model model) {
        SchoolExample schoolExample = new SchoolExample();
        List<School> schools = schoolService.selectByExample(schoolExample);
        model.addAttribute("schools", schools);
        return "organization/schooltable";
    }

    @RequestMapping("/depttable")
    public String getDeptTable(Model model) {
        DeptExample deptExample = new DeptExample();
        List<Dept> depts = deptService.selectByExample(deptExample);
        model.addAttribute("depts", depts);
        return "superuser/depttable";
    }

    @RequestMapping("/organization-depttable")
    public String getOrganizationDeptTable(Model model) {
        DeptExample deptExample = new DeptExample();
        List<Dept> depts = deptService.selectByExample(deptExample);
        model.addAttribute("depts", depts);
        return "organization/depttable";
    }

    @RequestMapping("/majortable")
    public String getMajorTable(Model model) {
        MajorExample majorExample = new MajorExample();
        List<Major> majors = majorService.selectByExample(majorExample);
        model.addAttribute("majors", majors);
        return "superuser/majortable";
    }

    @RequestMapping("/organization-majortable")
    public String getOrganizationMajorTable(Model model) {
        MajorExample majorExample = new MajorExample();
        List<Major> majors = majorService.selectByExample(majorExample);
        model.addAttribute("majors", majors);
        return "organization/majortable";
    }

    @RequestMapping("/iftakecoursetable")
    public String getIfTakeCourseTable(Model model) {
        IfTakeCourseExample ifTakeCourseExample = new IfTakeCourseExample();
        List<IfTakeCourse> ifTakeCourses = ifTakeCourseService.selectByExample(ifTakeCourseExample);
        model.addAttribute("ifTakeCourses", ifTakeCourses);
        return "superuser/iftakecoursetable";
    }

    @RequestMapping("/organization-iftakecoursetable")
    public String getOrganizationIfTakeCourseTable(Model model) {
        IfTakeCourseExample ifTakeCourseExample = new IfTakeCourseExample();
        List<IfTakeCourse> ifTakeCourses = ifTakeCourseService.selectByExample(ifTakeCourseExample);
        model.addAttribute("ifTakeCourses", ifTakeCourses);
        return "organization/iftakecoursetable";
    }

    @RequestMapping("/stucoursetable")
    public String getStuCourseTable(Model model) {
        StuCourseExample stuCourseExample = new StuCourseExample();
        List<StuCourse> stuCourses = stuCourseService.selectByExample(stuCourseExample);
        model.addAttribute("stuCourses", stuCourses);
        return "superuser/stucoursetable";
    }

    @RequestMapping("/organization-stucoursetable")
    public String getOrganizationStuCourseTable(Model model) {
        StuCourseExample stuCourseExample = new StuCourseExample();
        List<StuCourse> stuCourses = stuCourseService.selectByExample(stuCourseExample);
        model.addAttribute("stuCourses", stuCourses);
        return "organization/stucoursetable";
    }

    @RequestMapping("/stutasktable")
    public String getStuTaskTable(Model model) {
        StuTaskExample stuTaskExample = new StuTaskExample();
        List<StuTask> stuTasks = stuTaskService.selectByExample(stuTaskExample);
        model.addAttribute("stuTasks", stuTasks);
        return "superuser/stutasktable";
    }

    @RequestMapping("/organization-stutasktable")
    public String getOrganizationStuTaskTable(Model model) {
        StuTaskExample stuTaskExample = new StuTaskExample();
        List<StuTask> stuTasks = stuTaskService.selectByExample(stuTaskExample);
        model.addAttribute("stuTasks", stuTasks);
        return "organization/stutasktable";
    }

    @RequestMapping("/messagetable")
    public String getMessageTable(Model model) {
        MessageExample messageExample = new MessageExample();
        List<Message> messages = messageService.selectByExample(messageExample);
        model.addAttribute("messages", messages);
        return "superuser/messagetable";
    }

    @RequestMapping("/organization-messagetable")
    public String getOrganizationMessageTable(Model model) {
        MessageExample messageExample = new MessageExample();
        List<Message> messages = messageService.selectByExample(messageExample);
        model.addAttribute("messages", messages);
        return "organization/messagetable";
    }

    @RequestMapping("/slidetable")
    public String getSlideTable(Model model) {
        SlideExample slideExample = new SlideExample();
        List<Slide> slides = slideService.selectByExample(slideExample);
        model.addAttribute("slides", slides);
        return "superuser/slidetable";
    }

    @RequestMapping("/organization-slidetable")
    public String getOrganizationSlideTable(Model model) {
        SlideExample slideExample = new SlideExample();
        List<Slide> slides = slideService.selectByExample(slideExample);
        model.addAttribute("slides", slides);
        return "organization/slidetable";
    }

    @RequestMapping("/insertStuCourse")
    public String insertStuCourse(Model model, HttpSession session, Integer courseId) {
        Integer sId = (Integer) session.getAttribute("sId");
        StuCourseExample stuCourseExample = new StuCourseExample();
        StuCourseExample.Criteria criteria = stuCourseExample.createCriteria();
        if(sId != null && courseId != null) {
            criteria.andSIdEqualTo(sId);
            criteria.andCIdEqualTo(courseId);
            List<StuCourse> stuCourses = stuCourseService.selectByExample(stuCourseExample);
            if(stuCourses != null && stuCourses.size() > 0) {
                System.out.println("已选修该门课");
            } else {
                CourseExample courseExample = new CourseExample();
                CourseExample.Criteria criteria1 = courseExample.createCriteria();
                criteria1.andCIdEqualTo(courseId);
                List<Course> courses = courseService.selectByExample(courseExample);
                StuCourse stuCourse = new StuCourse();
                stuCourse.setcId(courseId);
                stuCourse.setsId(sId);
                stuCourse.settId(courses.get(0).gettId());
                stuCourse.setStatus("选课");
                stuCourse.setcName(courses.get(0).getcName());
                stuCourseService.insertStuCourse(stuCourse);
                System.out.println("选课成功");
            }
        }
        return "redirect:/student-courses";
    }
}