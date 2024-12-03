package base.repository.impl;

import base.entity.BaseEntity;
import base.repository.BaseRepository;
import config.DataSource;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class BaseRepositoryImpl<ID extends Serializable ,T extends BaseEntity<ID>> implements BaseRepository<ID,T> {
    @Override
    public void delete(int id) {
        String sql = "DELETE FROM " + getTableName() + " WHERE id = "+ getCountOfColumn();
        try (var connection = DataSource.getConnection();
             var statement = connection.prepareStatement(sql)) {


            //   fillParamForStatement(statement, id, true);


            int rowsAffected = statement.executeUpdate();

            System.out.println("Rows deleted: " + rowsAffected);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void selectAllName() {
        String sql = "SELECT firstname FROM " + getTableName();
        try (var connection = DataSource.getConnection();
             var statement = connection.prepareStatement(sql);
             var resultSet = statement.executeQuery()) {


            while (resultSet.next()) {
                String name = resultSet.getString("firstname");
                System.out.println("Name: " + name);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(T t) {
String sql3 = "INSERT INTO "+getTableName() +" "+ getColumnName() +" VALUES "+ getCountOfColumn();
try {
   var statement = DataSource.getConnection().prepareStatement(sql3);
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
