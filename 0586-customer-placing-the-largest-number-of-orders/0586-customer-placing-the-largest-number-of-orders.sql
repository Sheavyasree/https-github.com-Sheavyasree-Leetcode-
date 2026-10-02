# Write your MySQL query stat
SELECT customer_number from Orders
group by customer_number
order by count(*) desc
limit 1;