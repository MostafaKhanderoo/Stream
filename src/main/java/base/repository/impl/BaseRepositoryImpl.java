package base.repository.impl;

import base.entity.BaseEntity;
import base.repository.BaseRepository;
import config.DataSource;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class BaseRepositoryImpl<ID extends Serializable ,T extends BaseEntity<ID>> implements BaseRepository<ID,T> {

    @Override
    public void save(T t) {
String sql1 = "INSERT INTO "+getTableName() +" "+ getColumnName() +" VALUES "+ getCountOfColumn();
try {
   var statement = DataSource.getConnection().prepareStatement(sql1);
   fillParamForStatement(statement , t ,false);
   statement.executeUpdate();
   statement.close();


} catch (SQLException e) {
    e.printStackTrace();
}
    }
    public abstract String getTableName();
    public abstract String getColumnName();
    public abstract String getCountOfColumn();


    public abstract void fillParamForStatement(PreparedStatement preparedStatement,
                                               T type,
                                               boolean isCountOnly) throws SQLException;


}
