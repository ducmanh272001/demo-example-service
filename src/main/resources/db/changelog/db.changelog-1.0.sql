CREATE TABLE group_services
(
    id           serial PRIMARY KEY,
    code         varchar(255),
    name         varchar(255),
    alias        varchar(250),
    image_url    text,
    desription   text,
    is_active bool default FALSE NOT NULL,
    created_at   timestamp,
    deleted_at   timestamp,
    updated_at   timestamp,
    updated_by   int,
    created_by   int,
    deleted_by   int
);

CREATE TABLE services
(
    id           serial PRIMARY KEY,
    code         varchar(50),
    name         varchar(255),
    alias        varchar(250),
    group_service_id bigint,
    image_url text,
    partner_code varchar(50),
    price float,
    desription text,
    created_at   timestamp,
    deleted_at   timestamp,
    updated_at   timestamp,
    updated_by   int,
    created_by   int,
    deleted_by   int,
    FOREIGN KEY (group_service_id) REFERENCES group_services (id)
);