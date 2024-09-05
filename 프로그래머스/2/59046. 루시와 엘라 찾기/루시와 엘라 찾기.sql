-- Oracle
select
    animal_id,
    name,
    sex_upon_intake
from
    animal_ins
where
    name = 'Lucy'
    or name = 'Ella'
    or name = 'Pickle'
    or name = 'Rogan'
    or name = 'Sabrina'
    or name = 'Mitty'
order by
    animal_id asc
;

-- MySQL
SELECT 
    ANIMAL_ID, 
    NAME, 
    SEX_UPON_INTAKE
FROM 
    ANIMAL_INS
WHERE 
    NAME LIKE "Lucy" 
    OR NAME LIKE "Ella" 
    OR NAME LIKE "Pickle" 
    OR NAME LIKE "Rogan"
    OR NAME LIKE "Sabrina"
    OR NAME LIKE "Mitty"
ORDER BY 
    ANIMAL_ID
;
