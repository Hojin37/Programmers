-- Oracle
select
    I.name,
    I.datetime
from
    animal_ins I
left join
    animal_outs O
    on I.animal_id = O.animal_id
where    
    O.datetime is null
order by
    I.datetime asc
fetch first 3 rows only
;

-- MySQL
SELECT 
    I.NAME, I.DATETIME
FROM 
    ANIMAL_INS I
LEFT JOIN 
    ANIMAL_OUTS O 
    ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE 
    O.DATETIME IS NULL
ORDER BY 
    I.DATETIME ASC
LIMIT 3
;
