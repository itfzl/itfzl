package com.demo.ioc;

public class UserDaoImpl implements UserDao {

	@Override
	public void say() {
		System.out.println("userDao say hello World!");
	}

}
