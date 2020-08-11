package com.igz.talenttest.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.igz.talenttest.model.NumberOrder;
import com.igz.talenttest.service.SortService;

@Service
public class SortServiceImpl implements SortService{
	
	public List<String> sort(List<String> numbersReq) {
		List<String> response = new ArrayList<String>();
		
		List<NumberOrder> numberOrd = new ArrayList<NumberOrder>();
		numberOrd = getListNumberOrders(numbersReq);
		
		numberOrd.sort(Comparator.comparing(NumberOrder::getOneOcurrences).reversed().thenComparing(NumberOrder::getNum));
		
		response = getListResponse(numberOrd);
		
		return response;
	}
	
	public List<String> getListResponse(List<NumberOrder> numberOrd) {
		List<String> response = new ArrayList<String>();
		
		for(NumberOrder num: numberOrd) {
			response.add(String.valueOf(num.getNum()));
		}
		
		return response;
	}

	public List<NumberOrder> getListNumberOrders(List<String> request) {
		List<NumberOrder> response = new ArrayList<NumberOrder>();
		
		for(String number: request) {
			NumberOrder numOrd = new NumberOrder(number);
			response.add(numOrd);
		}
		
		return response;
	}
	
}
