package com.streamyear.share.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.streamyear.share.entity.User;
import com.streamyear.share.mapper.UserMapper;
import com.streamyear.share.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public void save(User user) {
		userMapper.insert(user);
	}

	@Override
	public PageInfo<User> listByPage(int page, int pageSize) {
		PageHelper.startPage(page, pageSize);
		List<User> users = userMapper.selectAll();
		return new PageInfo<>(users);
	}
}
