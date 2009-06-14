IF EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[Contact]')) 
   ALTER TABLE [dbo].[Contact] 
   DISABLE  CHANGE_TRACKING
GO
