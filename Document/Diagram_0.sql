/*
   Saturday, September 2, 20238:39:47 AM
   User: sa
   Server: DESKTOP-KJ1SU2P
   Database: COFFEESHOP_DA1
   Application: 
*/

/* To prevent any potential data loss issues, you should review this script in detail before running it outside the context of the database designer.*/
BEGIN TRANSACTION
SET QUOTED_IDENTIFIER ON
SET ARITHABORT ON
SET NUMERIC_ROUNDABORT OFF
SET CONCAT_NULL_YIELDS_NULL ON
SET ANSI_NULLS ON
SET ANSI_PADDING ON
SET ANSI_WARNINGS ON
COMMIT
BEGIN TRANSACTION
GO
ALTER TABLE dbo.TinTuc
	DROP CONSTRAINT FK_TinTuc_NhanVien
GO
ALTER TABLE dbo.NhanVien SET (LOCK_ESCALATION = TABLE)
GO
COMMIT
BEGIN TRANSACTION
GO
ALTER TABLE dbo.TinTuc
	DROP CONSTRAINT DF_TinTuc_Id
GO
ALTER TABLE dbo.TinTuc
	DROP CONSTRAINT DF_TinTuc_NgayTao
GO
CREATE TABLE dbo.Tmp_TinTuc
	(
	Id uniqueidentifier NOT NULL,
	TieuDe nvarchar(100) NULL,
	MoTa nvarchar(MAX) NULL,
	NoiDung nvarchar(MAX) NULL,
	IdNv uniqueidentifier NULL,
	NgayTao date NULL,
	HinhAnh image NULL
	)  ON [PRIMARY]
	 TEXTIMAGE_ON [PRIMARY]
GO
ALTER TABLE dbo.Tmp_TinTuc SET (LOCK_ESCALATION = TABLE)
GO
ALTER TABLE dbo.Tmp_TinTuc ADD CONSTRAINT
	DF_TinTuc_Id DEFAULT (newid()) FOR Id
GO
ALTER TABLE dbo.Tmp_TinTuc ADD CONSTRAINT
	DF_TinTuc_NgayTao DEFAULT (format(getdate(),'yyyy-MM-dd')) FOR NgayTao
GO
IF EXISTS(SELECT * FROM dbo.TinTuc)
	 EXEC('INSERT INTO dbo.Tmp_TinTuc (Id, TieuDe, MoTa, NoiDung, IdNv, NgayTao, HinhAnh)
		SELECT Id, TieuDe, CONVERT(nvarchar(MAX), MoTa), NoiDung, IdNv, NgayTao, HinhAnh FROM dbo.TinTuc WITH (HOLDLOCK TABLOCKX)')
GO
DROP TABLE dbo.TinTuc
GO
EXECUTE sp_rename N'dbo.Tmp_TinTuc', N'TinTuc', 'OBJECT' 
GO
ALTER TABLE dbo.TinTuc ADD CONSTRAINT
	PK_TinTuc PRIMARY KEY CLUSTERED 
	(
	Id
	) WITH( STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]

GO
ALTER TABLE dbo.TinTuc ADD CONSTRAINT
	FK_TinTuc_NhanVien FOREIGN KEY
	(
	IdNv
	) REFERENCES dbo.NhanVien
	(
	Id
	) ON UPDATE  NO ACTION 
	 ON DELETE  NO ACTION 
	
GO
COMMIT
