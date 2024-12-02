-- Oracle
select 
    flavor
from 
    (select flavor
    from first_half
    join july using(flavor)
    group by flavor
    order by sum(first_half.total_order) + sum(july.total_order) desc
    )
where 
    rownum <= 3
;

-- MySQL
SELECT
    F.FLAVOR
FROM
    FIRST_HALF F
JOIN
    JULY J
    ON F.FLAVOR= J.FLAVOR
GROUP BY
    F.FLAVOR
ORDER BY
    SUM(F.TOTAL_ORDER) + SUM(J.SHIPMENT_ID) DESC
LIMIT 3
;
    
