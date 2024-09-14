-- Oracle
select
    u.user_id, 
    u.nickname,
    sum(b.price) as total_sales
from
    used_goods_board b,
    used_goods_user u
where
    b.writer_id = u.user_id
    and b.status = 'DONE'
group by
    u.user_id,
    u.nickname
having
    sum(b.price) >= 700000
order by
    total_sales asc
;

-- MySQL
SELECT 
    U.USER_ID, 
    U.NICKNAME, 
    SUM(B.PRICE) AS TOTAL_SALES
FROM 
    USED_GOODS_BOARD B
JOIN 
    USED_GOODS_USER U 
    ON B.WRITER_ID = U.USER_ID
WHERE 
    B.STATUS = 'DONE'
GROUP BY 
    U.USER_ID
HAVING
    SUM(B.PRICE) >= 700000
ORDER BY
    TOTAL_SALES ASC
;
