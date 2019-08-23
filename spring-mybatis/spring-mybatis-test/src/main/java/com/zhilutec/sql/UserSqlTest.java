package com.zhilutec.sql;

import org.apache.ibatis.jdbc.SQL;

//SQL语句构建器类
public class UserSqlTest {
    static class UserSql {
        public static String selectByUserName(final String userName) {
            return new SQL() {{
                SELECT("id,user_name,age");
                FROM("users");
                WHERE("user_name like concat('%',#{userName},'%')");
            }}.toString();
        }

        public static String delById(final Long id) {
            return new SQL() {{
                DELETE_FROM("users");
                WHERE("id = #{id}");
            }}.toString();
        }
    }

    // @SelectProvider(type = UserSql.class, method = "buildGetUsersByName")
    // User selectByUserName (String userName);


    public static void main(String[] args) {
        UserSql userSql = new UserSql();
        String sql = userSql.selectByUserName("abc");
        System.out.println(sql);
    }
}
