-- 코드를 입력하세요
select author_id, author_name, category, sum(sales) from (
    SELECT a.author_id, a.author_name, b.category, sum(b.price * s.sales) as sales
    from book b
    join (select * from book_sales where date_format(sales_date, "%Y-%m") = "2022-01") as s on s.book_id = b.book_id
    join author a on b.author_id = a.author_id
    
    group by b.book_id
    ) as sub
group by author_id, category
order by author_id asc, category desc;