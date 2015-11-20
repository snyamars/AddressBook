package com.cto.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cto.spring.model.Address;
import com.cto.spring.service.AddressService;
import java.util.*;

@Controller
public class AddressController {
	
	private AddressService addressService;
	
	@Autowired(required=true)
	@Qualifier(value="addressService")
	public void setAddressService(AddressService ps){
		this.addressService = ps;
	}
	
	@RequestMapping(value = "/address", method = RequestMethod.GET)
	public String listAddresss(Model model) {
		model.addAttribute("address", new Address());
		model.addAttribute("listAddress", this.addressService.listAddress());
		return "address";
	}
	
	//For add and update address both
	@RequestMapping(value= "/address/add", method = RequestMethod.POST)
	public String addAddress(@ModelAttribute("address") Address p){
		
		if(p.getId() == 0){
			//new address, add it
			this.addressService.addAddress(p);
		}else{
			//existing address, call update
			this.addressService.updateAddress(p);
		}
		
		return "redirect:/address";
		
	}
	
	@RequestMapping("/remove/{id}")
    public String removeAddress(@PathVariable("id") int id){
		
        this.addressService.removeAddress(id);
        return "redirect:/address";
    }
 
    @RequestMapping("/edit/{id}")
    public String editAddress(@PathVariable("id") int id, Model model){
        model.addAttribute("address", this.addressService.getAddressById(id));
        model.addAttribute("listAddress", this.addressService.listAddress());
        return "address";
    }
	
}
