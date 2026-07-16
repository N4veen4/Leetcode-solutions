SELECT customer_number
FROM Orders 
GROUP BY customer_number
order by count(order_number) desc limit 1;
