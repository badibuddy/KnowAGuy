CREATE TABLE tbl_vendors(
  vendor_id SERIAL PRIMARY KEY,
  vendor_fname TEXT NOT NULL,
  vendor_lname TEXT NOT NULL,
  vendor_uname TEXT NOT NULL  UNIQUE,
  vendor_pass  TEXT NOT NULL,
  engaged BOOLEAN NOT NULL DEFAULT false,
  mobile_number BIGINT NOT NULL UNIQUE,
  service_category jsonb,
  description TEXT NOT NULL,
  date_added TIMESTAMP DEFAULT current_timestamp
);


CREATE TABLE tbl_clients(
  client_id SERIAL PRIMARY KEY,
  client_fname TEXT NOT NULL,
  client_lname TEXT NOT NULL,
  client_uname TEXT NOT NULL  UNIQUE,
  client_pass  TEXT NOT NULL,
  engaged BOOLEAN NOT NULL DEFAULT false,
  mobile_number BIGINT NOT NULL UNIQUE ,
  location TEXT NOT NULL,
  date_added TIMESTAMP DEFAULT current_timestamp
);


CREATE TABLE tbl_services(
  service_id SERIAL PRIMARY KEY,
  client_fk INTEGER REFERENCES tbl_clients(client_id),
  vendor_fk INTEGER REFERENCES tbl_vendors(vendor_id),
  service_name TEXT NOT NULL,
  start_date DATE DEFAULT current_date,
  end_date DATE,
  amount_charged  INTEGER NOT NULL,
  mode_of_payment TEXT ,
  initiated BOOLEAN NOT NULL DEFAULT true,
  payment_processed BOOLEAN NOT NULL DEFAULT false,
  date_added TIMESTAMP DEFAULT current_timestamp
);



