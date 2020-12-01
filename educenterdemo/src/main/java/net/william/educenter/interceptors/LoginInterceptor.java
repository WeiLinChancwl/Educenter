package net.william.educenter.interceptors;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class LoginInterceptor implements HandlerInterceptor {
    /*
    目标路径调用之前执行,如果该方法返回true，则表示让用户执行目标路径，否则，不让用户执行目标路径
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String userAccount = (String) session.getAttribute("userAccount");
        //获得用户要访问的路径，保存到session，这样，用户登录成功之后，可以从session获得该路径，从而跳转到对应的路径
        if(userAccount == null){
            String uri = request.getRequestURI();
            request.getSession().setAttribute("toPath",uri);
            response.sendRedirect("signin");
            return false;
        }else{
            return true;
        }
    }

    /*
    目标路径调用之后执行
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    /*
   目标页面绘制完之后执行
    */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
