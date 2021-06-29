package com.revature.models;

public class Employee {
	private int employee_id;
	private String f_name;
	private String m_name;
	private String l_name;
	private String dob;
	private String phone;
	private String street_address;
	private String city;
	private String zip_code;
	private String gender;
	private String marital_status;
	private String hire_date;
	private int role_id;
	
	public Employee() {
		super();
	}

	public Employee(int employee_id, String f_name, String m_name, String l_name, String dob, String phone,
			String street_address, String city, String zip_code, String gender, String marital_status, String hire_date,
			int role_id) {
		super();
		this.employee_id = employee_id;
		this.f_name = f_name;
		this.m_name = m_name;
		this.l_name = l_name;
		this.dob = dob;
		this.phone = phone;
		this.street_address = street_address;
		this.city = city;
		this.zip_code = zip_code;
		this.gender = gender;
		this.marital_status = marital_status;
		this.hire_date = hire_date;
		this.role_id = role_id;
	}

	public Employee(String f_name, String m_name, String l_name, String dob, String phone, String street_address,
			String city, String zip_code, String gender, String marital_status, String hire_date, int role_id) {
		super();
		this.f_name = f_name;
		this.m_name = m_name;
		this.l_name = l_name;
		this.dob = dob;
		this.phone = phone;
		this.street_address = street_address;
		this.city = city;
		this.zip_code = zip_code;
		this.gender = gender;
		this.marital_status = marital_status;
		this.hire_date = hire_date;
		this.role_id = role_id;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", f_name=" + f_name + ", m_name=" + m_name + ", l_name="
				+ l_name + ", dob=" + dob + ", phone=" + phone + ", street_address=" + street_address + ", city=" + city
				+ ", zip_code=" + zip_code + ", gender=" + gender + ", marital_status=" + marital_status
				+ ", hire_date=" + hire_date + ", role_id=" + role_id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + employee_id;
		result = prime * result + ((f_name == null) ? 0 : f_name.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((hire_date == null) ? 0 : hire_date.hashCode());
		result = prime * result + ((l_name == null) ? 0 : l_name.hashCode());
		result = prime * result + ((m_name == null) ? 0 : m_name.hashCode());
		result = prime * result + ((marital_status == null) ? 0 : marital_status.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + role_id;
		result = prime * result + ((street_address == null) ? 0 : street_address.hashCode());
		result = prime * result + ((zip_code == null) ? 0 : zip_code.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (employee_id != other.employee_id)
			return false;
		if (f_name == null) {
			if (other.f_name != null)
				return false;
		} else if (!f_name.equals(other.f_name))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (hire_date == null) {
			if (other.hire_date != null)
				return false;
		} else if (!hire_date.equals(other.hire_date))
			return false;
		if (l_name == null) {
			if (other.l_name != null)
				return false;
		} else if (!l_name.equals(other.l_name))
			return false;
		if (m_name == null) {
			if (other.m_name != null)
				return false;
		} else if (!m_name.equals(other.m_name))
			return false;
		if (marital_status == null) {
			if (other.marital_status != null)
				return false;
		} else if (!marital_status.equals(other.marital_status))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (role_id != other.role_id)
			return false;
		if (street_address == null) {
			if (other.street_address != null)
				return false;
		} else if (!street_address.equals(other.street_address))
			return false;
		if (zip_code != other.zip_code)
			return false;
		return true;
	}

	public int getEmployee_id() {
		return employee_id;
	}



	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}



	public String getF_name() {
		return f_name;
	}



	public void setF_name(String f_name) {
		this.f_name = f_name;
	}



	public String getM_name() {
		return m_name;
	}



	public void setM_name(String m_name) {
		this.m_name = m_name;
	}



	public String getL_name() {
		return l_name;
	}



	public void setL_name(String l_name) {
		this.l_name = l_name;
	}



	public String getDob() {
		return dob;
	}



	public void setDob(String dob) {
		this.dob = dob;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getStreet_address() {
		return street_address;
	}



	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getZip_code() {
		return zip_code;
	}



	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getMarital_status() {
		return marital_status;
	}



	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}



	public String getHire_date() {
		return hire_date;
	}



	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}



	public int getRole_id() {
		return role_id;
	}



	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
}
