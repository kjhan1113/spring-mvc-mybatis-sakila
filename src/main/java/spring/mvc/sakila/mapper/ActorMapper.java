package spring.mvc.sakila.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import spring.mvc.sakila.model.Actor;

@Mapper
public interface ActorMapper {
	List<Actor> findAll();
}
