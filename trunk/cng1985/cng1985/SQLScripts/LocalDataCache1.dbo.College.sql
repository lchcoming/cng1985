IF NOT EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[College]')) 
   ALTER TABLE [dbo].[College] 
   ENABLE  CHANGE_TRACKING
GO
