package com.mobile.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mobile.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	@Query(value ="select brand from mobile_details where id=?",nativeQuery = true)
	public String findBybr(int a); 
    @Query(value ="select * from mobile_details where mobNo<?",nativeQuery = true)
    public List<Mobile> findObj(long mobNo);
}
