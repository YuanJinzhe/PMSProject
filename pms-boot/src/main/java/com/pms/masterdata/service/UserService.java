package com.pms.masterdata.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pms.masterdata.entity.User;
import com.pms.masterdata.mapper.IUserMapper;

@Service
public class UserService {
   
   private Logger logger = Logger.getLogger(UserService.class);
   
   @Autowired
   private IUserMapper userMapper;
   
   @Transactional
   public List<User> queryUserList(){
       
       logger.info("Enter UserService queryUserList ");
       
       List<User> resultList = userMapper.queryUserList();
       
       logger.info("Exit UserService queryUserList resultList = "+resultList.size());
       
       return resultList;
   }
}
