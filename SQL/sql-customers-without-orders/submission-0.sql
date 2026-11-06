-- Write your query below
Select name
From customers
Where id NOT IN (Select customer_id From orders);