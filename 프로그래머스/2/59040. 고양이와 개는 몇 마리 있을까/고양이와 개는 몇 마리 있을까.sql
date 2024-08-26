-- Oracle
SELECT
    animal_type,
    count(*) as count
FROM
    animal_ins
GROUP BY
    animal_type
ORDER BY
    animal_type
;

-- MySQL
SELECT
    ANIMAL_TYPE,
    COUNT(*) AS COUNT
FROM
    ANIMAL_INS
GROUP BY
    ANIMAL_TYPE
ORDER BY
    ANIMAL_TYPE
;
