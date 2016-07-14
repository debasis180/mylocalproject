package com.flp.ems.dao;

import java.util.HashMap;

public interface IemployeeDao {
	void AddEmployee(HashMap bb);
    void ModifyEmployee();
    void RemoveEmployee();
    void SearchEmployee();
    void GetAllEmployee();

}
