package com.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Resume;
import utils.ResumeManagement;

@WebServlet("/addCV")
public class CVmanagement extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = (String) request.getParameter("name");
		String education = (String) request.getParameter("education");
		String experience = (String) request.getParameter("experience");
		String skills = (String) request.getParameter("skills");
		Resume resume=new Resume(name,education,experience,skills);
		HttpSession session=request.getSession();
		ResumeManagement rm=new ResumeManagement();
		if(session.getAttribute("listCV") != null){
			
			Map<Integer,Resume> listCV=(HashMap<Integer,Resume>)session.getAttribute("listCV");
			if(!rm.checkResumeExist(listCV,resume)){
			listCV.put(listCV.size(), resume);
			session.setAttribute("listCV", listCV);
			}
		}else{
			Map<Integer,Resume> listCV=new HashMap<Integer,Resume>();
			listCV.put(listCV.size(), resume);
			session.setAttribute("listCV", listCV);
		}
		
		
		getServletContext().getRequestDispatcher("/page2.jsp").forward(request, response);
		
	}
}
