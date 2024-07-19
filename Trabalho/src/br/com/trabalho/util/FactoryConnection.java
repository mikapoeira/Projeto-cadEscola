package br.com.trabalho.util;

import java.sql.Connection;
import java.sql.DriverManager;
//conexão com o servidor
public class FactoryConnection {
	public static Connection getConnection() throws Exception{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String login = "root";
			String senha = "";
			String url = "jdbc:mysql://localhost:3306/trabalho1";
			return DriverManager.getConnection(url,login,senha);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}