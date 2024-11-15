-- Oracle
select
    I.animal_id,
    I.name
from
    animal_ins I,
    animal_outs O
where
    I.animal_id = O.animal_id
order by
    O.datetime - I.datetime desc
offset 0 rows fetch next 2 rows only
;

-- MySQL
SELECT 
    O.ANIMAL_ID, I.NAME
FROM 
    ANIMAL_OUTS O
JOIN 
    ANIMAL_INS I 
    ON O.ANIMAL_ID = I.ANIMAL_ID
ORDER BY 
    O.DATETIME - I.DATETIME DESC
LIMIT 2
;
