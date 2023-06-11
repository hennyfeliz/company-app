
alter table userr
add foreign key (employee) references employee(id)

alter table employee
add foreign key (userr) references userr(id)

ALTER TABLE userr
	ADD employeee int,
	FOREIGN KEY (employeee) references employee(id)

ALTER TABLE employee
	ADD FOREIGN KEY (userr) references userr(id)

	ALTER TABLE userr
ADD CONSTRAINT PK_userr PRIMARY KEY (id);


ALTER TABLE employee
ADD FOREIGN KEY (userr) REFERENCES userr(id);