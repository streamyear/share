package com.streamyear.share.service;

import com.github.pagehelper.PageInfo;
import com.streamyear.share.entity.User;

public interface UserService {
	/**
	 * 根据id获取记录
	 * @param id
	 * @return
	 */
	User getById(Integer id);

	/**
	 * 新增用户
	 * @param user
	 */
	void save(User user);

	/**
	 * 分页查询
	 * @param page 当前页
	 * @param pageSize 每页显示的大小
	 * @return
	 */
	PageInfo<User> listByPage(int page, int pageSize);
}
