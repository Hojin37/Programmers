-- Oracle
select
    A.author_id,
    A.author_name,
    BS.category,
    sum(BS.book_total_sales) as total_sales
from
    (select 
        B.book_id,
        B.author_id,
        B.category,
        S.sales_date,
        sum(S.sales * B.price) as book_total_sales
    from 
        book B, 
        book_sales S
    where 
        B.book_id = S.book_id
    group by
        B.book_id,
        B.author_id,
        B.category,
        S.sales_date) BS,
    author A
where
    BS.author_id = A.author_id
    and BS.sales_date 
        between to_date('2022-01-01', 'yyyy-mm-dd') and to_date('2022-01-31', 'yyyy-mm-dd')
group by
    A.author_id,
    A.author_name,
    BS.category
order by
    1 asc,
    3 desc
;

-- MySQL
SELECT
    A.AUTHOR_ID,
    A.AUTHOR_NAME,
    BS.CATEGORY,
    SUM(BS.BOOK_TOTAL_SALES) AS TOTAL_SALES
FROM
    (SELECT
        B.BOOK_ID,
        B.AUTHOR_ID,
        B.CATEGORY,
        S.SALES_DATE,
        SUM(S.SALES * B.PRICE) AS BOOK_TOTAL_SALES
    FROM 
        BOOK B, 
        BOOK_SALES S
    WHERE 
        B.BOOK_ID = S.BOOK_ID
    GROUP BY
        B.BOOK_ID,
        B.AUTHOR_ID,
        B.CATEGORY,
        S.SALES_DATE) BS
JOIN
    AUTHOR A
    ON BS.AUTHOR_ID = A.AUTHOR_ID
WHERE
    BS.SALES_DATE LIKE '2022-01%'
GROUP BY
    A.AUTHOR_ID,
    A.AUTHOR_NAME,
    BS.CATEGORY
ORDER BY
    1 ASC,
    3 DESC
;
