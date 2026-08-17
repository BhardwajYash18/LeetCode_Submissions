# Write your MySQL query statement below
Select e2.name 
As Employee  
From Employee e1 
Inner Join Employee e2 
On e1.id = e2.managerID
Where e1.salary < e2.salary 