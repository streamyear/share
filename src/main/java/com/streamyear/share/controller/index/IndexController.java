package com.streamyear.share.controller.index;

import com.streamyear.share.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 首页
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView toIndex(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("siteName", "个人生活分享Site");

        User user = new User();
        user.setUserName("流年");
        mv.addObject("user", user);
        return mv;
    }
}
