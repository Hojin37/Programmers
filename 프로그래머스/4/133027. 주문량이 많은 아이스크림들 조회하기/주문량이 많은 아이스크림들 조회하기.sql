-- Oracle
select 
    flavor
from 
    (select flavor
    from first_half
    join july using(flavor)
    group by flavor
    order by sum(first_half.total_order) + sum(july.total_order) desc
    )
where 
    rownum <= 3
;
