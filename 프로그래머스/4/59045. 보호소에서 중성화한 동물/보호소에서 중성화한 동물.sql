-- Oracle
select
    I.animal_id,
    I.animal_type,
    I.name
from
    animal_ins I,
    animal_outs O
where
    I.animal_id = O.animal_id
    and I.sex_upon_intake like 'Intact%'
    and (O.sex_upon_outcome like 'Spayed%'
        or O.sex_upon_outcome like 'Neutered%')
order by
    1 asc
;

-- MySQL
SELECT 
    I.ANIMAL_ID, 
    I.ANIMAL_TYPE, 
    I.NAME
FROM 
    ANIMAL_INS I
JOIN 
    ANIMAL_OUTS O 
    ON I.ANIMAL_ID = O.ANIMAL_ID
WHERE 
    I.SEX_UPON_INTAKE LIKE "Intact%"
    AND (O.SEX_UPON_OUTCOME LIKE "Spayed%"
        OR O.SEX_UPON_OUTCOME LIKE "Neutered%")
ORDER BY 
    I.ANIMAL_ID ASC
;
