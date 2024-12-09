-- Oracle
select 
    car_id,
    to_char(round(avg(end_date - start_date + 1), 1), 'FM9999990.0') as average_duration
from 
    car_rental_company_rental_history
group by 
    car_id
having 
    round(avg(end_date - start_date + 1), 1) >= 7
order by 
    round(avg(end_date - start_date + 1), 1) desc,
    car_id desc
;

-- MySQL
SELECT 
    CAR_ID,
    FORMAT(ROUND(AVG(DATEDIFF(END_DATE, START_DATE) + 1), 1), 1) AS AVERAGE_DURATION
FROM 
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY 
    CAR_ID
HAVING 
    ROUND(AVG(DATEDIFF(END_DATE, START_DATE) + 1), 1) >= 7
ORDER BY 
    ROUND(AVG(DATEDIFF(END_DATE, START_DATE) + 1), 1) DESC,
    CAR_ID DESC
;
