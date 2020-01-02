package cc.eslink.service.impl;

import cc.eslink.bean.User;
import cc.eslink.mapper.UserMapper;
import cc.eslink.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


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
