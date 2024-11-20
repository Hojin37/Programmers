-- Oracle
select
    I.name,
    I.datetime
from
    animal_ins I
left join
    animal_outs O
    on I.animal_id = O.animal_id
where    
    O.datetime is null
order by
    I.datetime asc
fetch first 3 rows only
;