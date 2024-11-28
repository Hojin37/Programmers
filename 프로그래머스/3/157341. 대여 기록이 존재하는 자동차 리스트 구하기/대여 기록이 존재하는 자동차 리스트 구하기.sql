-- Oracle
select 
    distinct(c.car_id)
from 
    car_rental_company_car c,
    car_rental_company_rental_history h
where 
    c.car_id = h.car_id
    and c.car_type = '세단'
    and to_char(h.start_date, 'YYYY-MM') = '2022-10'
order by 
    c.car_id desc
;
