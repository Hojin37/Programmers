-- Oracle
SELECT
    animal_id,
    name
FROM
    animal_ins
WHERE
    intake_condition != 'Aged'
ORDER BY
    animal_id ASC
;

-- MySQL
SELECT
    ANIMAL_ID,
    NAME
FROM
    ANIMAL_INS
WHERE
    INTAKE_CONDITION NOT LIKE 'Aged'
ORDER BY
    ANIMAL_ID ASC
;
