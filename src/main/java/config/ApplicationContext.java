package config;

import entity.User;
import repository.UserRepository;
import repository.impl.UserRepositoryImpl;
import service.UserService;
import service.impl.UserServiceImpl;

import java.sql.Connection;

public class ApplicationContext {

    private static final Connection CONNECTION;
    private static final UserRepository USERREPOSITORY;
    private static final UserService USERSERVICE;

    static {
        CONNECTION = DataSource.getConnection();
        USERREPOSITORY =new UserRepositoryImpl(CONNECTION);
        USERSERVICE=new UserServiceImpl(USERREPOSITORY);

    }
    public static UserService getAdminService() {
        return USERSERVICE;
    }

}