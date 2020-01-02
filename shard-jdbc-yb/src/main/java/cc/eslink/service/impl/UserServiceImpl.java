package cc.eslink.service.impl;

import java.util.Date;

import cc.eslink.bean.User;
import cc.eslink.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.eslink.service.IUserService;


@Service
public class UserServiceImpl implements IUserService{

	
		@Autowired
		private UserMapper userMapper;

		@Override
		public void save(User user) {
			user.setCreateTime(new Date());
			userMapper.save(user);
		}

		@Override
		public User get(Long id) {
			// TODO Auto-generated method stub
			return userMapper.get(id);
		}
		
		
}
