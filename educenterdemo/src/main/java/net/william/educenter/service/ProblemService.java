package net.william.educenter.service;
import net.william.educenter.entity.Problem;
import net.william.educenter.entity.ProblemExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProblemService {

    @Resource
    private net.william.educenter.mapper.ProblemMapper ProblemMapper;

    public List<Problem> selectByExample(ProblemExample ProblemExample) {
        return ProblemMapper.selectByExample(ProblemExample);
    }
    public void insertProblem(Problem Problem) {
        ProblemMapper.insert(Problem);
    }
    public void deleteProblem(ProblemExample ProblemExample) {
        ProblemMapper.deleteByExample(ProblemExample);
    }
    public void updateProblem(Problem Problem, ProblemExample ProblemExample) {
        ProblemMapper.updateByExample(Problem, ProblemExample);
    }
}