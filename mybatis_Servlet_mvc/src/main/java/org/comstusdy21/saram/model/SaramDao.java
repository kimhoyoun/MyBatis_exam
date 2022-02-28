package org.comstusdy21.saram.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SaramDao {
	String resource;
	InputStream inputStream;
	SqlSessionFactory sqlSessionFactory;
	SqlSession mybatis;
	String ns = "org.comstusdy21.saram.SaramMapper";

	public SaramDao() {
		try {
			resource = "mybatis-config.xml";
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			// openSession(true)해줘야 AutoCommit됨.
			mybatis = sqlSessionFactory.openSession(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<SaramDto> selectAll() throws IOException {
		List<SaramDto> saramList = mybatis.selectList(ns + ".selectAll");
		return saramList;

	}

	public SaramDto selectOne(int no) throws IOException {
		SaramDto saram = mybatis.selectOne(ns + ".selectSaram", no);
		return saram;
	}

	public void insert(SaramDto dto) throws IOException {
		mybatis.insert(ns + ".insertSaram", dto);
	}

	public void update(SaramDto dto) {
		mybatis.update(ns + ".updateSaram", dto);
	}

	public void delete(SaramDto dto) {
		mybatis.delete(ns + ".deleteSaram", dto);
	}
}
