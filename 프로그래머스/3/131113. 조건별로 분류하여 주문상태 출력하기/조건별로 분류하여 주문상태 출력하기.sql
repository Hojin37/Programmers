-- Oracle
select 
    order_id, 
    product_id, 
    to_char(out_date, 'yyyy-mm-dd') as out_date,
    case
       when out_date is null then '출고미정'
       when out_date <= to_date('2022-05-01', 'yyyy-mm-dd') then '출고완료'
       else '출고대기'
    end as 출고여부
from (
    select 
        order_id, 
        product_id, 
        out_date
    from 
        food_order
    ) sub
order by 
    order_id asc
;

-- MySQL
SELECT 
    ORDER_ID, 
    PRODUCT_ID, 
    OUT_DATE, 
    CASE
       WHEN OUT_DATE IS NULL THEN '출고미정'
       WHEN OUT_DATE <= '2022-05-01' THEN '출고완료'
       ELSE '출고대기'
   END AS 출고여부
FROM (
    SELECT 
        ORDER_ID, 
        PRODUCT_ID, 
        DATE_FORMAT(OUT_DATE, "%Y-%m-%d") AS OUT_DATE
    FROM 
        FOOD_ORDER
    ) AS sub
ORDER BY 
    ORDER_ID ASC
;
