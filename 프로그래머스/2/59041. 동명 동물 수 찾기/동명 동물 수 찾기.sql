-- Oracle
select
    name,
    count(name) as count
from
    animal_ins
where
    name is not null
group by
    name
having
    count(name) >= 2
order by
    name asc
;

-- MySQL
SELECT 
    NAME, 
    COUNT(NAME) AS COUNT
FROM 
    ANIMAL_INS 
WHERE 
    NAME IS NOT NULL
GROUP BY 
    NAME
HAVING 
    COUNT > 1
ORDER 
    BY NAME
;
