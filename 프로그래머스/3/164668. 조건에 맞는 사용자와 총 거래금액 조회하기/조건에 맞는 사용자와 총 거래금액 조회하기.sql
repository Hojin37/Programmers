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
