-- Oracle
select
    o.animal_id,
    o.name
from
    animal_outs o
left outer join
    animal_ins i
on
    o.animal_id = i.animal_id
where
    i.animal_id is null
order by
    animal_id asc
;

-- MySQL
SELECT 
    O.ANIMAL_ID, 
    O.NAME
FROM 
    ANIMAL_OUTS O
LEFT JOIN 
    ANIMAL_INS I 
    ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE 
    I.ANIMAL_ID IS NULL
ORDER BY 
    I.ANIMAL_ID ASC
;
