-- Oracle
select
    u.user_id,
    u.nickname,
    u.city || ' ' || u.street_address1 || ' ' || u.street_address2 as 전체주소,
    substr(u.tlno, 1, 3) || '-' || substr(u.tlno, 4, 4) || '-' || substr(u.tlno, 8, 4) as 전화번호
from 
    used_goods_user u
join
    used_goods_board b
    on u.user_id = b.writer_id
group by
    u.user_id,
    u.nickname,
    u.city,
    u.street_address1,
    u.street_address2,
    u.tlno
having
    count(b.writer_id) > 2
order by
    u.user_id desc
;
