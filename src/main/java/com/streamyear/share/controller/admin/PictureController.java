package com.streamyear.share.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 图片管理的Controller
 */
@Controller
@RequestMapping("admin/picture")
public class PictureController {

    @RequestMapping("list")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView("admin/picture/list");
        return mv;
    }
}
