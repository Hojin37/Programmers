-- Oracle
select
    I.animal_id,
    I.name
from
    animal_ins I,
    animal_outs O
where
    I.animal_id = O.animal_id
order by
    O.datetime - I.datetime desc
offset 0 rows fetch next 2 rows only
;