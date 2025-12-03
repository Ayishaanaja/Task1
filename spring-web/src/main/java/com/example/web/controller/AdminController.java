package com.example.web.controller;

import java.util.ArrayList;
import com.example.web.service.FlightService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.web.bean.FlightBean;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;
import ch.qos.logback.core.model.Model;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final FlightService flightService;

    AdminController(FlightService flightService) {
        this.flightService = flightService;
    }
	@GetMapping("/welcome")
	public String meth1()
	{
		return "<h1> Hello I'm Ayisha </h1><marquee direction='up'> <h2>Welcome to Spring Boot Application</h2></marquee>";
		//return "<marquee direction='right'> Welcome to Spring Boot Application</marquee>";
	}
	@GetMapping("/data")
	public ArrayList<String> meth2()
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Ayisha");
		al.add("Aiswarya");
		al.add("Sreelakshmy");
		al.add("Merin");
		return al;
	}
	@GetMapping("/first")
	public ModelAndView meth3() {
		return new ModelAndView("Login");
	}
	//@RequestMapping(value="/validate",method=org.springframework.web.bind.annotation.RequestMethod.POST)
	@PostMapping(value="/validate")
	public ModelAndView meth4(@RequestParam("user") String usr,@RequestParam("pass")String pss) {
		if(usr.equals("AD-001")&& pss.equals("AD-001")) {
			return new ModelAndView("AddFlight");
		}
		else if(usr.equals("AD-002")&& pss.equals("AD-002"))
		{
			return new ModelAndView("UpdateFlight");
		}
		else if(usr.equals("AD-003")&& pss.equals("AD-003"))
		{
			return new ModelAndView("DeleteFlight");
		}
		else if(usr.equals("AD-004")&&(pss.equals("AD-004")))
		{
		return new ModelAndView("SelectAllFlights");
		}
		else {
			return new ModelAndView("Invalid");
		}
	}
	@PostMapping("/addFlight")
	public String meth5(@ModelAttribute("fb")FlightBean fb) {
		int i=flightService.addFlight(fb);
		if(i==1)
			return "<h1>Addedd Succesfully</h1>";
		else
			return "<h1>Cannot add the data</h1>";
	}
	@PostMapping("/updateFlight")
	public String meth6(@ModelAttribute("fb")FlightBean fb)
	{
		int i=flightService.updateFlight(fb);
		return "<h1>Updated Succesfully</h1>";
	}
	@PostMapping("/deleteFlight")
	public String meth7(@RequestParam("flightID")String flightID ){
		int i=flightService.deleteFlight(flightID);
		if(i==1)
			return "<h1>Deleted Succesfully</h1>";
		else
			return "<h1>Cannot delete the data</h1>";
	}
	@PostMapping("/selectAll")
	public ModelAndView meth8(org.springframework.ui.Model m)
	{
	ArrayList<FlightBean> allFlights= flightService.selectAllFlights();
	System.out.println(allFlights);
	m.addAttribute("aaa", allFlights);
	return new ModelAndView("DisplayFlights");
	}
	

}
