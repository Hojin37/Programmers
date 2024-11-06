-- Oracle
select
    p.category, 
    p.price, 
    p.product_name
from
    food_product p
join
    (select category, 
            max(price) as max_price
     from food_product
     where category in ('과자', '국', '김치', '식용유')
     group by category
    ) max_p
    on p.category = max_p.category 
    and p.price = max_p.max_price
order by
    p.price desc
;

-- MySQL
SELECT
    P.CATEGORY, 
    P.PRICE, 
    P.PRODUCT_NAME
FROM
    FOOD_PRODUCT P
JOIN
    (SELECT CATEGORY, 
     MAX(PRICE) AS MAX_PRICE
     FROM FOOD_PRODUCT
     WHERE CATEGORY IN ('과자', '국', '김치', '식용유')
     GROUP BY CATEGORY) 
     AS MAX_P
    ON P.CATEGORY = MAX_P.CATEGORY 
    AND P.PRICE = MAX_P.MAX_PRICE
ORDER BY
    P.PRICE DESC
;
