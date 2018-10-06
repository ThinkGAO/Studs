package cn.gao.studs.stud;

import java.util.List;

import cn.gao.studs.domain.Stud;

public class StudService {

	private StudDao dao = new StudDao();

	public List<Stud> query() {
		return dao.query();
	}

	public Stud save(Stud stud) {
		return dao.save(stud);
	}
}
