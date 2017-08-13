create database Candidate 


	private String majors;
	private String semester;
	private String universityName;

-- CANDIDATE---

CREATE TABLE CANDIDATE
(
canID INT IDENTITY(1,1)
CONSTRAINT pk_candidate
PRIMARY KEY(canID),
candidateID NVARCHAR(10)  NULL,
fullName NVARCHAR(60) NULL,
birthDate NVARCHAR(30) NULL,
phone NVARCHAR(60) NULL,
email NVARCHAR(60) NULL,
candidateType NVARCHAR(60) NULL
)





-- InternCandidate--
CREATE TABLE InternCandidate
(
internID INT IDENTITY(1,1)
CONSTRAINT pk_intern
PRIMARY KEY(internID),
majors NVARCHAR(50) NULL,
semester NVARCHAR(50) NULL,
universityName NVARCHAR(50) NULL
)


CREATE TABLE mathang
(
mahang NVARCHAR(10) NOT NULL
CONSTRAINT pk_mathang
PRIMARY KEY(mahang),
tenhang NVARCHAR(50) NOT NULL,
macongty NVARCHAR(10) NULL ,
maloaihang INT NULL ,
soluong INT NULL,
donvitinh NVARCHAR(20) NULL ,
giahang MONEY NULL
)
CREATE TABLE nhanvien
(
manhanvien NVARCHAR(10) NOT NULL
CONSTRAINT pk_nhanvien
PRIMARY KEY(manhanvien),
ho NVARCHAR(20) NOT NULL ,
ten NVARCHAR(10) NOT NULL ,
ngaysinh DATETIME NULL ,
ngaylamviec DATETIME NULL ,
diachi NVARCHAR(50) NULL ,
dienthoai NVARCHAR(15) NULL ,
luongcoban MONEY NULL ,
phucap MONEY NULL
)
CREATE TABLE khachhang
(
makhachhang NVARCHAR(10) NOT NULL
CONSTRAINT pk_khachhang
PRIMARY KEY(makhachhang),
tencongty NVARCHAR(50) NOT NULL ,
tengiaodich NVARCHAR(30) NOT NULL ,
diachi NVARCHAR(50) NULL ,
email NVARCHAR(30) NULL ,
dienthoai NVARCHAR(15) NULL ,
fax NVARCHAR(15) NULL
)
CREATE TABLE dondathang
(
sohoadon INT NOT NULL
CONSTRAINT pk_dondathang
PRIMARY KEY(sohoadon),
makhachhang NVARCHAR(10) NULL ,
manhanvien NVARCHAR(10) NULL ,
ngaydathang SMALLDATETIME NULL ,
ngaygiaohang SMALLDATETIME NULL ,
ngaychuyenhang SMALLDATETIME NULL ,
noigiaohang NVARCHAR(50) NULL
)
CREATE TABLE chitietdathang
(
sohoadon INT NOT NULL ,
mahang NVARCHAR(10) NOT NULL ,
giaban MONEY NOT NULL ,
soluong SMALLINT NOT NULL ,
mucgiamgia REAL NOT NULL,
CONSTRAINT pk_chitietdathang
PRIMARY KEY(sohoadon,mahang)
)
ALTER TABLE mathang
ADD
CONSTRAINT fk_mathang_loaihang
FOREIGN KEY (maloaihang)
REFERENCES loaihang(maloaihang)
ON DELETE CASCADE ON UPDATE CASCADE ,
CONSTRAINT fk_mathang_nhacungcap
FOREIGN KEY (macongty)
REFERENCES nhacungcap(macongty)
ON DELETE CASCADE ON UPDATE CASCADE
ALTER TABLE dondathang
ADD
CONSTRAINT fk_dondathang_khachhang
FOREIGN KEY (makhachhang)
REFERENCES khachhang(makhachhang)
ON DELETE CASCADE ON UPDATE CASCADE ,
CONSTRAINT fk_dondathang_nhanvien
FOREIGN KEY (manhanvien)
REFERENCES nhanvien(manhanvien)
ON DELETE CASCADE ON UPDATE CASCADE
ALTER TABLE chitietdathang
ADD
CONSTRAINT fk_chitiet_dondathang
FOREIGN KEY (sohoadon)
REFERENCES dondathang(sohoadon)
ON DELETE CASCADE ON UPDATE CASCADE ,
CONSTRAINT fk_chitiet_mathang
FOREIGN KEY (mahang)
REFERENCES mathang(mahang)
ON DELETE CASCADE ON UPDATE CASCADE
