-- 코드를 입력하세요
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