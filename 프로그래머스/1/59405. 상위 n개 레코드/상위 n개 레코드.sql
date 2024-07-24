-- Oracle
SELECT
    name
FROM
    (SELECT *
     FROM animal_ins
     ORDER BY datetime ASC)
WHERE 
    ROWNUM < 2
;