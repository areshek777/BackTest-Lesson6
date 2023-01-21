package utils;

import lombok.SneakyThrows;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class DBUtils {
    static String resource = "mybatis-config.xml";
    @SneakyThrows
    public static db.dao.CategoriesMapper getCategoriesMapper(){
        return getSqlSession().getMapper(db.dao.CategoriesMapper.class);
    }
    @SneakyThrows
    public static db.dao.ProductsMapper getProductsMapper() {
        return getSqlSession().getMapper(db.dao.ProductsMapper.class);
    }

    private static SqlSession getSqlSession() throws IOException {
        SqlSessionFactory sqlSessionFactory;
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession(true);
        return session;
    }
}