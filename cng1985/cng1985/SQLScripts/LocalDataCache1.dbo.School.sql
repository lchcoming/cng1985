IF NOT EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[School]')) 
   ALTER TABLE [dbo].[School] 
   ENABLE  CHANGE_TRACKING
GO
