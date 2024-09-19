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