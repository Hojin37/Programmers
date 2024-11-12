-- Oracle
select
    B.book_id,
    A.author_name,
    to_char(B.published_date, 'YYYY-MM-DD') as published_date
from
    book B,
    author A
where
    B.author_id = A.author_id
    and B.category = '경제'
order by
    B.published_date asc
;