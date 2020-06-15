package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
//声明控制器
@Controller
public class HelloController  {
//    声明映射的路径
    @RequestMapping("/hello")
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message","Hello SpringMVC");
        modelAndView.addObject("title","Hello");
        // 将 模型（Model）返回给 DispatcherServlet ，生成 视图（view） 再返回给前台
        return modelAndView;
    }
}
