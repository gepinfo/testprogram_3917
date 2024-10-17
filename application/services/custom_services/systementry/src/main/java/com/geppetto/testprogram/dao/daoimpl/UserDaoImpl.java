package com.geppetto.testprogram.dao.daoimpl;

import com.geppetto.testprogram.model.User;
import com.geppetto.testprogram.repository.UserRepository;
import com.geppetto.testprogram.dao.UserDao;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao{

    private final UserRepository userRepository;

     public UserDaoImpl(UserRepository userRepository) {
       this.userRepository = userRepository;
}





}
