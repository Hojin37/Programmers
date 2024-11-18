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