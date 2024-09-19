-- Oracle
select
    b.category,
    sum(s.sales) as total_sales
from
    book b,
    book_sales s
where
    b.book_id = s.book_id
    and to_char(s.sales_date, 'YYYY-MM') like '2022-01'
group by
    b.category
order by
    b.category asc
;

-- MySQL
SELECT 
    B.CATEGORY, 
    SUM(S.SALES) AS TOTAL_SALES
FROM 
    BOOK B
JOIN 
    BOOK_SALES S 
    ON B.BOOK_ID = S.BOOK_ID
WHERE 
    SALES_DATE LIKE "2022-01%"
GROUP BY 
    CATEGORY
ORDER BY 
    CATEGORY ASC
;
