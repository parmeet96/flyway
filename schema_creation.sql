-- Run this script as SYSTEM user to create or reset the schema from scratch.

drop user flyway_demo_user cascade; -- drop existing user

create user flyway_demo_user identified by welcome1 DEFAULT TABLESPACE users TEMPORARY TABLESPACE temp; -- create user
grant all privileges to flyway_demo_user; -- grant privileges
