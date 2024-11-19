-- Oracle
select
    I.animal_id,
    I.name
from
    animal_ins I,
    animal_outs O
where
    I.animal_id = O.animal_id
    and I.datetime > O.datetime
order by
    I.datetime asc
;

-- MySQL
SELECT 
    O.ANIMAL_ID, 
    O.NAME
FROM 
    ANIMAL_OUTS O
JOIN 
    ANIMAL_INS I 
    ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE 
    O.DATETIME < I.DATETIME
ORDER BY 
    I.DATETIME ASC
;
