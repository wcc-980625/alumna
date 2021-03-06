package com.alumna.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alumna.mapper.SayMapper;
import com.alumna.po.Loves;
import com.alumna.po.Review;
import com.alumna.po.Say;
import com.alumna.service.SayService;

public class SayServiceImpl implements SayService {
	@Autowired
	private SayMapper sayMapper;
	
	@Override
	public List<Say> findsayAll() throws Exception {
		// TODO Auto-generated method stub
		return sayMapper.findsayAll();
	}

	@Override
	public List<Review> findReview(int sayid) throws Exception {
		// TODO Auto-generated method stub
		return sayMapper.findReview(sayid);
	}

	@Override
	public int findCountLoves(int sayid) throws Exception {
		// TODO Auto-generated method stub
		return sayMapper.findCountLoves(sayid);
	}

	@Override
	public void insertLoves(Loves loves) throws Exception {
		// TODO Auto-generated method stub
		sayMapper.insertLoves(loves);
	}

	@Override
	public int findLoves(Loves loves) throws Exception {
		// TODO Auto-generated method stub
		return sayMapper.findLoves(loves);
	}

	@Override
	public void deleteLoves(Loves loves) throws Exception {
		// TODO Auto-generated method stub
		sayMapper.deleteLoves(loves);
	}

	@Override
	public void insertReview(Review review) throws Exception {
		// TODO Auto-generated method stub
		sayMapper.insertReview(review);
	}

	@Override
	public List<Say> findSayUser(String uid) throws Exception {
		// TODO Auto-generated method stub
		return sayMapper.findSayUser(uid);
	}

	@Override
	public void insertSay(Say say) throws Exception {
		// TODO Auto-generated method stub
		sayMapper.insertSay(say);
	}

	@Override
	public void deleteSay(String id) throws Exception {
		// TODO Auto-generated method stub
		sayMapper.deleteSay(id);
	}

	@Override
	public List<Loves> findCountloves() throws Exception {
		// TODO Auto-generated method stub
		return sayMapper.findCountloves();
	}

	@Override
	public List<Review> findCountreview() throws Exception {
		// TODO Auto-generated method stub
		return sayMapper.findCountreview();
	}

	@Override
	public Say findsayIDAll(int id) throws Exception {
		// TODO Auto-generated method stub
		return sayMapper.findsayIDAll(id);
	}

}
