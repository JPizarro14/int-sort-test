package com.igz.talenttest.model;

public class NumberOrder {
	private int oneOcurrences;
	private int num;
	
	public NumberOrder() {
		super();
	}
	
	public NumberOrder(String num) {
		super();
		this.num = Integer.parseInt(num);
		
		this.oneOcurrences = countChar(Integer.parseInt(num));
	}
	
	public NumberOrder(int num, int oneRepetition) {
		super();
		this.num = num;
		this.oneOcurrences = countChar(num);
	}

	public int getOneOcurrences() {
		return oneOcurrences;
	}

	public void setOneOcurrences(int oneOcurrences) {
		this.oneOcurrences = oneOcurrences;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int countChar(int num)
	{
	    int count = 0;

	    String str = Integer.toBinaryString(num);
	    
	    for(int i=0; i < str.length(); i++)
	    {    if(str.charAt(i) == '1')
	            count++;
	    }

	    return count;
	}
	
}
