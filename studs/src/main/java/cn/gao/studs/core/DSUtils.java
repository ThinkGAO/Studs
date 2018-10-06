package cn.gao.studs.core;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

//单例模式
public class DSUtils {
	private static DataSource dataSource;
	static {
		dataSource = new ComboPooledDataSource();
	}

	public static DataSource getDataSource() {
		return dataSource;
	}
}
