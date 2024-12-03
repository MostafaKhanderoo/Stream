package repository.impl;

import base.repository.impl.BaseRepositoryImpl;
import entity.User;
import repository.UserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepositoryImpl extends BaseRepositoryImpl<Integer , User> implements UserRepository {
    public UserRepositoryImpl(Connection connection) {
        super();
    }

    @Override
    public String getTableName() {
        return " users ";
    }

    @Override
    public String getColumnName() {
        return " ( firstname, lastname ) ";
    }

    @Override
    public String getCountOfColumn() {
        return " ( ? , ? ) ";
    }

    @Override
    public void fillParamForStatement(PreparedStatement preparedStatement, User type, boolean isCountOnly) throws SQLException {
preparedStatement.setString(1,type.getFirstname());
preparedStatement.setString(2,type.getLastname());
    }
}
