-- 코드를 입력하세요
SELECT u.user_id, u.nickname, b.price as total_sales
from (select writer_id, sum(price) as price from used_goods_board where status = 'done' group by writer_id) b
join used_goods_user u on b.writer_id = u.user_id
where b.price >= 700000
group by u.user_id
order by total_sales asc;