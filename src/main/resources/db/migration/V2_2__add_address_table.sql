create table address (
    id number(20) primary key,
    employee_id constraint fk_adr_emp references employee(id),
    line1 varchar2(100),
    line2 varchar2(100),
    city varchar2(100),
    county varchar2(100),
    state varchar2(100),
    country varchar2(100),
    pin varchar2(100)
)