package com.igz.talenttest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igz.talenttest.service.SortService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/Sort")
@Api (value = "Sort Numbers Microservice", description = "This API has a service to sort a list of numbers")
public class SortController {
	
	@Autowired
	private SortService sortService;
	
	@PostMapping(value = "/sort")
	@ApiOperation(value = "Sort list numbers", notes ="Returns the sorted list")
	public ResponseEntity sort(@RequestBody List<String> numbersReq) {
		List<String> response = sortService.sort(numbersReq);
		
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
}
