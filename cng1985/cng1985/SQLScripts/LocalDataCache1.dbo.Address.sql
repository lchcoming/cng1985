IF NOT EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[Address]')) 
   ALTER TABLE [dbo].[Address] 
   ENABLE  CHANGE_TRACKING
GO
