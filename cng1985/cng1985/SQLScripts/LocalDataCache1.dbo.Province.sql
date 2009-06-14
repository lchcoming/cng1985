IF NOT EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[Province]')) 
   ALTER TABLE [dbo].[Province] 
   ENABLE  CHANGE_TRACKING
GO
