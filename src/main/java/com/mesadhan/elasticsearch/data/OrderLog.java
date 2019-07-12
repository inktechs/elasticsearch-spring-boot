package com.mesadhan.elasticsearch.data;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="order", type="default")
public class OrderLog {

	@Id
	private String id;
	private Date timestamp;
	private String className;
	private String methodName;
	private String testCase;
	private String result;
	private String parameters;


	public OrderLog() {
	}

	public OrderLog(String id, Date timestamp, String className, String methodName, String testCase, String result, String parameters) {
		super();
		this.id = id;
		this.timestamp = timestamp;
		this.className = className;
		this.methodName = methodName;
		this.testCase = testCase;
		this.result = result;
		this.parameters = parameters;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getTestCase() {
		return testCase;
	}

	public void setTestCase(String testCase) {
		this.testCase = testCase;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
}
