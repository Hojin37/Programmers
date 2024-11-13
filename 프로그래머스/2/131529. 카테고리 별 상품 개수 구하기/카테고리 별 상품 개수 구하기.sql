-- Oracle
select
    substr(product_code, 1, 2) as category, 
    count(product_code) as products
from
    product
group by
    substr(product_code, 1, 2)
order by
    substr(product_code, 1, 2) asc
;

-- MySQL
SELECT 
    LEFT(PRODUCT_CODE, 2) AS CATEGORY, 
    COUNT(PRODUCT_CODE) AS PRODUCTS
FROM 
    PRODUCT
GROUP BY 
    LEFT(PRODUCT_CODE, 2)
ORDER BY 
    LEFT(PRODUCT_CODE, 2) ASC
;
