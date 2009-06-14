IF NOT EXISTS (SELECT * FROM sys.change_tracking_tables WHERE object_id = OBJECT_ID(N'[dbo].[EmployeeAddress]')) 
   ALTER TABLE [dbo].[EmployeeAddress] 
   ENABLE  CHANGE_TRACKING
GO
