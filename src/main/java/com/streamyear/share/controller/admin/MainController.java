package com.streamyear.share.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 后台主页的Controller
 */
@Controller
public class MainController {

    @RequestMapping("admin")
    public ModelAndView main() {
        ModelAndView mv = new ModelAndView("admin/main");
        return mv;
    }
}
