select customer_tbl.username,booking_tbl.moviename
from customer_tbl,booking_tbl
where booking_tbl.userid = customer_tbl.id;

select * from booking_tbl;

delete from booking_tbl where userid = 2;

SELECT customer_tbl.username,booking_tbl.moviename
FROM customer_tbl
INNER JOIN booking_tbl
ON booking_tbl.userid=customer_tbl.id;

select customer_tbl.username from customer_tbl;
select customer_tbl.id from customer_tbl;

