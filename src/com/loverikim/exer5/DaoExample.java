package com.loverikim.exer5;

public class DaoExample {

	public static void main(DataAccessObject dao) {
		// TODO Auto-generated method stub		
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();

	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

	private static void dbWork(OracleDao oracleDao) {
		// TODO Auto-generated method stub	
		
	}

	private static void dbWork(MySqlDao mySqlDao) {
		// TODO Auto-generated method stub	
		
	}

}
