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