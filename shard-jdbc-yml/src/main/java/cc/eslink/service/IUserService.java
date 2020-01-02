package cc.eslink.service;


import cc.eslink.bean.User;

public interface IUserService {
	
	void save(User user);

	User get(Long l);
}	
