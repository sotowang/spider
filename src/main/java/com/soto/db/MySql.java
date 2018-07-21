package com.soto.db;

import com.soto.pojo.Model;
import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class MySql {
    public static DataSource dataSource = MyDataSource.getDataSource("jdbc:mysql://127.0.0.1:3306/model_data");
    public static QueryRunner queryRunner = new QueryRunner(dataSource);

    public static void update(String sql) {
        try {
            queryRunner.update(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void insert(List<Model> modelList) throws SQLException {
        Object[][] params = new Object[modelList.size()][3];
        for (int i = 0; i < params.length; i++) {
            params[i][0] = modelList.get(i).getmodelId();
            params[i][1] = modelList.get(i).getmodelName();
            params[i][2] = modelList.get(i).getmodelPrice();
        }
        queryRunner.batch("insert into jd_book (book_id, book_name, book_price)"
                + "values (?,?,?)", params);
        System.out.println("执行数据库完毕！"+"成功插入数据："+modelList.size()+"条");
    }

}
