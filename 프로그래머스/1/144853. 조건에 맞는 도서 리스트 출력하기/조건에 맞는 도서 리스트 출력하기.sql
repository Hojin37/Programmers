-- 코드를 입력하세요
SELECT
    BOOK_ID,
    TO_CHAR(published_date, 'YYYY-MM-DD') AS PUBLISHED_DATE
FROM
    book
WHERE
    category LIKE '인문'
    AND
    TO_CHAR(published_date, 'YYYY') = '2021'
ORDER BY
    published_date asc
;