-- Oracle
select
    animal_id,
    name,
    to_char(datetime, 'YYYY-MM-DD') as 날짜
from
    animal_ins
order by
    animal_id asc
;

-- MySQL
SELECT 
    ANIMAL_ID, 
    NAME, 
    DATE_FORMAT(DATETIME, "%Y-%m-%d")
FROM 
    ANIMAL_INS
ORDER BY 
    ANIMAL_ID
;
