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