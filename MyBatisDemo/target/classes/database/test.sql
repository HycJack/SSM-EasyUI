CREATE TABLE STUDENT
(
stud_id int(11) NOT NULL AUTO_INCREMENT,
name varchar(50) NOT NULL,
email varchar(50) NOT NULL,
PRIMARY KEY (stud_id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
/*Sample Data for the students table */
insert into students(stud_id,name,email)
values (1,'Student1','student1@gmail.com');
insert into students(stud_id,name,email)
values (2,'Student2','student2@gmail.com');