select * from sampleschemas.transaction_tbl;

select * from sampleschemas.customer_tbl;

select transactionid , customer_tbl.name
from sampleschemas.transaction_tbl
RIGHT JOIN sampleschemas.customer_tbl
ON sampleschemas.transaction_tbl.customerid = sampleschemas.customer_tbl.id;



SELECT customer_tbl.name, transaction_tbl.customerid
FROM sampleschemas.customer_tbl
LEFT JOIN sampleschemas.transaction_tbl
ON sampleschemas.customer_tbl.id = sampleschemas.transaction_tbl.customerid
UNION
SELECT customer_tbl.name, transaction_tbl.customerid
FROM sampleschemas.customer_tbl
RIGHT JOIN sampleschemas.transaction_tbl
ON sampleschemas.customer_tbl.id = sampleschemas.transaction_tbl.customerid;


select count(id), address from sampleschemas.customer_tbl
GROUP by address;





select count(id), address from sampleschemas.customer_tbl
GROUP by address
having count(id) > 1;

