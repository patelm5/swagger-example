package org.patelm5.api;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.patelm5.model.TestModel;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiImplicitParam;
import com.wordnik.swagger.annotations.ApiImplicitParams;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Api(value="/testapi/", description="Test Api")
public class TestApi extends HttpServlet{

	
	
	@Override
	@ApiOperation(httpMethod = "GET", value = "Test Api", response = TestModel.class,nickname="testOperation",notes=" calling with /json will return json and /html will return html")
	@ApiResponses({@ApiResponse(code = 200, message = "Success", response = TestModel.class)})
	@ApiImplicitParams({
		  @ApiImplicitParam(name="contentType", value = "Either json or html", required = true, paramType="path")
		})
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
	}
	
}
