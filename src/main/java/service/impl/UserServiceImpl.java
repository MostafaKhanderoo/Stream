package service.impl;

import base.repository.impl.BaseRepositoryImpl;
import base.service.impl.BaseServiceImpl;
import entity.User;
import repository.UserRepository;
import service.UserService;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserServiceImpl extends BaseServiceImpl<Integer, User, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository userrepository) {
        super(userrepository);
    }

    @Override
    public void save(User user) {
        super.save(user);
    }

    @Override
    public void selectAllName() {
        super.selectAllName();
    }

    @Override
    public void delete(int id) {

    }
}
