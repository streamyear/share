package com.streamyear.share.controller.admin;

import com.github.pagehelper.PageInfo;
import com.streamyear.share.entity.User;
import com.streamyear.share.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户的Controller
 */
@Controller
@RequestMapping("/admin/user")
public class UserController {
	/**
	 * 用户的service
	 */
	@Autowired
	private UserService userService;


	/**
	 * 新增
	 */
	@RequestMapping("save")
	@ResponseBody
	public void save(){
		User user = new User();
		user.setUserName("streamyear");
		user.setPassword("56789");
		user.setPhone("13588888888");
		userService.save(user);
	}

	/**
	 * 分页查询
	 */
	@RequestMapping("list")
	@ResponseBody
	public PageInfo<User> list(){
		int page = 1;
		int pageSize = 3;
		PageInfo<User> list = userService.listByPage(page, pageSize);
		return list;
	}
}
