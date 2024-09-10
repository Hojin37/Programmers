-- Oracle
select
    i.ingredient_type,
    sum(f.total_order) as total_order
from    
    first_half f,
    icecream_info i
where
    f.flavor = i.flavor
group by
    i.ingredient_type
order by
    sum(f.total_order) asc
;

-- MySQL
SELECT 
    I.INGREDIENT_TYPE, 
    SUM(F.TOTAL_ORDER) AS TOTAL_ORDER
FROM 
    ICECREAM_INFO I
JOIN 
    FIRST_HALF F 
    ON I.FLAVOR = F.FLAVOR
GROUP BY 
    I.INGREDIENT_TYPE
ORDER BY 
    SUM(F.TOTAL_ORDER) ASC
;
