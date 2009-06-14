-- 此代码可以用于在数据库内禁用更改跟踪
-- 请确保在执行此代码之前所有表都已停止使用更改跟踪
    
IF EXISTS (SELECT * FROM sys.change_tracking_databases WHERE database_id = DB_ID(N'WORK')) 
  ALTER DATABASE [E:\SOURCE\CNG1985\CNG1985\DATA\WORK.MDF] 
  SET  CHANGE_TRACKING = OFF
GO
