package cn.gao.studs.login;

import org.apache.commons.dbutils.handlers.BeanHandler;

import cn.gao.studs.core.BaseDao;
import cn.gao.studs.domain.User;

public class LoginDao extends BaseDao {
	public User login(User user) {
		String sql = "select * from users where name=? and pwd=?";
		user = run.query(sql, new BeanHandler<>(User.class), user.getName(), user.getPwd());
		return user;
	}
}
