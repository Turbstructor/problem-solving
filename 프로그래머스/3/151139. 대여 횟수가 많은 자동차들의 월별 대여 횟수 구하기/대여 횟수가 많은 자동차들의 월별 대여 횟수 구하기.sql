-- 코드를 입력하세요
with monthly_history as (
    select month(start_date) as month, car_id, count(history_id) as records from car_rental_company_rental_history
    where date_format(start_date, "%Y-%m") between "2022-08" and "2022-10"
    group by car_id, month
    )
select month, car_id, records from monthly_history
where car_id in (
    select car_id from monthly_history
    group by car_id having sum(records) >= 5
)
order by month asc, car_id desc;
