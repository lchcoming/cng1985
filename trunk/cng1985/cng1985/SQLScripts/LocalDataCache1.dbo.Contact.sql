IF NOT EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[Contact]')) 
   ALTER TABLE [dbo].[Contact] 
   ENABLE  CHANGE_TRACKING
GO
