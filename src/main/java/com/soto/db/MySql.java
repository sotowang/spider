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
        Object[][] params = new Object[modelList.size()][9];
        for (int i = 0; i < params.length; i++) {
            params[i][0] = modelList.get(i).getmodelId();
            params[i][1] = modelList.get(i).getmodelName();
            params[i][2] = modelList.get(i).getmodelPrice();
            params[i][3] = modelList.get(i).getModelDesc();
            params[i][4] = modelList.get(i).getModelImg();
            params[i][5] = modelList.get(i).getModelShop();
            params[i][6] = modelList.get(i).getModelCount();
            params[i][7] = modelList.get(i).getModelComment();
            params[i][8] = modelList.get(i).getModelAddr();
        }
        queryRunner.batch("insert ignore into jd_book (book_id, book_name, book_price, book_desc,book_img, book_shop, book_count, book_comment, book_addr)"
                + "values (?,?,?,?,?,?,?,?,?)", params);
        System.out.println("执行数据库完毕！"+"成功插入数据："+modelList.size()+"条");
    }

}
