package com.mmall.dao;

import java.util.List;

import com.mmall.entity.Listeners;

public interface ListenersMapper {
    int deleteByPrimaryKey(String id);

    int insert(Listeners record);

    int insertSelective(Listeners record);

    Listeners selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Listeners record);

    int updateByPrimaryKeyWithBLOBs(Listeners record);

    int updateByPrimaryKey(Listeners record);
    
    List<Listeners> selectByName(String name);
}