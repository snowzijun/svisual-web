package com.meritit.svisual.dao;

import com.meritit.svisual.entity.User;

public interface UserDao {
	  public User findByName(String name);
	  public void save(User user);
	  public void updatePassword(User user);
	  public String findPwdById(String User);
}
