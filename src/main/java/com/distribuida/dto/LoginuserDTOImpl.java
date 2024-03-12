package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.LoginuserDAO;
import com.distribuida.entities.Loginuser;

@Service
public class LoginuserDTOImpl implements LoginuserDTO {

	@Autowired
	private LoginuserDAO loginuserDAO ;
	@Override
	public List<Loginuser> findAll() {
		// TODO Auto-generated method stub
		return loginuserDAO.findAll();
	}

	@Override
	public Loginuser findOne(int id) {
		// TODO Auto-generated method stub
		return loginuserDAO.findOne(id);
		
	}

	@Override
	public void add(int id, String user, String pasword, String new_pasword, String confirm_pasword,
			String login_correo, String login_token, Date session_time_In, Date session_time_OUT, int session_tiempo) {
		// TODO Auto-generated method stub
		Loginuser luser = new Loginuser(id,  user,pasword,new_pasword,confirm_pasword,login_correo,
				 login_token,  session_time_In,  session_time_OUT,session_tiempo);
		loginuserDAO.add(luser);
	}

	@Override
	public void up(int id, String user, String pasword, String new_pasword, String confirm_pasword, String login_correo,
			String login_token, Date session_time_In, Date session_time_OUT, int session_tiempo) {
		// TODO Auto-generated method stub
		Loginuser luser = new Loginuser(id,  user,pasword,new_pasword,confirm_pasword,login_correo,
				 login_token,  session_time_In,  session_time_OUT,session_tiempo);
		loginuserDAO.up(luser);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		loginuserDAO.del(id);
	}

}
