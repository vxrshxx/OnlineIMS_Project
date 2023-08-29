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

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired// 
	ProductService pser;
	
	@PostMapping("addproduct")
	public Product add(@RequestBody Product pp)
	{
		return pser.saveinfo(pp);
	}

	@PostMapping("addnproduct")
	public List<Product> addndetails(@RequestBody List<Product> pp)
	{
		return pser.savedetails(pp);
	}
	
    
	@GetMapping("showproducts")
   public List<Product> show()
   {
	   return pser.showinfo();
   }
	@GetMapping("showprodbyid/{id}")
	 public Optional<Product> showid(@PathVariable int id)
	 {
		   return pser.showbyid(id);
	 }
	
	@PutMapping("update")
	public Product modify(@RequestBody Product pp)
	{
		return pser.changeinfo(pp);
	}

	@PutMapping("updatebyid/{id}")
	public String modifybyid(@PathVariable int id,@RequestBody Product pp)
	{
		return pser.updateinfobyid(id, pp);
	}
	
	@DeleteMapping("deleteproduct")
	public String del(@RequestBody Product pp )
	{
		pser.deleteinfo(pp);
		return "Deleted succesfully";
	}
	@DeleteMapping("delid/{id}")
	public void deletemyid(@PathVariable int id)
	{
		pser.deleteid(id);
		
	}
	@DeleteMapping("delparamid")
	public void deletemyparamid(@RequestParam int id)
	{
		pser.deletepid(id);
		
	}
	@PostMapping("addcategory")
	public Product addcat(@RequestBody Product pp)
	{
		return pser.savecatinfo(pp);
	}

	@PostMapping("addncategory")
	public List<Product> addncat(@RequestBody List<Product> pp)
	{
		return pser.savecatdetails(pp);
	}
	
    
	@GetMapping("showcategory")
   public List<Product> showcat()
   {
	   return pser.showcatinfo();
   }
	
	//Query
	@GetMapping("/getnew/{product_id}/{product_name}")
	public List<Product> displayalldet(@PathVariable int product_id,@PathVariable String product_name)
	{
		return pser.getdetails(product_id,product_name);
	}
	
	//paging 
	@GetMapping("paging/{pageno}/{pagesize}")
	public List<Product> showpageinfo(@PathVariable int pageno,@PathVariable int pagesize)
	{
		return pser.getbypage(pageno,pagesize);
	}
	//sorting 
	@GetMapping("/sort/{size}")
	public List<Product> getsortinformation(@PathVariable String size)
	{
		return pser.sortinformation(size);
	}
	
	
	//query:deleting 
	
	@DeleteMapping("deletequery/{product_id}")
	public String delproddet(@PathVariable int product_id)
	{
		return pser.delprod(product_id)+"deleted";
	}
	
	//query:updating 
	@PutMapping("updatequery/{newid}/{oldid}")
	public String updatestudetails(@PathVariable int newid,@PathVariable int oldid)
	{
		return pser.updatestu(newid, oldid)+"Updated";
	}
	
}