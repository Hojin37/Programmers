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

-- MySQL
SELECT
    NAME
FROM
    ANIMAL_INS
ORDER BY
    DATETIME ASC
LIMIT 1
;
