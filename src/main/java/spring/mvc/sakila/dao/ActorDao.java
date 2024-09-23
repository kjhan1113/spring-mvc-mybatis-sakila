package spring.mvc.sakila.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.sakila.model.Actor;

@Repository
public class ActorDao {
    private final SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public ActorDao(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<Actor> findAll() {
        return sqlSessionTemplate.selectList("spring.mvc.sakila.mapper.ActorMapper.findAll");
    }
}
