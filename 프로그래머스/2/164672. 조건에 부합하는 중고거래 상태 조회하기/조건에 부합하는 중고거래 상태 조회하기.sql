-- Oracle
select
    board_id,
    writer_id,
    title,
    price,
    case 
        when status = 'DONE' then '거래완료'
        when status = 'RESERVED' then '예약중'
        else '판매중' end
    as "status"
from
    used_goods_board
where
    created_date =  to_date('2022-10-05', 'YYYY-MM-DD') 
order by
    board_id desc
;

-- MySQL
SELECT
    BOARD_ID,
    WRITER_ID,
    TITLE,
    PRICE,
    CASE
        WHEN STATUS = 'DONE' THEN '거래완료'
        WHEN STATUS = 'RESERVED' THEN '예약중'
        ELSE '판매중' END
    AS STATUS
FROM
    USED_GOODS_BOARD
WHERE
    CREATED_DATE = '2022-10-05'
ORDER BY
    BOARD_ID DESC
;



