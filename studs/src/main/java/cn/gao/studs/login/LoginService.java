package cn.gao.studs.login;

import cn.gao.studs.domain.User;

public class LoginService {
	private LoginDao dao = new LoginDao();

	public User login(User user) {
		return dao.login(user);
	}
}
