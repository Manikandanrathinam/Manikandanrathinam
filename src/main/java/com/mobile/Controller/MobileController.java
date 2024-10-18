package com.mobile.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.Exception.BrandException;
import com.mobile.Exception.PriceException;
import com.mobile.Service.MobileService;
import com.mobile.entity.Mobile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value ="/mobile")
public class MobileController {
	@Autowired
	MobileService ms;
	
	@PostMapping("/PostAll")
	public String postAllObj(@RequestBody List<Mobile> m) {
		return ms.postAllObj(m);
	}
	@GetMapping(value="/getbrand/{a}")
	public String gbrand(@PathVariable int a) throws BrandException {
		return ms.gbrand(a);
	}
	@PostMapping("/postbrand/{m}")
	public String pbrand(@PathVariable Mobile m)throws BrandException {
		return ms.pbrand(m);
	}
	@GetMapping("/postList/{m}")
	public List<Mobile> getdetail(@PathVariable String m)throws BrandException {
		return ms.getdetail(m);
	}
	@PostMapping("/postprice")
	public String postAbove(@RequestBody Mobile m)throws PriceException {
		return ms.postAbove(m);
	}
	@GetMapping("/GetBrand/{a}")
	public String findBybr(@PathVariable int a) {
		return ms.findBybr(a);
	}
}
