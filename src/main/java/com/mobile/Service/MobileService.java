package com.mobile.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.DAO.MobileDAO;
import com.mobile.Exception.BrandException;
import com.mobile.Exception.PriceException;
import com.mobile.entity.Mobile;

@Service
public class MobileService {
		@Autowired
		MobileDAO md;

		public String postAllObj(List<Mobile> m) {
			return md.PostAllObj(m);
		}
		public String gbrand(int a) throws BrandException{
			//try {
				if(md.gbrand(a).equals("Vivo")) {
					return md.gbrand(a);
				}
				else {
					throw new BrandException ("Vivo mobile is not created");
				}
			}
			/*catch(BrandException be){
			return be.getMessage();
		}
		}*/
		public String pbrand(Mobile m)throws BrandException{

				if(m.getBrand().equals("Apple")) {
					return md.pbrand(m);
				}
				else {
					throw new BrandException("Vivo not allowed");
				}
		}
		public List<Mobile> getdetail(String m)throws BrandException{
			List<Mobile> bb=md.getdetail(m);
			List<Mobile> res=bb.stream().filter(x->x.getBrand().equals(m)).collect(Collectors.toList());
			if(res.isEmpty()){
				throw new BrandException("Nothing in the table");
			}
			else {
				return res;
			}
		}
		public String postAbove(Mobile m)throws PriceException{
			if(m.getPrice()>40000) {
				return md.postAbove(m);
			}
			else {
				throw new PriceException("Price is not satisfied");
			}
			
		}
		public String findBybr(int a)throws NullPointerException {
		 String cc=md.findBybr(a);
			if(cc.isEmpty()) {
				throw new NullPointerException("Brand is not presented");
			}
			else {
				return cc;
			}
		}
		
}

