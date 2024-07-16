-- Oracle
SELECT
    book_id,
    TO_CHAR(published_date, 'YYYY-MM-DD') AS published_date
FROM
    book
WHERE
    category LIKE '인문'
    AND TO_CHAR(published_date, 'YYYY') = '2021'
ORDER BY
    published_date ASC
;

-- MySQL
SELECT 
    BOOK_ID, 
    DATE_FORMAT(PUBLISHED_DATE, "%Y-%m-%d") AS PUBLISHED_DATE
FROM 
    BOOK
WHERE 
    CATEGORY LIKE '인문'
    AND PUBLISHED_DATE LIKE "%2021%"
ORDER BY 
    PUBLISHED_DATE ASC
;
