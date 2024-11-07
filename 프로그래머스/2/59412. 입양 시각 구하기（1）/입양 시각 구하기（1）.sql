-- Oracle
select 
    to_number(to_char(datetime, 'hh24')) as hour,
    count(*) as count
from
    animal_outs
where
    to_char(datetime, 'hh24') between '09' and '19'
group by
    to_number(to_char(datetime, 'hh24'))
order by
    to_number(to_char(datetime, 'hh24'))
;

-- MySQL
SELECT 
    DATE_FORMAT(DATETIME, "%H") AS HOUR, 
    COUNT(*) AS COUNT
FROM 
    ANIMAL_OUTS
WHERE 
    DATE_FORMAT(DATETIME, "%H") BETWEEN 09 AND 19
GROUP BY 
    DATE_FORMAT(DATETIME, "%H")
ORDER BY 
    DATE_FORMAT(DATETIME, "%H")
;
