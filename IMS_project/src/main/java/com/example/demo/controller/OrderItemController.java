package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OrderItem;

import com.example.demo.service.OrderItemService;


@RestController
public class OrderItemController {

	@Autowired// 
	OrderItemService o;
	
	@PostMapping("addorderitem")
	public OrderItem add(@RequestBody OrderItem oi)
	{
		return o.saveinfo(oi);
	}

	@PostMapping("addnorderitems")
	public List<OrderItem> addndetails(@RequestBody List<OrderItem> oi)
	{
		return o.savedetails(oi);
	}
	
    
	@GetMapping("showorderitem")
   public List<OrderItem> show()
   {
	   return o.showinfo();
   }
	@GetMapping("showorderbyid/{id}")
	 public Optional<OrderItem> showid(@PathVariable int id)
	 {
		   return o.showbyid(id);
	 }
	
	@PutMapping("updateoi")
	public OrderItem modify(@RequestBody OrderItem oi)
	{
		return o.changeinfo(oi);
	}

	@PutMapping("oiupdatebyid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody OrderItem oi)
	{
		return o.updateinfobyid(id, oi);
	}
	
	@DeleteMapping("deleteorders")
	public String del(@RequestBody OrderItem oi )
	{
		o.deleteinfo(oi);
		return "Deleted succesfully";
	}
	@DeleteMapping("oidelid/{id}")
	public void deletemyid(@PathVariable int id)
	{
		o.deleteid(id);
		
	}
	@DeleteMapping("oidelparamid")
	public void deletemyparamid(@RequestParam int id)
	{
		o.deletepid(id);
		
	}

	@PostMapping("addorder")
	public OrderItem addorder(@RequestBody OrderItem oi)
	{
		return o.saveorderinfo(oi);
	}

	@PostMapping("addnorders")
	public List<OrderItem> addnorderdetails(@RequestBody List<OrderItem> oi)
	{
		return o.saveorderdetails(oi);
	}
	
    
	@GetMapping("showorders")
   public List<OrderItem> showorders()
   {
	   return o.showorderinfo();
   }
}
