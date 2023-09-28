SELECT * FROM TBL_DEPT;

INSERT INTO TBL_DEPT VALUES(167,'CSE','COMPUTER SCIENCE AND ENGINEERING');

DELETE FROM TBL_DEPT WHERE DEPTID=167;

INSERT INTO TBL_DEPT VALUES(9213,'CS','COMPUTER SCIENCE');



select a.id, a.name, a.address, b.name 
from tbl_student a, tbl_dept b 
where a.studeptid = b.deptid and b.deptid = 9213;
