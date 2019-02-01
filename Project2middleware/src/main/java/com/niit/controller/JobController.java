package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niit.Dao.JobDao;
import com.niit.models.ErrorClazz;
import com.niit.models.Job;




@RestController
public class JobController {
	@Autowired
	public JobDao jobDao;
	@RequestMapping(value="/addjob",method=RequestMethod.POST)

	public  ResponseEntity<?>  addJob(@RequestBody Job job){
		try{
			jobDao.addJob(job);
			}catch(Exception e){
				ErrorClazz errorClazz=new ErrorClazz(1,"Job details not inserted..something went wrong.." +e.getMessage());
				return new ResponseEntity<ErrorClazz>(errorClazz,HttpStatus.INTERNAL_SERVER_ERROR);			
			}
		return new ResponseEntity<Job>(job,HttpStatus.OK);
		
				
	}
	
	
}
