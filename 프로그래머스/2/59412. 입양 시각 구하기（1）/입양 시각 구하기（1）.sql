-- Oracle
select 
    to_number(to_char(datetime, 'hh24')) as hour,
    count(*) as count
from
    animal_outs
where
    to_char(datetime, 'hh24') between '09' and '19'
group by
    to_number(to_char(datetime, 'hh24'))
order by
    to_number(to_char(datetime, 'hh24'))
;