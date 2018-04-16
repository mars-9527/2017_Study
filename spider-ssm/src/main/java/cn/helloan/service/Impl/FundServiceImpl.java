package cn.helloan.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.helloan.entity.Fund;
import cn.helloan.mapper.FundMapper;
import cn.helloan.service.FundService;
@Service
public class FundServiceImpl implements FundService {
	
	@Autowired
	private FundMapper fundMapper;

	@Override
	public void insert(Fund fund) {
		fundMapper.insert(fund);
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		fundMapper.delete(id);
	}

	@Override
	public void update(Fund fund) {
		// TODO Auto-generated method stub
		fundMapper.update(fund);
	}

	@Override
	public Fund get(Integer id) {
		// TODO Auto-generated method stub
		return fundMapper.get(id);
	}

	@Override
	public List<Fund> findList(Fund fund) {
		// TODO Auto-generated method stub
		return fundMapper.findList(fund);
	}

	@Override
	public List<Fund> findAllList() {
		// TODO Auto-generated method stub
		return fundMapper.findAllList();
	}
	
	

}
