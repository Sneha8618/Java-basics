package com.xworkz.snehaMvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.snehaMvc.dto.BeverageDTO;
import com.xworkz.snehaMvc.dto.ChatDTO;
import com.xworkz.snehaMvc.dto.EducationDTO;
import com.xworkz.snehaMvc.dto.FamilyDTO;
import com.xworkz.snehaMvc.dto.MobileDTO;

@Component
@RequestMapping("/")
public class SnehaController {
	
	public SnehaController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("runnning onEmail..");
		model.addAttribute("mailId", "snehal.xworkz@gmail.com");
		return "index.jsp";
	}
	
	@GetMapping("/number")
	public String onMobile(Model model) {
		System.out.println("running onMobile..");
		model.addAttribute("number", 8618461535L);
		return "index.jsp";
	}
	
	@GetMapping("/adhar")
	public String onAdhar(Model model) {
		System.out.println("running onAdhar..");
		model.addAttribute("adharNo", 499685245556L);
		return "index.jsp";
	}
	
	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("running onAge");
		model.addAttribute("age", 22);
		return "index.jsp";
	}
	
	@GetMapping("/dob")
	public String onDate(Model model) {
		System.out.println("running onDate....");
		model.addAttribute("dateAndTime", LocalDateTime.of(2000, 10, 31, 12, 30));
		return "index.jsp";
	}
	
	@GetMapping("/amount")
	public String onSalary(Model model) {
		System.out.println("running onSalary..");
		model.addAttribute("salary", 30000);
		return "index.jsp";
	}
	
	@GetMapping("/friends")
	public String friendsName(Model model) {
		System.out.println("running friendsName..");
		List<String> list = new ArrayList();
		list.add("Aishwarya");
		list.add("Anu");
		list.add("Mahananda");
		list.add("Vishala");
		model.addAttribute("friend", list);
		return "index.jsp";
	}
	
	@GetMapping("/places")
	public String visitedPlaces(Model model) {
		System.out.println("running visitedPlaces...");
		List<String> list1 = new ArrayList();
		list1.add("Manglore");
		list1.add("Kundapur");
		list1.add("Shrungeri");
		list1.add("Murudeshwar");
		list1.add("Mysore");
		model.addAttribute("place", list1);
		return "index.jsp";
	}
	
	@GetMapping("/skills")
	public String skillSets(Model model) {
		System.out.println("running skillSets..");
		List<String> list = new ArrayList();
		list.add("Java");
		list.add("HTML");
		list.add("CSS");
		list.add("BootStrap");
		list.add("JavaScript");
		list.add("MYSQl");
		model.addAttribute("skill", list);
		return "index.jsp";
	}
	
	@GetMapping("/edu")
	public String education(Model model) {
		EducationDTO dto = new EducationDTO();
		dto.setName("Sneha");
		dto.setLocation("Mudhol");
		dto.setCollageName("BGMIT");
		dto.setQualification("B.E");
		dto.setSemesters(8);
		dto.setPercentage(80.0);
		dto.setTotalMarks(900);
		dto.setType("UG");
		dto.setAddress("Lokhande");
		model.addAttribute("education", dto);
		return "index.jsp";
	}
	
	@GetMapping("/fam")
	public String familyDetails(Model model) {
		FamilyDTO dto = new FamilyDTO() ;
		dto.setFatherName("Dinesh");
		dto.setMotherName("Subhadra");
		dto.setElderSisterName("Swapna");
		dto.setSisterName("Sanjana");
		dto.setSirName("Lokhande");
		dto.setCousinName("Pinki");
		dto.setBrotherName("Bhushan");
		dto.setNoOfMembers(5);
		dto.setFathersWork("Teacher");
		dto.setMyName("Sneha");
		model.addAttribute("family", dto);
		return "index.jsp";
	}
	
	@GetMapping("/mobile")
	public String mobileDetails(Model model) {
		System.out.println("running mobileDetails.");
		MobileDTO dto = new MobileDTO();
		dto.setBrand("MI");
		dto.setColor("Black");
		dto.setPrice(8000.00);
		dto.setVersion(6);
		dto.setStorage("32 GB");
		model.addAttribute("mob", dto);
		return "index.jsp";
	}
	
	@GetMapping("/beverage")
	public String beverageDetails(Model model) {
		System.out.println("running beverageDetails..");
		BeverageDTO dto = new BeverageDTO();
		dto.setName("Cofee");
		dto.setColor("Brown");
		dto.setBrand("Bru");
		dto.setFlavour("milk");
		dto.setPrice(30.00);
		dto.setBuyer("Sneha");
		dto.setQuantity("1 cup");
		dto.setShopName("Namm coffee");
		dto.setTypes(4);
		dto.setSugarContent("Less");
		model.addAttribute("coffee", dto);
		return "index.jsp";
	}
	
	@GetMapping("/chat")
	public String chatDetails(Model model) {
		System.out.println("running chatDetails");
		ChatDTO dto = new ChatDTO();
		dto.setId(1);
		dto.setName("Gobi Manchuri");
		dto.setPrice(60.00);
		dto.setMadeBy("Sahana");
		dto.setLocation("Rajajinagar");
		dto.setQuantity("1 plate");
		dto.setCoolDrinkName("Sprite");
		dto.setBuyerName("Swati");
		dto.setTaste(false);
		dto.setCenterName("Mahananda Chat center");
		dto.setType("Spicy");
		model.addAttribute("chat", dto);
		return "index.jsp";
	}
	
	
	
	

}
