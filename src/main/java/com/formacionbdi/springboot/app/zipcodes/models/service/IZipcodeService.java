package com.formacionbdi.springboot.app.zipcodes.models.service;

import java.util.List;

import com.formacionbdi.springboot.app.zipcodes.controllers.ZipcodeNotFoundException;
import com.formacionbdi.springboot.app.zipcodes.models.entity.Zipcode;
import com.formacionbdi.springboot.app.zipcodes.models.entity.ZipcodeInfo;

public interface IZipcodeService {
	public List<Zipcode> findAll();
	public ZipcodeInfo findByZipcode(String zCode) throws ZipcodeNotFoundException;
}
