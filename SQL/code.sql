SELECT * FROM task.code;
INSERT INTO code (EID,ANAME,AVALUE) VALUES(1,'CODE','C1');
SELECT 
    t1.EID,
    t2.AVALUE AS code,
    t1.ANAME,
    t1.AVALUE
FROM 
    code t1
JOIN 
    code t2 ON t1.EID = t2.EID
        AND t2.ANAME = 'CODE'
WHERE 
    t1.ANAME != 'CODE';
