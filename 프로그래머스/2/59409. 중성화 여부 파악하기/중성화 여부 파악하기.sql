-- Oracle
select
    animal_id,
    name,
    case 
        when sex_upon_intake like '%Neutered%' then 'O'
        when sex_upon_intake like '%Spayed%' then 'O'
        else 'X' 
    end as sex_upon_intake
from
    animal_ins
order by
    animal_id asc
;

-- MySQL
SELECT 
    ANIMAL_ID, 
    NAME, 
    IF(SEX_UPON_INTAKE LIKE "%Neutered%" OR SEX_UPON_INTAKE LIKE "Spayed%", "O", "X") AS 중성화
FROM 
    ANIMAL_INS
ORDER BY 
    ANIMAL_ID ASC
;
