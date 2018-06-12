package com.streamyear.share.service.impl;

import com.streamyear.share.entity.User;
import com.streamyear.share.mapper.UserMapper;
import com.streamyear.share.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}
}
