/* ユーザーマスタ */
MERGE INTO m_user (
	user_id,
	password,
	user_name,
	birthday,
	age,
	gender,
	department_id,
	role
)
KEY (user_id)
VALUES
		('system@example.co.jp','password','システム管理','2000-01-01',24,1,1,'ROLE_ADMIN'),
		('user1@example.co.jp','password','ユーザー','2000-01-01',24,2,2,'ROLE_GENERAL'),
		('user2@example.co.jp','password','ユーザー','2000-01-01',24,2,2,'ROLE_GENERAL'),
		('user3@example.co.jp','password','ユーザー','2000-01-01',24,2,2,'ROLE_GENERAL'),
		('user4@example.co.jp','password','ユーザー','2000-01-01',24,2,2,'ROLE_GENERAL'),
		('user5@example.co.jp','password','ユーザー','2000-01-01',24,2,2,'ROLE_GENERAL'),
		('user6@example.co.jp','password','ユーザー','2000-01-01',24,2,2,'ROLE_GENERAL'),
		('user7@example.co.jp','password','ユーザー','2000-01-01',24,2,2,'ROLE_GENERAL'),
		('user8@example.co.jp','password','ユーザー','2000-01-01',24,2,2,'ROLE_GENERAL'),
		('user9@example.co.jp','password','ユーザー','2000-01-01',24,2,2,'ROLE_GENERAL');
		
/* 部署マスタ */
MERGE INTO m_department (
	department_id,
	department_name
)
KEY (department_id)
VALUES
	(1,'システム管理部'),
	(2,'営業部');
	
/* 給料テーブル */
MERGE INTO t_salary (
	user_id,
	year_month,
	salary
)
KEY (user_id, year_month)
VALUES
	('user1@example.co.jp','2020/11',280000),
	('user1@example.co.jp','2020/12',290000),
	('user1@example.co.jp','2021/01',300000);
