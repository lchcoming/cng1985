IF NOT EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[Department]')) 
   ALTER TABLE [dbo].[Department] 
   ENABLE  CHANGE_TRACKING
GO
