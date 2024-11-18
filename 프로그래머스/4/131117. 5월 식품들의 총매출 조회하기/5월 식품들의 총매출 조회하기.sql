-- Oracle
select
    P.product_id as "PRODUCT_ID",
    P.product_name as "PRODUCT_NAME",
    sum(P.price * O.amount) as "TOTAL_SALES"
from
    food_product P,
    food_order O
where
    P.product_id = O.product_id
    and to_char(O.produce_date, 'YYYY-MM') = '2022-05'
group by
    P.product_id,
    P.product_name
order by
    TOTAL_SALES desc,
    P.product_id asc
;

-- MySQL
SELECT 
    P.PRODUCT_ID, 
    P.PRODUCT_NAME, 
    SUM(P.PRICE * O.AMOUNT) AS TOTAL_SALES
FROM 
    FOOD_PRODUCT P
JOIN 
    FOOD_ORDER O
    ON P.PRODUCT_ID = O.PRODUCT_ID
WHERE
    O.PRODUCE_DATE LIKE '2022-05%'
GROUP BY 
    P.PRODUCT_ID
ORDER BY
    TOTAL_SALES DESC,
    PRODUCT_ID ASC
;
