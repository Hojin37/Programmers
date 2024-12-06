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
