package com.example.web.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.web.bean.FlightBean;

@Repository
public class AdministratorDAO {
	int i=0;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public int addFlight(FlightBean flight) {
		return jdbcTemplate.update("insert into flight values('"+flight.getFlightID()+"','"+flight.getFlightName()+"',"+flight.getSeatingCapacity()+","+flight.getReservationCapacity()+")");
	}
	public int updateFlight(FlightBean fb) {
		jdbcTemplate.execute("update flight set flightname=?,seatingcapacity=?,reservationc=? where flightid=?",new PreparedStatementCallback<FlightBean>() {

			@Override
			public FlightBean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setString(1, fb.getFlightName());
				ps.setInt(2, fb.getSeatingCapacity());
				ps.setInt(3, fb.getReservationCapacity());
				ps.setString(4, fb.getFlightID());
				i=ps.executeUpdate();
				return fb;
			}
		});
		return i;
	}
	public int deleteFlight(String flightid) {
		return jdbcTemplate.update("delete from flight where flightid='"+flightid+"'");
	}
	
	public ArrayList<FlightBean> selectAllFlights()
	{
	ArrayList<FlightBean> all=new ArrayList<FlightBean>();
	jdbcTemplate.query("select * from flight", new RowMapper<FlightBean>() {
	@Override
	 public FlightBean mapRow(ResultSet rs, int rowNum) throws SQLException {
	FlightBean f=new FlightBean();
	f.setFlightID(rs.getString(1));
	f.setFlightName(rs.getString(2));
	f.setSeatingCapacity(rs.getInt(3));
	f.setReservationCapacity(rs.getInt(4));
	all.add(f);
	return null;
	}
	});
	return all;
	}
}

