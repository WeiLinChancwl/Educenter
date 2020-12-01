package net.william.educenter.controller;
import net.william.educenter.entity.Blog;
import net.william.educenter.entity.BlogExample;
import net.william.educenter.service.BlogService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BlogController {
    @Resource
    private BlogService blogService;

    @RequestMapping("/blog-single")
    public String blog(Model model, Integer blogId) {
        BlogExample blogExample = new BlogExample();
        BlogExample.Criteria criteria = blogExample.createCriteria();
        criteria.andBlogIdEqualTo(blogId);
        List<Blog> blogs = blogService.selectByExample(blogExample);
        if(blogs!=null && blogs.size()>0) {
            model.addAttribute("blog", blogs.get(0));
        }
        BlogExample blogExample1 = new BlogExample();
        List<Blog> blogs1 = blogService.selectByExample(blogExample1);
        model.addAttribute("blogs", blogs1);
        return "blog-single";
    }

    @RequestMapping("/student-blog-single")
    public String studentBlog(Model model, Integer blogId) {
        BlogExample blogExample = new BlogExample();
        BlogExample.Criteria criteria = blogExample.createCriteria();
        criteria.andBlogIdEqualTo(blogId);
        List<Blog> blogs = blogService.selectByExample(blogExample);
        if(blogs!=null && blogs.size()>0) {
            model.addAttribute("blog", blogs.get(0));
        }
        BlogExample blogExample1 = new BlogExample();
        List<Blog> blogs1 = blogService.selectByExample(blogExample1);
        model.addAttribute("blogs", blogs1);
        return "student/blog-single";
    }

    @RequestMapping("/teacher-blog-single")
    public String teacherBlog(Model model, Integer blogId) {
        BlogExample blogExample = new BlogExample();
        BlogExample.Criteria criteria = blogExample.createCriteria();
        criteria.andBlogIdEqualTo(blogId);
        List<Blog> blogs = blogService.selectByExample(blogExample);
        if(blogs!=null && blogs.size()>0) {
            model.addAttribute("blog", blogs.get(0));
        }
        BlogExample blogExample1 = new BlogExample();
        List<Blog> blogs1 = blogService.selectByExample(blogExample1);
        model.addAttribute("blogs", blogs1);
        return "teacher/blog-single";
    }

    @RequestMapping("/bloglist")
    public String BlogList(Model model) {
        BlogExample blogExample = new BlogExample();
        List<Blog> blogs = blogService.selectByExample(blogExample);
        if(blogs!=null && blogs.size()>0) {
            model.addAttribute("blogs", blogs);
        }
        return "bloglist";
    }

    @RequestMapping("/blogtable")
    public String getBlogTable(Model model) {
        BlogExample blogExample = new BlogExample();
        List<Blog> blogs = blogService.selectByExample(blogExample);
        model.addAttribute("blogs", blogs);
        return "superuser/blogtable";
    }

    @RequestMapping("/organization-blogtable")
    public String getOrganizationBlogTable(Model model) {
        BlogExample blogExample = new BlogExample();
        List<Blog> blogs = blogService.selectByExample(blogExample);
        model.addAttribute("blogs", blogs);
        return "organization/blogtable";
    }
}