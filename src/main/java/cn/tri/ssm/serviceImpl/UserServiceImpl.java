package cn.tri.ssm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tri.ssm.mapper.UserMapper;
import cn.tri.ssm.pojo.User;
import cn.tri.ssm.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}

}
