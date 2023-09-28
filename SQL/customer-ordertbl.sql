select user.username,booking.moviename
from user,booking
where booking.bookingid = user.id;

SELECT customer.customername, orders.shipperid
FROM customer, orders
WHERE customer.customerid = orders.customerid;

SELECT orders.OrderID, customer.customername, customer.customerid
FROM orders
RIGHT JOIN customer ON orders.customerid = customer.customerid
ORDER BY orders.orderid;
SELECT  customer.customername, orders.OrderID
FROM orders
LEFT JOIN customer ON customer.customerid = orders.customerid
ORDER BY customer.customerid;

SELECT orders.OrderID, customer.customername, customer.customerid
FROM orders
RIGHT JOIN customer ON orders.customerid = customer.customerid
GROUP BY orders.OrderID, customer.customername, customer.customerid
ORDER BY orders.orderid;