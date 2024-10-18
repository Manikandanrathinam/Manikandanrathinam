package com.mobile.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobile.Repository.MobileRepository;
import com.mobile.entity.Mobile;
@Repository
public class MobileDAO {
	@Autowired
	MobileRepository mr;

	public String PostAllObj(List<Mobile> m) {
		mr.saveAll(m);
		return "Car list has been saved";
	}
	public String gbrand(int i) {
		String c= mr.findById(i).get().getBrand();
		return c;
	}
	public String pbrand(Mobile m) {
		 mr.save(m);
		 return "Posted Successfully";
	}
	public List<Mobile> getdetail(String m) {
		return mr.findAll();
	}
	public String postAbove(Mobile m) {
		mr.save(m);
		return "Price range Success";
	}
	//Using Query
	public String findBybr(int a) {
		return mr.findBybr(a);
	}
}

