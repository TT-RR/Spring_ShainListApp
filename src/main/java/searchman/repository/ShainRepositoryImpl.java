package searchman.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import searchman.entity.Shain;

@Repository
public class ShainRepositoryImpl implements ShainRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Shain> findAll() {
		//SQL文の作成
		final String sql = "select id, name, sei, nen, address from shain";

		//SQLの実行
		List<Shain> shainList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Shain>(Shain.class));

		return shainList;
	}

	@Override
	public Shain findByShainId(int shainId) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public void insertShain(Shain shain) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void updateShain(Shain shain) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void deleteShain(int shainId) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
