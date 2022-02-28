package org.comstusdy21.saram.test;

import java.io.IOException;
import java.util.List;

import org.comstusdy21.saram.model.SaramDao;
import org.comstusdy21.saram.model.SaramDto;

public class SaramDaoTest {
	private static SaramDao saramDao = new SaramDao();
	
	public static void main(String[] args) {
		SaramDto dto = new SaramDto(6,"","",0);
		saramDao.delete(dto);
	}
	
	public static void updateTest(String[] args) throws IOException {
		SaramDto dto = new SaramDto(6,"GANG","gildong",34);
		saramDao.update(dto);
	
	}
	
	
	public static void insertTest(String[] args) throws IOException {
		SaramDto dto = new SaramDto(0,"PARK","gildong",34);
		saramDao.insert(dto);
		
		selectAllTest(null);
				
	}
	
	
	public static void selectOneTest(String[] args) throws IOException {
		
		SaramDto dto = saramDao.selectOne(2);
		System.out.println(dto);
	}
	
	public static void selectAllTest(String[] args) throws IOException {
		List<SaramDto> list = saramDao.selectAll();
		System.out.println(list);
		
	}
}
