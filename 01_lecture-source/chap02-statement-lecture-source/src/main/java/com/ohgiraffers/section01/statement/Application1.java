package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {

    public static void main(String[] args) {
        // 24.09.30 12:15

        Connection con = getConnection();

        /* 필기.
        *   쿼리문을 저장하고 실행할 수 있는 기능을 하는 인터페이스
        *   Statement
        * */

        Statement stmt = null;

        /* 필기.
        *   select 결과 집합을 받아올 수 있는 인터페이스
        *   ResultSet
        * */

        ResultSet rset = null;

        try {
            stmt = con.createStatement();   // connection 이용해서 인스턴스 생성

            

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

    }

}
