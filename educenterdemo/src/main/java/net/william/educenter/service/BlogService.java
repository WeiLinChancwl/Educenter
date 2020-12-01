package net.william.educenter.service;
import net.william.educenter.entity.Blog;
import net.william.educenter.entity.BlogExample;
import net.william.educenter.mapper.BlogMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BlogService {
    @Resource
    private BlogMapper blogMapper;
    public List<Blog> selectByExample(BlogExample example) {
        return blogMapper.selectByExample(example);
    }
}