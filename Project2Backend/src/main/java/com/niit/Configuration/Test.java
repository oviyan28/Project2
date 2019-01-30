package com.niit.Configuration;

public class Test {
public static void main(String args[]) {
	DBConfiguration db=new DBConfiguration();
	db.getDataSource();
	db.sessionFactory();
	db.hibTransManagement();

}
}
