IF NOT EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[City]')) 
   ALTER TABLE [dbo].[City] 
   ENABLE  CHANGE_TRACKING
GO
