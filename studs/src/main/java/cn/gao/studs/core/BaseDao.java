package cn.gao.studs.core;

public class BaseDao {
	protected QueryRunner run;

	public BaseDao() {
		run = new QueryRunner(DSUtils.getDataSource());
	}
}
