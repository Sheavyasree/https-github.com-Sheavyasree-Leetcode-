# Write your MySQL query statement below
SELECT EmployeeUNI.unique_id , Employees.name
FROM Employees left join Employeeuni
on Employees.id = EMployeeUNI.id;