-- Oracle
select
    floor(price/10000) * 10000 as price_group,
    count(*) as products
from
    product
group by
    floor(price/10000) * 10000
order by
    price_group
;

-- MySQL
SELECT 
    FLOOR(price / 10000) * 10000 AS PRICE_GROUP,
    COUNT(*) AS PRODUCTS
FROM 
    PRODUCT
GROUP BY 
    PRICE_GROUP
ORDER BY 
    PRICE_GROUP
;
