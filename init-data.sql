CREATE DATABASE WEB_DAY11;
USE WEB_DAY11;


CREATE TABLE STUDENTS(
	ID INT NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(50),
	PRIMARY KEY (ID)
);

CREATE TABLE FACULTIES(
	ID INT NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(70),
	PRIMARY KEY (ID)
);

CREATE TABLE SUBJECTS(
	ID INT NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(70),
	PRIMARY KEY (ID)
);

CREATE TABLE FACULTY_SUBJECT(
	ID INT NOT NULL AUTO_INCREMENT,
	FACULTY_ID INT NOT NULL,
	SUBJECT_ID INT NOT NULL,
    PRIMARY KEY (ID),
	FOREIGN KEY (SUBJECT_ID) REFERENCES SUBJECTS(ID),
	FOREIGN KEY (FACULTY_ID) REFERENCES FACULTIES(ID)
);

CREATE TABLE STUDENT_SUBJECT(
	ID INT NOT NULL AUTO_INCREMENT,
	STUDENT_ID INT NOT NULL,
	SUBJECT_ID INT NOT NULL,
	GRADE DOUBLE,
	PRIMARY KEY (ID),
	FOREIGN KEY (STUDENT_ID) REFERENCES STUDENTS(ID),
	FOREIGN KEY (SUBJECT_ID) REFERENCES SUBJECTS(ID)
);


INSERT INTO STUDENTS (NAME) VALUES ("TRAN VAN A"), ("NGUYEN THI B"), ("LE VAN C");

INSERT INTO FACULTIES (NAME) VALUES ("INFORMATION TECHNOLOGY"), ("COMPUTER SCIENCE");

INSERT INTO SUBJECTS (NAME) VALUES ("PHYSICS"), ("MATH"), ("COMPUTER NETWORKING");

INSERT INTO FACULTY_SUBJECT (FACULTY_ID, SUBJECT_ID) VALUES (1, 1), (1, 3), (2, 2);

INSERT INTO STUDENT_SUBJECT (STUDENT_ID, SUBJECT_ID, GRADE) VALUES (1, 1, 7.5), (1, 2, 8), (2, 2, 6.5), (3, 1, 8.5);

