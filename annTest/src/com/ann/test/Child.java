package com.ann.test;

@Description("小孩子")
public class Child implements Person {

	@Override
	@Description("人名")
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String sing() {
		// TODO Auto-generated method stub
		return "唱歌啊";
	}
}
