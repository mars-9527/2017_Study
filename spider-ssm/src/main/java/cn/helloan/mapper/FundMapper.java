package cn.helloan.mapper;

import java.util.List;

import cn.helloan.entity.Fund;

public interface FundMapper {
	
	public void insert(Fund fund);
	public void delete(Integer id);
	public void update(Fund fund);
	public Fund get(Integer id);
	public List<Fund> findList(Fund fund);
	public List<Fund> findAllList();

}
