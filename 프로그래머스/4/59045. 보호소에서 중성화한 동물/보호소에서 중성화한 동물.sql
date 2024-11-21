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