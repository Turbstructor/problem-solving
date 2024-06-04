-- 코드를 입력하세요
SELECT year(o.sales_date) as year, month(o.sales_date) as month, u.gender, count(distinct u.user_id) as users
from online_sale o join USER_INFO u on o.user_id = u.user_id
where u.gender is not null
group by concat(date_format(o.sales_date, "%Y-%m"), "/", u.gender)
order by concat(date_format(o.sales_date, "%Y-%m"), "/", u.gender) asc;