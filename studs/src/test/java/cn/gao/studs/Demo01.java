package cn.gao.studs;

import java.sql.Connection;

import org.junit.Test;

import cn.gao.studs.core.DSUtils;

public class Demo01 {
	@Test
	public void test1() throws Exception {
		Connection con = DSUtils.getDataSource().getConnection();
		System.err.println(con);
		con.close();
	}
}
