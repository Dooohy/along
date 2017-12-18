package org.ssm.dufy.dao;

import org.springframework.stereotype.Repository;
import org.ssm.dufy.entity.User;

@Repository
public interface IUserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    /**
     *
     */
}