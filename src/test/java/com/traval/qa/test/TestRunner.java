package com.traval.qa.test;

import java.util.Arrays;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TestNG testNG = new TestNG();
		testNG.setTestSuites(Arrays.asList("resourcesF/Master.xml"));
        testNG.run();
		

	}

}
