package org.apache.study.jdbc;



import java.sql.*;
import java.util.*;

public class MysqlConnect {
    public static Connection getConnection() {
        final String url = "jdbc:mysql://localhost:3306/school";
        final String user = "root";
        final String password = "118080132020";
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


    public static int update(String sql) {
        Connection conn = MysqlConnect.getConnection();
        Statement st =null;

        try {
            st = conn.createStatement();
            return st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null && !st.isClosed()) {
                    st.close();
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }
    public static List<Map<String, Object>> selectRow(String sql, int pageno, int pagesize) {
        Connection conn = MysqlConnect.getConnection();
        List<Map<String, Object>> datas = new ArrayList<>();
        Statement st = null;
        ResultSet rs = null;
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql + " limit " + pagesize * (pageno - 1) + "," + pagesize);
            Map<String, Object> data;
            while (rs.next()) {
                data = new HashMap<>();
                data.put("id", rs.getInt("id"));
                data.put("name", rs.getString("name"));
                data.put("age", rs.getInt("age"));
                data.put("date", rs.getTimestamp("date"));
                datas.add(data);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (st != null && !st.isClosed()) {
                    rs.close();
                }
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return datas;
    }

    public static void main(String[] args) {
        // "select name,id from table_1 limit"
        Connection conn = MysqlConnect.getConnection();
        /*
        int ret = MysqlConnect.update("insert into table_student(id,name,age) values('8','李四三','11'), ('9','王五三','10')");
        System.out.println("添加了" + ret + "条数据");
        */
        /*
        int ret = MysqlConnect.update("delete from table_student where id = 1");
        System.out.println("删除了" + ret + "条数据");
         */
        /*
        int ret = MysqlConnect.update("update table_student set name = '张三' where id = 1");
        System.out.println("修改了" + ret + "条数据");
         */
        List<Map<String, Object>> dates = MysqlConnect.selectRow("select * from table_student ",2, 4);
        Iterator<String> it;
        String key;
        Object val;
        for (Map<String, Object> data : dates) {
            it = data.keySet().iterator();
            while (it.hasNext()) {
                key = it.next();
                val = data.get(key);
                System.out.println(key + "=" + val + "\t");
            }
            System.out.println();
        }
    }
}
