-- Oracle
SELECT
    datetime AS 시간
FROM
    (SELECT *
     FROM animal_ins
     ORDER BY datetime DESC)
WHERE
    ROWNUM = 1
;