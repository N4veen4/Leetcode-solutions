-- Last updated: 14/07/2026, 14:51:25
select p.firstName,p.lastName,a.city,a.state 
from person p
Left join Address a
On
p.personId = a.personId;