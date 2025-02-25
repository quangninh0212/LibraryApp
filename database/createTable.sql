
use  my_libary;

create table books (
	maSach varchar(15) primary key,
    tenSach varchar(255),
    tacGia varchar(255),
    nhaXuatBan varchar(255),
	soLuong int
);

ALTER TABLE books
ADD CONSTRAINT CHECK_SL1 CHECK (soLuong >= 0);

create table people (
	maDG varchar(15) primary key,
    hoTen varchar(255),
    gioiTinh varchar(255),
    ngaySinh date,
    doiTuong varchar(255)
);

create table borrow (
	maMuon int auto_increment primary key,
    maDG varchar(15),
    maSach varchar(15),
    ngayMuon date,
    soLuong int,
    tinhTrang int,
    foreign key(maDG) references people(maDG),
	foreign key(maSach) references books(maSach)
);

create table users (
	userID int auto_increment primary key,
    tenDangNhap varchar(25) unique not null,
    matKhau varchar(25) not null,
    vaiTro varchar(25) not null
);

ALTER TABLE people ADD COLUMN userID INT UNIQUE;
ALTER TABLE people ADD FOREIGN KEY (userID) REFERENCES users(userID);

CREATE TABLE request_borrow (
    requestID INT AUTO_INCREMENT PRIMARY KEY,
    maDG VARCHAR(15),
    maSach VARCHAR(15),
    ngayYeuCau DATE DEFAULT (CURRENT_DATE),
    status VARCHAR(15) DEFAULT 'pending',
    FOREIGN KEY (maDG) REFERENCES people(maDG),
    FOREIGN KEY (maSach) REFERENCES books(maSach)
);

ALTER TABLE borrow ADD COLUMN requestID INT;
ALTER TABLE borrow ADD FOREIGN KEY (requestID) REFERENCES request_borrow(requestID);

CREATE TABLE librarians (
    librarianID INT AUTO_INCREMENT PRIMARY KEY,
    userID INT UNIQUE,
    hoTen VARCHAR(255),
    FOREIGN KEY (userID) REFERENCES users(userID)
);


ALTER TABLE borrow ADD COLUMN ngayHenTra DATE;
ALTER TABLE borrow ADD COLUMN ngayTraThucTe DATE;

insert into users(tenDangNhap, matKhau, vaiTro) values ("admin", "admin", "Admin");
insert into people(maDG, userID) values ("admin", 1);

ALTER TABLE borrow MODIFY COLUMN requestID INT NULL;
