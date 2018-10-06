package cn.gao.studs.stud;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import cn.gao.studs.domain.Stud;

public class StudServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private StudService service = new StudService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Stud> list = service.query();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<div><a href='" + request.getContextPath() + "/add.html'>增加</a></div>");
		out.print("<table border='1'> <tr><td>ID</td><td>姓名</td><td>年龄</td><td>性别</td><td>地址</td></tr>");
		for (Stud stud : list) {
			String html = "<tr><td>" + stud.getId() + "</td><td>" + stud.getName() + "</td><td>" + stud.getAge()
					+ "</td><td>" + (stud.getSex().equals("1") ? "男" : "女") + "</td><td>" + stud.getAddr()
					+ "</td></tr>";
			out.print(html);
		}
		out.print("</table>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		Stud stud = new Stud();
		try {
			BeanUtils.populate(stud, req.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		service.save(stud);
		resp.sendRedirect(req.getContextPath()+"/stud");
	}
}
