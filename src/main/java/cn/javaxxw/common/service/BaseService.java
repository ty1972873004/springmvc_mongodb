package cn.javaxxw.common.service;

import java.util.List;

import cn.javaxxw.common.model.BaseModel;
import cn.javaxxw.common.page.PageEntity;
import cn.javaxxw.common.page.PagingResult;

public interface BaseService<T extends BaseModel> {
	
	int insertOrUpdate(T t);
	
	T findByPk(int id);
	
    List<T> getAll();
    
    PagingResult<T> selectPagination(PageEntity pageEntity);
	
	
	

}
