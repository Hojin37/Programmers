-- Oracle
SELECT
    animal_id,
    name
FROM
    animal_ins
WHERE
    intake_condition = 'Sick'
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
    INTAKE_CONDITION LIKE 'SICK'
ORDER BY
    ANIMAL_ID ASC
;
