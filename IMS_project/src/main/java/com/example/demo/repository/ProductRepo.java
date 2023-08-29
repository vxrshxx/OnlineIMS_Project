package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Product;

import jakarta.transaction.Transactional;


public interface ProductRepo extends JpaRepository<Product, Integer> {
	@Query(value="select * from Products_Table where product_id=:s or product_name=:sn",nativeQuery=true)
	public List<Product> getproductinfo(@Param("s") int product_id,@Param("sn")String product_name);

	@Modifying
	@Transactional
	@Query(value="delete from Products_Table where product_id=:s",nativeQuery=true)
	public int deleteproductInfo(@Param("s") int product_id);
	
	
	@Modifying
	@Transactional
	@Query(value="update product_table set product_id=?1 where product_id=?2",nativeQuery=true)
	public int updateStudentInfo(int newid,int oldid);
	
	
	
}