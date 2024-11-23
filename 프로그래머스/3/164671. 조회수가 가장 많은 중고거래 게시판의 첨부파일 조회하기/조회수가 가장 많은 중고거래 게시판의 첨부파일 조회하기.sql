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