CREATE TABLE m_karyawan
(
  id serial NOT NULL,
  alamat character varying(255),
  keterangan text,
  nama character varying(100) NOT NULL,
  CONSTRAINT m_karyawan_pkey PRIMARY KEY (id)
);

