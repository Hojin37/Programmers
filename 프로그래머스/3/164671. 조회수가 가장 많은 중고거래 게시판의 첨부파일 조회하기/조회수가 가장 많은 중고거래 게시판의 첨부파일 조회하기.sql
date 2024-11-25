-- Oracle
select
    '/home/grep/src/' || F.board_id || '/' || F.file_id || F.file_name || F.file_ext as "FILE_PATH"
from
    used_goods_board B
join used_goods_file F
    on B.board_id = F.board_id
where 
    B.views = (select max(views) 
               from used_goods_board)
group by
    B.board_id,
    F.board_id,
    F.file_id,
    F.file_name,
    F.file_ext
order by
    F.file_id desc
;

-- MySQL
SELECT
    CONCAT("/home/grep/src/",
           F.BOARD_ID,
           "/",
           F.FILE_ID,
           F.FILE_NAME,
           F.FILE_EXT) AS FILE_PATH
FROM
    USED_GOODS_BOARD B
JOIN
    USED_GOODS_FILE F
    ON B.BOARD_ID = F.BOARD_ID
WHERE 
    B.VIEWS = (SELECT MAX(VIEWS) 
            FROM USED_GOODS_BOARD)
GROUP BY
    B.BOARD_ID,
    F.BOARD_ID,
    F.FILE_ID,
    F.FILE_NAME,
    F.FILE_EXT
ORDER BY
    F.FILE_ID DESC
;
