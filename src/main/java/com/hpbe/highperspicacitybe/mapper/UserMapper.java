package com.hpbe.highperspicacitybe.mapper;

import com.hpbe.highperspicacitybe.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectUserById(Integer id);
}
