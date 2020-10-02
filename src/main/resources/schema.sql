DROP TABLE course; 
DROP TABLE game;
DROP TABLE hole;

CREATE TABLE course
(course_id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50),
city VARCHAR(30),
address VARCHAR(100),
rating VARCHAR(10),
holesqty int);

CREATE TABLE game
(id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY
,score int NOT NULL,
course_id BIGINT NOT NULL);

CREATE TABLE hole (
id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50),
par int,
distance int,
course_id BIGINT NOT NULL);

INSERT INTO course (name, city, address, rating, holesqty) VALUES ('Siltamäki','Helsinki','Pallomäentie','A2',18);
INSERT INTO course (name, city, address, rating, holesqty) VALUES ('Kivikko','Helsinki','Savikiekontie 8','A1',18);
INSERT INTO course (name, city, address, rating, holesqty) VALUES ('Munkkiniemi','Helsinki','Nuottapolku 12','B1',9);
INSERT INTO course (name, city, address, rating, holesqty) VALUES ('Oittaa-Rantapuisto','Espoo','Oittaantie','C1',9);
INSERT INTO course (name, city, address, rating, holesqty) VALUES ('Oittaa-Kalliometsä','Espoo','Oittaantie','A1',18);



INSERT INTO game (score, course_id) VALUES (-3,1);

INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #1:',3,66,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #2:',3,86,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #3:',3,51,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #4:',3,59,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #5:',3,63,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #6:',3,61,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #7:',3,66,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #8:',3,77,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #9:',3,96,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #10:',3,81,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #11:',3,72,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #12:',3,94,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #13:',3,92,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #14:',3,67,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #15:',3,61,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #16:',3,108,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #17:',3,76,1);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #18:',2,35,1);

INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #1:',3,90,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #2:',3,115,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #3:',3,81,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #4:',3,100,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #5:',3,96,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #6:',4,106,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #7:',4,127,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #8:',3,113,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #9:',3,91,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #10:',3,108,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #11:',3,70,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #12:',3,96,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #13:',3,89,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #14:',3,50,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #15:',3,54,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #16:',3,66,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #17:',3,55,2);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #18:',2,72,2);

INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #1:',3,89,3);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #2:',3,68,3);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #3:',3,57,3);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #4:',3,111,3);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #5:',3,65,3);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #6:',3,97,3);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #7:',3,132,3);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #8:',3,78,3);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #9:',3,98,3);

INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #1:',3,37,4);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #2:',3,34,4);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #3:',3,54,4);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #4:',3,45,4);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #5:',3,60,4);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #6:',3,49,4);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #7:',3,46,4);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #8:',3,45,4);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #9:',3,46,4);

INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #1:',3,85,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #2:',3,70,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #3:',3,80,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #4:',3,86,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #5:',4,101,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #6:',3,78,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #7:',3,74,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #8:',3,76,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #9:',3,69,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #10:',4,126,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #11:',3,74,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #12:',3,82,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #13:',3,90,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #14:',4,166,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #15:',4,136,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #16:',4,154,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #17:',3,85,5);
INSERT INTO hole (name, par, distance, course_id) VALUES ('Hole #18:',3,83,5);

SELECT * FROM course;
SELECT * FROM game;
SELECT * FROM hole;