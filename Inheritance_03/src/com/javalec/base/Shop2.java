package com.javalec.base;

public class Shop2 extends HeadQuarter {
	
	public Shop2() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void orderKim() {
		System.out.println("김치찌개(HQ) : 5,000원");
	}
	
	@Override
	public void orderBu() {
		System.out.println("부대찌개 : 5,000원");
	}
	
	@Override
	public void orderBi() {
		System.out.println("비빔밥 : 5,000원");
	}
	
	@Override
	public void orderSoon() {
		System.out.println("순대국 : 4,000원");
	}
	
	@Override
	public void orderKong() {
		System.out.println("공기밥 : 무료입니다.");
	}

}
