package com.early.autumn.user.dao.earlyautumn;

import com.early.autumn.common.domain.user.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findUserById(long id);

}
