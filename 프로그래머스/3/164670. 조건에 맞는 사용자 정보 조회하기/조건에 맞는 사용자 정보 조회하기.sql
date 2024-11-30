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

-- MySQL
SELECT
    U.USER_ID,
    U.NICKNAME,
    CONCAT(U.CITY, ' ', U.STREET_ADDRESS1, ' ', U.STREET_ADDRESS2) AS '전체주소',
    CONCAT(SUBSTRING(TLNO, 1, 3), '-', SUBSTRING(TLNO, 4, 4), '-', SUBSTRING(TLNO, 8, 4)) AS '전화번호'
FROM 
    USED_GOODS_USER U
JOIN
    USED_GOODS_BOARD B
    ON U.USER_ID = B.WRITER_ID
GROUP BY
    U.USER_ID,
    U.NICKNAME,
    U.CITY,
    U.STREET_ADDRESS1,
    U.STREET_ADDRESS2,
    U.TLNO
HAVING
    COUNT(B.WRITER_ID) > 2
ORDER BY
    U.USER_ID DESC
;
