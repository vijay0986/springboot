package com.example.demo.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.demo.beans.first;
import com.example.demo.controller.addContoller;

public class firstService {
	
	static HashMap<Integer, first> firstIdMap;
	
	public firstService() {
		firstIdMap = new HashMap<Integer, first>();
		first myName = new first(1,"Sai","KKts");
		first yourName = new first(2,"Mona","KKts");
		first othersName = new first(3,"random","other school");
		firstIdMap.put(1, myName);
		firstIdMap.put(2, yourName);
		firstIdMap.put(3, othersName);
	}
	public List getAllNames() {
		List names = new ArrayList(firstIdMap.values());
		return names;
	}
	public first getAllById(int id) {
		first obj = firstIdMap.get(id);
		return obj;
	}
	public first getAllByName(String firstName) {
		first obj = null;
		for(int i:firstIdMap.keySet()) {
			if(firstIdMap.get(i).getFirstName().equals(firstName))
				obj=firstIdMap.get(i);
		}
		return obj;
	}
	public first addSchool(first school) {
		school.setId(getMaxId());
		firstIdMap.put(school.getId(), school);
		return school;
	}
//	utility method
	public static int getMaxId() {
		int max = 0;
		for (int id: firstIdMap.keySet())
			if(max<=id)
				max=id;
		return max+1;
	}
	public first updateSchool(first school) {
		if(school.getId()>0)
			firstIdMap.put(school.getId(), school);
		return school;
	}
	public addContoller deleteSchool(int id) {
		firstIdMap.remove(id);
		addContoller response = new addContoller();
		response.setMsg("removed the school...");
		response.setId(id);
		return response;
	}
}
