package com.javaprograms.asigment2;

public class implementor22 implements I22, I33 {

	@Override
	public void sum1(int i, int j) throws Exception {

		try {
			System.out.println(i + j);
		} catch (Exception e) {
			throw new Exception("Variable e is not set properly and get error");
		}
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
	}

	@Override
	public void sum2(String i, int j) throws Exception {
		try {
			int k = Integer.parseInt(i);

			System.out.println(k + j);
		} catch (Exception e) {
			throw new Exception("Variable e is not set properly and get error");
		}
	}

	@Override
	public void sum1() {
		// TODO Auto-generated method stub
	}

	@Override
	public void subtract1(int i, int j) throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println(i - j);
		} catch (Exception e) {
			throw new Exception("Variable e is not set properly and get error");
		}
	}

	@Override
	public void subtract() {
		// TODO Auto-generated method stub

	}

	@Override
	public void subtract2(String i, int j) throws Exception {
		try {
			int k = Integer.parseInt(i);

			System.out.println(k - j);
		} catch (Exception e) {
			throw new Exception("Variable e is not set properly and get error");
		}
	}

	@Override
	public void subtract1() {
		// TODO Auto-generated method stub
	}

	@Override
	public void divide1(int i, int j) throws Exception {

		try {
			System.out.println(i / j);
		} catch (Exception e) {
			throw new Exception("Variable e is not set properly and get error");
		}
	}

	@Override
	public void divide() {
		// TODO Auto-generated method stub
	}

	@Override
	public void divide2(String i, int j) throws Exception {
		try {
			int k = Integer.parseInt(i);

			System.out.println(k / j);
		} catch (Exception e) {
			throw new Exception("Variable e is not set properly and get error");
		}
	}

	@Override
	public void divide1() {
		// TODO Auto-generated method stub
	}

	@Override
	public void multiplication1(int i, int j) throws Exception {

		try {
			System.out.println(i * j);
		} catch (Exception e) {
			throw new Exception("Variable e is not set properly and get error");
		}
	}

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
	}

	@Override
	public void multiplication2(String i, int j) throws Exception {
		try {
			int k = Integer.parseInt(i);

			System.out.println(k * j);
		} catch (Exception e) {
			throw new Exception("Variable e is not set properly and get error");
		}
	}

	@Override
	public void multiplication1() {
		// TODO Auto-generated method stub
	}
}
