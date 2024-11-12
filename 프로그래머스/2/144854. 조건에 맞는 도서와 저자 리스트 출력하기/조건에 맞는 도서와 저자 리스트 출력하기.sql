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

-- MySQL
SELECT 
    B.BOOK_ID, 
    A.AUTHOR_NAME, 
    DATE_FORMAT(B.PUBLISHED_DATE, "%Y-%m-%d") AS PUBLISHED_DATE
FROM 
    BOOK B
    JOIN AUTHOR A 
    ON B.AUTHOR_ID = A.AUTHOR_ID
WHERE 
    B.CATEGORY LIKE "경제"
ORDER BY 
    B.PUBLISHED_DATE ASC
;
