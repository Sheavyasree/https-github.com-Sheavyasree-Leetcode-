# Write your MySQL query statement below
Select P.firstname, P.lastname, A.city, A.state
FROM Person P Left join Address A 
On P.personid = A.personid;