package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/Test")
public class Mycontroler {

	public Mycontroler() {
		// TODO Auto-generated constructor stub
	}
   @RequestMapping("/list")
	public String Listvech(Model model) {
		MYVECHICAL1 myvechical1=new MYVECHICAL1(1,"Sandeep","Active");
		MYVECHICAL1 myvechical2=new MYVECHICAL1(2,"Ajinkya","Active");
		MYVECHICAL1 myvechical3=new MYVECHICAL1(3,"Test","Active");
		List<MYVECHICAL1> listVeh=new ArrayList<MYVECHICAL1>();
		listVeh.add(myvechical1);
		listVeh.add(myvechical2);
		listVeh.add(myvechical3);
		model.addAttribute("vechical", listVeh);
		return "Listvich";
	}

	
}
