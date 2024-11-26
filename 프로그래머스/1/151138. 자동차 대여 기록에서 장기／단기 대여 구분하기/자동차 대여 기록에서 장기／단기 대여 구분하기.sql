-- Oracle
select
    history_id,
    car_id,
    to_char(start_date, 'YYYY-MM-DD') as "START_DATE",
    to_char(end_date, 'YYYY-MM-DD') as "END_DATE",
    case when end_date - start_date >= 29 then '장기 대여'
         else '단기 대여' 
         end as "RENT_TYPE"
from
    car_rental_company_rental_history
where
    to_char(start_date, 'YYYY-MM') = '2022-09'
order by
    history_id desc
;

-- MySQL
SELECT
    HISTORY_ID,
    CAR_ID,
    DATE_FORMAT(START_DATE, "%Y-%m-%d") AS START_DATE,
    DATE_FORMAT(END_DATE, "%Y-%m-%d") AS END_DATE,
    CASE WHEN DATEDIFF(END_DATE, START_DATE)+1 >= 30 THEN '장기 대여'
    ELSE '단기 대여'
    END AS RENT_TYPE
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE
    DATE_FORMAT(START_DATE, '%Y-%m') = '2022-09'
ORDER BY
    HISTORY_ID DESC
;
