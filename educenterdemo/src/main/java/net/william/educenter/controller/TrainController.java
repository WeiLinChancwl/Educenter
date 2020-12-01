package net.william.educenter.controller;

import net.william.educenter.entity.*;
import net.william.educenter.service.AttachmentService;
import net.william.educenter.service.StuTrainService;
import net.william.educenter.service.TrainService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TrainController {
    @Resource
    private TrainService trainService;
    @Resource
    private StuTrainService stuTrainService;
    @Resource
    private AttachmentService attachmentService;

    @RequestMapping("/traintable")
    public String getTrainTable(Model model) {
        TrainExample trainExample = new TrainExample();
        List<Train> trains = trainService.selectByExample(trainExample);
        model.addAttribute("trains", trains);
        return "superuser/traintable";
    }

    @RequestMapping("/stutraintable")
    public String getStuTrainTable(Model model) {
        StuTrainExample stuTrainExample = new StuTrainExample();
        List<StuTrain> stuTrains = stuTrainService.selectByExample(stuTrainExample);
        model.addAttribute("stutrains", stuTrains);
        return "superuser/stutraintable";
    }

    @RequestMapping("/organization-traintable")
    public String getOrganizationTrainTable(Model model) {
        TrainExample trainExample = new TrainExample();
        List<Train> trains = trainService.selectByExample(trainExample);
        model.addAttribute("trains", trains);
        return "organization/traintable";
    }

    @RequestMapping("/organization-stutraintable")
    public String getOrganizationStuTrainTable(Model model) {
        StuTrainExample stuTrainExample = new StuTrainExample();
        List<StuTrain> stuTrains = stuTrainService.selectByExample(stuTrainExample);
        model.addAttribute("stutrains", stuTrains);
        return "organization/stutraintable";
    }

    @RequestMapping("/student-train")
    public String getStudentTrain(Model model, HttpSession session) {
        Integer sId = (Integer) session.getAttribute("sId");
        TrainExample trainExample = new TrainExample();
        TrainExample.Criteria criteria = trainExample.createCriteria();
        criteria.andSIdEqualTo(sId);
        List<Train> trains = trainService.selectByExample(trainExample);
        model.addAttribute("trains", trains);
        return "student/train";
    }

    @RequestMapping("/teacher-train")
    public String getTeacherTrain(Model model, HttpSession session) {
        Integer tId = (Integer) session.getAttribute("tId");
        TrainExample trainExample = new TrainExample();
        TrainExample.Criteria criteria = trainExample.createCriteria();
        criteria.andTIdEqualTo(tId);
        List<Train> trains = trainService.selectByExample(trainExample);
        model.addAttribute("trains", trains);
        return "teacher/train";
    }

    @RequestMapping("/trainlearn")
    public String TrainLearn(Model model, Integer trainId) {
        TrainExample TrainExample = new TrainExample();
        TrainExample.Criteria criteria = TrainExample.createCriteria();
        criteria.andTrainIdEqualTo(trainId);
        List<Train> Trains = trainService.selectByExample(TrainExample);
        if(Trains!=null && Trains.size()>0) {
            model.addAttribute("train", Trains.get(0));
        }
        TrainExample TrainExample1 = new TrainExample();
        TrainExample.Criteria criteria1 = TrainExample1.createCriteria();
        List<Train> Trains1 = trainService.selectByExample(TrainExample1);
        model.addAttribute("trains", Trains1);
        AttachmentExample attachmentExample = new AttachmentExample();
        AttachmentExample.Criteria criteria2 = attachmentExample.createCriteria();
        criteria2.andTrainIdEqualTo(trainId);
        List<Attachment> attachments = attachmentService.selectByExample(attachmentExample);
        model.addAttribute("attachments", attachments);
        return "student/trainlearn";
    }

    @RequestMapping("/train-admin")
    public String TrainAdmin(Model model, Integer trainId) {
        TrainExample TrainExample = new TrainExample();
        TrainExample.Criteria criteria = TrainExample.createCriteria();
        criteria.andTrainIdEqualTo(trainId);
        List<Train> Trains = trainService.selectByExample(TrainExample);
        if(Trains!=null && Trains.size()>0) {
            model.addAttribute("train", Trains.get(0));
        }
        TrainExample TrainExample1 = new TrainExample();
        TrainExample.Criteria criteria1 = TrainExample1.createCriteria();
        List<Train> Trains1 = trainService.selectByExample(TrainExample1);
        model.addAttribute("trains", Trains1);
        AttachmentExample attachmentExample = new AttachmentExample();
        AttachmentExample.Criteria criteria2 = attachmentExample.createCriteria();
        criteria2.andTrainIdEqualTo(trainId);
        List<Attachment> attachments = attachmentService.selectByExample(attachmentExample);
        model.addAttribute("attachments", attachments);
        return "teacher/train-admin";
    }

    @RequestMapping("/train-single")
    public String Train(Model model, Integer trainId) {
        TrainExample trainExample = new TrainExample();
        TrainExample.Criteria criteria = trainExample.createCriteria();
        criteria.andTrainIdEqualTo(trainId);
        List<Train> trains = trainService.selectByExample(trainExample);
        if (trains != null && trains.size() > 0) {
            model.addAttribute("train", trains.get(0));
        }
        TrainExample trainExample1 = new TrainExample();
        TrainExample.Criteria criteria1 = trainExample1.createCriteria();
        List<Train> trains1 = trainService.selectByExample(trainExample1);
        model.addAttribute("trains", trains1);
        return "train-single";
    }

    @RequestMapping("/student-train-single")
    public String StudentTrainSingle(Model model, Integer trainId) {
        TrainExample trainExample = new TrainExample();
        TrainExample.Criteria criteria = trainExample.createCriteria();
        criteria.andTrainIdEqualTo(trainId);
        List<Train> trains = trainService.selectByExample(trainExample);
        if (trains != null && trains.size() > 0) {
            model.addAttribute("train", trains.get(0));
        }
        TrainExample trainExample1 = new TrainExample();
        TrainExample.Criteria criteria1 = trainExample1.createCriteria();
        List<Train> trains1 = trainService.selectByExample(trainExample1);
        model.addAttribute("trains", trains1);
        return "student/train-single";
    }

    @RequestMapping("/teacher-train-single")
    public String StudentTrain(Model model, Integer trainId) {
        TrainExample trainExample = new TrainExample();
        TrainExample.Criteria criteria = trainExample.createCriteria();
        criteria.andTrainIdEqualTo(trainId);
        List<Train> trains = trainService.selectByExample(trainExample);
        if (trains != null && trains.size() > 0) {
            model.addAttribute("train", trains.get(0));
        }
        TrainExample trainExample1 = new TrainExample();
        TrainExample.Criteria criteria1 = trainExample1.createCriteria();
        List<Train> trains1 = trainService.selectByExample(trainExample1);
        model.addAttribute("trains", trains1);
        return "teacher/train-single";
    }
}