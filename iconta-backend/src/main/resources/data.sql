delete from user_roles;
delete from roles;
delete from users;
insert into roles (id, name) values(1, 'ROLE_ADMIN');
insert into users (id, email, name, password, username) values(1,'admin@teste.com','admin','$2a$10$Bd1oc2wcyOSD0YxgpdOcTuU2IAmmjpWZJug41uN2raQE.fegzIIVK','admin');
insert into user_roles (user_id, role_id) values(1,1);