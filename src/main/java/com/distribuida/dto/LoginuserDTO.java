package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Loginuser;

public interface LoginuserDTO {
	
	public List<Loginuser> findAll();
	
	public Loginuser findOne(int id);
	
	public void add(int id, String user, String pasword, String new_pasword, String confirm_pasword, String login_correo,
			String login_token, Date session_time_In, Date session_time_OUT, int session_tiempo) ;
	
	public void up(int id, String user, String pasword, String new_pasword, String confirm_pasword, String login_correo,
			String login_token, Date session_time_In, Date session_time_OUT, int session_tiempo);
	
	public void del(int id);

}
