package com.impetus.Controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.impetus.bean.ValidBean;
import com.impetus.service.ConnectionService;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

@Controller
public class AddController extends HttpServlet {
	@Override 	@RequestMapping("/validate")
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	   throws IOException, ServletException {
		
		ValidBean validBean = new ValidBean();
		
		validBean.setTable1("table1");
		validBean.setTable2("table2");
		validBean.setHdfs1("hdfs1tb");
		validBean.setHdfs2("hdfs2tb");
		validBean.setRowByRow("rowByRow");
		validBean.setValidationOfSamples("validationOfSamples");
		validBean.setCustomQuery("customQuery");
		validBean.setCustomQueryTA("customQueryTA");
		validBean.setOutputCheck("outputCheck");
		validBean.setAssertValues("assertValues");
		validBean.setOperator("operator");
		validBean.setValue("value");
		validBean.setResultCount("resultCount");
		validBean.setColumnCountCheck("columnCountCheck");
		validBean.setAllColumnDataTypeCheck("allColumnDataTypeCheck");
		validBean.setCustomColumnDataTypeCheck("customColumnDataTypeCheck");
		validBean.setCustomColumn("customColumn");
		
		boolean b = ConnectionService.connection();
		System.out.println(b);
		String customQueryTA = validBean.getCustomQueryTA();
		String value= validBean.getValue();
		String operator = validBean.getOperator();
		
		String source = null, destination = null;
		if(validBean.getTable1()!= null && validBean.getHdfs1()== null)
		{
			source = validBean.getTable1();
		}
		if(validBean.getTable1()== null && validBean.getHdfs1()!= null)
		{
			source = validBean.getHdfs1();
		}
		if(validBean.getTable2() != null && validBean.getHdfs2() == null)
		{
			destination = validBean.getTable2();
		}
		if(validBean.getTable2() == null && validBean.getHdfs2() != null)
		{
			destination = validBean.getHdfs2(); 
		}
		
		if(validBean.getRowByRow() != null)
		{
			RowByRowFunc(source, destination);
		}
		
		if(validBean.getValidationOfSamples() != null)
		{
			validationOfSamplesFunc(source, destination);
		}
		
		if(validBean.getOutputCheck() != null)
		{
			outputCheckFunc(source, destination, validBean.getCustomQueryTA());
		}
		if(validBean.getAssertValues() != null)
		{
			assertValueFunc(source, destination, validBean.getCustomQueryTA(), validBean.getOperator(), validBean.getValue());
		}
		if(validBean.getResultCount() != null)
		{
			resultCountFunc(source, destination, validBean.getCustomQueryTA());
		}
		if(validBean.getColumnCountCheck() != null)
		{
			columnCountCheckFunc(source, destination);
		}
		if(validBean.getAllColumnDataTypeCheck() != null)
		{
			AllColumnDataTypeCheckFunc(source, destination);
		}
		if(validBean.getCustomColumnDataTypeCheck() != null)
		{
			CustomColumnDataTypeCheckFunc(source, destination);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
	  rd.forward(request, response);
	 }

	private void CustomColumnDataTypeCheckFunc(String source, String destination) {
		// TODO Auto-generated method stub
		
	}

	private void AllColumnDataTypeCheckFunc(String source, String destination) {
		// TODO Auto-generated method stub
		
	}

	private void columnCountCheckFunc(String source, String destination) {
		// TODO Auto-generated method stub
		
	}

	private void resultCountFunc(String source, String destination, String customQueryTA) {
		// TODO Auto-generated method stub
		
	}

	private void assertValueFunc(String source, String destination, String customQueryTA, String operator, String value) {
		// TODO Auto-generated method stub
		
	}

	private void outputCheckFunc(String source, String destination, String customQueryTA) {
		// TODO Auto-generated method stub
		
	}

	private void validationOfSamplesFunc(String source, String destination) {
		// TODO Auto-generated method stub
		
	}

	private void RowByRowFunc(String source, String destination) {
		// TODO Auto-generated method stub
		
	}

}
