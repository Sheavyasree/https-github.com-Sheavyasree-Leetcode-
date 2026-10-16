# Write your MySQL query statement below
select d.name Department , e.name Employee , e.salary
from employee e inner join department d on e.departmentId = d.id
where (e.departmentid,e.salary) in (select departmentid,max(salary) from employee group by departmentid);