
package com.example.web.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.bean.FlightBean;
import com.example.web.dao.AdministratorDAO;

@Service
public class FlightService {
	@Autowired
	private AdministratorDAO adao;
public int addFlight(FlightBean fb) {
	return adao.addFlight(fb);
}
public int updateFlight(FlightBean fb)
{
	return adao.updateFlight(fb);
}
public int deleteFlight(String flightid)
{
	return adao.deleteFlight(flightid);
}
public ArrayList<FlightBean> selectAllFlights()
{
return adao.selectAllFlights();
}
}
