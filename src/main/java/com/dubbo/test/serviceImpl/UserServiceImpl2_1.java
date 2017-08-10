package com.dubbo.test.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dubbo.test.pojo.User;
import com.dubbo.test.service.UserService;


@Service("userService2_1")
public class UserServiceImpl2_1 implements UserService{

	public User getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUserListByAge(Integer age) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUserListByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUserListByGender(Integer gender) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUserListByHobby(String hobby) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getUserListByHobbys(String[] hobby) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getString() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getint() {
		System.out.println("我是dubbo_provider2.xml中的第1个实现类(userService2_1)");
		return 0;
	}

	public Integer getInteger() {
		// TODO Auto-generated method stub
		return null;
	}

	public float getfloat() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Float getFloat() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getboolean() {
		// TODO Auto-generated method stub
		return false;
	}

	public Boolean getBoolean() {
		// TODO Auto-generated method stub
		return null;
	}

}
