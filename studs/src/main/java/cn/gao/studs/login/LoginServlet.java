package cn.gao.studs.login;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import cn.gao.studs.domain.User;
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		//
		User user = new User();
		try {
			BeanUtils.populate(user, req.getParameterMap());
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
		user = new LoginService().login(user);
		if(user==null) {//登录没有成功
			//重定向到index.html
			resp.sendRedirect(req.getContextPath()+"/index.html?error");
		}else {
			//去显示所有学生
			resp.sendRedirect(req.getContextPath()+"/stud");
		}
	}

}
