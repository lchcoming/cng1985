IF NOT EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[Major]')) 
   ALTER TABLE [dbo].[Major] 
   ENABLE  CHANGE_TRACKING
GO
