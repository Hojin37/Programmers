-- Oracle
select 
    *
from
    car_rental_company_car
where
    options like '%네비게이션%'
order by
    car_id desc
;

-- MySQL
SELECT
   *
FROM
   CAR_RENTAL_COMPANY_CAR
WHERE
   OPTIONS LIKE "%네비게이션%"  
ORDER BY
   CAR_ID DESC
;
