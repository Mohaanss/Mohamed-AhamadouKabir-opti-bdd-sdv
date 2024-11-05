CREATE MATERIALIZED VIEW IF NOT EXISTS task_count_per_project AS
SELECT projet_id, COUNT(task_id) AS task_count
FROM task
GROUP BY projet_id;
