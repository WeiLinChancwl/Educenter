package net.william.educenter.controller;
import net.william.educenter.entity.Organization;
import net.william.educenter.entity.OrganizationExample;
import net.william.educenter.service.OrganizationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrganizationController {
    @Resource
    private net.william.educenter.service.OrganizationService OrganizationService;

    @RequestMapping("/organizationlogin.do")
    public String login(HttpSession session) {
        String useraccount = (String) session.getAttribute("useraccount");
        String password = (String) session.getAttribute("password");
        OrganizationExample organizationExample = new OrganizationExample();
        OrganizationExample.Criteria criteria = organizationExample.createCriteria();
        if (useraccount != null && useraccount.trim() != "" && password != null && password.trim() != "") {
            criteria.andOAccountEqualTo(useraccount);
            criteria.andOPswEqualTo(password);
            List<Organization> Organizations = OrganizationService.selectByExample(organizationExample);
            if (Organizations!=null && Organizations.size()>0) {
                Organization Organization = Organizations.get(0);
                session.setAttribute("userAccount", useraccount);
                System.out.println("登录成功");
                return "organization/organizationindex";
            } else {
                System.out.println("账号或密码有误");
            }
        }
        return "signin";
    }

    @RequestMapping("/organizationregister.do")
    public String register(Model model, HttpSession session) {
        String newaccount = (String) session.getAttribute("newaccount");
        String newpassword = (String) session.getAttribute("newpassword");
        String newemail = (String) session.getAttribute("newemail");
        String newusername = (String) session.getAttribute("newusername");
        String newtel = (String) session.getAttribute("newtel");
        OrganizationExample OrganizationExample = new OrganizationExample();
        OrganizationExample.Criteria criteria = OrganizationExample.createCriteria();
        if (newaccount != null && newaccount.trim() != "" && newpassword != null && newpassword.trim() != "") {
            criteria.andOAccountEqualTo(newaccount);
            criteria.andOPswEqualTo(newpassword);
            List<Organization> Organizations = OrganizationService.selectByExample(OrganizationExample);
            if (Organizations!=null && Organizations.size()>0) {
                System.out.println("已存在该账户");
            } else {
                Organization organization = new Organization();
                organization.setoAccount(newaccount);
                organization.setoPsw(newpassword);
                organization.setoEmail(newemail);
                organization.setoName(newusername);
                organization.setoTel(newtel);
                OrganizationService.insertOrganization(organization);
                System.out.println("注册成功");
                return "/signin";
            }
        }
        return "/signup";
    }

    @RequestMapping("/organizationtable")
    public String getOrganizationTable(Model model) {
        OrganizationExample OrganizationExample = new OrganizationExample();
        List<Organization> organizations = OrganizationService.selectByExample(OrganizationExample);
        model.addAttribute("organizations", organizations);
        return "superuser/organizationtable";
    }

    @RequestMapping("organization-index")
    public String getOrganizationIndex() {
        return "organization/organizationindex";
    }

    @RequestMapping("organization-charts")
    public String getOrganizationCharts() {
        return "organization/charts";
    }



}