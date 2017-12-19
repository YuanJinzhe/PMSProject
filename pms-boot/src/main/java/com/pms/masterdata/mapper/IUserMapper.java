package com.pms.masterdata.mapper;

import java.util.List;

import com.pms.masterdata.entity.User;

public interface IUserMapper {
    public List<User> queryUserList();
}
