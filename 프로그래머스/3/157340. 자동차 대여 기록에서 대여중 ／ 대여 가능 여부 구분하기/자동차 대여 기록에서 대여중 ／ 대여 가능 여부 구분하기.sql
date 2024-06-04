-- 코드를 입력하세요
SELECT distinct car_id a, (case
when exists (select distinct car_id from car_rental_company_rental_history where a = car_id and date("2022-10-16") between start_date and end_date) then "대여중"
else "대여 가능" end) as availability
from car_rental_company_rental_history
order by car_id desc;