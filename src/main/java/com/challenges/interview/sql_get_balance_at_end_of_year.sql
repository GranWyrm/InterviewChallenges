select sum(t.balance)
           - 5 * count(*) filter(where coalesce(t.cnt, 0) < 3 or coalesce(t.debit, 0) < 100) as balance
from generate_series(date '2020-01-01', date '2020-12-01', '1 month') as d(dt)
left join (
select date_trunc('month', date) as dt, count(*) cnt, sum(amount) as balance,
    sum(-amount) filter(where amount < 0) as debit
from transactions t
group by date_trunc('month', date)
    ) t on t.dt = d.dt

/*
this is to solve a postgres code test from codility.
You get a table with a transaction amount and a date, you need to calculate the balance at the end of the year.
taking into consideration that you need 3 transactions per month with a minimum accumulated amount of 100
this is in postgres db.
*/