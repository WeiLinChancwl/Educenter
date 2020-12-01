package net.william.educenter.controller;
import net.william.educenter.entity.SuperUser;
import net.william.educenter.entity.SuperUserExample;
import net.william.educenter.service.SuperUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SuperUserController {
    @Resource
    private SuperUserService superUserService;

    @RequestMapping("/superuserlogin.do")
    public String superLogin(HttpSession session, String superUserAccount, String superUserPassword) {
        SuperUserExample superUserExample = new SuperUserExample();
        SuperUserExample.Criteria criteria = superUserExample.createCriteria();
        if (superUserAccount != null && superUserAccount.trim() != "" && superUserPassword != null && superUserPassword.trim() != "") {
            criteria.andSupAccountEqualTo(superUserAccount);
            criteria.andSupPswEqualTo(superUserPassword);
            List<SuperUser> superUsers = superUserService.selectByExample(superUserExample);
            if (superUsers!=null && superUsers.size()>0) {
                SuperUser superUser = superUsers.get(0);
                session.setAttribute("superUser", superUser);
                session.setAttribute("superUserAccount", superUserAccount);
                System.out.println("登录成功");
                return "superuser/superuserindex";
            } else {
                System.out.println("管理员账号或密码有误");
            }
        }
        return "superuser/superuserlogin";
    }

    @RequestMapping("/superuserregister.do")
    public String login(Model model, String newaccount, String newpassword, String newemail, String newtel, String newusername) {
        SuperUserExample superUserExample = new SuperUserExample();
        SuperUserExample.Criteria criteria = superUserExample.createCriteria();
        if (newaccount != null && newaccount.trim() != "" && newpassword != null && newpassword.trim() != "") {
            criteria.andSupAccountEqualTo(newaccount);
            criteria.andSupPswEqualTo(newpassword);
            List<SuperUser> superUsers = superUserService.selectByExample(superUserExample);
            if (superUsers!=null && superUsers.size()>0) {
                System.out.println("已存在该管理员账户");
            } else {
                SuperUser superUser = new SuperUser();
                superUser.setSupAccount(newaccount);
                superUser.setSupPsw(newpassword);
                superUser.setSupEmail(newemail);
                superUser.setSupName(newusername);
                superUser.setSupTel(newtel);
                System.out.println("管理员注册成功");
                return "superuser/superuserlogin";
            }
        }
        return "superuser/superuserregister";
    }

    @RequestMapping("/superusertable")
    public String getSuperuserTable(Model model) {
        SuperUserExample superUserExample = new SuperUserExample();
        List<SuperUser> superUsers = superUserService.selectByExample(superUserExample);
        model.addAttribute("superusers", superUsers);
        return "superuser/superusertable";
    }

    @RequestMapping("/superuserindex")
    public String getSuperuserIndex() {
        return "superuser/superuserindex";
    }

    @RequestMapping("/superuserlogin")
    public String getSuperuserLogin() {
        return "superuser/superuserlogin";
    }

    @RequestMapping("/superuserregister")
    public String getSuperuserRegister() {
        return "superuser/superuserregister";
    }

    @RequestMapping("/errorpage")
    public String getErrorPage() {
        return "superuser/404";
    }

    @RequestMapping("/blank")
    public String getBlankPage() {
        return "superuser/blank";
    }

    @RequestMapping("/forgot_password")
    public String getFogotPasswordPage() {
        return "superuser/forgot_password";
    }

    @RequestMapping("/cards")
    public String getCardsPage() {
        return "superuser/cards";
    }

    @RequestMapping("/buttons")
    public String getButtonsPage() {
        return "superuser/buttons";
    }

    @RequestMapping("/charts")
    public String getChartsPage() {
        return "superuser/charts";
    }

    @RequestMapping("/utilities-animation")
    public String getUtilitiesAnimationPage() {
        return "superuser/utilities-animation";
    }

    @RequestMapping("/utilities-border")
    public String getUtilitiesBorderPage() {
        return "superuser/utilities-border";
    }

    @RequestMapping("/utilities-color")
    public String getUtilitiesColorPage() {
        return "superuser/utilities-color";
    }

    @RequestMapping("/utilities-other")
    public String getUtilitiesOtherPage() {
        return "superuser/utilities-other";
    }
}