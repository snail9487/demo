package com.example.demo.vo;

import com.example.demo.constants.RtnCode;
import com.example.demo.entity.Atm;

public class AtmResponse {

	private Atm atm;
	
	private RtnCode rtnCode;

	public AtmResponse() {
		super();
	}

	public AtmResponse(Atm atm, RtnCode rtnCode) {
		super();
		this.atm = atm;
		this.rtnCode = rtnCode;
	}

	public Atm getAtm() {
		return atm;
	}

	public void setAtm(Atm atm) {
		this.atm = atm;
	}

	public RtnCode getRtnCode() {
		return rtnCode;
	}

	public void setRenCode(RtnCode rtnCode) {
		this.rtnCode = rtnCode;
	}

	
	
	
}
