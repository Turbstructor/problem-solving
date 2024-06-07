-- 코드를 입력하세요
select flavor from
(SELECT * from first_half union select * from july) as until_july
group by flavor
order by sum(total_order) desc limit 3;