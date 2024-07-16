-- Oracle
SELECT
    B.title,
    B.board_id,
    R.reply_id,
    R.writer_id,
    R.contents,
    TO_CHAR(R.created_date, 'YYYY-MM-DD') AS created_date
FROM
    used_goods_board B,
    used_goods_reply R
WHERE
    B.board_id = R.board_id
    AND
    TO_CHAR(B.created_date, 'YYYY-MM') = '2022-10'
ORDER BY
    R.created_date ASC,
    B.title ASC
;

-- MySQL
SELECT
    B.TITLE,
    B.BOARD_ID,
    R.REPLY_ID,
    R.WRITER_ID,
    R.CONTENTS,
    DATE_FORMAT(R.CREATED_DATE, "%Y-%m-%d") AS CREATED_DATE
FROM
    USED_GOODS_BOARD B
    JOIN
        USED_GOODS_REPLY R
        ON B.BOARD_ID = R.BOARD_ID
WHERE
    B.CREATED_DATE
    LIKE "2022-10%"
ORDER BY
    R.CREATED_DATE ASC,
    B.TITLE ASC
;
    
    
    
