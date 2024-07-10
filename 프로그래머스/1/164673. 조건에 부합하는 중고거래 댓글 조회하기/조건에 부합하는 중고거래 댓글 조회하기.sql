-- 코드를 입력하세요
SELECT
    B.TITLE,
    B.BOARD_ID,
    R.REPLY_ID,
    R.WRITER_ID,
    R.CONTENTS,
    TO_CHAR(R.CREATED_DATE, 'YYYY-MM-DD') AS CREATED_DATE
FROM
    used_goods_board B,
    used_goods_reply R
WHERE
    B.BOARD_ID = R.BOARD_ID
    AND
    TO_CHAR(B.created_date, 'YYYY-MM') = '2022-10'
ORDER BY
    R.created_date asc,
    B.title asc
;
    
    
    
    