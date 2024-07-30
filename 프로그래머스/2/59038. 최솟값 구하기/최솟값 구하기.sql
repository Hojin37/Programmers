-- Oracle
SELECT
    datetime AS 시간
FROM
    (SELECT *
     FROM animal_ins
     ORDER BY datetime ASC)
WHERE
    ROWNUM = 1
;

-- MySQL
SELECT 
    DATETIME AS '시간'
FROM
    ANIMAL_INS
ORDER BY
    DATETIME ASC
LIMIT 1
;
