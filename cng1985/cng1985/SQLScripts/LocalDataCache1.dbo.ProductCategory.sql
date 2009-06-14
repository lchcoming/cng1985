IF NOT EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[ProductCategory]')) 
   ALTER TABLE [dbo].[ProductCategory] 
   ENABLE  CHANGE_TRACKING
GO
