package net.william.educenter.controller;
import net.william.educenter.entity.Event;
import net.william.educenter.entity.EventExample;
import net.william.educenter.service.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EventController {
    @Resource
    private EventService eventService;

    @RequestMapping("/event-single")
    public String Event(Model model, Integer eventId) {
        EventExample eventExample = new EventExample();
        EventExample.Criteria criteria = eventExample.createCriteria();
        criteria.andEventIdEqualTo(eventId);
        List<Event> events = eventService.selectByExample(eventExample);
        if(events!=null && events.size()>0) {
            model.addAttribute("event", events.get(0));
        }
        EventExample eventExample1 = new EventExample();
        List<Event> events1 = eventService.selectByExample(eventExample1);
        model.addAttribute("events", events1);
        return "event-single";
    }

    @RequestMapping("/student-event-single")
    public String StudentEventSingle(Model model, Integer eventId) {
        EventExample eventExample = new EventExample();
        EventExample.Criteria criteria = eventExample.createCriteria();
        criteria.andEventIdEqualTo(eventId);
        List<Event> events = eventService.selectByExample(eventExample);
        if(events!=null && events.size()>0) {
            model.addAttribute("event", events.get(0));
        }
        EventExample eventExample1 = new EventExample();
        List<Event> events1 = eventService.selectByExample(eventExample1);
        model.addAttribute("events", events1);
        return "student/event-single";
    }

    @RequestMapping("/teacher-event-single")
    public String TeacherEventSingle(Model model, Integer eventId) {
        EventExample eventExample = new EventExample();
        EventExample.Criteria criteria = eventExample.createCriteria();
        criteria.andEventIdEqualTo(eventId);
        List<Event> events = eventService.selectByExample(eventExample);
        if(events!=null && events.size()>0) {
            model.addAttribute("event", events.get(0));
        }
        EventExample eventExample1 = new EventExample();
        List<Event> events1 = eventService.selectByExample(eventExample1);
        model.addAttribute("events", events1);
        return "teacher/event-single";
    }

    @RequestMapping("/eventlist")
    public String EventList(Model model) {
        EventExample eventExample = new EventExample();
        List<Event> events = eventService.selectByExample(eventExample);
        if(events!=null && events.size()>0) {
            model.addAttribute("events", events);
        }
        return "eventlist";
    }

    @RequestMapping("/eventtable")
    public String getEventTable(Model model) {
        EventExample eventExample = new EventExample();
        List<Event> events = eventService.selectByExample(eventExample);
        model.addAttribute("events", events);
        return "superuser/eventtable";
    }

    @RequestMapping("/organization-eventtable")
    public String getOrganizationEventTable(Model model) {
        EventExample eventExample = new EventExample();
        List<Event> events = eventService.selectByExample(eventExample);
        model.addAttribute("events", events);
        return "organization/eventtable";
    }
}