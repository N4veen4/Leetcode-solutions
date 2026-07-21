select email as Email
from person 
group by email
Having count(email)>1;