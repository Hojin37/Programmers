-- Oracle
select
    p.product_code,
    p.price * sum(o.sales_amount) as sales
from 
    product p, offline_sale o
where 
    p.product_id = o.product_id
group by
    p.product_code,
    p.price
order by 
    sales desc, 
    p.product_code asc
;

-- MySQL
SELECT 
    P.PRODUCT_CODE,
    (SUM(O.SALES_AMOUNT) * P.PRICE) AS SALES
FROM 
    PRODUCT P
JOIN 
    OFFLINE_SALE O ON P.PRODUCT_ID = O.PRODUCT_ID
GROUP BY 
    P.PRODUCT_CODE, 
    P.PRICE
ORDER BY 
    SALES DESC, 
    P.PRODUCT_CODE ASC
;
