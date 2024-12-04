-- Oracle
select
    car_id,
    case 
        when max(
            case 
                when to_date('2022-10-16', 'yyyy-mm-dd') between start_date and end_date then 1 
            else 0 
            end
        ) = 1 then '대여중'
        else '대여 가능'
    end as availability
from
    car_rental_company_rental_history
group by
    car_id
order by
    car_id desc
;

-- MySQL
SELECT
    CAR_ID,
    CASE 
        WHEN MAX(
            CASE 
                WHEN '2022-10-16' BETWEEN START_DATE AND END_DATE THEN 1
                ELSE 0
            END
        ) = 1 THEN '대여중'
        ELSE '대여 가능'
    END AS "AVAILABILITY"
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY
    CAR_ID
ORDER BY
    CAR_ID DESC
;
