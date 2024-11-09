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

-- MySQL
SELECT 
    I.FOOD_TYPE,
    I.REST_ID,
    I.REST_NAME,
    I.FAVORITES
FROM 
    REST_INFO I
JOIN
    (SELECT FOOD_TYPE, 
        MAX(FAVORITES) AS MAX_FAVOR
    FROM REST_INFO
    GROUP BY FOOD_TYPE) AS F
    ON I.FOOD_TYPE = F.FOOD_TYPE
    AND I.FAVORITES = F.MAX_FAVOR
ORDER BY 
    I.FOOD_TYPE DESC
;
