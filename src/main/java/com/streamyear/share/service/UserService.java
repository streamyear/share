package com.streamyear.share.service;

import com.streamyear.share.entity.User;

public interface UserService {
	/**
	 * 根据id获取记录
	 * @param id
	 * @return
	 */
	User getById(Integer id);
}
