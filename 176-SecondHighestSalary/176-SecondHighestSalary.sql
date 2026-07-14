-- Last updated: 14/07/2026, 14:51:24
SELECT (
    select max(salary)
    FROM Employee
     WHERE salary < (SELECT MAX(salary) FROM employee)
)as SecondHighestSalary;