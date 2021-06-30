CREATE TABLE employeeBasicDetails (employee_id serial PRIMARY KEY,	
						f_name TEXT,
						m_name TEXT,
						l_name TEXT,
						dob DATE,
						phone TEXT,
						street_address TEXT,
						city TEXT,
						zip_code TEXT,
						gender TEXT,
						marital_status TEXT,
						hire_date DATE, --YYYY-MM-DD	
						role_id INT REFERENCES Roles (role_id) --foreign key
						);
					
DROP TABLE employeeBasicDetails;
					
CREATE TABLE roles (role_id serial PRIMARY KEY,
					role_title TEXT, 
					role_salary INT
);

INSERT INTO roles (role_title, role_salary)		
			VALUES ('General Manager', 120000),			   
					('Butcher', 80000),			   
					('Cashier', 60000),			   
					('Cook', 50000),			   
					('Courtesy Clerk', 25000),
					('Produce Worker', 55000),
					('Kitchen Manager', 65000),
					('Meat Department Manager', 90000),
					('Wine Manager', 65000),
					('Parking Lot Attendant', 30000);
					
--SELECT * FROM roles;
SELECT * FROM employeeBasicDetails;
				
INSERT INTO employeeBasicDetails (f_name, m_name, l_name, dob, phone, street_address, city, zip_code, gender, marital_status, hire_date, role_id)		
			VALUES ('Samuel', 'Gregory', 'Nicholson', '1970-01-01', '5101234567', '8016 S. Alderwood St.', 'Lafayette', 94549, 'Male', 'Single', '1990-01-05', 1),			   
			('Ronald', 'Alexander', 'Smith', '1970-01-01', '9257299822', '73 Roehampton Drive', 'Oakley', 94561, 'Male', 'Single', '1985-07-15', 2),
			('Victor', 'Rodrigo', 'Nunez', '1969-02-15', '9256804453', '4 East Edgefield St.', 'Walnut Creek', 94545, 'Male', 'Single', '1995-06-13', 2),
			('Andrew', 'Lee', 'Johnson', '1963-03-18', '9252686974', '53 Lawrence Street', 'Orinda', 94563, 'Male', 'Married', '1997-05-21', 2),
			('Johnathan', 'Andrew', 'Vazquez', '1972-04-01', '9256366297', '9087 West Marconi St.', 'Clayton', 94517, 'Male', 'Married', '2008-10-01', 2),
			('Jim', 'Johnathan', 'Frank','1965-08-12', '9257081702', '8449 Parker Ave.', 'Concord', 94520, 'Male', 'Married', '1996-07-18', 8),
			('Conis', 'Corina', 'Linares', '1985-10-19', '9254022745', '22 N. Acacia St.', 'Walnut Creek', 94565, 'Female', 'Married', '2006-08-04', 4),
			('Norman', 'Burra', 'Linares', '1983-12-03', '9254198565', '123 Pittsburg St.', 'Bay Point', 94565, 'Male', 'Married', '2003-02-12', 4),
			('Densy', 'Alex', 'Colindres', '1981-10-18', '9255069378', '362 Eagle St.', 'Bay Point', 94565, 'Female', 'Married', '2018-03-17', 4),
			('Marco', 'Rodriguez', 'Franco', '1982-06-02', '9255300797', '25 Squaw Creek Ave.', 'Pacheco', 94553, 'Male', 'Married', '2005-05-07', 4),
			('Jorge', 'Jairo', 'Hernandez', '1980-04-14', '2194899243', '340 Tailwater Dr.', 'Pittsburg', 94565, 'Male', 'Married', '2003-06-01', 4),
			('Alejandro', 'Christian', 'Salvador', '1979-09-23', '9255481165', '943 Berkshire Ave.', 'Antioch', 94509, 'Male', 'Single', '2002-01-19', 4),
			('Tish', 'Elizabeth', 'Gaytan', '1959-07-30', '9252893269', '135 Leeton Ridge Road', 'Pleasant Hill', 94523, 'Female', 'Married', '1999-02-19', 7),
			('Andres', 'Gomez', 'Rembers', '1982-12-25', '9254560635', '9033 NW. Adams Ave.', 'Lafayette', 94563, 'Male', 'Married', '2001-09-15', 3),
			('Clifford', 'Jonathan', 'Walker', '1987-03-11', '9256874710', '8929 Harvard Street', 'San Ramon', 94582, 'Male', 'Married', '2000-12-16', 1),
			('Jennifer', 'Jackie', 'Jalbert', '1992-08-02', '9256768687', '8320 Hillcrest Drive', 'Concord', 94520, 'Female', 'Single', '2011-05-18', 5),
			('Joey', 'Jackson', 'Schaffer', '1991-01-15', '9258826102', '7656 Brewery Court', 'Walnut Creek', 94596, 'Male', 'Married', '2010-01-08', 5),
			('Caitlyn', 'Rose', 'Motalin', '1993-05-28', '9256823202', '9107 Grove Lane', 'Benicia', 94510, 'Female', 'Married', '2008-05-17', 5),
			('Skyler', 'Robert', 'Haman', '1995-02-26', '9255712203', '9298 Beechwood St.', 'Orinda', 94563, 'Male', 'Single', '2013-04-08', 5),
			('Jonathan', 'Jo', 'Rodriguez', '1990-06-11', '9257208555', '954 Piper Rd.', 'Martinez', 94553, 'Male', 'Married', '2014-12-04', 6),
			('Anthony', 'Juan', 'Mujica', '1985-08-27', '9259232687', '9211 Lake Street', 'Concord', 94519, 'Male', 'Married', '2003-08-12', 6),
			('Lee', 'Louie', 'Roberts', '1985-06-22', '5106500205', '114 Valley Road', 'Clyde', 94520, 'Male', 'Single', '2013-01-09', 10),
			('Max', 'Franklin','Mayeri', '1989-02-20', '9254772532', '603 Helen Ave.', 'Orinda', 94563, 'Male', 'Single', '2009-08-05', 9),
			('Katie', 'Farida', 'Eaton', '1988-03-20', '9256395404', '7893 Hudson St.', 'Alameda', 94502, 'Female', 'Single', '2006-08-22', 3),
			('Kevin', 'Jack', 'Walkinson', '1963-09-24', '9256822846', '9275 Depot Street', 'Walnut Creek', 94597, 'Male', 'Married', '2001-06-13', 3),
			('Sandra', 'Beth', 'Monroy', '1972-09-21', '9256579316', '9482 Rock Maple St.', 'Concord', 94519, 'Female', 'Married', '1998-05-23', 3),
			('Joy', 'Louise', 'Jetson', '1960-06-30', '7078122999', '46 Ridge St.', 'Vallejo', 94591, 'Female', 'Single', '1992-01-02', 3);
		
	