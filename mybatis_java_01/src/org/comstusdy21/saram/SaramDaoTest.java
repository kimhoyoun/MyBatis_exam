package org.comstusdy21.saram;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.comstusdy21.saram.model.SaramDto;

public class SaramDaoTest {

	public static void main(String[] args) throws IOException {
//		String resource = "org/mybatis/example/mybatis-config.xml";
		// src 바로 아래있기때문에 앞경로를 삭제해도 됨.
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		try (SqlSession session = sqlSessionFactory.openSession()) {
			// 패키지 앞에 붙어있는건 SaramMapper.xml의 namespace와 동일
//			  SaramDto saram = session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
			// SaramMapper.xml의 namespace(org.comstusdy21.saram.SaramMapper) +
			// id(selectSaram)
			SaramDto saram = session.selectOne("org.comstusdy21.saram.SaramMapper.selectSaram", 1);
			// 1번이라는 인자값이 SaramMapper.xml의 select * from saram where no = #{no}의 #{no}로 들어감.
			System.out.println(saram);
		}

		try (SqlSession mybatis = sqlSessionFactory.openSession()) {
			List<SaramDto> saramList = mybatis.selectList("org.comstusdy21.saram.SaramMapper.selectAll");
			System.out.println(saramList);
		}

	}
}
