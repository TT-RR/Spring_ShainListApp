package searchman.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
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
		//SQL文の作成
		final String sql = "insert into shain(id, name, sei, nen, address)"
				+ "values(:id, :name, :sei, :nen, :address)";

		// パラメータの作成
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("id", shain.getId());
		param.addValue("name", shain.getName());
		param.addValue("sei", shain.getSei());
		param.addValue("nen", shain.getNen());
		param.addValue("address", shain.getAddress());

		//SQLの実行
		jdbcTemplate.update(sql, param);

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
