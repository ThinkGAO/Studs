package cn.gao.studs.stud;

import java.util.List;
import java.util.UUID;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.gao.studs.core.BaseDao;
import cn.gao.studs.domain.Stud;

public class StudDao extends BaseDao {
	public List<Stud> query() {
		String sql = "select * from studs";
		List<Stud> list = run.query(sql, new BeanListHandler<>(Stud.class));
		return list;
	}

	public Stud save(Stud stud) {
		stud.setId(UUID.randomUUID().toString().replace("-", ""));
		String sql = "insert into studs(id,name,age,sex,addr) values(?,?,?,?,?)";
		run.update(sql, stud.getId(), stud.getName(), stud.getAge(), stud.getSex(), stud.getAddr());
		return stud;
	}
}
