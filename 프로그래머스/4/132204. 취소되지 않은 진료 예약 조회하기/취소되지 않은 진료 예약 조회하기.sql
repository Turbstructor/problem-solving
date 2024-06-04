-- 코드를 입력하세요
SELECT a.apnt_no, p.pt_name, p.pt_no, d.mcdp_cd, d.dr_name, a.apnt_ymd from appointment a
join doctor d on d.dr_id = a.mddr_id
join patient p on p.pt_no = a.pt_no
where date_format(apnt_ymd, "%Y-%m-%d") = "2022-04-13" and a.apnt_cncl_yn = 'N'
order by apnt_ymd asc;