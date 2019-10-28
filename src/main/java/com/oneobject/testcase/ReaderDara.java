package com.oneobject.testcase;

import com.oneobject.modle.Whx;
import com.oneobject.utile.DataUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class ReaderDara {
    public static void main(String[]args){
        try {
            SqlSession sqlSession = DataUtil.getSqlSession();

           System.out.println(sqlSession.selectOne("selectAll",1001));

        } catch (IOException e) {
            System.out.println("语句执行错误");
            e.printStackTrace();
        }
    }
}
