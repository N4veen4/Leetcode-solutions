select p.firstName,p.lastName,a.city,a.state 
from person p
Left join Address a
On
p.personId = a.personId;