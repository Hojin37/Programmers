-- Oracle
select 
    i.food_type,
    i.rest_id,
    i.rest_name,
    i.favorites
from 
    rest_info i
where 
    i.favorites = (
        select max(favorites)
        from rest_info
        where food_type = i.food_type
        )
order by 
    i.food_type desc
;